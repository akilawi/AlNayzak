/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alnayzak;

import java.math.BigDecimal;
import java.util.ArrayList;
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
public class AddGeneralGroupFrame extends javax.swing.JFrame {

    EntityManagerFactory emf=null;
    EntityManager em=null;
    Query qr=null;
    List<Employee> employees=null;
    List <Locations> locations=null;
    List<Phases> phases=null;
    List<Volunteer> volunteers=null;
    Pgroup group=null;
    
    
    public void initialData(){
        
        group= new Pgroup();
        qr=em.createNamedQuery("Employee.findAll");
        employees=qr.getResultList();
        for (Employee x : employees){
            this.SupervisourComboBox.addItem(x.getPeople().getFname()+" "+ x.getPeople().getMinname()+" "+x.getPeople().getLname());
        }
        qr=em.createNamedQuery("Locations.findAll");
        locations=qr.getResultList();
        for(Locations x: locations){
            this.LocationComboBox.addItem(x.getLocationname());
        }
        qr=em.createNamedQuery("Phases.findAll");
        phases=qr.getResultList();
        for(Phases x:phases){
            this.PhaseComboBox.addItem(x.getPhasename());
        }
        
    }
    public AddGeneralGroupFrame()
    {
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GeneralGroupNumberTextField = new javax.swing.JTextField();
        GeneralGroupNameTextField = new javax.swing.JTextField();
        SupervisourComboBox = new javax.swing.JComboBox();
        LocationComboBox = new javax.swing.JComboBox();
        PhaseComboBox = new javax.swing.JComboBox();
        AddGeneralGroupButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add General Group");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Number");

        jLabel2.setText("Name");

        jLabel3.setText("Supervisour");

        jLabel4.setText("Location");

        jLabel5.setText("Phase");

        AddGeneralGroupButton.setText("Save");
        AddGeneralGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGeneralGroupButtonActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GeneralGroupNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(GeneralGroupNameTextField)
                    .addComponent(SupervisourComboBox, 0, 150, Short.MAX_VALUE)
                    .addComponent(LocationComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PhaseComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddGeneralGroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(GeneralGroupNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(GeneralGroupNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SupervisourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PhaseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddGeneralGroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddGeneralGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGeneralGroupButtonActionPerformed
        try{
        group.setGroupnumber(BigDecimal.valueOf(Double.valueOf(this.GeneralGroupNumberTextField.getText())));
        group.setGroupname(this.GeneralGroupNameTextField.getText());
        group.setPhasenumber(phases.get(this.PhaseComboBox.getSelectedIndex()));
        group.setSupervisorid(employees.get(this.SupervisourComboBox.getSelectedIndex()).getPeople());
        group.setLocationnumber(locations.get(this.LocationComboBox.getSelectedIndex()));
        group.setTrainingCollection(new ArrayList<Training>());
        //volunteers.get(this.VolunteerComboBox.getSelectedIndex()).set
        //group.setParticipant(null);
        //group.getPgroupCollection(null);
        group.setResult(null);
        group.setStudentCollection(null);
        qr=em.createNamedQuery("Projects.findAll");
        group.setProjectnumber((Projects)qr.getSingleResult());
        em.getTransaction().begin();
        em.persist(group);
        em.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Done");
        this.LocationComboBox.removeAllItems();
        this.PhaseComboBox.removeAllItems();
        this.SupervisourComboBox.removeAllItems();
        //this.VolunteerComboBox.removeAllItems();
        initialData();
        this.GeneralGroupNameTextField.setText("");
        this.GeneralGroupNumberTextField.setText("");  
      
         }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Check Your Enteries");
        }
    }//GEN-LAST:event_AddGeneralGroupButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.LocationComboBox.removeAllItems();
        this.PhaseComboBox.removeAllItems();
        this.SupervisourComboBox.removeAllItems();
        //this.VolunteerComboBox.removeAllItems();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddGeneralGroupButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField GeneralGroupNameTextField;
    private javax.swing.JTextField GeneralGroupNumberTextField;
    private javax.swing.JComboBox LocationComboBox;
    private javax.swing.JComboBox PhaseComboBox;
    private javax.swing.JComboBox SupervisourComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
