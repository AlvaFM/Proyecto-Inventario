package vista;

import controlador.ProcesosBD;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Usuario;

/**
 *
 * @author auror
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void mostrarVentanaPrincipal() {
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        ingresar = new javax.swing.JButton();
        texContraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        VerContra = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2560px-Logo_DuocUC.svg (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 320, 80));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 70, 24));

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 80, 30));

        textUsuario.setBackground(new java.awt.Color(255, 255, 204));
        textUsuario.setForeground(new java.awt.Color(0, 0, 0));
        textUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 144, -1));

        ingresar.setBackground(new java.awt.Color(255, 255, 204));
        ingresar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        ingresar.setForeground(new java.awt.Color(0, 0, 0));
        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        texContraseña.setBackground(new java.awt.Color(255, 255, 204));
        texContraseña.setForeground(new java.awt.Color(0, 0, 0));
        texContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(texContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 144, -1));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bienvenido al sistema de inventario de DuocUC");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 520, 30));

        VerContra.setBackground(new java.awt.Color(255, 255, 255));
        VerContra.setForeground(new java.awt.Color(255, 255, 255));
        VerContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerContraActionPerformed(evt);
            }
        });
        jPanel1.add(VerContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo inventario 600.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsuarioActionPerformed

    private void texContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texContraseñaActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        String usuario = textUsuario.getText();

        String contraseña = new String(texContraseña.getPassword());

        Usuario usuarioAValidar = new Usuario(usuario, contraseña);

        ProcesosBD Pro = new ProcesosBD();

        boolean existe = Pro.usuarioValido(usuarioAValidar);

        if (existe) {
            Inventario inventario = new Inventario();

            inventario.setVisible(true);

            inventario.mostrar("");

            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Usuario Invalido", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_ingresarActionPerformed

    private void VerContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerContraActionPerformed
// Verificar si el CheckBox está seleccionado
        if (VerContra.isSelected()) {
            // Mostrar la contraseña
            texContraseña.setEchoChar((char) 0);
        } else {
            // Ocultar la contraseña
            texContraseña.setEchoChar('*');
        }

    }//GEN-LAST:event_VerContraActionPerformed

 
    public static void main(String args[]) {
        try {
            
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

           
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox VerContra;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField texContraseña;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
