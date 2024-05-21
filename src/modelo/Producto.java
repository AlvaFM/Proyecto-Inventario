package modelo;

public class Producto {
    private int idProducto;
    private int categoríaProducto;
    private String nombreProducto;
    private int precioProducto;
    private int cantidadProducto;

    public Producto() {
    }

    public Producto(int idProducto, int categoríaProducto, String nombreProducto, int precioProducto, int cantidadProducto) {
        this.idProducto = idProducto;
        this.categoríaProducto = categoríaProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCategoríaProducto() {
        return categoríaProducto;
    }

    public void setCategoríaProducto(int categoríaProducto) {
        this.categoríaProducto = categoríaProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", categoríaProducto=" + categoríaProducto + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", cantidadProducto=" + cantidadProducto + '}';
    }
}
