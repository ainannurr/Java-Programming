/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.sun.xml.internal.fastinfoset.EncodingConstants;
import konversibilangan.KonversiBilangan;

/**
 *
 * @author AINAN-Gaul
 */
public class Biner extends javax.swing.JInternalFrame {

    /**
     * Creates new form Biner
     */
    public Biner() {
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

        inputBiner = new javax.swing.JTextField();
        BinerDesimal = new javax.swing.JButton();
        BinerOktal = new javax.swing.JButton();
        BinerHexa = new javax.swing.JButton();
        outputBiner = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Konversi Bilangan Biner");
        setToolTipText("");
        setEnabled(false);
        setMinimumSize(new java.awt.Dimension(250, 150));
        setName("Konversi Bilangan Biner"); // NOI18N
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

        inputBiner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBinerActionPerformed(evt);
            }
        });
        getContentPane().add(inputBiner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 320, 30));

        BinerDesimal.setText("Desimal");
        BinerDesimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinerDesimalActionPerformed(evt);
            }
        });
        getContentPane().add(BinerDesimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, -1));

        BinerOktal.setText("Oktal");
        BinerOktal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinerOktalActionPerformed(evt);
            }
        });
        getContentPane().add(BinerOktal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, -1));

        BinerHexa.setText("Heksadesimal");
        BinerHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinerHexaActionPerformed(evt);
            }
        });
        getContentPane().add(BinerHexa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 150, -1));

        outputBiner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputBinerActionPerformed(evt);
            }
        });
        getContentPane().add(outputBiner, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 120, 30));

        jLabel1.setText("Masukkan bilangan biner:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("Hasil:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BinerDesimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinerDesimalActionPerformed
        // TODO add your handling code here:
        KonversiBilangan kb = new KonversiBilangan();
        String input = inputBiner.getText();
        int hasil = kb.BinertoDesimal(input);
        outputBiner.setText(Integer.toString(hasil));
    }//GEN-LAST:event_BinerDesimalActionPerformed

    private void BinerOktalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinerOktalActionPerformed
        // TODO add your handling code here:
        KonversiBilangan kb = new KonversiBilangan();
        String input = inputBiner.getText();
        String hasil = kb.BinertoOktal(input);
        outputBiner.setText(hasil);
    }//GEN-LAST:event_BinerOktalActionPerformed

    private void outputBinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputBinerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputBinerActionPerformed

    private void inputBinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBinerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBinerActionPerformed

    private void BinerHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinerHexaActionPerformed
        // TODO add your handling code here:
        KonversiBilangan kb = new KonversiBilangan();
        String input = inputBiner.getText();
        String hasil = kb.BinertoHexa(input);
        outputBiner.setText(hasil);
    }//GEN-LAST:event_BinerHexaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BinerDesimal;
    private javax.swing.JButton BinerHexa;
    private javax.swing.JButton BinerOktal;
    private javax.swing.JTextField inputBiner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField outputBiner;
    // End of variables declaration//GEN-END:variables
}