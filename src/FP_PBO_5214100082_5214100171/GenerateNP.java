
package FP_PBO_5214100082_5214100171;

import java.awt.Dimension;
import java.awt.Toolkit;
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

/**
 *
 * @author user Fandhi Akhmad dan Rheindra Alfarizi
 */
public class GenerateNP extends javax.swing.JFrame {

    static int nonportable, list, generate,login;
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
    
    
    public GenerateNP() {
    initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation (
        (screenSize.width - frameSize.width) / 2,
        (screenSize.height - frameSize.height) / 2);
        daftarmatkul.removeAllItems();
        daftarbab.removeAllItems();
        refreshnp.setEnabled(true);
        generatenp.setEnabled(true);
        savenp.setEnabled(true);
        jumlahsoal.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        FileChooser = new javax.swing.JFileChooser();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        daftarmatkul = new javax.swing.JComboBox();
        daftarbab = new javax.swing.JComboBox();
        jumlahsoal = new javax.swing.JComboBox();
        generatenp = new javax.swing.JButton();
        savenp = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        hasiltext = new javax.swing.JTextArea();
        refreshnp = new javax.swing.JButton();
        choosefile = new javax.swing.JButton();
        exportfile = new javax.swing.JButton();
        importfile = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FP_PBO_5214100082_5214100171/ehome.png"))); // NOI18N

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Non Portable"));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FP_PBO_5214100082_5214100171/ehome.png"))); // NOI18N

        jLabel1.setText("Mata Kuliah");

        jLabel2.setText("Pokok Bahasan");

        jLabel3.setText("Jumlah Soal");

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

        jumlahsoal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        generatenp.setText("Generate");
        generatenp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatenpActionPerformed(evt);
            }
        });

        savenp.setText("Save");
        savenp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savenpActionPerformed(evt);
            }
        });

        hasiltext.setColumns(20);
        hasiltext.setRows(5);
        jScrollPane2.setViewportView(hasiltext);

        refreshnp.setText("Refresh");
        refreshnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshnpActionPerformed(evt);
            }
        });

        choosefile.setText("Choose File");
        choosefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosefileActionPerformed(evt);
            }
        });

        exportfile.setText("Export");
        exportfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportfileActionPerformed(evt);
            }
        });

        importfile.setText("Import");
        importfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importfileActionPerformed(evt);
            }
        });

        jButton5.setText("List Mata Kuliah");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("List Pokok Bahasan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("List Soal");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jumlahsoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(daftarbab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(43, 43, 43)
                                .addComponent(daftarmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(exportfile)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(importfile))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(savenp)
                                            .addComponent(choosefile))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(refreshnp, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(generatenp))))
                                .addGap(0, 33, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(28, 28, 28)
                        .addComponent(jButton7)))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {choosefile, daftarbab, daftarmatkul, exportfile, generatenp, importfile, jumlahsoal, refreshnp, savenp});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton5, jButton6, jButton7});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel29)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(daftarmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choosefile)
                    .addComponent(refreshnp))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(daftarbab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savenp)
                    .addComponent(generatenp))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jumlahsoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportfile)
                    .addComponent(importfile))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {choosefile, daftarbab, daftarmatkul, exportfile, generatenp, importfile, jumlahsoal, refreshnp, savenp});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton5, jButton6, jButton7});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Non Portable"));

        jButton1.setText("Generate");

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Main Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        new FP_PBO_5214100082_5214100171().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void generatenpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatenpActionPerformed
    if (datapenuh1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Refresh, Please!");
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
        savenp.setEnabled(true);
        exportfile.setEnabled(true);
        importfile.setEnabled(true);
        }                              
    }//GEN-LAST:event_generatenpActionPerformed

    private void refreshnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshnpActionPerformed
       if (filename2.equals("")) {
            JOptionPane.showMessageDialog(null, "Choose File, Please");
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
        
    }//GEN-LAST:event_refreshnpActionPerformed

    private void savenpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savenpActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showSaveDialog(this);
        File f = chooser.getSelectedFile();
        filename3 = f.getAbsolutePath();
        
        try{
            FileWriter writer;
            writer = new FileWriter(filename3);
            BufferedWriter bw = new BufferedWriter(writer);
            hasiltext.write(bw);
            bw.close();
            hasiltext.setText("");
            hasiltext.requestFocus();
            
            JOptionPane.showMessageDialog(null,"Penyimpanan Berhasil !");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Penyimpanan Gagal !");
        }       
    }//GEN-LAST:event_savenpActionPerformed

    private void daftarmatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarmatkulActionPerformed
        
       daftarbab.removeAllItems();
       databab.clear();
        for (int i = 0; i < datapenuh1.size(); i++) {
            if(datapenuh1.get(i).getMatakuliah().equals(daftarmatkul.getSelectedItem()) &&
            databab.add(datapenuh1.get(i).getPokokbahasan()));
            }
        LinkedList<String> list = new LinkedList<String>(databab);
        for (int i = 0; i < list.size(); i++) {            
            daftarbab.addItem(list.get(i));
        }
    }//GEN-LAST:event_daftarmatkulActionPerformed

    private void daftarbabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarbabActionPerformed
        
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

    private void choosefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosefileActionPerformed
        // TODO add your handling code here:
    int returnVal = FileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
    File file = FileChooser.getSelectedFile();
    filename2 = file.getAbsolutePath();
    } else {
        System.out.println("Batal Membuka File");
    }
        refreshnp.setEnabled(true);
        generatenp.setEnabled(true);
    }//GEN-LAST:event_choosefileActionPerformed

    private void importfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importfileActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn  = DriverManager.getConnection("jdbc:mysql://localhost/banksoal", "root", "");
            int a = 0;
            
            for (int i = 0; i < datapenuh1.size(); i++) {
                pstmt = conn.prepareStatement("insert into soalbank values(?,?,?,?,?,?,?,?)");
                pstmt.setString(1, datapenuh1.get(i).getMatakuliah().toString());
                pstmt.setString(2, datapenuh1.get(i).getPokokbahasan().toString());
                pstmt.setString(3, datapenuh1.get(i).getSoal().toString());
                pstmt.setString(4, datapenuh1.get(i).getJawabanA().toString());
                pstmt.setString(5, datapenuh1.get(i).getJawabanB().toString());
                pstmt.setString(6, datapenuh1.get(i).getJawabanC().toString());
                pstmt.setString(7, datapenuh1.get(i).getJawabanD().toString());
                String jwbBenar = "";                
                if (datapenuh1.get(i).getJawabanA().toString().substring(datapenuh1.get(i).getJawabanA().length()-1).equals("*")) {
                    jwbBenar += "A";
                }
                if (datapenuh1.get(i).getJawabanB().toString().substring(datapenuh1.get(i).getJawabanB().length()-1 ).equals("*")) {
                    jwbBenar += "B";
                }
                if (datapenuh1.get(i).getJawabanC().toString().substring(datapenuh1.get(i).getJawabanC().length()-1 ).equals("*")) {
                    jwbBenar += "C";
                }
                if (datapenuh1.get(i).getJawabanD().toString().substring(datapenuh1.get(i).getJawabanD().length()-1 ).equals("*")) {
                    jwbBenar += "D";
                }
                
                pstmt.setString(8, jwbBenar);
            a = pstmt.executeUpdate();
            }
            
            
            
            if (a > 0) {
                JOptionPane.showMessageDialog(null, "Data telah tersimpan");
            } else  {
                JOptionPane.showMessageDialog(null, "Data tidak tersimpan");
            }
        } catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_importfileActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        GenerateNP.nonportable = 1;
        new NonPortable().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void exportfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportfileActionPerformed
        // TODO add your handling code here:
        StringBuffer strBfr = new StringBuffer();
        int a =1 ;
            try {
            Connection conne = null;
            ResultSet rss = null;
            conne = DriverManager.getConnection("jdbc:mysql://localhost/banksoal", "root", "");
            String sql1 = "select * from soalbank";
            PreparedStatement pss = conne.prepareStatement(sql1);
            rss = pss.executeQuery();

            while(rss.next()){
                strBfr.append(a+" . "+rss.getString("soal")+"\n");
                strBfr.append("A. "+rss.getString("jawabanA")+"\n");
                strBfr.append("B. "+rss.getString("jawabanB")+"\n");
                strBfr.append("C. "+rss.getString("jawabanC")+"\n");
                strBfr.append("D. "+rss.getString("jawabanD")+"\n");
                strBfr.append("Jawaban Benar : " +rss.getString("jawabanBenar") +"\n");
                a++;
            }
            
            hasiltext.setText(strBfr.toString());

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error");
        }
            
            
    }//GEN-LAST:event_exportfileActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        StringBuffer strBfr = new StringBuffer();
            try {
            Connection conne = null;
            ResultSet rss = null;
            conne = DriverManager.getConnection("jdbc:mysql://localhost/banksoal", "root", "");
            String sql1 = "select distinct matakuliah from soalbank";
            PreparedStatement pss = conne.prepareStatement(sql1);
            rss = pss.executeQuery();

            while(rss.next()){
                strBfr.append(rss.getString("matakuliah"));
                strBfr.append("\n");
            }
            
            hasiltext.setText(strBfr.toString());

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        StringBuffer strBfr = new StringBuffer();
            try {
            Connection conne = null;
            ResultSet rss = null;
            conne = DriverManager.getConnection("jdbc:mysql://localhost/banksoal", "root", "");
            String sql1 = "select distinct pokokbahasan from soalbank";
            PreparedStatement pss = conne.prepareStatement(sql1);
            rss = pss.executeQuery();

            while(rss.next()){
                strBfr.append(rss.getString("pokokbahasan"));
                strBfr.append("\n");
            }
            
            hasiltext.setText(strBfr.toString());

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        StringBuffer strBfr = new StringBuffer();
            try {
            Connection conn = null;
            ResultSet rss = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/banksoal", "root", "");
            String sql = "select distinct soal, jawabanA, jawabanB, jawabanC, jawabanD, jawabanBenar from soalbank";
            PreparedStatement ps = conn.prepareStatement(sql);
            rss = ps.executeQuery();
            int a = 1;
            while(rss.next()){
                strBfr.append(a+" . "+rss.getString("soal"));
                strBfr.append("A. "+rss.getString("jawabanA")+"\n");
                strBfr.append("B. "+rss.getString("jawabanB")+"\n");
                strBfr.append("C. "+rss.getString("jawabanC")+"\n");
                strBfr.append("D. "+rss.getString("jawabanD")+"\n");
                strBfr.append("Jawaban Benar : " +rss.getString("jawabanBenar") +"\n");
                a++;
            }
            
            hasiltext.setText(strBfr.toString());

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateNP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton choosefile;
    private javax.swing.JComboBox daftarbab;
    private javax.swing.JComboBox daftarmatkul;
    private javax.swing.JButton exportfile;
    private javax.swing.JButton generatenp;
    private javax.swing.JTextArea hasiltext;
    private javax.swing.JButton importfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jumlahsoal;
    private javax.swing.JButton refreshnp;
    private javax.swing.JButton savenp;
    // End of variables declaration//GEN-END:variables
}
