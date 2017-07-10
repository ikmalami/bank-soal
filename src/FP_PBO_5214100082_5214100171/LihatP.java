package FP_PBO_5214100082_5214100171;

import java.awt.FileDialog;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author User Fandhi dan Rheindra Alfarizi
 */
public class LihatP extends javax.swing.JFrame {

    private String fn;
    private String direktori;
    private String filename = "";
    private String filename2 = "";
    private String filename3 = "";
    private String filename4 = "";
    private String tahanText;
    private String namaProgram = "Bank Soal";
    private boolean perubahanText = false;
    Database baru,terbaru;
    LinkedList<Database>datapenuh= new LinkedList<Database>();
    LinkedList<Database>datapenuh1= new LinkedList<Database>();
    LinkedList<Database>datakhusus= new LinkedList<Database>();
    LinkedList<String> datamatakuliah = new LinkedList<String>();
    LinkedList<String> datapokokbahasan = new LinkedList<String>();
    LinkedList<String> datasoal = new LinkedList<String>();
    LinkedList<String>datajawaban= new LinkedList<String>();
    LinkedList<String>datajawabanacak = new LinkedList<String>();
    LinkedList<String>datajawabanA = new LinkedList<String>();
    LinkedList<String>datajawabanB = new LinkedList<String>();
    LinkedList<String>datajawabanC = new LinkedList<String>();
    LinkedList<String>datajawabanD = new LinkedList<String>();
    LinkedHashSet<String>data = new LinkedHashSet<String>();
    LinkedList<String>data2 = new LinkedList<String>();
    LinkedList<String>data3 = new LinkedList<String>();
    LinkedHashSet<String>databab = new LinkedHashSet<String>();
    LinkedList<String>datainput = new LinkedList<String>();
    LinkedList<String> datainput2 = new LinkedList<String>();
    
