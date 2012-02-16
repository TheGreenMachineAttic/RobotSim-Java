/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RobotDataDisplay.java
 *
 * Created on Feb 15, 2012, 7:14:23 PM
 */
package com.edinarobotics.utils.gui;

/**
 *
 * @author Danny
 */
public class RobotDataDisplay extends javax.swing.JFrame {
    /** Creates new form RobotDataDisplay */

    
    public RobotDataDisplay(){
        initComponents();
        super.setTitle("1816 Simulator");
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    public void setLeftSpeed(String speed){
        leftMotorSpeedField.setText(speed);
    }
    public void setRightSpeed(String speed){
        rightMotorSpeedField.setText(speed);
    }
    public void shooterSpeed(String speed){
        shooterSpeedField.setText(speed);
    }
    public void setShooterRotation(String speed){
        shooterRotationField.setText(speed);
    }
    public void setCollectorSpin(String speed){
        collectorSpinField.setText(speed);
    }
    public void setCollectorLift(String speed){
        collectorLiftField.setText(speed);
    }
    public void setCollectorConveyorField(String speed){
        collectorConveyorField.setText(speed);
    }
    public void setShooterPiston(String speed){
        shooterPistonField.setText(speed);
    }
    public void updateLog(String event){
        logField.append("Event: "+ event+"\n");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        Enable = new javax.swing.JButton();
        disable = new javax.swing.JButton();
        leftMotorSpeedField = new javax.swing.JTextField();
        leftMotorSpeedLabel = new javax.swing.JLabel();
        rightMotorSpeedField = new javax.swing.JTextField();
        rightMotorSpeedLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        shooterSpeedLabel = new javax.swing.JLabel();
        shooterSpeedField = new javax.swing.JTextField();
        shooterRotationLabel = new javax.swing.JLabel();
        shooterRotationField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        collectorStatesLabel = new javax.swing.JLabel();
        collectorSpinLabel = new javax.swing.JLabel();
        collectorSpinField = new javax.swing.JTextField();
        collectorLiftLabel = new javax.swing.JLabel();
        collectorLiftField = new javax.swing.JTextField();
        collectorConveyorLabel = new javax.swing.JLabel();
        collectorConveyorField = new javax.swing.JTextField();
        shooterPistonLabel = new javax.swing.JLabel();
        shooterPistonField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        logField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Enable.setText("Enable");
        Enable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnableActionPerformed(evt);
            }
        });

        disable.setText("Disable");

        leftMotorSpeedField.setEditable(false);
        leftMotorSpeedField.setText("left motor speed");

        leftMotorSpeedLabel.setText("Left Motor Speed");

        rightMotorSpeedField.setEditable(false);
        rightMotorSpeedField.setText("right motor speed");

        rightMotorSpeedLabel.setText("Right Motor Speed:");

        shooterSpeedLabel.setText("Shooter Speed:");

        shooterSpeedField.setEditable(false);
        shooterSpeedField.setText("Shooter Speed   ");

        shooterRotationLabel.setText("Shooter Rotation Speed:");

        shooterRotationField.setEditable(false);
        shooterRotationField.setText("Shooter Rotation");

        collectorStatesLabel.setText("Collector States:");

        collectorSpinLabel.setText("Spin:");

        collectorSpinField.setEditable(false);
        collectorSpinField.setText("1");
        collectorSpinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectorSpinFieldActionPerformed(evt);
            }
        });

        collectorLiftLabel.setText("Lift:");

        collectorLiftField.setEditable(false);
        collectorLiftField.setText("-1");

        collectorConveyorLabel.setText("Conveyor");

        collectorConveyorField.setEditable(false);
        collectorConveyorField.setText("1");
        collectorConveyorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectorConveyorFieldActionPerformed(evt);
            }
        });

        shooterPistonLabel.setText("Shooter Piston:");

        shooterPistonField.setEditable(false);
        shooterPistonField.setText("1");

        logField.setColumns(20);
        logField.setEditable(false);
        logField.setRows(5);
        logField.setText("Session Log.");
        jScrollPane1.setViewportView(logField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftMotorSpeedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(leftMotorSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(rightMotorSpeedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rightMotorSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(shooterSpeedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shooterSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(shooterRotationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shooterRotationField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(disable, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Enable, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collectorStatesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collectorSpinLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collectorSpinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(collectorLiftLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collectorLiftField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(collectorConveyorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collectorConveyorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(shooterPistonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shooterPistonField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftMotorSpeedLabel)
                    .addComponent(leftMotorSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightMotorSpeedLabel)
                    .addComponent(rightMotorSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shooterSpeedLabel)
                    .addComponent(shooterSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shooterRotationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shooterRotationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collectorStatesLabel)
                    .addComponent(collectorSpinLabel)
                    .addComponent(collectorSpinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(collectorConveyorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(collectorConveyorLabel)
                    .addComponent(collectorLiftField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(collectorLiftLabel)
                    .addComponent(shooterPistonLabel)
                    .addComponent(shooterPistonField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Enable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disable)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnableActionPerformed

    private void collectorSpinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectorSpinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collectorSpinFieldActionPerformed

    private void collectorConveyorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectorConveyorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collectorConveyorFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RobotDataDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RobotDataDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RobotDataDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RobotDataDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RobotDataDisplay().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enable;
    private javax.swing.JTextField collectorConveyorField;
    private javax.swing.JLabel collectorConveyorLabel;
    private javax.swing.JTextField collectorLiftField;
    private javax.swing.JLabel collectorLiftLabel;
    private javax.swing.JTextField collectorSpinField;
    private javax.swing.JLabel collectorSpinLabel;
    private javax.swing.JLabel collectorStatesLabel;
    private javax.swing.JButton disable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField leftMotorSpeedField;
    private javax.swing.JLabel leftMotorSpeedLabel;
    private javax.swing.JTextArea logField;
    private javax.swing.JTextField rightMotorSpeedField;
    private javax.swing.JLabel rightMotorSpeedLabel;
    private javax.swing.JTextField shooterPistonField;
    private javax.swing.JLabel shooterPistonLabel;
    private javax.swing.JTextField shooterRotationField;
    private javax.swing.JLabel shooterRotationLabel;
    private javax.swing.JTextField shooterSpeedField;
    private javax.swing.JLabel shooterSpeedLabel;
    // End of variables declaration//GEN-END:variables
}
