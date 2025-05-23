package nezet;

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modell.Konfiguracio;

public class NewJFrame extends javax.swing.JFrame {

    private Konfiguracio modell;

    public NewJFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        cmbKesz = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUjNev = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        chbHirlevel = new javax.swing.JCheckBox();
        cmbSzak = new javax.swing.JComboBox<>();
        txtNev = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuKonfig = new javax.swing.JMenu();
        mnuPrgBetoltes = new javax.swing.JMenuItem();
        mnuPrgMentes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuPrgKilepes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuKimenet = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Konfigurációk"));

        cmbKesz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--== Kiválasztott szak ==--, Szoftverfejlesztő, Rendszergazda, Szoftverfejlesztő és tesztelő" }));
        cmbKesz.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cmbKesz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKeszActionPerformed(evt);
            }
        });

        jLabel3.setText("Új név");

        jLabel4.setText("Kész konfigurációk");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbKesz, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUjNev))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUjNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(cmbKesz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Aktuális konfigurációk"));

        jLabel2.setText("Szak");

        jLabel1.setText("Név");

        chbHirlevel.setSelected(true);
        chbHirlevel.setText("hírlevél");

        cmbSzak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--== Kiválasztott szak ==--", "Szoftverfejlesztő", "Rendszergazda", "Szoftverfejlesztő és tesztelő" }));

        btnReset.setText("Reset");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNev, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbSzak, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbHirlevel))
                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSzak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbHirlevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addContainerGap())
        );

        menuKonfig.setText("Konfiguráció");

        mnuPrgBetoltes.setText("Betöltés...");
        mnuPrgBetoltes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrgBetoltesActionPerformed(evt);
            }
        });
        menuKonfig.add(mnuPrgBetoltes);

        mnuPrgMentes.setText("Mentés...");
        mnuPrgMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrgMentesActionPerformed(evt);
            }
        });
        menuKonfig.add(mnuPrgMentes);
        menuKonfig.add(jSeparator1);

        mnuPrgKilepes.setText("Kilépés...");
        mnuPrgKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrgKilepesActionPerformed(evt);
            }
        });
        menuKonfig.add(mnuPrgKilepes);

        jMenuBar1.add(menuKonfig);

        jMenu1.setText("Program");

        mnuKimenet.setText("Modell beszédes kimenete");
        mnuKimenet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKimenetActionPerformed(evt);
            }
        });
        jMenu1.add(mnuKimenet);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPrgKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrgKilepesActionPerformed
        kilepes();
    }//GEN-LAST:event_mnuPrgKilepesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //System.out.println("kilépés folyamatban...");
        kilepes();
    }//GEN-LAST:event_formWindowClosing

    private void mnuPrgMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrgMentesActionPerformed
        //JFileChooser jfc = new JFileChooser();//Documents könnyvtár
        String hely = System.getProperty("user.dir");
        JFileChooser jfc = new JFileChooser(hely);//aktuális projekt könnyvtár

        /* jfc paraméterezése: */
        File kivalasztottFajl = new File(hely + "\\" + txtNev.getText() + ".txt");
        System.out.println("fajl = " + kivalasztottFajl);
        jfc.setSelectedFile(kivalasztottFajl);

        /* jfc megjelenítése, vizsgálata */
        int gomb = jfc.showSaveDialog(rootPane);//null | this <-- ez ua, mint rootPane

        if (gomb == JFileChooser.APPROVE_OPTION) {
            kivalasztottFajl = jfc.getSelectedFile();
            String fajlElerese = kivalasztottFajl.getAbsolutePath();
            Path path = Path.of(fajlElerese);//hova írjuk
            try {
                Files.writeString(path, tartalom());
            } catch (IOException ex) {
                /* felhasználónak: */
                String msg = "IO hiba!\n" + ex.getMessage();
                JOptionPane.showMessageDialog(rootPane, msg);
                /* fejlesztőnek: */
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        /* a mentés alapszerkezete: */
//        Path path = Path.of("kimenet.txt");//hova írjuk
//        byte[] bytes = jTextField1.getText().getBytes();//mit írunk
//        try {
//            //Files.write(path, bytes);
//            Files.writeString(path, jTextField1.getText());
//        } catch (IOException ex) {// generált kód!!!
//            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_mnuPrgMentesActionPerformed

    private void mnuPrgBetoltesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrgBetoltesActionPerformed
        /* a beolvasás alapszerkezete: */
        JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));//aktuális projekt könnyvtár
        int gomb = jfc.showSaveDialog(rootPane);//null | this <-- ez ua, mint rootPane
        if (gomb == JFileChooser.APPROVE_OPTION) {
            File kivalasztottFajl = jfc.getSelectedFile();
            try {
                String adatok = Files.readString(kivalasztottFajl.toPath());
                System.out.println("A beolvasott fájl tartalma: ");
                System.out.println(adatok);

                /* sorok feldolgozása */
                String[] sorok = adatok.split("\n");
                String nev = sorok[0];
                int index = Integer.parseInt(sorok[1]);
                boolean chb = Boolean.parseBoolean(sorok[2]);

                txtNev.setText(modell.getNev());
                cmbSzak.setSelectedIndex(modell.getSzakIndex());
                chbHirlevel.setSelected(modell.isHirlevel());
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mnuPrgBetoltesActionPerformed

    private void cmbKeszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKeszActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKeszActionPerformed

    private void mnuKimenetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKimenetActionPerformed
        /*TODO: 
            *ha nincs modell betöltve, akkor az nullPointer
            * a szak nevet is ki kell nyerni, most ??? van helyette
        */
        
        String msg = "név: " + modell.getNev()
                + "\nszak: %s(%d)".formatted("???", modell.getSzakIndex())
                + "\nhírlevél :" + (modell.isHirlevel() ? "kér" : "nem kér");

        try {
            Files.writeString(Path.of("modellBeszedes.txt"), msg);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuKimenetActionPerformed

    private String tartalom() {
        String nev = txtNev.getText();
        //String szak = cmbSzak.getSelectedItem().toString();
        String szak = (String) cmbSzak.getSelectedItem();
        boolean hirlevel = chbHirlevel.isSelected();
        final String SEP = " ";
        return nev + SEP + cmbSzak.getSelectedIndex() + SEP + hirlevel;
    }

    private void kilepes() throws HeadlessException {
        String msg = "Biztos kilépsz?";
        String cim = "KILÉPÉS";
        int msgTip = JOptionPane.QUESTION_MESSAGE;
        int optTip = JOptionPane.YES_NO_OPTION;//.OK_CANCEL_OPTION;
        //JOptionPane.showMessageDialog(this, msg, cim, msgTip);
        int gomb = JOptionPane.showConfirmDialog(rootPane, msg, cim, optTip);
        if (gomb == JOptionPane.YES_OPTION) {
            int hibaKod = 0;
            System.exit(hibaKod);
        }

        //System.out.println("gomb = " + gomb);//YES: 0, NO: 1 , X: -1
    }

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox chbHirlevel;
    private javax.swing.JComboBox<String> cmbKesz;
    private javax.swing.JComboBox<String> cmbSzak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu menuKonfig;
    private javax.swing.JMenuItem mnuKimenet;
    private javax.swing.JMenuItem mnuPrgBetoltes;
    private javax.swing.JMenuItem mnuPrgKilepes;
    private javax.swing.JMenuItem mnuPrgMentes;
    private javax.swing.JTextField txtNev;
    private javax.swing.JTextField txtUjNev;
    // End of variables declaration//GEN-END:variables
}