    public LihatP() {
        initComponents();
        daftarmatkul.removeAllItems();
        daftarbab.removeAllItems();
        jumlahsoal.setEnabled(true);
        check.setEnabled(true);
        view.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox7 = new javax.swing.JComboBox();
        jRadioButton19 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        scrollPane6 = new java.awt.ScrollPane();
        fileChooser = new javax.swing.JFileChooser();
        scrollPane8 = new java.awt.ScrollPane();
        jPanel5 = new javax.swing.JPanel();
        daftarmatkul = new javax.swing.JComboBox();
        daftarbab = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        check = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasiltext = new javax.swing.JTextArea();
        openFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jumlahsoal = new javax.swing.JComboBox();
        view = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jRadioButton19.setText("jRadioButton1");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });

        jButton4.setText("Back");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 700));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        daftarmatkul.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        daftarmatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarmatkulActionPerformed(evt);
            }
        });

        daftarbab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        daftarbab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarbabActionPerformed(evt);
            }
        });

        jLabel14.setText("Mata Kuliah");

        jLabel15.setText("Pokok Bahasan");

        jLabel17.setText("Daftar Soal");

        check.setText("Check");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FP_PBO_5214100082_5214100171/ehome.png"))); // NOI18N

        hasiltext.setColumns(20);
        hasiltext.setRows(5);
        jScrollPane1.setViewportView(hasiltext);

        openFile.setText("File");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });

        jLabel1.setText("Jumlah Soal");

        jumlahsoal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jumlahsoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahsoalActionPerformed(evt);
            }
        });

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(daftarbab, 0, 100, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(daftarmatkul, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jumlahsoal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(openFile)
                                    .addComponent(view))
                                .addGap(25, 25, 25)))))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {check, openFile, view});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daftarmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(daftarbab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(openFile)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jumlahsoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel17))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(view)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {check, openFile, view});

        scrollPane8.add(jPanel5);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Portable", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButton3.setText("List");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText(" Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton10.setText("Input");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton5.setText("Generate");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton10, jButton3, jButton5});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton10, jButton3, jButton5});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Portable.LihatP = 2;
        new LihatP().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new FP_PBO_5214100082_5214100171().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Portable.InputP = 1;
        new InputP().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Portable.GenerateP = 3;
        new GenerateP().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void daftarmatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarmatkulActionPerformed
        // TODO add your handling code here:
       daftarbab.removeAllItems();
       databab.clear();
       for (int i = 0; i < datapenuh1.size(); i++) {
            if(datapenuh1.get(i).getMatakuliah().equals(daftarmatkul.getSelectedItem()))
            databab.add(datapenuh1.get(i).getPokokbahasan());
            
        }
       
        LinkedList<String> list = new LinkedList<String>(databab);
        for (int i = 0; i < list.size(); i++) {            
            daftarbab.addItem(list.get(i));
        }        
    }//GEN-LAST:event_daftarmatkulActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here: 
        if (filename2.equals("")) {
        JOptionPane.showMessageDialog(null, "Silahkan Pilih File");
        } else {
        daftarmatkul.removeAllItems();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename2));
            Object booksIn = ois.readObject();
            datapenuh1 = (LinkedList<Database>)booksIn;
            ois.close();
        } catch (Exception exc){}
        datamatakuliah.clear();
        for (int i = 0; i < datapenuh1.size(); i++) {
            datamatakuliah.add(datapenuh1.get(i).getMatakuliah());
        }
        LinkedList<String> list = new LinkedList<String>(datamatakuliah);
        for (int i = 0; i < datamatakuliah.size(); i--) {
            daftarmatkul.addItem(list.get(i));
            }
        }
    }//GEN-LAST:event_checkActionPerformed

    private void daftarbabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarbabActionPerformed
        // TODO add your handling code here:
        jumlahsoal.removeAllItems();
        int x = 0;
        for (int i = 0; i < datapenuh1.size(); i++) {
            if(datapenuh1.get(i).getMatakuliah().equals(daftarmatkul.getSelectedItem())&&
                    datapenuh1.get(i).getPokokbahasan().equals(daftarbab.getSelectedItem())){
                x++;
            }
        }
        for (int i = 0; i < x; i++) {
            jumlahsoal.addItem(i+1);
        }        
    }//GEN-LAST:event_daftarbabActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
    int returnVal = fileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
    File file = fileChooser.getSelectedFile();
    filename2 = file.getAbsolutePath();
    } else {
        System.out.println("Batal Membuka File");
    }
        check.setEnabled(true);
        view.setEnabled(true);
    }//GEN-LAST:event_openFileActionPerformed

    private void jumlahsoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahsoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahsoalActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here: 
        if (datapenuh1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Silahkan Check Dahulu");
        } else {
        StringBuffer sb = new StringBuffer();
        while (!datakhusus.isEmpty()) {
        datakhusus.removeFirst();
        }
       
        for (int i = 0; i < datapenuh1.size(); i++) {            
            if(datapenuh1.get(i).getMatakuliah().equals(daftarmatkul.getSelectedItem())&&
               datapenuh1.get(i).getPokokbahasan().equals(daftarbab.getSelectedItem())){
               datakhusus.add(new Database(datapenuh1.get(i).getMatakuliah(),datapenuh1.get(i).getPokokbahasan(),
                            datapenuh1.get(i).getSoal(),
                            datapenuh1.get(i).getJawabanA(),
                            datapenuh1.get(i).getJawabanB(),
                            datapenuh1.get(i).getJawabanC(),
                            datapenuh1.get(i).getJawabanD()));
            }
        }
        String jawabA = "";
        String jawabB = "";
        String jawabC = "";
        String jawabD = "";
        for (int i = 0; i < Integer.parseInt(jumlahsoal.getSelectedItem().toString()); i++) {
            datajawaban.add(datakhusus.get(i).getJawabanA());
            datajawaban.add(datakhusus.get(i).getJawabanB());
            datajawaban.add(datakhusus.get(i).getJawabanC());
            datajawaban.add(datakhusus.get(i).getJawabanD());

            sb.append(i+1+". "+datakhusus.get(i).getSoal()+"\n");
            sb.append("A. "+datajawaban.get(0).substring(0,datajawaban.get(0).length()-1)+"\n");
            sb.append("B. "+datajawaban.get(1).substring(0,datajawaban.get(1).length()-1)+"\n");
            sb.append("C. "+datajawaban.get(2).substring(0,datajawaban.get(2).length()-1)+"\n");
            sb.append("D. "+datajawaban.get(3).substring(0,datajawaban.get(3).length()-1)+"\n");
            String jawaban_benar = "Jawaban Benar :";
            if (datajawaban.get(0).substring(datajawaban.get(0).length()-1).equals("*")) {
                    jawaban_benar = jawaban_benar+"A";
                }
            if (datajawaban.get(1).substring(datajawaban.get(1).length()-1).equals("*")) {
                    jawaban_benar = jawaban_benar+"B";
                }
            if (datajawaban.get(2).substring(datajawaban.get(2).length()-1).equals("*")) {
                    jawaban_benar = jawaban_benar+"C";
                }
            if (datajawaban.get(3).substring(datajawaban.get(3).length()-1).equals("*")) {
                    jawaban_benar = jawaban_benar+"D";            
                }
            
            sb.append(jawaban_benar+"\n");
            datajawaban.remove(0);
            datajawaban.remove(0);
            datajawaban.remove(0);
            datajawaban.remove(0);
        }

        hasiltext.setText(sb.toString());
        }                                        
    }//GEN-LAST:event_viewActionPerformed

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
            java.util.logging.Logger.getLogger(LihatP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LihatP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LihatP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LihatP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LihatP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton check;
    private javax.swing.JComboBox daftarbab;
    private javax.swing.JComboBox daftarmatkul;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JTextArea hasiltext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jumlahsoal;
    private javax.swing.JButton openFile;
    private java.awt.ScrollPane scrollPane6;
    private java.awt.ScrollPane scrollPane8;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}