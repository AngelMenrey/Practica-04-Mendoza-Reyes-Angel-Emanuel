
import javax.swing.JOptionPane;

public class Jframe extends javax.swing.JFrame {
int ID = 0, IDE=-1;
int num;
Futbol futbol [] = new Futbol[20];  
    public Jframe() {
    initComponents();
    setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NOMBREEQUIPO = new javax.swing.JTextField();
        NOMBREJUGADOR = new javax.swing.JTextField();
        POSICIONJUGADOR = new javax.swing.JTextField();
        NUMEROJUGADOR = new javax.swing.JTextField();
        jflagregar = new javax.swing.JButton();
        jflbuscar = new javax.swing.JButton();
        jfleliminar = new javax.swing.JButton();
        jfllimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        etiqueta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(51, 255, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("LIGA DE FUTBOL");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel2.setText("NOMBRE JUGADOR");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel3.setText("NOMBRE EQUIPO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel4.setText("POSICION JUGADOR");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel5.setText("NUMERO JUGADOR");

        NOMBREEQUIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBREEQUIPOActionPerformed(evt);
            }
        });

        NUMEROJUGADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMEROJUGADORActionPerformed(evt);
            }
        });

        jflagregar.setBackground(new java.awt.Color(0, 102, 0));
        jflagregar.setText("AGREGAR");
        jflagregar.setToolTipText("Agregar jugador");
        jflagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jflagregarMouseClicked(evt);
            }
        });
        jflagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jflagregarActionPerformed(evt);
            }
        });

        jflbuscar.setBackground(new java.awt.Color(0, 153, 153));
        jflbuscar.setText("BUSCAR");
        jflbuscar.setToolTipText("Buscar jugador");
        jflbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jflbuscarMouseClicked(evt);
            }
        });

        jfleliminar.setBackground(new java.awt.Color(255, 0, 0));
        jfleliminar.setText("ELIMINAR");
        jfleliminar.setToolTipText("Eliminar jugador");
        jfleliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jfleliminarMouseClicked(evt);
            }
        });
        jfleliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfleliminarActionPerformed(evt);
            }
        });

        jfllimpiar.setBackground(new java.awt.Color(0, 204, 204));
        jfllimpiar.setText("LIMPIAR");
        jfllimpiar.setToolTipText("Limpiar ");
        jfllimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jfllimpiarMouseClicked(evt);
            }
        });
        jfllimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfllimpiarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setText("SALIR");
        jButton1.setToolTipText("Salir del menu");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NOMBREJUGADOR, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(NOMBREEQUIPO)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(24, 24, 24)
                            .addComponent(NUMEROJUGADOR))
                        .addComponent(jLabel1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(POSICIONJUGADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jflagregar)
                        .addGap(18, 18, 18)
                        .addComponent(jflbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jfleliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addComponent(jfllimpiar)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NOMBREEQUIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NOMBREJUGADOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(POSICIONJUGADOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NUMEROJUGADOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(etiqueta)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jflagregar)
                    .addComponent(jflbuscar)
                    .addComponent(jfleliminar)
                    .addComponent(jfllimpiar)
                    .addComponent(jButton1))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOMBREEQUIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBREEQUIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBREEQUIPOActionPerformed

    private void NUMEROJUGADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMEROJUGADORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUMEROJUGADORActionPerformed

    private void jflagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jflagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jflagregarActionPerformed

    private void jfllimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfllimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfllimpiarActionPerformed

    private void jfllimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jfllimpiarMouseClicked
     NOMBREEQUIPO.setText("");
     NOMBREJUGADOR.setText("");
     POSICIONJUGADOR.setText("");
     NUMEROJUGADOR.setText("");
     NOMBREEQUIPO.requestFocus();
    }//GEN-LAST:event_jfllimpiarMouseClicked

    private void jflagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jflagregarMouseClicked
    String nombrejugador, nombreequipo, posicionjugador;
    int numerojugador;
    if (ID<20){
    nombreequipo = NOMBREEQUIPO.getText();
    nombrejugador = NOMBREJUGADOR.getText();
    posicionjugador = POSICIONJUGADOR.getText();
    numerojugador = Integer.parseInt(NUMEROJUGADOR.getText());
    futbol [ID] = new Futbol(nombrejugador, nombreequipo, posicionjugador, numerojugador);
    ID++;
    NOMBREEQUIPO.setText("");
    NOMBREJUGADOR.setText("");
    POSICIONJUGADOR.setText("");
    NUMEROJUGADOR.setText("");
    NOMBREEQUIPO.requestFocus();
    etiqueta.setText("El jugador fue agregado");
    }    
    }//GEN-LAST:event_jflagregarMouseClicked

    private void jflbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jflbuscarMouseClicked
       int aux = 0;
        int  numerojugador = Integer.parseInt(NUMEROJUGADOR.getText());
        for (int i = 0; i < ID; i++) {
            if(numerojugador == futbol[i].getNumerojugador()){
            NUMEROJUGADOR.setText(String.valueOf(futbol[i].getNumerojugador()));
            NOMBREEQUIPO.setText(futbol[i].getNombreequipo());
            NOMBREJUGADOR.setText(futbol[i].getNombrejugador());
            POSICIONJUGADOR.setText(futbol[i].getPosicionjugador());
            etiqueta.setText("El jugador fue encontrado ");
            aux = 1;
            break;
            }
        }
        if(aux==0){
            etiqueta.setText("No se encontro jugador");
        }
    }//GEN-LAST:event_jflbuscarMouseClicked

    private void jfleliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jfleliminarMouseClicked
        int  numerojugador = Integer.parseInt(NUMEROJUGADOR.getText());
        for (int i = 0; i < ID; i++) {
        if(numerojugador == futbol[i].getNumerojugador()){
        IDE = i;
        break;
        }
        }
        if(IDE== -1){
       etiqueta.setText("No se encontro el jugador");
        }else{
            for (int i = IDE; i < ID; i++) {
                futbol[i]=futbol[i+1];
            }
            ID --;
            IDE = -1;
       etiqueta.setText("Se elimino el jugador");
       
        }    
    }//GEN-LAST:event_jfleliminarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      this.dispose();        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jfleliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfleliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfleliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NOMBREEQUIPO;
    private javax.swing.JTextField NOMBREJUGADOR;
    private javax.swing.JTextField NUMEROJUGADOR;
    private javax.swing.JTextField POSICIONJUGADOR;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jflagregar;
    private javax.swing.JButton jflbuscar;
    private javax.swing.JButton jfleliminar;
    private javax.swing.JButton jfllimpiar;
    // End of variables declaration//GEN-END:variables
}
