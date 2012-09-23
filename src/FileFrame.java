import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.*;

public class FileFrame extends javax.swing.JFrame {

    private File myFile;
    private int mode;
    Toolkit myKit=Toolkit.getDefaultToolkit();
    Dimension myScreenSize = myKit.getScreenSize();
    
    public FileFrame(int mode)
    {
        initComponents();
        this.setLocation(myScreenSize.width / 4, myScreenSize.height / 4);
        this.setVisible(true);
        this.mode = mode;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FileChooser.setDialogType(javax.swing.JFileChooser.CUSTOM_DIALOG);
        FileChooser.setCurrentDirectory(new java.io.File("/~"));
        FileChooser.setDialogTitle("Select a file");
        FileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(FileChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(FileChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserActionPerformed
        myFile = FileChooser.getSelectedFile();
        this.setVisible(false);
        try {
            String tmp = "";
            String line= "";
            BufferedReader reader;
            BufferedWriter writer;
        
            switch (mode)
            {
                case 1:
                    reader = new BufferedReader(new FileReader(myFile.getAbsolutePath()));
                    while((line=reader.readLine())!=null)
                    {
                        tmp += line+"\n";
                    }
                    myFrame.setHTML(tmp);
                    reader.close();
                    break;
                case 2:
                    reader = new BufferedReader(new FileReader(myFile.getAbsolutePath()));
                    while((line=reader.readLine())!=null)
                    {
                        tmp += line+"\n";
                    }
                    myFrame.setBBCode(tmp);
                    reader.close();
                    break;
                case 3:
                    writer= new BufferedWriter(new FileWriter(myFile.getAbsolutePath()));
                    writer.write(myFrame.getHTML());;
                    writer.close();
                    break;
                case 4:
                    writer= new BufferedWriter(new FileWriter(myFile.getAbsolutePath()));
                    writer.write(myFrame.getBBCode());
                    writer.close();
                    break;
            }
        } catch (IOException e) {javax.swing.JOptionPane.showMessageDialog(null, "Cannot read file", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_FileChooserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    // End of variables declaration//GEN-END:variables
}
