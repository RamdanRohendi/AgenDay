/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenday.views;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author LENOVO
 */
public class V_Tutorial extends javax.swing.JFrame {

    /**
     * Creates new form V_Tutorial
     */
    public V_Tutorial() {
        initComponents();
        gbrTutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenday/Gambar/GbrTutor/1tutormenu.png").getFile()));
    }
    
    int position=0;
    
    public String[] ambilgambar()
    {
        File t = new File(getClass().getResource("/agenday/Gambar/GbrTutor/").getFile());
        String[] Images = t.list();
        return Images;
    }

    public void show(int index)
    {
        String[] Images = ambilgambar();
        String img = Images[index];
        ImageIcon icon=new ImageIcon(getClass().getResource("/agenday/Gambar/GbrTutor/" + img));
        Image image=icon.getImage().getScaledInstance(gbrTutor.getWidth(), gbrTutor.getHeight(), Image.SCALE_SMOOTH);
        gbrTutor.setIcon(new ImageIcon(image));
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
        next = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        gbrTutor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 0, 204));

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenday/Gambar/icons8_Next_page_52px.png"))); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextMousePressed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenday/Gambar/icons8_Back_To_64px.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenday/Gambar/icons8_Cancel_64px.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(next)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exit)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gbrTutor.setBackground(new java.awt.Color(255, 255, 255));
        gbrTutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gbrTutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenday/Gambar/GbrTutor/1tutormenu.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gbrTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(gbrTutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMousePressed
        // TODO add your handling code here:
        position = position +1;
        if(position >= ambilgambar().length)
        {
            position = ambilgambar().length-1;
        }
        show(position);
    }//GEN-LAST:event_nextMousePressed

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        position = position -1;
        if(position<0)
        {
            position = 0;
        }
        show(position);
    }//GEN-LAST:event_backMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_exitMousePressed

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
            java.util.logging.Logger.getLogger(V_Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Tutorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel gbrTutor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel next;
    // End of variables declaration//GEN-END:variables
}