package vista;

import controlador.ProcesosBD;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author auror
 */
public class ModificarProducto extends javax.swing.JPanel {

    /**
     * Creates new form AgregarProducto
     */
    public ModificarProducto() {
        initComponents();
        ButtonGroup grupoTipo = new ButtonGroup();
        grupoTipo.add(boxBebida);
        grupoTipo.add(boxComida);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNuevoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boxBebida = new javax.swing.JCheckBox();
        boxComida = new javax.swing.JCheckBox();
        botonGuardarCambios = new javax.swing.JButton();
        txtNuevaCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNuevaPrecio = new javax.swing.JTextField();
        botonCerrar = new javax.swing.JButton();
        ProductoEncontrado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Buscador2 = new javax.swing.JTextField();
        BuscarProducto = new javax.swing.JButton();
        Produc = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProductoEncontrado1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNuevoNombre.setBackground(new java.awt.Color(255, 255, 204));
        txtNuevoNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNuevoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 118, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("N.Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("N.Tipo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 40, 20));

        boxBebida.setBackground(new java.awt.Color(255, 255, 204));
        boxBebida.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        boxBebida.setForeground(new java.awt.Color(0, 0, 0));
        boxBebida.setText("Bebida");
        boxBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBebidaActionPerformed(evt);
            }
        });
        jPanel1.add(boxBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        boxComida.setBackground(new java.awt.Color(255, 255, 204));
        boxComida.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        boxComida.setForeground(new java.awt.Color(0, 0, 0));
        boxComida.setText("Comida");
        jPanel1.add(boxComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        botonGuardarCambios.setBackground(new java.awt.Color(255, 255, 204));
        botonGuardarCambios.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        botonGuardarCambios.setForeground(new java.awt.Color(0, 0, 0));
        botonGuardarCambios.setText("Guardar");
        botonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        txtNuevaCantidad.setBackground(new java.awt.Color(255, 255, 204));
        txtNuevaCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtNuevaCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevaCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtNuevaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 118, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("N.Precio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 50, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("N.Cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, 30));

        txtNuevaPrecio.setBackground(new java.awt.Color(255, 255, 204));
        txtNuevaPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtNuevaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevaPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtNuevaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 120, -1));

        botonCerrar.setBackground(new java.awt.Color(255, 255, 204));
        botonCerrar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        botonCerrar.setForeground(new java.awt.Color(0, 0, 0));
        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        ProductoEncontrado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProductoEncontrado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(ProductoEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 20, -1));

        Buscador2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.add(Buscador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 120, 30));

        BuscarProducto.setBackground(new java.awt.Color(255, 255, 204));
        BuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/magnifier-1_icon-icons.com_56924 (1).png"))); // NOI18N
        BuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, 30));

        Produc.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        Produc.setForeground(new java.awt.Color(0, 0, 0));
        Produc.setText("Producto :");
        jPanel1.add(Produc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo 400.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 281));

        ProductoEncontrado1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProductoEncontrado1.setForeground(new java.awt.Color(0, 0, 0));
        ProductoEncontrado1.setText("Producto");
        jPanel1.add(ProductoEncontrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void txtNuevaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevaPrecioActionPerformed

    private void txtNuevaCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevaCantidadActionPerformed

    private void botonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarCambiosActionPerformed
        String busqueda = Buscador2.getText();
        ProcesosBD pro = new ProcesosBD();

        if (busqueda.isEmpty() || ProductoEncontrado.getText().isEmpty() || ProductoEncontrado.getText().equals("No encontrado")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una ID para buscar el producto y asegúrese de encontrar un producto antes de intentar modificar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            int idProducto = Integer.parseInt(busqueda);
            String nuevoNombre = txtNuevoNombre.getText().trim();
            int nuevaCantidad = Integer.parseInt(txtNuevaCantidad.getText());
            int nuevoPrecio = Integer.parseInt(txtNuevaPrecio.getText());
            if (nuevoNombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un nombre válido para el producto", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int nuevoTipo = 0;
            if (boxBebida.isSelected()) {
                nuevoTipo = 1;
            } else if (boxComida.isSelected()) {
                nuevoTipo = 2;
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione al menos una opción entre Bebida y Comida", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            pro.modificarProducto(idProducto, nuevoTipo, nuevoNombre, nuevoPrecio, nuevaCantidad);

            JOptionPane.showMessageDialog(null, "Producto modificado. Presione 'Actualizar' para visualizar los cambios.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            SwingUtilities.getWindowAncestor(this).dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores válidos para cantidad y precio", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_botonGuardarCambiosActionPerformed

    private void boxBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxBebidaActionPerformed

    private void txtNuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoNombreActionPerformed

    private void BuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarProductoActionPerformed
        String busqueda = Buscador2.getText();
        ProcesosBD pro = new ProcesosBD();

        if (busqueda.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una ID para buscar el producto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int idProducto = Integer.parseInt(busqueda);
            String[] datosProducto = pro.buscarProducto(busqueda);

            if (datosProducto != null && Integer.parseInt(datosProducto[0]) == idProducto) {
                ProductoEncontrado.setText("" + datosProducto[2]);
            } else {
                ProductoEncontrado.setText("No encontrado");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una ID válida para buscar el producto", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_BuscarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscador2;
    private javax.swing.JButton BuscarProducto;
    private javax.swing.JLabel Produc;
    private javax.swing.JLabel ProductoEncontrado;
    private javax.swing.JLabel ProductoEncontrado1;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonGuardarCambios;
    private javax.swing.JCheckBox boxBebida;
    private javax.swing.JCheckBox boxComida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNuevaCantidad;
    private javax.swing.JTextField txtNuevaPrecio;
    private javax.swing.JTextField txtNuevoNombre;
    // End of variables declaration//GEN-END:variables
}
