/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import static javax.sound.sampled.Clip.LOOP_CONTINUOUSLY;
import static lbry.Lbry.fileNotFound;

/**
 *
 * @author Diego
 */
public class Information extends javax.swing.JFrame {

    /**
     * Creates new form Information
     */
    Clip infoMusic;
    public Information() {
        initComponents();
        this.setLocationRelativeTo(null);
        infoMusic = null;
        try{
            infoMusic = AudioSystem.getClip();
            infoMusic.open(AudioSystem.getAudioInputStream(new File("songs/infoSong.aiff")));
            infoMusic.loop(LOOP_CONTINUOUSLY);
        }catch(Exception ex){
            fileNotFound();
        }
        if(infoMusic.isActive())
            infoMusic.start();
    }

        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nerite = new javax.swing.JLabel();
        hakonmyo = new javax.swing.JLabel();
        neriteB = new javax.swing.JButton();
        hakonmyoB = new javax.swing.JButton();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nerite.setBackground(new java.awt.Color(255, 255, 255));
        nerite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nerite.setText("                N e r i t e");
        nerite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nerite.setOpaque(true);
        getContentPane().add(nerite, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 250, 40));

        hakonmyo.setBackground(new java.awt.Color(255, 255, 255));
        hakonmyo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hakonmyo.setText("           H a k o n m y o");
        hakonmyo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hakonmyo.setOpaque(true);
        getContentPane().add(hakonmyo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 250, 40));

        neriteB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NeriteInfo.png"))); // NOI18N
        neriteB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        neriteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neriteBActionPerformed(evt);
            }
        });
        getContentPane().add(neriteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 250, 250));

        hakonmyoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HakonmyoInfo.png"))); // NOI18N
        hakonmyoB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hakonmyoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hakonmyoBActionPerformed(evt);
            }
        });
        getContentPane().add(hakonmyoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 250, 250));

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Menu window = new Menu();
        window.setVisible(true);
        this.setVisible(false);
        infoMusic.stop();
    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void neriteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neriteBActionPerformed
        Nerite window = new Nerite();
        window.setVisible(true);
        this.setVisible(false);
        infoMusic.stop();
    }//GEN-LAST:event_neriteBActionPerformed

    private void hakonmyoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hakonmyoBActionPerformed
        Hakonmyo window = new Hakonmyo();
        window.setVisible(true);
        this.setVisible(false);
        infoMusic.stop();
    }//GEN-LAST:event_hakonmyoBActionPerformed

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
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JButton exit;
    private javax.swing.JLabel hakonmyo;
    private javax.swing.JButton hakonmyoB;
    private javax.swing.JLabel nerite;
    private javax.swing.JButton neriteB;
    // End of variables declaration//GEN-END:variables
}
