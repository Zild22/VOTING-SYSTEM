/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author Justin Ian Aldevera
 */
public class UpdateEmailAddressUI extends javax.swing.JFrame {

    /**
     * Creates new form UpdateEmailAddress
     */
    public UpdateEmailAddressUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FIRSTLAYERPANEL = new javax.swing.JPanel();
        NEWEMAILLABEL = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        NEWEMAILTEXTFIELD = new javax.swing.JTextField();
        CONFIRMEMAILTEXTFIELD = new javax.swing.JTextField();
        HEADERPANEL = new javax.swing.JPanel();
        TITLETEXT = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();
        NEWEMAILLABEL1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        FIRSTLAYERPANEL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FIRSTLAYERPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NEWEMAILLABEL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NEWEMAILLABEL.setText("Confirm new email");
        FIRSTLAYERPANEL.add(NEWEMAILLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 310, 20));

        jButton1.setBackground(new java.awt.Color(25, 18, 211));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONFIRM");
        FIRSTLAYERPANEL.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 210, 40));
        FIRSTLAYERPANEL.add(NEWEMAILTEXTFIELD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 310, 40));
        FIRSTLAYERPANEL.add(CONFIRMEMAILTEXTFIELD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 310, 40));

        HEADERPANEL.setBackground(new java.awt.Color(25, 18, 211));
        HEADERPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITLETEXT.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TITLETEXT.setForeground(new java.awt.Color(255, 255, 255));
        TITLETEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLETEXT.setText("UPDATE EMAIL ADDRESS");
        HEADERPANEL.add(TITLETEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 400, 60));

        EXIT.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 255));
        EXIT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EXIT.setText("X");
        EXIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITMouseClicked(evt);
            }
        });
        HEADERPANEL.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        FIRSTLAYERPANEL.add(HEADERPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        NEWEMAILLABEL1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NEWEMAILLABEL1.setText("New email");
        FIRSTLAYERPANEL.add(NEWEMAILLABEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 310, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FIRSTLAYERPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FIRSTLAYERPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        System.exit(0);
    }//GEN-LAST:event_EXITMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateEmailAddressUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmailAddressUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmailAddressUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmailAddressUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmailAddressUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CONFIRMEMAILTEXTFIELD;
    private javax.swing.JLabel EXIT;
    private javax.swing.JPanel FIRSTLAYERPANEL;
    private javax.swing.JPanel HEADERPANEL;
    private javax.swing.JLabel NEWEMAILLABEL;
    private javax.swing.JLabel NEWEMAILLABEL1;
    private javax.swing.JTextField NEWEMAILTEXTFIELD;
    private javax.swing.JLabel TITLETEXT;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
