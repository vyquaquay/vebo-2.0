/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vb;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author GIGA
 */
public class vebo extends javax.swing.JFrame {
    /**
     * Creates new form vebo
     */
     String age;
     String name;
     ImageIcon imageIcon;
    public vebo() {
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

        Button_Panel = new javax.swing.JPanel();
        Add_btn = new javax.swing.JButton();
        Infor_btn = new javax.swing.JButton();
        Delete_btn = new javax.swing.JButton();
        Update_btn = new javax.swing.JButton();
        Home_btn = new javax.swing.JButton();
        Main_Panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Add_Panel = new javax.swing.JPanel();
        PlayerNameLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        PlayerAgeLabel = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        imgLabel = new javax.swing.JLabel();
        ImgchooseBtn = new javax.swing.JButton();
        PlayerCountryLabel = new javax.swing.JLabel();
        Country_Input = new javax.swing.JTextField();
        Save_btn = new javax.swing.JButton();
        Infor_Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Delete_Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Update_Panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Home_Panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Button_Panel.setBackground(new java.awt.Color(204, 255, 51));

        Add_btn.setText("Add");
        Add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_btnActionPerformed(evt);
            }
        });

        Infor_btn.setText("Information");
        Infor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Infor_btnActionPerformed(evt);
            }
        });

        Delete_btn.setText("Delete");
        Delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_btnActionPerformed(evt);
            }
        });

        Update_btn.setText("Update");
        Update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_btnActionPerformed(evt);
            }
        });

        Home_btn.setText("Home");
        Home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Button_PanelLayout = new javax.swing.GroupLayout(Button_Panel);
        Button_Panel.setLayout(Button_PanelLayout);
        Button_PanelLayout.setHorizontalGroup(
            Button_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button_PanelLayout.createSequentialGroup()
                .addComponent(Add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Infor_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Home_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(Delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Button_PanelLayout.setVerticalGroup(
            Button_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button_PanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(Button_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_btn)
                    .addComponent(Infor_btn)
                    .addComponent(Delete_btn)
                    .addComponent(Update_btn)
                    .addComponent(Home_btn))
                .addGap(36, 36, 36))
        );

        getContentPane().add(Button_Panel, java.awt.BorderLayout.PAGE_START);

        Main_Panel.setBackground(new java.awt.Color(204, 102, 0));
        Main_Panel.setLayout(new java.awt.CardLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome to Vebo88");
        Main_Panel.add(jLabel5, "card6");

        Add_Panel.setBackground(new java.awt.Color(51, 51, 51));

        PlayerNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlayerNameLabel.setText("Name");

        nameInput.setText("Input Name");

        PlayerAgeLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlayerAgeLabel.setText("Age");

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        imgLabel.setForeground(new java.awt.Color(255, 255, 255));
        imgLabel.setText("Image");

        ImgchooseBtn.setText("Browse Img");
        ImgchooseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImgchooseBtnActionPerformed(evt);
            }
        });

        PlayerCountryLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlayerCountryLabel.setText("Country");

        Country_Input.setText("Country");

        Save_btn.setText("Save");
        Save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Add_PanelLayout = new javax.swing.GroupLayout(Add_Panel);
        Add_Panel.setLayout(Add_PanelLayout);
        Add_PanelLayout.setHorizontalGroup(
            Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_PanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addComponent(PlayerCountryLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Country_Input)
                            .addComponent(PlayerAgeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlayerNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                        .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Add_PanelLayout.createSequentialGroup()
                                .addComponent(ImgchooseBtn)
                                .addGap(115, 115, 115))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Add_PanelLayout.createSequentialGroup()
                                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Save_btn)
                                    .addComponent(imgLabel))
                                .addGap(106, 106, 106))))))
        );
        Add_PanelLayout.setVerticalGroup(
            Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_PanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(PlayerNameLabel)
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(imgLabel)))
                .addGap(18, 18, 18)
                .addComponent(PlayerAgeLabel)
                .addGap(18, 18, 18)
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgchooseBtn))
                .addGap(28, 28, 28)
                .addComponent(PlayerCountryLabel)
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Country_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Save_btn)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        Main_Panel.add(Add_Panel, "card4");

        Infor_Panel.setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout Infor_PanelLayout = new javax.swing.GroupLayout(Infor_Panel);
        Infor_Panel.setLayout(Infor_PanelLayout);
        Infor_PanelLayout.setHorizontalGroup(
            Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Infor_PanelLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel2)
                .addContainerGap(372, Short.MAX_VALUE))
        );
        Infor_PanelLayout.setVerticalGroup(
            Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Infor_PanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel2)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        Main_Panel.add(Infor_Panel, "card3");

        Delete_Panel.setBackground(new java.awt.Color(204, 0, 204));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout Delete_PanelLayout = new javax.swing.GroupLayout(Delete_Panel);
        Delete_Panel.setLayout(Delete_PanelLayout);
        Delete_PanelLayout.setHorizontalGroup(
            Delete_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Delete_PanelLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel3)
                .addContainerGap(347, Short.MAX_VALUE))
        );
        Delete_PanelLayout.setVerticalGroup(
            Delete_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Delete_PanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel3)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        Main_Panel.add(Delete_Panel, "card5");

        Update_Panel.setBackground(new java.awt.Color(255, 255, 0));

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout Update_PanelLayout = new javax.swing.GroupLayout(Update_Panel);
        Update_Panel.setLayout(Update_PanelLayout);
        Update_PanelLayout.setHorizontalGroup(
            Update_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Update_PanelLayout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(251, 251, 251))
        );
        Update_PanelLayout.setVerticalGroup(
            Update_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Update_PanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel4)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        Main_Panel.add(Update_Panel, "card2");

        Home_Panel.setBackground(new java.awt.Color(255, 199, 255));

        jLabel7.setText("Welcome to vebo88. World Football Player Information Record System");

        javax.swing.GroupLayout Home_PanelLayout = new javax.swing.GroupLayout(Home_Panel);
        Home_Panel.setLayout(Home_PanelLayout);
        Home_PanelLayout.setHorizontalGroup(
            Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_PanelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel7)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        Home_PanelLayout.setVerticalGroup(
            Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_PanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel7)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        Main_Panel.add(Home_Panel, "card7");

        getContentPane().add(Main_Panel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Infor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Infor_btnActionPerformed
        Main_Panel.removeAll();
        Main_Panel.add(Infor_Panel);
        Main_Panel.repaint();
        Main_Panel.validate();
    }//GEN-LAST:event_Infor_btnActionPerformed

    private void Add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_btnActionPerformed
        Main_Panel.removeAll();
        Main_Panel.add(Add_Panel);
        Main_Panel.repaint();
        Main_Panel.validate();
    }//GEN-LAST:event_Add_btnActionPerformed

    private void Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btnActionPerformed
        Main_Panel.removeAll();
        Main_Panel.add(Delete_Panel);
        Main_Panel.repaint();
        Main_Panel.validate();
    }//GEN-LAST:event_Delete_btnActionPerformed

    private void Update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btnActionPerformed
        Main_Panel.removeAll();
        Main_Panel.add(Update_Panel);
        Main_Panel.repaint();
        Main_Panel.validate();
    }//GEN-LAST:event_Update_btnActionPerformed

    /**
     * @param evt
     */
    private void ImgchooseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImgchooseBtnActionPerformed
       JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image","jpg","png");
        fileChooser.setFileFilter(imageFilter);
        fileChooser.setMultiSelectionEnabled(false);
        int x = fileChooser.showDialog(this, "choose your file");
        if (x == JFileChooser.APPROVE_OPTION){
        File f = fileChooser.getSelectedFile();
        imageIcon = new ImageIcon(f.getAbsolutePath());
        Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        imgLabel.setIcon(imageIcon);
        imgLabel.setText("");
        }
    }//GEN-LAST:event_ImgchooseBtnActionPerformed

    private void Home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_btnActionPerformed
        Main_Panel.removeAll();
        Main_Panel.add(Home_Panel);
        Main_Panel.repaint();
        Main_Panel.validate();
    }//GEN-LAST:event_Home_btnActionPerformed

    private void Save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_btnActionPerformed
        try{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        age = dateFormat.format(jDateChooser1.getDate());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No date selected");
        }

        
        try{
        name = nameInput.getText();
        String country = Country_Input.getText();
        String fileName = name;
        File file = new File(fileName);
        file.createNewFile() ;
        FileWriter writer = new FileWriter(fileName + ".SIUUU");
        writer.write(name);
        writer.write(age);
        writer.write(country);
        writer.close();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "No COuntry input");
        }
    }//GEN-LAST:event_Save_btnActionPerformed

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
            java.util.logging.Logger.getLogger(vebo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vebo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vebo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vebo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vebo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add_Panel;
    private javax.swing.JButton Add_btn;
    private javax.swing.JPanel Button_Panel;
    private javax.swing.JTextField Country_Input;
    private javax.swing.JPanel Delete_Panel;
    private javax.swing.JButton Delete_btn;
    private javax.swing.JPanel Home_Panel;
    private javax.swing.JButton Home_btn;
    private javax.swing.JButton ImgchooseBtn;
    private javax.swing.JPanel Infor_Panel;
    private javax.swing.JButton Infor_btn;
    private javax.swing.JPanel Main_Panel;
    private javax.swing.JLabel PlayerAgeLabel;
    private javax.swing.JLabel PlayerCountryLabel;
    private javax.swing.JLabel PlayerNameLabel;
    private javax.swing.JButton Save_btn;
    private javax.swing.JPanel Update_Panel;
    private javax.swing.JButton Update_btn;
    private javax.swing.JLabel imgLabel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameInput;
    // End of variables declaration//GEN-END:variables
}
