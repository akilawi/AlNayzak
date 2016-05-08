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
public class ChangeYRManagersFrame extends javax.swing.JFrame {
    
   EntityManagerFactory emf=null;
   EntityManager em=null;
   Query qr=null;
   List<YoungResearcher>yr=null;
   List<Employee>emp=null;
   List<Phases>ph=null;
   
   public void initialData(){
       qr=em.createNamedQuery("YoungResearcher.findAll");
        yr=qr.getResultList();
        qr=em.createNamedQuery("Phases.findAll");
        ph=qr.getResultList();
        qr=em.createNamedQuery("Employee.findAll");
        emp=qr.getResultList();
        this.YRManagerComboBox.addItem("No change");
        this.FirstPhaseManagerComboBox.addItem("No change");
        this.SecondPhaseManagerComboBox.addItem("No change");
        this.ThirdPhaseManagerComboBox.addItem("No change");
        for(Employee x : emp){
            this.YRManagerComboBox.addItem(x.getPeople().getFname()+" "+x.getPeople().getMinname()+" "+x.getPeople().getLname());
            this.FirstPhaseManagerComboBox.addItem(x.getPeople().getFname()+" "+x.getPeople().getMinname()+" "+x.getPeople().getLname());
            this.SecondPhaseManagerComboBox.addItem(x.getPeople().getFname()+" "+x.getPeople().getMinname()+" "+x.getPeople().getLname());
            this.ThirdPhaseManagerComboBox.addItem(x.getPeople().getFname()+" "+x.getPeople().getMinname()+" "+x.getPeople().getLname());
        }
   }
    
    public ChangeYRManagersFrame() {
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
        YRManagerComboBox = new javax.swing.JComboBox();
        FirstPhaseManagerComboBox = new javax.swing.JComboBox();
        SecondPhaseManagerComboBox = new javax.swing.JComboBox();
        ThirdPhaseManagerComboBox = new javax.swing.JComboBox();
        ExitButton = new javax.swing.JButton();
        ChangeYRManagersButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chaneg Young Researcher Managers");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Young Researcher Manager");

        jLabel2.setText("1st Phase Manager");

        jLabel3.setText("2nd Phase Manager");

        jLabel4.setText("3rd Phase Manager");

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        ChangeYRManagersButton.setText("Save");
        ChangeYRManagersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeYRManagersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YRManagerComboBox, 0, 160, Short.MAX_VALUE)
                    .addComponent(FirstPhaseManagerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SecondPhaseManagerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ThirdPhaseManagerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChangeYRManagersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(YRManagerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FirstPhaseManagerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SecondPhaseManagerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ThirdPhaseManagerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChangeYRManagersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ChangeYRManagersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeYRManagersButtonActionPerformed
        try{
        if(!(this.YRManagerComboBox.getSelectedIndex()==0)){
            yr.get(0).setManegerid(emp.get(this.YRManagerComboBox.getSelectedIndex()-1));
            em.getTransaction().begin();
            em.getTransaction().commit();
        }
        if(!(this.FirstPhaseManagerComboBox.getSelectedIndex()==0)){
            ph.get(0).setPSupervisour(emp.get(this.FirstPhaseManagerComboBox.getSelectedIndex()-1));
            em.getTransaction().begin();
            em.getTransaction().commit();
        }
        if(!(this.SecondPhaseManagerComboBox.getSelectedIndex()==0)){
            ph.get(1).setPSupervisour(emp.get(this.SecondPhaseManagerComboBox.getSelectedIndex()-1));
            em.getTransaction().begin();
            em.getTransaction().commit();
        }
        if(!(this.ThirdPhaseManagerComboBox.getSelectedIndex()==0)){
            ph.get(2).setPSupervisour(emp.get(this.ThirdPhaseManagerComboBox.getSelectedIndex()-1));
            em.getTransaction().begin();
            em.getTransaction().commit();
        }
        JOptionPane.showMessageDialog(null,"Done");
        this.FirstPhaseManagerComboBox.removeAllItems();
        this.SecondPhaseManagerComboBox.removeAllItems();
        this.ThirdPhaseManagerComboBox.removeAllItems();
        this.YRManagerComboBox.removeAllItems();
        initialData();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Check Your Enteries");
        }
        
    }//GEN-LAST:event_ChangeYRManagersButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.FirstPhaseManagerComboBox.removeAllItems();
        this.SecondPhaseManagerComboBox.removeAllItems();
        this.ThirdPhaseManagerComboBox.removeAllItems();
        this.YRManagerComboBox.removeAllItems();
        initialData();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeYRManagersButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JComboBox FirstPhaseManagerComboBox;
    private javax.swing.JComboBox SecondPhaseManagerComboBox;
    private javax.swing.JComboBox ThirdPhaseManagerComboBox;
    private javax.swing.JComboBox YRManagerComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}