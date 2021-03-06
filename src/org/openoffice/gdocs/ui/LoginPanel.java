// (c) 2007 by Przemyslaw Rumik
// myBlog: http://przemelek.blogspot.com
// project page: http://ooo2gd.googlecode.com
// contact with me: http://przemelek.googlepages.com/kontakt
package org.openoffice.gdocs.ui;

import java.io.Serializable;
import org.openoffice.gdocs.configuration.Configuration;
import org.openoffice.gdocs.ui.dialogs.ConfigDialog;
import org.openoffice.gdocs.util.Creditionals;
import org.openoffice.gdocs.util.Util;

public class LoginPanel extends javax.swing.JPanel implements Serializable {
    
    private String system;
    /** Creates new form LoginPanel */
    public LoginPanel() {
        initComponents();        
        // By default we assume using of Google Docs        
        setSystem("Google Docs");
    }

    public void fillCredentials(Creditionals creditionals) {
        rememberCheckBox.setSelected(creditionals.getWsCreditionalsReadedFromDisk());
        userNameField.setText(creditionals.getUserName());
        passwordField.setText(creditionals.getPassword());
    }
    
    public Creditionals getCreditionals() {        
        Creditionals creditionals = new Creditionals(getUserName(),getPassword(),system);
        if (rememberCheckBox.isSelected()) {
            storeCredentials(creditionals);
        }                
        return creditionals;
    }
    
    public void storeCredentials(Creditionals creditionals) {
        creditionals.store();
    }
    
    private void removeCredentials() {
        Creditionals creditionals = new Creditionals(getUserName(),getPassword(),system);
        creditionals.remove();
    }
    
    private String getUserName() {
        return userNameField.getText();
    }
    
    private String getPassword() {
        return new String(passwordField.getPassword());
    }
                
    public void readCreditionals() {
        Creditionals creditionals = new Creditionals(getSystem());
        fillCredentials(creditionals);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        userNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rememberCheckBox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Google User Name:");

        jLabel2.setText("Google Password:");

        jLabel4.setText("Google Account Info");

        rememberCheckBox.setText("Remember Password (It will be stored on local disk)");
        rememberCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rememberCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rememberCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberCheckBoxActionPerformed(evt);
            }
        });

        jButton1.setText("Configure");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(passwordField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .add(userNameField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(rememberCheckBox)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 27, Short.MAX_VALUE)
                        .add(jButton1))
                    .add(layout.createSequentialGroup()
                        .add(124, 124, 124)
                        .add(jLabel4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(userNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(passwordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(rememberCheckBox)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rememberCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberCheckBoxActionPerformed
        boolean value = rememberCheckBox.isSelected();
        if (!value) {
            removeCredentials();
        }
    }//GEN-LAST:event_rememberCheckBoxActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    Util.startNewThread(Configuration.getClassLoader(),new Runnable() {
                    public void run() {
                        try {
                            new ConfigDialog(null,true).setVisible(true);
                        } catch (Exception e) {
                            
                        }
                    }
                });   
}//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox rememberCheckBox;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables

    public void setSystem(String system) {
        this.system = system;
        jLabel4.setText(Configuration.getStringFromResources("Google_Account_Info", system));
        jLabel1.setText(Configuration.getStringFromResources("Google_User_Name:",system));
        jLabel2.setText(Configuration.getStringFromResources("Google_Password:",system));
        rememberCheckBox.setText(Configuration.getResources().getString("Remember_Password_(It_will_be_stored_on_local_disk)"));
        jButton1.setText(Configuration.getResources().getString("CONFIGURATION"));         
        readCreditionals();
    }
    
    public String getSystem() {
        return this.system;
    }
    
}
