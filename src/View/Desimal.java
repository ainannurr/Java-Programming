/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import konversibilangan.KonversiBilangan;

/**
 *
 * @author AINAN-Gaul
 */
public class Desimal extends javax.swing.JInternalFrame {

    /**
     * Creates new form Desimal
     */
    public Desimal() {
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

        inputDesimal = new javax.swing.JTextField();
        DesimalBiner = new javax.swing.JButton();
        DesimalOktal = new javax.swing.JButton();
        DesimalHexa = new javax.swing.JButton();
        outputDesimal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Konversi Bilangan Desimal");
        setEnabled(false);
        setMinimumSize(new java.awt.Dimension(250, 150));
        setPreferredSize(new java.awt.Dimension(400, 250));
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputDesimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDesimalActionPerformed(evt);
            }
        });
        getContentPane().add(inputDesimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 320, 30));

        DesimalBiner.setText("Biner");
        DesimalBiner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesimalBinerActionPerformed(evt);
            }
        });
        getContentPane().add(DesimalBiner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, -1));

        DesimalOktal.setText("Oktal");
        DesimalOktal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesimalOktalActionPerformed(evt);
            }
        });
        getContentPane().add(DesimalOktal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, -1));

        DesimalHexa.setText("Heksadesimal");
        DesimalHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesimalHexaActionPerformed(evt);
            }
        });
        getContentPane().add(DesimalHexa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 150, -1));

        outputDesimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputDesimalActionPerformed(evt);
            }
        });
        getContentPane().add(outputDesimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 120, 30));

        jLabel1.setText("Masukkan bilangan biner:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("Hasil:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputDesimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDesimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDesimalActionPerformed

    private void DesimalBinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesimalBinerActionPerformed
        // TODO add your handling code here:
        KonversiBilangan kb = new KonversiBilangan();
        String input = inputDesimal.getText();
        int dsm = Integer.parseInt(input);
        String hasil = kb.DesimaltoBiner(dsm);
        outputDesimal.setText(hasil);
    }//GEN-LAST:event_DesimalBinerActionPerformed

    private void DesimalOktalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesimalOktalActionPerformed
        // TODO add your handling code here:
        KonversiBilangan kb = new KonversiBilangan();
        String input = inputDesimal.getText();
        int dsm = Integer.parseInt(input);
        String hasil = kb.DesimaltoOktal(dsm);
        outputDesimal.setText(hasil);
    }//GEN-LAST:event_DesimalOktalActionPerformed

    private void DesimalHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesimalHexaActionPerformed
        // TODO add your handling code here:
        KonversiBilangan kb = new KonversiBilangan();
        String input = inputDesimal.getText();
        int dsm = Integer.parseInt(input);
        String hasil = kb.DesimaltoHexa(dsm);
        outputDesimal.setText(hasil);
    }//GEN-LAST:event_DesimalHexaActionPerformed

    private void outputDesimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputDesimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputDesimalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DesimalBiner;
    private javax.swing.JButton DesimalHexa;
    private javax.swing.JButton DesimalOktal;
    private javax.swing.JTextField inputDesimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField outputDesimal;
    // End of variables declaration//GEN-END:variables
}
