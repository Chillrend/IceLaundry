/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kushier;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author X453SA
 */
public class kushMain1 extends javax.swing.JFrame {
    int i=1,total,arr;
    int Grand;
    String gitTotal=" ";
    String textAddon1,textAddon2,bigMass;
    
    /**
     * Creates new form kushMain
     */
    public kushMain1() {
        initComponents();
        lType.setEnabled(false);
        nLType.setEnabled(false);
        nSTypeActionPerformed();
        mainProgram();
        Checkout.addActionListener(action);
        addEd.setBorderPainted(false);
        addEd.setFocusPainted(false);
        addEd.setContentAreaFilled(true);
        addEd.setText("<HTML><I>Add  ↓</I></HTML>");
        addEd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    Action action = new AbstractAction(){
        @Override
        public void actionPerformed(ActionEvent e){
            new checkOut(gitTotal).setVisible(true);
                        
        }
    };
    public void mainProgram(){
            
            String getCombos = nSType.getSelectedItem().toString();
            
            DefaultTableModel model = (DefaultTableModel) aTable.getModel();
            addEd.addActionListener (new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                String getValStr = nMass.getText();
                int aMass = Integer.parseInt(getValStr);
                String getCombo = nSType.getSelectedItem().toString();
                String getComboBig = nLType.getSelectedItem().toString();
                    
                switch (getCombo){
                    case "Per-Kilo":
                        if (aMass<3){
                            total = aMass*6000;
                            checkAddon();
                            grandTotal();
                            bigMass = "";
                        }else if(aMass>=3 && aMass<5){
                            total = aMass*5000;
                            checkAddon();
                            grandTotal();
                            bigMass = "";
                        }else{
                            total = aMass*4500;
                            checkAddon();
                            grandTotal();
                            bigMass = "";
                        }
                        break;
                    case "Per-Piece":
                        if (aMass==1){
                            total = 4000;
                            checkAddon();
                            grandTotal();
                            bigMass = "";
                        }else if (aMass>2 && aMass<4){
                            total = aMass*3500;
                            checkAddon();
                            grandTotal();
                            bigMass = "";
                        }else{
                            total = aMass*3000;
                            checkAddon();
                            grandTotal();
                            bigMass = "";
                        }
                        break;
                    case "Big-Mass":
                        switch(getComboBig){
                            case "Suite":
                                if(aMass==1){
                                    total = 12000;
                                    checkAddon();
                                    grandTotal();
                                    bigMass = " Suite Laundry";
                                }else{
                                    total = aMass*10000;
                                    checkAddon();
                                    grandTotal();
                                    bigMass = " Suite Laundry";
                                }
                                break;
                            case "Mattress":
                                if(aMass==1){
                                    total = 35000;
                                    checkAddon();
                                    grandTotal();
                                    bigMass = " Mattress Laundry";
                                }else{
                                    total = aMass*30000;
                                    checkAddon();
                                    grandTotal();
                                    bigMass = " Mattress Laundry";
                                }
                                break;
                            case "Special Handled Silk":
                                if(aMass==1){
                                    total = 8000;
                                    checkAddon();
                                    grandTotal();
                                    bigMass = " Special Silk Laundry";
                                }else{
                                    total = aMass*7000;
                                    checkAddon();
                                    grandTotal();
                                    bigMass = " Special Silk Laundry";
                                }
                                break;
                            default : JOptionPane.showMessageDialog(null, "Please enter a proper number");
                        }
                    break;
                    default : JOptionPane.showMessageDialog(null, "Please enter a proper numberzz");
                }
                model.addRow(new Object[]{i, getCombo+ bigMass + textAddon1 + textAddon2,aMass + "KG/PCS", "Rp. " + total});
                showGTotal.setText(gitTotal);
                addint();
                }
            
        });
    }
    public void grandTotal(){
        Grand = Grand + total;
        gitTotal = String.valueOf(Grand);
        
    }
    public void addint(){
        i = i+1;
    }
    public void checkAddon(){
        //start if statements
        if (bPerfume.isSelected()){
            total = total + 3000;
            textAddon1 = " With Extra Perfume ";
        }else{
            textAddon1 = "";
            //do nothing and clear the var   
        }
        if (bFolds.isSelected()){
            total = total + 5000;
            textAddon2 = " With Drapes and Folds ";
        }else{
            textAddon2 = "";
            //do nothing and clear the var
        }
        //end if statements
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nSType = new javax.swing.JComboBox<>();
        nMass = new javax.swing.JTextField();
        nLType = new javax.swing.JComboBox<>();
        lType = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addEd = new javax.swing.JButton();
        Checkout = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        cobadulu = new javax.swing.JLabel();
        bPerfume = new javax.swing.JRadioButton();
        bFolds = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        aTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        showGTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cashier");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel1.setText("IceLaundry Cashier System");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Service Type");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Mass/Piece");

        nSType.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nSType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Per-Kilo", "Per-Piece", "Big-Mass" }));
        nSType.setSelectedItem(nSType);

        nMass.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nMass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nMassKeyTyped(evt);
            }
        });

        nLType.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nLType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suite", "Mattress", "Special Handled Silk" }));
        nLType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nLTypeActionPerformed(evt);
            }
        });

        lType.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lType.setText("Laundry Type");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Added Items");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icelaundry/imgsrc/cashier.png"))); // NOI18N

        addEd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        addEd.setText(" Add ↓");
        addEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEdActionPerformed(evt);
            }
        });

        Checkout.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Checkout.setText("Proceed to Checkout");
        Checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutActionPerformed(evt);
            }
        });

        bReset.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bExit.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        bPerfume.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bPerfume.setText("Extra Perfume");

        bFolds.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bFolds.setText("Drapes and Folds");

        aTable.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        aTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Type", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(aTable);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Grand Total");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel7.setText("Rp.");

        showGTotal.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        showGTotal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showGTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Checkout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bExit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bPerfume)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bFolds))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nSType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nMass, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nLType, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(167, 167, 167))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addEd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(147, 147, 147)))
                        .addComponent(cobadulu)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nSType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(nMass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lType)
                            .addComponent(nLType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPerfume)
                    .addComponent(bFolds))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEd)
                    .addComponent(cobadulu))
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(showGTotal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Checkout)
                    .addComponent(bReset)
                    .addComponent(bExit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nMassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nMassKeyTyped
        char karakter = evt.getKeyChar();
            if(!(((karakter >= '0') && (karakter <= '9') || 
              (karakter == KeyEvent.VK_BACK_SPACE) || 
              (karakter == KeyEvent.VK_DELETE))))
                {
                getToolkit().beep();
                evt.consume();
                }
        // TODO add your handling code here:
    }//GEN-LAST:event_nMassKeyTyped

    private void CheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckoutActionPerformed

    private void addEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEdActionPerformed

    private void nLTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nLTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nLTypeActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        this.dispose();
        new icelaundry.MainMenu().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_bExitActionPerformed
    public void reset(){
        nMass.setText("");
        showGTotal.setText("0");
        //reset tables
        DefaultTableModel model = (DefaultTableModel) aTable.getModel();
        model.setRowCount(0);
        //radio button reset
        bPerfume.setSelected(false);
        bFolds.setSelected(false);
        //comboBox reset
        nSType.setSelectedIndex(0);
        //start re-initialize variable
        total = 0;
        Grand = 0;
        textAddon1 = "";
        textAddon2 = "";
        gitTotal = "";
    }    
    public void nSTypeActionPerformed(){
        nSType.addActionListener (new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                String valueSel = nSType.getSelectedItem().toString();
                if (valueSel.equals("Big-Mass")){
                    lType.setEnabled(true);
                    nLType.setEnabled(true);
                }else{
                    lType.setEnabled(false);
                    nLType.setEnabled(false);
                }
            }
        });
    }
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
            java.util.logging.Logger.getLogger(kushMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kushMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kushMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kushMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kushMain1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Checkout;
    private javax.swing.JTable aTable;
    public javax.swing.JButton addEd;
    private javax.swing.JButton bExit;
    private javax.swing.JRadioButton bFolds;
    private javax.swing.JRadioButton bPerfume;
    private javax.swing.JButton bReset;
    private javax.swing.JLabel cobadulu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lType;
    private javax.swing.JComboBox<String> nLType;
    private javax.swing.JTextField nMass;
    public javax.swing.JComboBox<String> nSType;
    private javax.swing.JLabel showGTotal;
    // End of variables declaration//GEN-END:variables
}
