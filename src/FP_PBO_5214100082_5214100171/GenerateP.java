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
import java.util.Collections;
import java.util.Scanner;



/**
 *
 * @author User Fandhi Akhmad dan Rheindra Alfarizi
 */
public class GenerateP extends javax.swing.JFrame {

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
    
    public GenerateP() {
        initComponents();
        daftarmatkul.removeAllItems();
        daftarbab.removeAllItems();
        hapussoal.removeAllItems();
        refresh.setEnabled(true);
        generate.setEnabled(true);
        delete.setEnabled(true);
        shuffle.setEnabled(true);
        save.setEnabled(true);
        jumlahsoal.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jComboBox14 = new javax.swing.JComboBox();
        jComboBox15 = new javax.swing.JComboBox();
        scrollPane16 = new java.awt.ScrollPane();
        jLabel13 = new javax.swing.JLabel();
        scrollPane17 = new java.awt.ScrollPane();
        scrollPane18 = new java.awt.ScrollPane();
        scrollPane19 = new java.awt.ScrollPane();
        scrollPane20 = new java.awt.ScrollPane();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        scrollPane1 = new java.awt.ScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        generate = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        hasiltext = new javax.swing.JTextArea();
        daftarmatkul = new javax.swing.JComboBox();
        daftarbab = new javax.swing.JComboBox();
        jumlahsoal = new javax.swing.JComboBox();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        hapussoal = new javax.swing.JComboBox();
        shuffle = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lihat Soal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("Daftar Matakuliah");

        jLabel15.setText("Daftar Pokok Bahasan");

        jLabel16.setText("Jawaban :");

        jLabel17.setText("Soal :");

        jButton6.setText("Lihat Soal");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addGap(10, 10, 10)
                .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Soal");
        setPreferredSize(new java.awt.Dimension(640, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Portable", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButton1.setText(" Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Input");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Generate");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("List");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton4, jButton5, jButton7});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton4, jButton5, jButton7});

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generate Soal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel10.setPreferredSize(new java.awt.Dimension(413, 867));

        jLabel29.setText("Mata Kuliah");

        jLabel30.setText("Pokok Bahasan");

        generate.setText("Generate Soal");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FP_PBO_5214100082_5214100171/ehome.png"))); // NOI18N

        jLabel1.setText("Jumlah Soal");

        jButton8.setText("Choose File");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        hasiltext.setColumns(20);
        hasiltext.setRows(5);
        jScrollPane7.setViewportView(hasiltext);

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
        jumlahsoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahsoalActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Hapus Soal");

        hapussoal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hapussoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapussoalActionPerformed(evt);
            }
        });

        shuffle.setText("Shuffle");
        shuffle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shuffleActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hapussoal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(daftarmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(daftarbab, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel28)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jumlahsoal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(shuffle)
                            .addComponent(jButton8)
                            .addComponent(save))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refresh)
                            .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {delete, generate, jButton8, refresh, save, shuffle});

        jPanel10Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {daftarbab, daftarmatkul, hapussoal, jLabel1, jLabel2, jLabel29, jLabel30, jumlahsoal});

        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(daftarmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(daftarbab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jumlahsoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(hapussoal)))
                .addGap(31, 31, 31)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(refresh))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shuffle)
                    .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(delete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {delete, generate, jButton8, refresh, save, shuffle});

        scrollPane1.add(jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Portable.GenerateP = 3;
        new GenerateP().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        Portable.InputP = 1;
        new InputP().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new FP_PBO_5214100082_5214100171().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        if (datapenuh1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Refresh Terlebih Dahulu");
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
        delete.setEnabled(true);
        shuffle.setEnabled(true);
        save.setEnabled(true);
        }                                          
    }//GEN-LAST:event_generateActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    int returnVal = fileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
    File file = fileChooser.getSelectedFile();
    filename2 = file.getAbsolutePath();
    } else {
        System.out.println("Batal Membuka File");
    }
        refresh.setEnabled(true);
        generate.setEnabled(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

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
    }//GEN-LAST:event_saveActionPerformed

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
        // TODO add your handling code here:
        jumlahsoal.removeAllItems();
        hapussoal.removeAllItems();
        int x = 0;
        for (int i = 0; i < datapenuh1.size(); i++) {
            if(datapenuh1.get(i).getMatakuliah().equals(daftarmatkul.getSelectedItem())&&
                    datapenuh1.get(i).getPokokbahasan().equals(daftarbab.getSelectedItem())){
                x++;
            }
        }
        for (int i = 0; i < x; i++) {
            jumlahsoal.addItem(i+1);
            hapussoal.addItem(i+1);
        }
    }//GEN-LAST:event_daftarbabActionPerformed

    private void jumlahsoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahsoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahsoalActionPerformed

    private void hapussoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapussoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapussoalActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int x = Integer.parseInt(hapussoal.getSelectedItem().toString());
        for (int i = 0; i < datapenuh1.size(); i++) {
            if (datapenuh1.get(i).getSoal().equals(datakhusus.get(x-1).getSoal())) {
                datapenuh1.remove(i);
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(filename2);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(datapenuh1);
            oos.flush();
            } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerateP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GenerateP.class.getName()).log(Level.SEVERE, null, ex);
        }
        hasiltext.setText("");
    }//GEN-LAST:event_deleteActionPerformed

    private void shuffleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shuffleActionPerformed
        // TODO add your handling code here:
        StringBuffer sb = new StringBuffer();
        Collections.shuffle(datakhusus);
        
        for (int i = 0; i < Integer.parseInt(jumlahsoal.getSelectedItem().toString()); i++) {
            datajawabanacak.add(datakhusus.get(i).getJawabanA());
            datajawabanacak.add(datakhusus.get(i).getJawabanB());
            datajawabanacak.add(datakhusus.get(i).getJawabanC());
            datajawabanacak.add(datakhusus.get(i).getJawabanD());
            Collections.shuffle(datajawabanacak);
            
            sb.append(i+1+". "+datakhusus.get(i).getSoal()+"\n");
            sb.append("A. "+datajawabanacak.get(0).substring(0,datajawabanacak.get(0).length()-1)+"\n");
            sb.append("B. "+datajawabanacak.get(1).substring(0,datajawabanacak.get(1).length()-1)+"\n");
            sb.append("C. "+datajawabanacak.get(2).substring(0,datajawabanacak.get(2).length()-1)+"\n");
            sb.append("D. "+datajawabanacak.get(3).substring(0,datajawabanacak.get(3).length()-1)+"\n");
            String jawaban_benar = "Jawaban Benar :";
            if (datajawabanacak.get(0).substring(datajawabanacak.get(0).length()-1).equals("*")) {
                    jawaban_benar = jawaban_benar+"A";
                }
            if (datajawabanacak.get(1).substring(datajawabanacak.get(1).length()-1).equals("*")) {
                    jawaban_benar = jawaban_benar+"B";
                }
            if (datajawabanacak.get(2).substring(datajawabanacak.get(2).length()-1).equals("*")) {
                    jawaban_benar = jawaban_benar+"C";
                }
            if (datajawabanacak.get(3).substring(datajawabanacak.get(3).length()-1).equals("*")) {
                    jawaban_benar = jawaban_benar+"D";            
                }
            
            sb.append(jawaban_benar+"\n");
            datajawabanacak.remove(0);
            datajawabanacak.remove(0);
            datajawabanacak.remove(0);
            datajawabanacak.remove(0);
        }
        hasiltext.setText(sb.toString());
        
    }//GEN-LAST:event_shuffleActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
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
        
    }//GEN-LAST:event_refreshActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Portable.LihatP = 2;
        new LihatP().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox daftarbab;
    private javax.swing.JComboBox daftarmatkul;
    private javax.swing.JButton delete;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton generate;
    private javax.swing.JComboBox hapussoal;
    private javax.swing.JTextArea hasiltext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JComboBox jumlahsoal;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private java.awt.ScrollPane scrollPane1;
    private java.awt.ScrollPane scrollPane16;
    private java.awt.ScrollPane scrollPane17;
    private java.awt.ScrollPane scrollPane18;
    private java.awt.ScrollPane scrollPane19;
    private java.awt.ScrollPane scrollPane20;
    private javax.swing.JButton shuffle;
    // End of variables declaration//GEN-END:variables

    public void saveAs() {
        FileDialog fd = new FileDialog(GenerateP.this, "save", FileDialog.SAVE);
 
        fd.show();
        if(fd.getFile() != null){
        
            fn=fd.getFile();
            direktori=fd.getDirectory();
            filename = direktori + fn + ".txt";
            
            setTitle(filename);
        
            try{
            
                DataOutputStream d = new DataOutputStream(new FileOutputStream(filename));
                tahanText = hasiltext.getText();
                BufferedReader br = new BufferedReader(new StringReader(tahanText));
                while ((tahanText = br.readLine()) != null){
                    
                    d.writeBytes(tahanText = "\r\n" );
                    d.close();
                    
                }
            }
            catch (Exception e){
            
                System.out.println("File Note Found!~~");
                
            }
            hasiltext.requestFocus();
            save(filename);
            }
    }

    public void save(String fn) {
        setTitle(namaProgram+" "+filename);
        try{
        
        FileWriter fw;
        fw = new FileWriter(fn);
        BufferedWriter bw = new BufferedWriter(fw);
        hasiltext.write(bw);
        bw.close();
        hasiltext.setText("");
            hasiltext.requestFocus();
            
        
        } catch (Exception err) {
            System.out.println("Error!~ "+ err);
        }
        perubahanText = false;
    }

    public void masukkan_data() {
        try {
            LinkedList<String> datamatakuliah = new LinkedList<String>();
            LinkedList<String> datapokokbahasan = new LinkedList<String>();
            LinkedList<String> datasoal = new LinkedList<String>();
            LinkedList<String> datajawabanA = new LinkedList<String>();
            LinkedList<String> datajawabanB = new LinkedList<String>();
            LinkedList<String> data_jawabanC = new LinkedList<String>();
            LinkedList<String> data_jawabanD = new LinkedList<String>();
            LinkedList<String> datainput = new LinkedList<String>();
            LinkedList<String> datajawabanacak = new LinkedList<String>();
            
            File file   = new File("");
            Scanner abc = new Scanner(file);
            String xyz  =null;
            int index[] = new int[7];
            while (abc.hasNextLine())
            {
                xyz = abc.nextLine();
                
                int a = 0;
                for (int i = 0; i < xyz.length(); i++) {
                    if (xyz.substring(i,i+1).equals(";")) {
                        index[a]=i;
                        a++;
                    }
                }
                datamatakuliah.add(xyz.substring(0,index[0]));
                datapokokbahasan.add(xyz.substring(index[0]+1,index[1]));
                datasoal.add(xyz.substring(index[1]+1,index[2]));
                datajawabanA.add(xyz.substring(index[2]+1,index[3]));
                datajawabanB.add(xyz.substring(index[3]+1,index[4]));
                datajawabanC.add(xyz.substring(index[4]+1,index[5]));
                datajawabanD.add(xyz.substring(index[5]+1,index[6]));
                datainput.add(xyz.substring(index[1]+1,index[2])+";"+xyz.substring(index[2]+1,index[3])+";"+xyz.substring(index[3]+1,index[4])+";"+
                        xyz.substring(index[4]+1,index[5])+";"+xyz.substring(index[5]+1,index[6])+";");
            }
            for (int i = 0; i < datainput2.size(); i++) {
                datainput2.poll();
                datainput2.poll();
            }
            for (int i = 0; i < datamatakuliah.size(); i++) {
                if (datamatakuliah.get(i).equals(daftarmatkul.getSelectedItem())
                        && datapokokbahasan.get(i).equals(daftarbab.getSelectedItem())) {
                    datainput2.add(datainput2.get(i));
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerateP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}