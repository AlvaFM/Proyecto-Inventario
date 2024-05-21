package vista;

import controlador.ProcesosBD;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.Producto;
import static vista.Inventario.abrirVentana;

/**
 *
 * @author auror
 */
public class AgregarProducto extends javax.swing.JPanel {

    /**
     * Creates new form AgregarProducto
     */
    public AgregarProducto() {
        initComponents();

        this.setVisible(true);

        ButtonGroup grupoTipo = new ButtonGroup();
        grupoTipo.add(Box1Bebida);
        grupoTipo.add(Box2Comida);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombreNewProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Box1Bebida = new javax.swing.JCheckBox();
        Box2Comida = new javax.swing.JCheckBox();
        IngresarNewProducto = new javax.swing.JButton();
        CantidadNewProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PrecioNewProducto = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Agregar producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        NombreNewProducto.setBackground(new java.awt.Color(255, 255, 204));
        NombreNewProducto.setForeground(new java.awt.Color(0, 0, 0));
        NombreNewProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreNewProductoActionPerformed(evt);
            }
        });
        jPanel1.add(NombreNewProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 118, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        Box1Bebida.setBackground(new java.awt.Color(255, 255, 204));
        Box1Bebida.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        Box1Bebida.setForeground(new java.awt.Color(0, 0, 0));
        Box1Bebida.setText("Bebida");
        Box1Bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box1BebidaActionPerformed(evt);
            }
        });
        jPanel1.add(Box1Bebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        Box2Comida.setBackground(new java.awt.Color(255, 255, 204));
        Box2Comida.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        Box2Comida.setForeground(new java.awt.Color(0, 0, 0));
        Box2Comida.setText("Comida");
        Box2Comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box2ComidaActionPerformed(evt);
            }
        });
        jPanel1.add(Box2Comida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        IngresarNewProducto.setBackground(new java.awt.Color(255, 255, 204));
        IngresarNewProducto.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        IngresarNewProducto.setForeground(new java.awt.Color(0, 0, 0));
        IngresarNewProducto.setText("Ingresar");
        IngresarNewProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarNewProductoActionPerformed(evt);
            }
        });
        jPanel1.add(IngresarNewProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        CantidadNewProducto.setBackground(new java.awt.Color(255, 255, 204));
        CantidadNewProducto.setForeground(new java.awt.Color(0, 0, 0));
        CantidadNewProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadNewProductoActionPerformed(evt);
            }
        });
        jPanel1.add(CantidadNewProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 118, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 60, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 50, 20));

        PrecioNewProducto.setBackground(new java.awt.Color(255, 255, 204));
        PrecioNewProducto.setForeground(new java.awt.Color(0, 0, 0));
        PrecioNewProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioNewProductoActionPerformed(evt);
            }
        });
        jPanel1.add(PrecioNewProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 120, -1));

        regresar.setBackground(new java.awt.Color(255, 255, 204));
        regresar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        regresar.setForeground(new java.awt.Color(0, 0, 0));
        regresar.setText("Cerrar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo 400.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 281));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void PrecioNewProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioNewProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioNewProductoActionPerformed

    private void CantidadNewProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadNewProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadNewProductoActionPerformed

    private void IngresarNewProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarNewProductoActionPerformed

        String Nombre = NombreNewProducto.getText();
        String PrecioStr = PrecioNewProducto.getText();
        String CantidadStr = CantidadNewProducto.getText();
        int Tipo;

        int Precio;
        int Cantidad;
        if (Nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre para el producto", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (PrecioStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numérico para el precio", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (CantidadStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numérico para la cantidad", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Precio = Integer.parseInt(PrecioStr);
            Cantidad = Integer.parseInt(CantidadStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos para Precio y Cantidad", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (Box1Bebida.isSelected()) {
            Tipo = 1;
        } else if (Box2Comida.isSelected()) {
            Tipo = 2;
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una categoría (Bebida o Comida)", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Producto nuevoProducto = new Producto(0, Tipo, Nombre, Precio, Cantidad);

        ProcesosBD procesosBD = new ProcesosBD();

        if (procesosBD.productoExistente(Nombre)) {
            JOptionPane.showMessageDialog(null, "Ya existe un producto con ese nombre", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            if (procesosBD.agregarProducto(nuevoProducto)) {
                SwingUtilities.getWindowAncestor(this).dispose();
                abrirVentana(new ProductoAgregado(), "");
                        
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar el producto", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_IngresarNewProductoActionPerformed

    private void Box1BebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box1BebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box1BebidaActionPerformed

    private void NombreNewProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreNewProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreNewProductoActionPerformed

    private void Box2ComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box2ComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box2ComidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Box1Bebida;
    private javax.swing.JCheckBox Box2Comida;
    private javax.swing.JTextField CantidadNewProducto;
    private javax.swing.JButton IngresarNewProducto;
    private javax.swing.JTextField NombreNewProducto;
    private javax.swing.JTextField PrecioNewProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
