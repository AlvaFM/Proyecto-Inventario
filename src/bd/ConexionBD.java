/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public Connection ConexionDB() {

        String url = "jdbc:mysql://localhost:3306/productosbd";
        String usuario = "root";
        String contraseña = "esio1313";

        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            if (conexion != null) {
                System.out.println("CONEXIÓN EXITOSA");
            }
        } catch (SQLException e) {
            System.out.println("ERROR al conectar a la base de datos: " + e.getMessage());
        }
        return conexion;

    }

}
