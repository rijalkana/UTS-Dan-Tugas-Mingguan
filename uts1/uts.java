package boh;

import com.sun.istack.internal.logging.Logger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JFileChooser;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iqbal
 */
public class uts extends javax.swing.JFrame {

    /**
     * Creates new form uts
     */
    public uts() {
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

        open = new javax.swing.JButton();
        openfile = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cv2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        open.setLabel("open fie");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        jButton1.setText("convert doc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("txt to doc");

        cv2.setText("convert txt");
        cv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cv2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(openfile, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(open))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(cv2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(open, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openfile, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cv2))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static String readtxt() {
        String filepath = "D:\\input.txt";
        BufferedReader br = null;
        String content = null;
        try {
            br = new BufferedReader(new FileReader(filepath));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
                sb.append(System.lineSeparator());

            }
            content = sb.toString();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {

            try {
                br.close();
            } catch (IOException e) {
            }
        }
        return content;
    }

    public static void writer(String a) {
        java.io.File newTextFile = new java.io.File("D:\\readuts.doc");
        //String NewTextFile = null;
        try (FileWriter fwl = new FileWriter(newTextFile)) {
            fwl.write(a);
        } catch (IOException iox) {
        }
    }
     public static void writerdocx(String a) {
        java.io.File newTextFile = new java.io.File("D:\\readuts.docx");
        //String NewTextFile = null;
        try (FileWriter fwl = new FileWriter(newTextFile)) {
            fwl.write(a);
        } catch (IOException iox) {
        }
    }

//    private static String readdoc() {

//////        String filepath = "D:\\apa.doc";
//////        BufferedReader br = null;
//////        String content = null;
//////        try {
//////            br = new BufferedReader(new FileReader(filepath));
//////            StringBuilder sb = new StringBuilder();
//////            String line = br.readLine();
//////
//////            while (line != null) {
//////                sb.append(line);
//////                line = br.readLine();
//////                sb.append(System.lineSeparator());
//////
//////            }
//////            content = sb.toString();
//////        } catch (FileNotFoundException e) {
//////        } catch (IOException e) {
//////        } finally {
//////
//////            try {
//////                br.close();
//////            } catch (IOException e) {
//////            }
//////        }
//////        return content;
//////
////////       File filenya = new File("D:\\apa1.doc");
////////        WordExtractor extractor = null;
////////        try {
////////            FileInputStream fis = new FileInputStream(filenya.getAbsolutePath());
////////            HWPFDocument document = new HWPFDocument(fis);
////////            extractor = new WordExtractor(document);
////////            String fileText = extractor.getText();
////////            //System.out.println(fileText);
////////        } catch (Exception exep) {
////////            exep.printStackTrace();
////////        }
////////        
////////        return null;
//////    }
//////
    


    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        JFileChooser chooser = new JFileChooser("");
        File filenya;

        int buka_dialog = chooser.showOpenDialog(uts.this);

        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            filenya = chooser.getSelectedFile();
            openfile.setText(filenya.getPath());
            String file = filenya.getPath();
            readtxt();

        }
    }//GEN-LAST:event_openActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        writer(readtxt());
        System.out.println(readtxt());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cv2ActionPerformed
        writerdocx(readtxt());
        System.out.println(readtxt());
    }//GEN-LAST:event_cv2ActionPerformed

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
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cv2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton open;
    private javax.swing.JTextField openfile;
    // End of variables declaration//GEN-END:variables

}
