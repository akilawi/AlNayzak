/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alnayzak;

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
public class ChangeDepartmentGeneralManagerFrame extends javax.swing.JFrame {

    List<Department> dep=null;
    List<Employee> emp=null;
    EntityManagerFactory emf=null;
    EntityManager em=null;
    Query qr=null;
    
    public void initialData(){
        qr=em.createNamedQuery("Department.findAll");
        dep= qr.getResultList();
        qr=em.createNamedQuery("Employee.findAll");
        emp=qr.getResultList();
        this.ProjectsManagerComboBox.addItem("No change");
        this.RDManagerComboBox.addItem("No change");
        for(Employee x : emp){
            this.ProjectsManagerComboBox.addItem(x.getPeople().getFname()+" "+x.getPeople().getMinname()+" "+x.getPeople().getLname());
            this.RDManagerComboBox.addItem(x.getPeople().getFname()+" "+x.getPeople().getMinname()+" "+x.getPeople().getLname());
        }
    }
    
    public ChangeDepartmentGeneralManagerFrame() {
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
        RDManagerComboBox = new javax.swing.JComboBox();
        ProjectsManagerComboBox = new javax.swing.JComboBox();
        ChangeDepartmentManagerButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Department General Manager");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Research and Development Manager");

        jLabel2.setText("Projects Manager");

        ChangeDepartmentManagerButton.setText("Save");
        ChangeDepartmentManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeDepartmentManagerButtonActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ProjectsManagerComboBox, 0, 150, Short.MAX_VALUE)
                            .addComponent(RDManagerComboBox, 0, 150, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChangeDepartmentManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RDManagerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ProjectsManagerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChangeDepartmentManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ChangeDepartmentManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeDepartmentManagerButtonActionPerformed
        try{
        if(!(this.RDManagerComboBox.getSelectedIndex()==0)){
            dep.get(0).setDepartmentmaneger(emp.get(this.RDManagerComboBox.getSelectedIndex()-1));
            em.getTransaction().begin();
            em.getTransaction().commit();
            
        }
        if(!(this.ProjectsManagerComboBox.getSelectedIndex()==0)){
            dep.get(1).setDepartmentmaneger(emp.get(this.ProjectsManagerComboBox.getSelectedIndex()-1));
            em.getTransaction().begin();
            em.getTransaction().commit();
            
        }
        JOptionPane.showMessageDialog(null,"Done");
        this.ProjectsManagerComboBox.removeAllItems();
        this.RDManagerComboBox.removeAllItems();
        initialData();
         }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Check Your Enteries");
        }
    }//GEN-LAST:event_ChangeDepartmentManagerButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.ProjectsManagerComboBox.removeAllItems();
        this.RDManagerComboBox.removeAllItems();
        initialData();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeDepartmentManagerButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JComboBox ProjectsManagerComboBox;
    private javax.swing.JComboBox RDManagerComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
