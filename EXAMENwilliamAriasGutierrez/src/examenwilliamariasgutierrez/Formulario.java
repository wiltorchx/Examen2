

package examenwilliamariasgutierrez;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
      initComponents();
        
        // Crear una JLabel con la imagen de fondo
        JLabel fondo = new JLabel(new ImageIcon(getClass().getResource("/imagenes/fondo.jpg")));
        fondo.setBounds(0, 0, fondop.getWidth(), fondop.getHeight());
        fondop.add(fondo);
        //////////////////////////////////////////////////////////////////////////////////////////
      
    }
     public Icon setIcono(String url, JButton boton){
   
       
       ImageIcon icon = new ImageIcon(getClass().getResource(url));
       
       int ancho = boton.getWidth();
       int alto = boton.getHeight();
       
       ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
       return icono;
   
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tnombre = new javax.swing.JTextField();
        tfecha = new javax.swing.JTextField();
        tcorreo = new javax.swing.JTextField();
        tedad = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        Bimprimir = new javax.swing.JButton();
        bsalvar = new javax.swing.JButton();
        Bregresar = new javax.swing.JButton();
        tencuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondop.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("ENCUESTAS");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fondop.add(jLabel1);
        jLabel1.setBounds(210, 10, 140, 50);

        jLabel2.setText("NOMBRE Y APELLIDO");
        fondop.add(jLabel2);
        jLabel2.setBounds(44, 107, 115, 16);

        jLabel3.setText("FECHA DE NACIMIENTO");
        fondop.add(jLabel3);
        jLabel3.setBounds(44, 145, 129, 16);

        jLabel4.setText("EDAD");
        fondop.add(jLabel4);
        jLabel4.setBounds(44, 179, 30, 16);

        jLabel5.setText("CARRO PROPIO");
        fondop.add(jLabel5);
        jLabel5.setBounds(44, 251, 138, 16);

        jLabel6.setText("CORREO ELECTRONICO");
        fondop.add(jLabel6);
        jLabel6.setBounds(44, 212, 126, 16);

        tnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnombreActionPerformed(evt);
            }
        });
        fondop.add(tnombre);
        tnombre.setBounds(260, 110, 220, 18);

        tfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfechaActionPerformed(evt);
            }
        });
        fondop.add(tfecha);
        tfecha.setBounds(260, 142, 220, 18);

        tcorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcorreoActionPerformed(evt);
            }
        });
        fondop.add(tcorreo);
        tcorreo.setBounds(260, 209, 220, 18);

        tedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tedadActionPerformed(evt);
            }
        });
        fondop.add(tedad);
        tedad.setBounds(260, 176, 220, 18);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        fondop.add(jComboBox1);
        jComboBox1.setBounds(260, 250, 72, 22);

        Bimprimir.setText("IMPRIMIR");
        Bimprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BimprimirActionPerformed(evt);
            }
        });
        fondop.add(Bimprimir);
        Bimprimir.setBounds(350, 390, 110, 50);

        bsalvar.setText("SALVAR");
        bsalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalvarActionPerformed(evt);
            }
        });
        fondop.add(bsalvar);
        bsalvar.setBounds(220, 390, 80, 50);

        Bregresar.setText("Bregresar");
        Bregresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Bregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BregresarActionPerformed(evt);
            }
        });
        fondop.add(Bregresar);
        Bregresar.setBounds(80, 390, 80, 50);

        tencuesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fondop.add(tencuesta);
        tencuesta.setBounds(260, 70, 60, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fondop, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondop, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnombreActionPerformed

    private void tfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfechaActionPerformed

    private void tcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcorreoActionPerformed

    private void tedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tedadActionPerformed

    private void bsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalvarActionPerformed
        String nombre = tnombre.getText();
        String fecha = tfecha.getText();
        String edad = tedad.getText();
        String correo = tcorreo.getText();

// Validar si alguno de los campos de texto está vacío
if (nombre.isEmpty() || fecha.isEmpty() || edad.isEmpty() || correo.isEmpty()) {
    // Mostrar un mensaje de error indicando que hay campos vacíos
    JOptionPane.showMessageDialog(null, "Hay campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
} else {
    // Todos los campos tienen contenido, continuar con el proceso
    
    // Convertir el campo edad a un valor numérico
    int edadNum = Integer.parseInt(edad);
    
    // Validar si la edad está dentro del rango requerido
    if (edadNum >= 18 && edadNum <= 50) {
        // La edad está dentro del rango requerido, continuar con el proceso
        
        // Asignar los valores a las propiedades del objeto Encuesta
        Encuesta.setNombre(nombre);
        Encuesta.setFechan(fecha);
        Encuesta.setEdad(edad);
        Encuesta.setCorreo(correo);
        
        // Realizar las operaciones necesarias con los datos
        // ...
    } else {
        // La edad está fuera del rango requerido, mostrar un mensaje de alerta
        JOptionPane.showMessageDialog(null, "La edad debe estar entre 18 y 50 años", "Error", JOptionPane.ERROR_MESSAGE);
    }
            Random rand = new Random();

     // Generar un número aleatorio de 6 dígitos
     int numEncuesta = rand.nextInt(900000) + 100000;

     // Convertir el número a una cadena de texto y mostrarlo en el campo correspondiente
     tencuesta.setText(String.valueOf(numEncuesta));
        
        ///////////////////////GUARDAR INFORMACION///////////////////////////////
    
        ArrayList<String> nombres = Encuesta.getNombre();
        ArrayList<String> cedulas = Encuesta.getFechan();
        ArrayList<String> telefonos = Encuesta.getEdad();
        ArrayList<String> direcciones = Encuesta.getCorreo();
         StringBuilder mensaje = new StringBuilder();
         
         mensaje.append("Nombre: ").append(nombres.toString()).append("\n");
         mensaje.append("Cedula: ").append(cedulas.toString()).append("\n");
         mensaje.append("Telefono: ").append(telefonos.toString()).append("\n");
         mensaje.append("Direccion: ").append(direcciones.toString()).append("\n");
         JOptionPane.showMessageDialog(null, mensaje.toString(), "Información del cliente", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bsalvarActionPerformed
} 
    private void BregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BregresarActionPerformed
        tnombre.setText("");
        tfecha.setText("");
        tedad.setText("");
        tcorreo.setText("");
    }//GEN-LAST:event_BregresarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     int clientesConCarro = 0;
    int clientesSinCarro = 0;
        
        String opcion = jComboBox1.getSelectedItem().toString(); 
    
    if(opcion.equals("Sí")) { 
        clientesConCarro++; 
    } else if(opcion.equals("No")) { 
        clientesSinCarro++; 
    }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BimprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BimprimirActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bimprimir;
    private javax.swing.JButton Bregresar;
    private javax.swing.JButton bsalvar;
    private javax.swing.JPanel fondop;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tcorreo;
    private javax.swing.JTextField tedad;
    private javax.swing.JLabel tencuesta;
    private javax.swing.JTextField tfecha;
    private javax.swing.JTextField tnombre;
    // End of variables declaration//GEN-END:variables
}
