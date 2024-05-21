package controlador;


import modelo.Producto;
import modelo.Usuario;
import bd.ConexionBD;
/**
 *
 * @author Alvaro
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    //Aqui probare los metodos
    public static void main(String[] args) {
        Producto prueba = new Producto( 0,2, "acuarela", 120000, 55) {};
        ProcesosBD procesos = new ProcesosBD(); 
        //procesos.eliminarProducto(7);
        //PresosBD mostrar = new ProcesosBD();
        Usuario user = new Usuario("Alvaro","12345678");
        
        ConexionBD cone = new ConexionBD();
        
        cone.ConexionDB();
        
        
                
               
        
        
       
     
         
                
        
      
        
        

    
        
        
        
    }
    
}
