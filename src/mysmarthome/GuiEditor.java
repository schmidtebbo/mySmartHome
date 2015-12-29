/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysmarthome;

import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 *
 * @author ktams
 */
public class GuiEditor extends javax.swing.JFrame {

    String strGuiElement;
    int Index;
    Config myParent;
    /**
     * Creates new form GuiEditor
     */
    public GuiEditor() {
        strGuiElement = null;
        initComponents();
    }

    GuiEditor(Config aThis, int selectedIndex) {
        Index = selectedIndex;
        myParent = aThis;
        strGuiElement = myParent.GUIList.get(Index);
        initComponents();
        ImageIcon II = new ImageIcon(getClass().getResource("pictures/Home.jpg"));
        this.setIconImage(II.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jOK = new javax.swing.JButton();
        jCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDeviceText = new javax.swing.JTextField();
        jNameText = new javax.swing.JTextField();
        jGroupText = new javax.swing.JTextField();
        jMedia = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jReadNo = new javax.swing.JRadioButton();
        jReadYes = new javax.swing.JRadioButton();
        jConfNo = new javax.swing.JRadioButton();
        jConfYes = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jOK.setText("OK");
        jOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOKActionPerformed(evt);
            }
        });

        jCancel.setText("Cancel");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        jLabel1.setText("pilight GUI Editor");

        jLabel2.setText("Device:");

        jLabel3.setText("Name:");

        jLabel4.setText("Group:");

        jLabel5.setText("Media:");

        jDeviceText.setEditable(false);

        jMedia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mobile", "Web", "Desktop", "All" }));

        jLabel6.setText("Readonly:");

        jLabel7.setText("Confirm:");

        buttonGroup1.add(jReadNo);
        jReadNo.setSelected(true);
        jReadNo.setText("no");

        buttonGroup1.add(jReadYes);
        jReadYes.setText("yes");

        buttonGroup2.add(jConfNo);
        jConfNo.setSelected(true);
        jConfNo.setText("no");

        buttonGroup2.add(jConfYes);
        jConfYes.setText("yes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jOK, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel1)))
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(32, 32, 32)
                                .addComponent(jMedia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(32, 32, 32)
                                .addComponent(jGroupText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35)
                                .addComponent(jNameText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(jDeviceText))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jReadNo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jReadYes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jConfNo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jConfYes)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jDeviceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jGroupText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jReadNo)
                    .addComponent(jReadYes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jConfNo)
                    .addComponent(jConfYes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCancel)
                    .addComponent(jOK))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jCancelActionPerformed

    private void jOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOKActionPerformed
// "tempreo": {             "name": "Temperatur Wärmeplatz rechts",             "group": [ "Terrarium" ],             "media": [ "all" ]         
        int i = strGuiElement.indexOf("name");
        String str = strGuiElement.substring(0, i + 7);
        String strTemp = strGuiElement.substring(i + 8, strGuiElement.length());
        str += "\"" + jNameText.getText() + "\",";
        i = strTemp.indexOf(",");
        strTemp = strTemp.substring(i+1, strTemp.length());
        i = strTemp.indexOf("group");
        String s = strTemp.substring(0, i + 8);
        str += s;
        str += "[ \"" + jGroupText.getText() + "\" ],";       
        i = strTemp.indexOf(",");
        strTemp = strTemp.substring(i+1, strTemp.length());
        i = strTemp.indexOf("media");
        str += strTemp.substring(0, i+8);
        switch(jMedia.getSelectedIndex())
        {
            case 0:
                str += "[ \"mobile\" ]";
                break;
                
            case 1:
                str += "[ \"web\" ]";
                break;
                
            case 2:
                str += "[ \"desktop\" ]";
                break;
                
            case 3:
                str += "[ \"all\" ]";
                break;
                
        }
        i = strTemp.indexOf("]");
        strTemp = strTemp.substring(i+1, strTemp.length());
        str += strTemp;
        if(strGuiElement.contains("readonly"))
        {
//ToDo            
        }
        if(strGuiElement.contains("confirm"))
        {
//ToDo            
        }
        myParent.GUIList.add(Index, str);
        myParent.GUIList.remove(Index+1);
        String[] tmp = str.split("\n");
        str = tmp[1].substring(tmp[1].indexOf("\"") + 1, tmp[1].length());
        str = "<html><pre>" + str.substring(0, str.indexOf("\"")) + "\t";
        str += tmp[2].substring(tmp[2].indexOf(":") + 1, tmp[2].length())+ "\t";
        str += tmp[3].substring(tmp[3].indexOf(":") + 1, tmp[3].length()) + "</pre></html>";
        myParent.GUIlistenModell.add(Index+1, str);
        myParent.GUIlistenModell.remove(Index+2);
        this.dispose();
    }//GEN-LAST:event_jOKActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int i = strGuiElement.indexOf("\"");
        String str = strGuiElement.substring(i+1, strGuiElement.length());
        i = str.indexOf(":");
        str = str.substring(0, i-1);
        jDeviceText.setText( str );
        i = strGuiElement.indexOf("name");
        str = strGuiElement.substring(i+8, strGuiElement.length());
        i = str.indexOf("\n");
        str = str.substring(0,i-2);
        jNameText.setText(str);
        i = strGuiElement.indexOf("group");
        str = strGuiElement.substring(i+11, strGuiElement.length());
        i = str.indexOf("\n");
        str = str.substring(0,i-4);
        jGroupText.setText(str);
        i = strGuiElement.indexOf("media");
        str = strGuiElement.substring(i+11, strGuiElement.length());
        i = str.indexOf("\n");
        str = str.substring(0,i-3);
        if(str.contains("all"))
            jMedia.setSelectedIndex(3);
        if(str.contains("desktop"))
            jMedia.setSelectedIndex(2);
        if(str.contains("web"))
            jMedia.setSelectedIndex(1);
        if(str.contains("mobile"))
            jMedia.setSelectedIndex(0);
        if(strGuiElement.contains("readonly"))
        {
//ToDo            
        }
        if(strGuiElement.contains("confirm"))
        {
//ToDo            
        }
        Dimension preferredSize = this.getPreferredSize();
        this.setBounds(myParent.getBounds().x, myParent.getBounds().y, preferredSize.width, preferredSize.height);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(GuiEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jCancel;
    private javax.swing.JRadioButton jConfNo;
    private javax.swing.JRadioButton jConfYes;
    private javax.swing.JTextField jDeviceText;
    private javax.swing.JTextField jGroupText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox jMedia;
    private javax.swing.JTextField jNameText;
    private javax.swing.JButton jOK;
    private javax.swing.JRadioButton jReadNo;
    private javax.swing.JRadioButton jReadYes;
    // End of variables declaration//GEN-END:variables
}