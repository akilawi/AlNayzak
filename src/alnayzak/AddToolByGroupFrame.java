/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alnayzak;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author BaRa' DwEiKaT
 */
public class AddToolByGroupFrame extends javax.swing.JFrame {

    Tool tool=null;
    EntityManagerFactory emf=null;
    EntityManager em=null;
    Query qr=null;
    List<Pgroup> pgroup=null;
    
    public void initialData(){
        tool=new Tool();
        qr=em.createQuery("select g from Pgroup g where g.subgroupnumber=null ");
        pgroup=qr.getResultList();
        //this.ToolRequestedByComboBox.addItem("---");
        for(int i=0; i<pgroup.size();i++){
             this.ToolRequestedByComboBox.addItem(pgroup.get(i).getGroupname());   
        }
    }
    
    public AddToolByGroupFrame() {
        initComponents();
        emf=Persistence.createEntityManagerFactory("AlNayzakPU");
        em=emf.createEntityManager();
        initialData();

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ToolSerialNumberTextField = new javax.swing.JTextField();
        ToolNameTextField = new javax.swing.JTextField();
        ToolQuantityTextField = new javax.swing.JTextField();
        ToolPriceTextField = new javax.swing.JTextField();
        ToolRequestedByComboBox = new javax.swing.JComboBox();
        AddToolbyGroupButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Tool");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Serial Number");

        jLabel2.setText("Name");

        jLabel3.setText("Quantity");

        jLabel4.setText("Price");

        jLabel5.setText("Requested By Group");

        AddToolbyGroupButton.setText("Save");
        AddToolbyGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToolbyGroupButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddToolbyGroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ToolPriceTextField)
                    .addComponent(ToolQuantityTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ToolNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ToolSerialNumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ToolRequestedByComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToolSerialNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToolNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToolQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToolPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToolRequestedByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddToolbyGroupButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void AddToolbyGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToolbyGroupButtonActionPerformed
        try{
        tool.setToolname(this.ToolNameTextField.getText());
        tool.setToolsn(BigDecimal.valueOf(Long.valueOf(this.ToolSerialNumberTextField.getText())));
        tool.setQuantity(BigInteger.valueOf(Integer.valueOf(this.ToolQuantityTextField.getText())));
        tool.setPrice(BigInteger.valueOf(Integer.valueOf(this.ToolPriceTextField.getText())));
        tool.setPgroupCollection(pgroup);
        em.getTransaction().begin();
        em.persist(tool);
        em.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Done");
        this.ToolNameTextField.setText("");
        this.ToolSerialNumberTextField.setText("");
        this.ToolPriceTextField.setText("");
        this.ToolQuantityTextField.setText("");
        this.ToolRequestedByComboBox.setSelectedIndex(0);
         }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Check Your Enteries");
        }
    }//GEN-LAST:event_AddToolbyGroupButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.ToolRequestedByComboBox.removeAllItems();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToolbyGroupButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField ToolNameTextField;
    private javax.swing.JTextField ToolPriceTextField;
    private javax.swing.JTextField ToolQuantityTextField;
    private javax.swing.JComboBox ToolRequestedByComboBox;
    private javax.swing.JTextField ToolSerialNumberTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
