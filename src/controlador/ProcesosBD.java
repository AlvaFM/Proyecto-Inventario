package controlador;

import bd.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Producto;
import modelo.Usuario;

public class ProcesosBD {

    public boolean agregarProducto(Producto producto) {
        ConexionBD conexion = new ConexionBD();
        Connection con = conexion.ConexionDB();

        String sql = "INSERT INTO producto(idProducto, idCategoria, nombreProducto, precioProducto, cantidadProducto) VALUES(?,?,?,?,?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, 0);
            stmt.setInt(2, producto.getCategoríaProducto());
            stmt.setString(3, producto.getNombreProducto());
            stmt.setInt(4, producto.getPrecioProducto());
            stmt.setInt(5, producto.getCantidadProducto());

            int filasAfectadas = stmt.executeUpdate();
            stmt.close();
            con.close();

            return filasAfectadas > 0;

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            return false;
        }
    }

    public boolean productoExistente(String nombre) {
        ConexionBD conexion = new ConexionBD();
        Connection con = conexion.ConexionDB();

        String sql = "SELECT COUNT(*) FROM producto WHERE nombreProducto = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nombre);
            ResultSet result = stmt.executeQuery();

            result.next();
            int YaExiste = result.getInt(1);

            stmt.close();
            con.close();

            return YaExiste > 0;

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            return false;
        }
    }

    public void mostrarProductos() {
        ConexionBD conexion = new ConexionBD();
        Connection con = conexion.ConexionDB();

        String sql = "SELECT * FROM producto";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet set = stmt.executeQuery();

            while (set.next()) {
                System.out.println("ID: " + set.getInt(1) + " Nombre: " + set.getString("nombreProducto"));
            }

        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public String[] buscarProducto(String busqueda) {
        ConexionBD conexion = new ConexionBD();
        Connection con = conexion.ConexionDB();

        String sql = "SELECT * FROM producto p JOIN categoria c ON p.idCategoria = c.idCategoria WHERE p.idProducto = ? OR LOWER(p.nombreProducto) = LOWER(?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            int idProducto = 0;

            try {
                idProducto = Integer.parseInt(busqueda);
            } catch (Exception e) {

            }

            stmt.setInt(1, idProducto);
            stmt.setString(2, busqueda);

            ResultSet set = stmt.executeQuery();

            if (set.next()) {
                String[] datos = new String[5];
                datos[0] = String.valueOf(set.getInt("idProducto"));
                datos[1] = set.getString("nombreCategoria");
                datos[2] = set.getString("nombreProducto");
                datos[3] = String.valueOf(set.getInt("precioProducto"));
                datos[4] = String.valueOf(set.getInt("cantidadProducto"));

                stmt.close();
                con.close();

                return datos;
            } else {
                stmt.close();
                con.close();

                return null;
            }

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            return null;
        }
    }

    public boolean usuarioValido(Usuario usuario) {
        ConexionBD conexion = new ConexionBD();
        Connection con = conexion.ConexionDB();

        String sql = "SELECT * FROM datosusuarios WHERE Usuario = ? AND contraseña = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getContraseña());

            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                String usuarioBD = result.getString("Usuario");
                String contraseñaBD = result.getString("contraseña");
                if (usuarioBD.equals(usuario.getUsuario()) && contraseñaBD.equals(usuario.getContraseña())) {
                    result.close();
                    stmt.close();
                    con.close();
                    return true;
                }
            }

            result.close();
            stmt.close();
            con.close();

            return false;

        } catch (SQLException ex) {
            System.out.println("Error al validar usuario: " + ex.getMessage());
            return false;
        }
    }

    public boolean agregarUsuario(Usuario usuario, String confirmacionContraseña) {
        if (!usuario.getContraseña().equals(confirmacionContraseña)) {
            System.out.println("Error: Las contraseñas no coinciden. Intente de nuevo.");
            return false;
        }

        ConexionBD conexion = new ConexionBD();
        Connection con = conexion.ConexionDB();

        String sql = "INSERT INTO datosusuarios(Usuario, contraseña) VALUES(?, ?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getContraseña());

            stmt.executeUpdate();
            stmt.close();
            con.close();
            System.out.println("Se ingresó correctamente el usuario.");
            return true;

        } catch (SQLException ex) {
            System.out.println("Error al agregar usuario: " + ex.getMessage());
            return false;
        }
    }

    public void modificarProducto(int idProducto, int nuevoTipo, String nuevoNombre, int nuevoPrecio, int nuevaCantidad) {
        ConexionBD conexion = new ConexionBD();
        Connection con = conexion.ConexionDB();

        String sql = "UPDATE producto SET idCategoria=?, nombreProducto=?, precioProducto=?, cantidadProducto=? WHERE idProducto=?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, nuevoTipo);
            stmt.setString(2, nuevoNombre);
            stmt.setInt(3, nuevoPrecio);
            stmt.setInt(4, nuevaCantidad);
            stmt.setInt(5, idProducto);

            int filasModificadas = stmt.executeUpdate();

            if (filasModificadas > 0) {
                System.out.println("Se modificó correctamente el producto con ID " + idProducto);
            } else {
                System.out.println("No se encontró el producto con ID " + idProducto);
            }

            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al modificar el producto: " + ex.getMessage());
        }
    }

}
