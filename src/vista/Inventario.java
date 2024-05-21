package vista;

import java.sql.Statement;
import javax.swing.JFrame;
import controlador.ProcesosBD;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JPanel;
import java.sql.SQLException;
import bd.ConexionBD;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Inventario extends javax.swing.JFrame {

    public Inventario() {
        initComponents();

        this.setLocationRelativeTo(null);

    }

    public static void abrirVentana(JPanel panel, String titulo) {
        JFrame frame = new JFrame(titulo);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void mostrar(String categoria) {
        String sqlBase = "SELECT p.idProducto, c.nombreCategoria, p.nombreProducto, "
                + "p.precioProducto, p.cantidadProducto "
                + "FROM productosbd.producto p "
                + "JOIN productosbd.categoria c ON p.idCategoria = c.idCategoria ";
        String sql;

        if (categoria.isEmpty()) {
            sql = sqlBase + "ORDER BY p.idCategoria;";
        } else {

            sql = sqlBase + "WHERE c.nombreCategoria = '" + categoria + "' ORDER BY p.idCategoria;";
        }

        Statement stmt;
        ConexionBD con = new ConexionBD();
        Connection conexion = con.ConexionDB();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Categoría");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        visor.setModel(model);
        String[] datos = new String[5];

        try {
            stmt = (Statement) conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                model.addRow(datos);
            }

            stmt.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error" + e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        buscador = new javax.swing.JTextField();
        MostrarComidas = new javax.swing.JButton();
        BotonAbrirEliminar = new javax.swing.JButton();
        AgregarProducto = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        MostrarBebidas = new javax.swing.JButton();
        BontonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AgregarNewUser = new javax.swing.JMenuItem();
        VolverAllogin = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N

        visor.setBackground(new java.awt.Color(255, 255, 255));
        visor.setBorder(new javax.swing.border.MatteBorder(null));
        visor.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        visor.setForeground(new java.awt.Color(0, 0, 0));
        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Categoría", "Nombre", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        visor.setGridColor(new java.awt.Color(255, 255, 255));
        visor.setSelectionBackground(new java.awt.Color(255, 255, 255));
        visor.setSelectionForeground(new java.awt.Color(0, 0, 0));
        visor.setShowHorizontalLines(true);
        visor.setShowVerticalLines(true);
        jScrollPane1.setViewportView(visor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 560, 250));

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Inventario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        buscador.setBackground(new java.awt.Color(255, 255, 204));
        buscador.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        buscador.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, -1));

        MostrarComidas.setBackground(new java.awt.Color(255, 255, 204));
        MostrarComidas.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        MostrarComidas.setForeground(new java.awt.Color(0, 0, 0));
        MostrarComidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foodmealplaterestaurant_109684.png"))); // NOI18N
        MostrarComidas.setText("Comida");
        MostrarComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarComidasActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarComidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        BotonAbrirEliminar.setBackground(new java.awt.Color(255, 255, 204));
        BotonAbrirEliminar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        BotonAbrirEliminar.setForeground(new java.awt.Color(0, 0, 0));
        BotonAbrirEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/biggarbagebin_121980.png"))); // NOI18N
        BotonAbrirEliminar.setText("Eliminar");
        BotonAbrirEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbrirEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAbrirEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 100, -1));

        AgregarProducto.setBackground(new java.awt.Color(255, 255, 204));
        AgregarProducto.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        AgregarProducto.setForeground(new java.awt.Color(0, 0, 0));
        AgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add_insert_new_plus_button_icon_142943.png"))); // NOI18N
        AgregarProducto.setText("Agregar");
        AgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 100, -1));

        actualizar.setBackground(new java.awt.Color(255, 255, 204));
        actualizar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        actualizar.setForeground(new java.awt.Color(0, 0, 0));
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh-page-option_icon-icons.com_73441.png"))); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        BotonModificar.setBackground(new java.awt.Color(255, 255, 204));
        BotonModificar.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        BotonModificar.setForeground(new java.awt.Color(0, 0, 0));
        BotonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compose_edit_modify_icon_177770.png"))); // NOI18N
        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        BotonModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotonModificarKeyPressed(evt);
            }
        });
        getContentPane().add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        MostrarBebidas.setBackground(new java.awt.Color(255, 255, 204));
        MostrarBebidas.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        MostrarBebidas.setForeground(new java.awt.Color(0, 0, 0));
        MostrarBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coffee-cup_icon-icons.com_69402.png"))); // NOI18N
        MostrarBebidas.setText("Bebida");
        MostrarBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarBebidasActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        BontonBuscar.setBackground(new java.awt.Color(255, 255, 204));
        BontonBuscar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BontonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        BontonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/magnifier-1_icon-icons.com_56924 (1).png"))); // NOI18N
        BontonBuscar.setText("Buscar");
        BontonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BontonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BontonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo inventario 600.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo inventario 600.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jMenuBar1.setOpaque(true);
        jMenuBar1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuBar1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jMenu1.setBorder(null);
        jMenu1.setText("Menu       ");
        jMenu1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N

        AgregarNewUser.setText("Agregar nuevo usuario");
        AgregarNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNewUserActionPerformed(evt);
            }
        });
        jMenu1.add(AgregarNewUser);

        VolverAllogin.setText("Salir");
        VolverAllogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverAlloginActionPerformed(evt);
            }
        });
        jMenu1.add(VolverAllogin);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductoActionPerformed

        abrirVentana(new AgregarProducto(), "Agregar Producto");
    }//GEN-LAST:event_AgregarProductoActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        mostrar("");
    }//GEN-LAST:event_actualizarActionPerformed

    private void BontonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BontonBuscarActionPerformed

        String busqueda = buscador.getText();
        ProcesosBD pro = new ProcesosBD();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Categoría");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        visor.setModel(model);

        String[] datos = pro.buscarProducto(busqueda);

        if (datos != null) {
            model.addRow(datos);
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
    }//GEN-LAST:event_BontonBuscarActionPerformed

    private void MostrarBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarBebidasActionPerformed
        mostrar("Bebida");
    }//GEN-LAST:event_MostrarBebidasActionPerformed

    private void VolverAlloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverAlloginActionPerformed
        this.setVisible(false);
        Principal p = new Principal();
        p.mostrarVentanaPrincipal();
    }//GEN-LAST:event_VolverAlloginActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuBar1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuBar1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar1AncestorAdded

    private void AgregarNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarNewUserActionPerformed

        abrirVentana(new Registro(), "Registro");
    }//GEN-LAST:event_AgregarNewUserActionPerformed

    private void MostrarComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarComidasActionPerformed
        mostrar("Comida");
    }//GEN-LAST:event_MostrarComidasActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed

        abrirVentana(new ModificarProducto(), "Modificar Producto");
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonAbrirEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbrirEliminarActionPerformed
        int fila = visor.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto antes de eliminar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String celda = visor.getModel().getValueAt(fila, 0).toString();
        String sql = "DELETE FROM producto WHERE idProducto = " + celda;
        int opc = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar el producto?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {
            try {
                ConexionBD conexion = new ConexionBD();
                Connection con = conexion.ConexionDB();
                Statement stmt = con.createStatement();
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                mostrar("");
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Hubo un error, intente nuevamente");
            }
        }


    }//GEN-LAST:event_BotonAbrirEliminarActionPerformed

    private void BotonModificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotonModificarKeyPressed


    }//GEN-LAST:event_BotonModificarKeyPressed

    public static void main(String args[]) {
        try {

            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarNewUser;
    private javax.swing.JButton AgregarProducto;
    private javax.swing.JButton BontonBuscar;
    private javax.swing.JButton BotonAbrirEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton MostrarBebidas;
    private javax.swing.JButton MostrarComidas;
    private javax.swing.JMenuItem VolverAllogin;
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField buscador;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables
}
