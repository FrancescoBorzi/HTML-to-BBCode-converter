
import java.awt.Dimension;
import java.awt.Toolkit;

public class chosenColor extends javax.swing.JFrame
{

    Toolkit myKit=Toolkit.getDefaultToolkit();
    Dimension myScreenSize = myKit.getScreenSize();
  
    
    public chosenColor(String myColor)
    {
        initComponents();
        this.setLocation(myScreenSize.width/4 + myScreenSize.width/6, myScreenSize.height/4 + myScreenSize.height/6);
        chosenColorTextField.setText(myColor);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chosenColorLabel = new javax.swing.JLabel();
        chosenColorTextField = new javax.swing.JTextField();

        chosenColorLabel.setText("Your chosen color:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(chosenColorTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(chosenColorLabel))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(chosenColorLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(chosenColorTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chosenColorLabel;
    private javax.swing.JTextField chosenColorTextField;
    // End of variables declaration//GEN-END:variables
}
