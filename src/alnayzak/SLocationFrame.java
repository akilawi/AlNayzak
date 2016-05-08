/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alnayzak;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class SLocationFrame extends javax.swing.JFrame {

    EntityManagerFactory emf=null;
    EntityManager em=null;
    Query qr=null;
    Locations location=null;
    EditLocationFrame elf=null;
  
    public SLocationFrame() {
        initComponents();
        emf=Persistence.createEntityManagerFactory("AlNayzakPU");
        em=emf.createEntityManager(); 
        
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
        NumberTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        SearchLocationButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Location");

        jLabel1.setText("Number");

        jLabel2.setText("Name");

        SearchLocationButton.setText("Search");
        SearchLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchLocationButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        ResultTextArea.setColumns(20);
        ResultTextArea.setRows(5);
        jScrollPane1.setViewportView(ResultTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(SearchLocationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchLocationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
        this.NameTextField.setText("");
        this.NumberTextField.setText("");
        this.ResultTextArea.setText("");
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SearchLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchLocationButtonActionPerformed
        try{
        if(!this.NumberTextField.getText().equals(""))
        {
            qr=em.createNamedQuery("Locations.findByLocationnumber");
            qr.setParameter("locationnumber",BigDecimal.valueOf(Long.valueOf(this.NumberTextField.getText())));
            location = (Locations) qr.getSingleResult();
            elf = new EditLocationFrame(location);
            this.ResultTextArea.setText("Number: "+location.getLocationnumber()+"\n"+
                    "Name: "+location.getLocationname());
           this.ResultTextArea.setEditable(false);
        }
        else if(!this.NameTextField.getText().equals(""))
        {
            qr=em.createNamedQuery("Locations.findByLocationname");
            qr.setParameter("locationname",this.NameTextField.getText());
            location = (Locations) qr.getSingleResult();
            this.ResultTextArea.setText("Number: "+location.getLocationnumber()+"\n"+
                    "Name: "+location.getLocationname());
            this.ResultTextArea.setEditable(false);
        }
        else
            JOptionPane.showMessageDialog(null,"Please Insert Data");
             }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Check Your Enteries");
        }
    }//GEN-LAST:event_SearchLocationButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField NumberTextField;
    private javax.swing.JTextArea ResultTextArea;
    private javax.swing.JButton SearchLocationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
