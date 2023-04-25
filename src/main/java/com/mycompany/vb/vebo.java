/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vb;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GIGA
 */
public class vebo extends javax.swing.JFrame {
    /**
     * Creates new form vebob
     */
     String age;
     String name;
     String country;
     int Pl_Number;
     ArrayList<Player> players = new ArrayList<Player>();
     ArrayList<Player> S_Player = new ArrayList<Player>();
    public vebo() {
        initComponents();
        try{
            FileInputStream fis = new FileInputStream("Player.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            players = (ArrayList<Player>) ois.readObject();
            ois.close(); 
        }catch (Exception f){
            JOptionPane.showMessageDialog(null, "Some error happened when open the file.");
        }
       this.setTitle("VEBO88");
       URL urlIcon = vebo.class.getResource("epl_icon.jpg");
       Image img = Toolkit.getDefaultToolkit().createImage(urlIcon);
       this.setIconImage(img);

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
        Home_btn = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        Main_Panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Add_Panel = new javax.swing.JPanel();
        PlayerNameLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        PlayerAgeLabel = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        PlayerCountryLabel = new javax.swing.JLabel();
        Country_Input = new javax.swing.JTextField();
        Save_btn = new javax.swing.JButton();
        Number_label = new javax.swing.JLabel();
        P_Number = new javax.swing.JTextField();
        Infor_Panel = new javax.swing.JPanel();
        D_Name = new javax.swing.JTextField();
        D_Age = new javax.swing.JTextField();
        D_Country = new javax.swing.JTextField();
        D_Number = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Choose_Player_Box = new javax.swing.JComboBox<>();
        update_btn = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Search_panel = new javax.swing.JPanel();
        Search_Box = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Search_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Remove_Table_Btn = new javax.swing.JButton();
        Home_Panel = new javax.swing.JPanel();
        Home_label = new javax.swing.JLabel();

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

        Home_btn.setText("Home");
        Home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_btnActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Button_PanelLayout = new javax.swing.GroupLayout(Button_Panel);
        Button_Panel.setLayout(Button_PanelLayout);
        Button_PanelLayout.setHorizontalGroup(
            Button_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button_PanelLayout.createSequentialGroup()
                .addComponent(Add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Infor_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Button_PanelLayout.setVerticalGroup(
            Button_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Button_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_btn)
                    .addComponent(Infor_btn)
                    .addComponent(Home_btn)
                    .addComponent(Search))
                .addGap(33, 33, 33))
        );

        getContentPane().add(Button_Panel, java.awt.BorderLayout.PAGE_START);

        Main_Panel.setBackground(new java.awt.Color(204, 102, 0));
        Main_Panel.setLayout(new java.awt.CardLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/vb/ca_do_bong_da (1).png"))); // NOI18N
        Main_Panel.add(jLabel5, "card6");

        Add_Panel.setBackground(new java.awt.Color(51, 51, 51));

        PlayerNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlayerNameLabel.setText("Name");

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        PlayerAgeLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlayerAgeLabel.setText("Age");

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        PlayerCountryLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlayerCountryLabel.setText("Country");

        Country_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Country_InputActionPerformed(evt);
            }
        });

        Save_btn.setText("Save");
        Save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_btnActionPerformed(evt);
            }
        });

        Number_label.setForeground(new java.awt.Color(255, 255, 255));
        Number_label.setText("Number");

        P_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_NumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Add_PanelLayout = new javax.swing.GroupLayout(Add_Panel);
        Add_Panel.setLayout(Add_PanelLayout);
        Add_PanelLayout.setHorizontalGroup(
            Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_PanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PlayerAgeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlayerNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameInput, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                        .addComponent(Save_btn)
                        .addGap(106, 106, 106))
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PlayerCountryLabel)
                            .addComponent(Country_Input, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(Number_label)
                            .addComponent(P_Number))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Add_PanelLayout.setVerticalGroup(
            Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_PanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayerNameLabel)
                    .addComponent(PlayerCountryLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Country_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayerAgeLabel)
                    .addComponent(Number_label))
                .addGap(18, 18, 18)
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(Save_btn)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Main_Panel.add(Add_Panel, "card4");

        Infor_Panel.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Age");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Country");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Number");

        Choose_Player_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Choose_Player_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose_Player_BoxActionPerformed(evt);
            }
        });

        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Infor_PanelLayout = new javax.swing.GroupLayout(Infor_Panel);
        Infor_Panel.setLayout(Infor_PanelLayout);
        Infor_PanelLayout.setHorizontalGroup(
            Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Infor_PanelLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(update_btn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Infor_PanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Infor_PanelLayout.createSequentialGroup()
                        .addComponent(Choose_Player_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Infor_PanelLayout.createSequentialGroup()
                        .addGroup(Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(D_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Infor_PanelLayout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(Delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Infor_PanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(D_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addGroup(Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28)))
                        .addGroup(Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addContainerGap())))
        );
        Infor_PanelLayout.setVerticalGroup(
            Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Infor_PanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Choose_Player_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(Infor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_btn)
                    .addComponent(Delete))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        Main_Panel.add(Infor_Panel, "card3");

        Search_panel.setBackground(new java.awt.Color(255, 204, 204));

        Search_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_BoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Search box");

        Search_btn.setText("OK");
        Search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_btnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Country", "Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Remove_Table_Btn.setText("Remove");
        Remove_Table_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_Table_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Search_panelLayout = new javax.swing.GroupLayout(Search_panel);
        Search_panel.setLayout(Search_panelLayout);
        Search_panelLayout.setHorizontalGroup(
            Search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
            .addGroup(Search_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Search_panelLayout.createSequentialGroup()
                        .addComponent(Search_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(Search_btn)
                        .addGap(55, 55, 55)
                        .addComponent(Remove_Table_Btn))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Search_panelLayout.setVerticalGroup(
            Search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Search_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_btn)
                    .addComponent(Remove_Table_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
        );

        Main_Panel.add(Search_panel, "card2");

        Home_Panel.setBackground(new java.awt.Color(255, 199, 255));

        Home_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/vb/ca_do_bong_da.png"))); // NOI18N
        Home_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Home_PanelLayout = new javax.swing.GroupLayout(Home_Panel);
        Home_Panel.setLayout(Home_PanelLayout);
        Home_PanelLayout.setHorizontalGroup(
            Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Home_PanelLayout.setVerticalGroup(
            Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home_label, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
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
         try{
            FileInputStream fis = new FileInputStream("Player.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            players = (ArrayList<Player>) ois.readObject();
            ois.close(); 
        }catch (Exception f){
            JOptionPane.showMessageDialog(null, "Some error happened when open the file.");
        }
        String[] playerArray = new String[players.size()];
        for(int i = 0; i<players.size(); i++){
            
            playerArray[i] = players.get(i).getName();
        }
        Choose_Player_Box.setModel(new javax.swing.DefaultComboBoxModel<>(playerArray) {
            
        });;
    }//GEN-LAST:event_Infor_btnActionPerformed

    private void Add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_btnActionPerformed
        Main_Panel.removeAll();
        Main_Panel.add(Add_Panel);
        Main_Panel.repaint();
        Main_Panel.validate();
        
    }//GEN-LAST:event_Add_btnActionPerformed

    private void Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btnActionPerformed

    }//GEN-LAST:event_Delete_btnActionPerformed

    private void Update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btnActionPerformed
        Main_Panel.removeAll();
        Main_Panel.add(Search_panel);
        Main_Panel.repaint();
        Main_Panel.validate();
    }//GEN-LAST:event_Update_btnActionPerformed

    private void Home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_btnActionPerformed
        Main_Panel.removeAll();
        Main_Panel.add(Home_Panel);
        Main_Panel.repaint();
        Main_Panel.validate();
    }//GEN-LAST:event_Home_btnActionPerformed

    private void Save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_btnActionPerformed

        String name="";
        String age="";
        String country="";
        int pl_Number=0;
        try{
        name = nameInput.getText().trim();
        if(name.isEmpty()){
            throw new Exception();}
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No name input");
            return;
        }
        try{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        age = dateFormat.format(jDateChooser1.getDate());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No date selected");
            return;
        }
        try{
        country = Country_Input.getText().trim();
        if(country.isEmpty()){
            throw new Exception();
        }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No country input");
            return;
        }
         try{
            pl_Number = Integer.parseInt(P_Number.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Only accept number input");
            return;
        }
        
        Player player = new Player( age, name, country, pl_Number); 
        players.add(player);
        try {
            // Writing to file
            FileOutputStream out = new FileOutputStream("Player.txt");
            ObjectOutputStream oos = new ObjectOutputStream(out);
 
                oos.writeObject(players);
       
            oos.close();
            JOptionPane.showMessageDialog(null, "Added success.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Some error happened.");
        }
        
        

        
        
    }//GEN-LAST:event_Save_btnActionPerformed
        
    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        try{
        name = nameInput.getText();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No Name input");
        }
    }//GEN-LAST:event_nameInputActionPerformed

    private void Country_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Country_InputActionPerformed
       try{
        country = Country_Input.getText();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No Country input");
        }
    }//GEN-LAST:event_Country_InputActionPerformed

    private void P_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_NumberActionPerformed
        try{
            Pl_Number = Integer.parseInt(P_Number.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Only Accept Number");
        }
    }//GEN-LAST:event_P_NumberActionPerformed

    private void Choose_Player_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose_Player_BoxActionPerformed
        try{
            FileInputStream fis = new FileInputStream("Player.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            players = (ArrayList<Player>) ois.readObject();
            ois.close(); 
        }catch (Exception f){
            JOptionPane.showMessageDialog(null, "Some error happened when open the file.");
        }
        String[] playerArray = new String[players.size()];
        for(int i = 0; i<players.size(); i++){
            
            playerArray[i] = players.get(i).getName();
        }
 playerArray = new String[players.size()];
for(int i = 0; i < players.size(); i++){
    playerArray[i] = players.get(i).getName();
}
Choose_Player_Box.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        int selectedIndex = Choose_Player_Box.getSelectedIndex();
        Player selectedPlayer = players.get(selectedIndex);
        D_Name.setText(selectedPlayer.getName());
        D_Age.setText(selectedPlayer.getAge());
        D_Country.setText(selectedPlayer.getCountry());
        D_Number.setText(String.valueOf(selectedPlayer.getPl_Number()));
    }
});

    }//GEN-LAST:event_Choose_Player_BoxActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        int selectedIndex = Choose_Player_Box.getSelectedIndex();
    Player selectedPlayer = players.get(selectedIndex);
    selectedPlayer.setName(D_Name.getText());
    selectedPlayer.setAge(D_Age.getText());
    selectedPlayer.setCountry(D_Country.getText());
    selectedPlayer.setPl_Number(Integer.parseInt(D_Number.getText()));

    try {
        // Writing the updated player to file
        FileOutputStream out = new FileOutputStream("Player.txt");
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(players);
        oos.close();
        JOptionPane.showMessageDialog(null, "Update success.");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Some error happened.");
    }
    }//GEN-LAST:event_update_btnActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
            int selectedIndex = Choose_Player_Box.getSelectedIndex();
            if (selectedIndex != -1) { // make sure a player is selected
                Player selectedPlayer = players.get(selectedIndex);
                players.remove(selectedIndex);
                try {
                    FileOutputStream out = new FileOutputStream("Player.txt");
                    ObjectOutputStream oos = new ObjectOutputStream(out);
                    oos.writeObject(players);
                    oos.close();
                    JOptionPane.showMessageDialog(null, "Deleted successfully.");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Some error happened.");
                }
                // update the combo box with the remaining players
                String[] playerArray = new String[players.size()];
                for (int i = 0; i < players.size(); i++) {
                    playerArray[i] = players.get(i).getName();
                }
                Choose_Player_Box.setModel(new DefaultComboBoxModel<>(playerArray));
                // update the selected index variable
                if (selectedIndex < playerArray.length) {
                    Choose_Player_Box.setSelectedIndex(selectedIndex);
                } else {
                    Choose_Player_Box.setSelectedIndex(playerArray.length - 1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a player to delete.");
            }
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        Main_Panel.removeAll();
        Main_Panel.add(Search_panel);
        Main_Panel.repaint();
        Main_Panel.validate();
    }//GEN-LAST:event_SearchActionPerformed

    private void Search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_btnActionPerformed
        S_Player.clear();
        name = Search_Box.getText().trim();
        for (Player player : players) {
            if(player.getName().contains(name)){
                S_Player.add(player);
            }
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Player> list = S_Player;
        Object rowData[] = new Object[4];
        try {
            for(int i = 0; i<list.size();i++){
            rowData[0] = list.get(i).getName();
            rowData[1] = list.get(i).getAge();
            rowData[2] = list.get(i).getCountry();
            rowData[3] = list.get(i).getPl_Number();
            model.addRow(rowData);
            }
            list.clear();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Some error occur!!!!");
}

    }//GEN-LAST:event_Search_btnActionPerformed

    private void Search_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_BoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_BoxActionPerformed

    private void Remove_Table_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_Table_BtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
    }//GEN-LAST:event_Remove_Table_BtnActionPerformed
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
    private javax.swing.JComboBox<String> Choose_Player_Box;
    private javax.swing.JTextField Country_Input;
    private javax.swing.JTextField D_Age;
    private javax.swing.JTextField D_Country;
    private javax.swing.JTextField D_Name;
    private javax.swing.JTextField D_Number;
    private javax.swing.JButton Delete;
    private javax.swing.JPanel Home_Panel;
    private javax.swing.JButton Home_btn;
    private javax.swing.JLabel Home_label;
    private javax.swing.JPanel Infor_Panel;
    private javax.swing.JButton Infor_btn;
    private javax.swing.JPanel Main_Panel;
    private javax.swing.JLabel Number_label;
    private javax.swing.JTextField P_Number;
    private javax.swing.JLabel PlayerAgeLabel;
    private javax.swing.JLabel PlayerCountryLabel;
    private javax.swing.JLabel PlayerNameLabel;
    private javax.swing.JButton Remove_Table_Btn;
    private javax.swing.JButton Save_btn;
    private javax.swing.JButton Search;
    private javax.swing.JTextField Search_Box;
    private javax.swing.JButton Search_btn;
    private javax.swing.JPanel Search_panel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
