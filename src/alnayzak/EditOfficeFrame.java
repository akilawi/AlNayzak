/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alnayzak;

import java.math.BigDecimal;
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
public class EditOfficeFrame extends javax.swing.JFrame {

    EntityManagerFactory emf=null;
    EntityManager em=null;
    Query qr=null;
    List<Locations> locations=null;
    List<Employee> managers=null;
    Office offices=null;
    
    public void initialData(){
        qr=em.createNamedQuery("Locations.findAll");
        locations=qr.getResultList();
        for (Locations x:locations){
            this.LocationComboBox.addItem(x.getLocationname());
        }
        qr=em.createNamedQuery("Employee.findAll");
        managers=qr.getResultList();
        for(Employee x : managers){
            this.ManagerComboBox.addItem(x.getPeople().getFname()+" "+x.getPeople().getMinname()+" "+x.getPeople().getLname());
        }
    }
    public EditOfficeFrame(Office office) {
        initComponents();
        emf=Persistence.createEntityManagerFactory("AlNayzakPU");
        em=emf.createEntityManager();
        qr=em.createNamedQuery("Office.findByOfficenumber");
        qr.setParameter("officenumber", office.getOfficenumber());
        offices=(Office) qr.getSingleResult();
        initialData();
        this.NumberTextField.setText(office.getOfficenumber()+"");
        this.NameTextField.setText(office.getOfficename()+"");
        this.ManagerComboBox.setSelectedItem(office.getManegerid().getPeople().getFname()+" "+office.getManegerid().getPeople().getMinname()+" "+office.getManegerid().getPeople().getLname());
        this.LocationComboBox.setSelectedItem(office.getLocationnumber().getLocationname());
        this.NumberTextField.disable();
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
        NumberTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        LocationComboBox = new javax.swing.JComboBox();
        ManagerComboBox = new javax.swing.JComboBox();
        EditOfficeButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Office");

        jLabel1.setText("Number");

        jLabel2.setText("Name");

        jLabel3.setText("Location");

        jLabel4.setText("Manager");

        EditOfficeButton.setText("Save");
        EditOfficeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditOfficeButtonActionPerformed(evt);
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
                .addComponent(EditOfficeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NumberTextField)
                    .addComponent(NameTextField)
                    .addComponent(LocationComboBox, 0, 140, Short.MAX_VALUE)
                    .addComponent(ManagerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ManagerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EditOfficeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void EditOfficeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditOfficeButtonActionPerformed
        try{
            offices.setLocationnumber(locations.get(this.LocationComboBox.getSelectedIndex()));
        offices.setManegerid(managers.get(this.ManagerComboBox.getSelectedIndex()));
        offices.setOfficename(this.NameTextField.getText());
        offices.setOfficenumber(BigDecimal.valueOf(Long.valueOf(this.NumberTextField.getText())));
        em.getTransaction().begin();
        em.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Done");
        this.NameTextField.setText("");
        this.NumberTextField.setText("");
        this.ManagerComboBox.setSelectedIndex(0);
        this.LocationComboBox.setSelectedIndex(0);    
        this.dispose();
         }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Check Your Enteries");
        }
    }//GEN-LAST:event_EditOfficeButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditOfficeButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JComboBox LocationComboBox;
    private javax.swing.JComboBox ManagerComboBox;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField NumberTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
