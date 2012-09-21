import java.awt.*;
import javax.swing.*;
import java.util.*;

public class myFrame extends javax.swing.JFrame implements Observer
{

    private static myFrame frame = new myFrame();
    
    Toolkit myKit=Toolkit.getDefaultToolkit();
    Dimension myScreenSize = myKit.getScreenSize();
    
    // Menu Bar variables
    private JMenuBar myMenuBar = new JMenuBar();
    private JMenu File = new JMenu();
    private JMenu Tools = new JMenu();
    private JMenuItem ImportHTML = new JMenuItem();
    private JMenuItem ImportBBCode = new JMenuItem();
    private JMenuItem SaveHTML = new JMenuItem();
    private JMenuItem SaveBBCode = new JMenuItem();
    private JMenuItem Exit = new JMenuItem();
    private JMenuItem Palette = new JMenuItem();
    
    public void update(Observable s, Object c)
    {
        // debug
        System.exit(0);
        
        if (s instanceof MenuListener)
        {
            if (c == ImportHTML)
            {
                
            }
            else if (c == ImportBBCode)
            {
                
            }
            else if (c == SaveHTML)
            {
                
            }
            else if (c == SaveBBCode)
            {
                
            }
            else if (c == Exit)
            {
                System.exit(0);
            }
            else if (c == Palette)
            {
                
            }
        }
        /*else if (s instanceof KeyboardListener)
        {
            TO DO: KeyboardListener
        }*/
            
    }
    
    public static myFrame getFrame()
    {
        return frame;
    }
    
    private void initMenu()
    {	
        myMenuBar.add(File);
        myMenuBar.add(Tools);
        
        File.add(ImportHTML);
        File.add(ImportBBCode);
        File.add(SaveHTML);
        File.add(SaveBBCode);
        File.add(Exit);

        Tools.add(Palette);
        
        File.setText("File");
        Tools.setText("Tools");
  
        ImportHTML.setText("Import HTML..");
        ImportBBCode.setText("Import BBCode..");
        SaveHTML.setText("Save HTML");
        SaveBBCode.setText("Save BBCode");
        Exit.setText("Exit");

        Palette.setText("Palette");
        
        
        ImportHTML.addActionListener(MenuListener.getMenuListener());
        ImportBBCode.addActionListener(MenuListener.getMenuListener());
        SaveHTML.addActionListener(MenuListener.getMenuListener());
        SaveBBCode.addActionListener(MenuListener.getMenuListener());
        Exit.addActionListener(MenuListener.getMenuListener());

        Palette.addActionListener(MenuListener.getMenuListener());
    }
    
    private myFrame()
    {
        initComponents();
        initMenu();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("HTML-BBCode converter");
        this.setVisible(true);
        this.setSize(myScreenSize.width/2, myScreenSize.height/2);
        this.setLocation(myScreenSize.width/4, myScreenSize.height/4);
        this.setJMenuBar(myMenuBar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        convert1 = new javax.swing.JButton();
        check1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        clear1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        convert2 = new javax.swing.JButton();
        check2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Clear1 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        convert1.setText("Convert");
        convert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convert1ActionPerformed(evt);
            }
        });

        check1.setText("Check");
        check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check1ActionPerformed(evt);
            }
        });

        jLabel1.setText("HTML");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(check1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(convert1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(clear1)
                        .add(157, 157, 157))))
            .add(jPanel1Layout.createSequentialGroup()
                .add(126, 126, 126)
                .add(jLabel1)
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(check1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(clear1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(convert1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 247, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(34, 34, 34))
        );

        convert2.setText("Convert");
        convert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convert2ActionPerformed(evt);
            }
        });

        check2.setText("Check");
        check2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check2ActionPerformed(evt);
            }
        });

        jLabel2.setText("BBCode");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        Clear1.setText("Clear");

        clear2.setText("Clear");
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(112, 112, 112)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(check2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(convert2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(clear2)
                        .add(175, 175, 175)))
                .add(Clear1))
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 252, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(Clear1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(341, 341, 341))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(check2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(convert2)
                    .add(clear2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 246, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(72, 72, 72))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 287, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 280, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 326, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check1ActionPerformed

    private void convert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convert2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convert2ActionPerformed

    private void check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check2ActionPerformed

    private void convert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convert1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convert1ActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear1ActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear2ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(myFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                getFrame();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear1;
    private javax.swing.JButton check1;
    private javax.swing.JButton check2;
    private javax.swing.JButton clear1;
    private javax.swing.JButton clear2;
    private javax.swing.JButton convert1;
    private javax.swing.JButton convert2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
