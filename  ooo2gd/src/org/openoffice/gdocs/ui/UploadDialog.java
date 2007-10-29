/*
 * UploadDialog.java
 *
 * Created on 15 sierpie� 2007, 12:47
 */

package org.openoffice.gdocs.ui;

import java.io.File;
import javax.swing.JOptionPane;
import org.openoffice.gdocs.GoogleDocsWrapper;

/**
 *
 * @author  rmk
 */
public class UploadDialog extends javax.swing.JDialog {
    
    public static final String CREDITIONALS_FILE = "gdocs.dat";
    private static final String SECRET_PHRASE = "$ogorek#";
    private String pathName;
    
    public UploadDialog(String pathName) {
        super();
        this.pathName = pathName;
        initComponents();
        String docName = new File(pathName).getName();            
        setVisibleForDocName(true);            
        setMessageText("File "+pathName+" will be uploaded to Google Docs");
        setDocumentTitle(docName);
        setModal(true);
        toFront();        
    }
    
    private String xorString(String input,String key) {
        char[] keyChars = key.toCharArray();
        char[] inputChars = input.toCharArray();
        for (int i=0; i<inputChars.length; i++) {
            inputChars[i]^=keyChars[i%keyChars.length];
        }
        return new String(inputChars);
    }    
    
    public void setVisibleForDocName(boolean visible) {
        documentNamePanel.setVisible(visible);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jSeparator1 = new javax.swing.JSeparator();
        documentNamePanel = new javax.swing.JPanel();
        docName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        loginPanel1 = new org.openoffice.gdocs.ui.LoginPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Export to Google Docs");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel3.setText("Document name:");

        message.setText("     ");

        javax.swing.GroupLayout documentNamePanelLayout = new javax.swing.GroupLayout(documentNamePanel);
        documentNamePanel.setLayout(documentNamePanelLayout);
        documentNamePanelLayout.setHorizontalGroup(
            documentNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(documentNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(documentNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(documentNamePanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(docName, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                    .addComponent(message, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
                .addContainerGap())
        );
        documentNamePanelLayout.setVerticalGroup(
            documentNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, documentNamePanelLayout.createSequentialGroup()
                .addComponent(message)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(documentNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(docName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(documentNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.toFront();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.toFront();
    }//GEN-LAST:event_formWindowActivated

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.toFront();
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        upload=false;
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        upload=true;
        this.setVisible(false);
        Uploading uploading = new Uploading();
        try {            
            GoogleDocsWrapper wrapper = new GoogleDocsWrapper();
            String docName=getDocumentTitle();
            uploading.setVisible(true);
            wrapper.login(getUserName(),getPassword());                    
            wrapper.upload(pathName,docName);
            JOptionPane.showMessageDialog(null,"File Uploaded");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Problem: "+e.getMessage());
        }
        finally {
            uploading.setVisible(false);
        }        
    }//GEN-LAST:event_jButton1ActionPerformed
        
    public void setMessageText(String messageText) {
        message.setText(messageText);
    }
    
    public String getUserName() {
        return loginPanel1.getUserName();
    }
    
    public String getPassword() {
        return loginPanel1.getPassword();
    }
    
    public boolean getUpload() {
        return upload;
    }
    
    public void setDocumentTitle(String title) {
        docName.setText(title);
    }
    
    public String getDocumentTitle() {
        return docName.getText();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField docName;
    private javax.swing.JPanel documentNamePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private org.openoffice.gdocs.ui.LoginPanel loginPanel1;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
    private boolean upload = false;
}
