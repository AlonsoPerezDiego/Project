/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import classpackage.Info;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import static lbry.Lbry.fileNotFound;

/**
 *
 * @author Diego
 */
public class Hakonmyo extends javax.swing.JFrame {

    /**
     * Creates new form Hakonmyo
     */
    public Hakonmyo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureFront = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        info1 = new javax.swing.JLabel();
        info2 = new javax.swing.JLabel();
        info3 = new javax.swing.JLabel();
        nameH = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureFront.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HakonmyoInfo.png"))); // NOI18N
        getContentPane().add(pictureFront, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, -1, -1));

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        menu.setBackground(new java.awt.Color(0, 153, 0));
        menu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        menu.setText("MENU");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, -1, -1));

        info1.setBackground(new java.awt.Color(255, 255, 255));
        info1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        info1.setOpaque(true);
        getContentPane().add(info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 460, 30));

        info2.setBackground(new java.awt.Color(255, 255, 255));
        info2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        info2.setOpaque(true);
        getContentPane().add(info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 460, 30));

        info3.setBackground(new java.awt.Color(255, 255, 255));
        info3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        info3.setOpaque(true);
        getContentPane().add(info3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 460, 30));

        nameH.setBackground(new java.awt.Color(255, 255, 255));
        nameH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameH.setText("          PRESS HERE ");
        nameH.setOpaque(true);
        nameH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameHMouseClicked(evt);
            }
        });
        getContentPane().add(nameH, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 210, 250));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        Menu window = new Menu();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Information window = new Information();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void nameHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameHMouseClicked
        readFile();
        
    }//GEN-LAST:event_nameHMouseClicked

    private Scanner scan;
    private ArrayList <Info> list;
    public void readFile(){
        list = new ArrayList();
        try{
            scan = new Scanner(new File("HakonmyoInformation.txt"));
            String[]aux;
            while(scan.hasNextLine()){
                aux = scan.nextLine().split(";");
                Info object = new Info(aux[0],aux[1]);
                list.add(object);
            }
        }catch(Exception ex){
            fileNotFound();
        }finally{
            scan.close();
        }
        nameH.setText(list.get(0).getName());
        info1.setText( list.get(0).getInformation());
        info2.setText(list.get(1).getInformation());
        info3.setText(list.get(2).getInformation());
    }
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
            java.util.logging.Logger.getLogger(Hakonmyo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hakonmyo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hakonmyo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hakonmyo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hakonmyo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JButton exit;
    private javax.swing.JLabel info1;
    private javax.swing.JLabel info2;
    private javax.swing.JLabel info3;
    private javax.swing.JButton menu;
    private javax.swing.JLabel nameH;
    private javax.swing.JLabel pictureFront;
    // End of variables declaration//GEN-END:variables
}
