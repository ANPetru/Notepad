
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.undo.UndoManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alux9127477l
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    File fileRead;
    File fileWrite;
    UndoManager undoManager;
    
    public MainFrame() {
        initComponents();
        initVariables();

    }

    private void initVariables() {
        fileRead = null;
        fileWrite = null;
        undoManager=new UndoManager();
        textAreaDisplay.getDocument().addUndoableEditListener(undoManager);
        textAreaDisplay.setText("");
    }

    private void writeOnFile() throws IOException {
        PrintWriter output = null;
        try {
            output = new PrintWriter(new FileWriter(fileWrite));
            output.write(textAreaDisplay.getText());
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    private void readFromFile() throws IOException {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(fileRead));
            String line = "";
            while ((line = input.readLine()) != null) {
                textAreaDisplay.setText(textAreaDisplay.getText() + line + "\n");
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnSave = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDisplay = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        btnNew = new javax.swing.JMenuItem();
        btnFileOpenFile = new javax.swing.JMenuItem();
        btnFileSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnUndo = new javax.swing.JMenuItem();
        btnRedo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        btnSave.setText(bundle.getString("MainFrame.btnSave.text")); // NOI18N
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSave);

        btnOpenFile.setText(bundle.getString("MainFrame.btnOpenFile.text")); // NOI18N
        btnOpenFile.setFocusable(false);
        btnOpenFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpenFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOpenFile);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        textAreaDisplay.setColumns(20);
        textAreaDisplay.setRows(5);
        jScrollPane1.setViewportView(textAreaDisplay);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        menuFile.setText(bundle.getString("MainFrame.menuFile.text")); // NOI18N

        btnNew.setText(bundle.getString("MainFrame.btnNew.text")); // NOI18N
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        menuFile.add(btnNew);

        btnFileOpenFile.setText(bundle.getString("MainFrame.btnFileOpenFile.text")); // NOI18N
        btnFileOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileOpenFileActionPerformed(evt);
            }
        });
        menuFile.add(btnFileOpenFile);

        btnFileSave.setText(bundle.getString("MainFrame.btnFileSave.text")); // NOI18N
        btnFileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileSaveActionPerformed(evt);
            }
        });
        menuFile.add(btnFileSave);
        menuFile.add(jSeparator1);

        btnExit.setText(bundle.getString("MainFrame.btnExit.text")); // NOI18N
        menuFile.add(btnExit);

        jMenuBar1.add(menuFile);

        jMenu2.setText(bundle.getString("MainFrame.jMenu2.text")); // NOI18N

        btnUndo.setText(bundle.getString("MainFrame.btnUndo.text")); // NOI18N
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });
        jMenu2.add(btnUndo);

        btnRedo.setText(bundle.getString("MainFrame.btnRedo.text")); // NOI18N
        btnRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedoActionPerformed(evt);
            }
        });
        jMenu2.add(btnRedo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("MainFrame.jMenu3.text")); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText(bundle.getString("MainFrame.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        int n = JOptionPane.showConfirmDialog(this, "Do you want to delete current text?", "Remove test?", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            initVariables();
        }

    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "text file", "txt");
        chooser.setFileFilter(filter);
        int returnVal;
        returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            fileWrite = chooser.getSelectedFile();
            try {
                writeOnFile();
            } catch (IOException e) {

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "text file", "txt");
        chooser.setFileFilter(filter);
        int returnVal;
        returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            fileRead = chooser.getSelectedFile();
            try {
                readFromFile();
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
     }//GEN-LAST:event_btnOpenFileActionPerformed

    private void btnFileOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileOpenFileActionPerformed
        btnOpenFileActionPerformed(evt);
    }//GEN-LAST:event_btnFileOpenFileActionPerformed

    private void btnFileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileSaveActionPerformed
        btnSaveActionPerformed(evt);
    }//GEN-LAST:event_btnFileSaveActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showConfirmDialog(this, "This program is an exercice for the Programming subject. IES ElCaminas","",JOptionPane.OK_CANCEL_OPTION);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
        undoManager.undo();
    }//GEN-LAST:event_btnUndoActionPerformed

    private void btnRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedoActionPerformed
        undoManager.redo();
    }//GEN-LAST:event_btnRedoActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JMenuItem btnFileOpenFile;
    private javax.swing.JMenuItem btnFileSave;
    private javax.swing.JMenuItem btnNew;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JMenuItem btnRedo;
    private javax.swing.JButton btnSave;
    private javax.swing.JMenuItem btnUndo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu menuFile;
    private javax.swing.JTextArea textAreaDisplay;
    // End of variables declaration//GEN-END:variables
}
