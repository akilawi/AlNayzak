/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alnayzak;

import java.awt.event.ItemEvent;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author BaRa' DwEiKaT
 */
public class AddSessionFrame extends javax.swing.JFrame {

    EntityManagerFactory emf=null;
    EntityManager em=null;
    Query qr=null;
    List<Training>trainings=null;
    Sessions session=null;
    Training training=null;
    List<Student> students=null;
    StudantsList frame=null;
    
    public void initialData(){
        qr=em.createNamedQuery("Training.findAll");
        trainings=qr.getResultList();
        this.TrainingComboBox.addItem("select a training");
        for (Training x : trainings){
            this.TrainingComboBox.addItem(x.getTrainingname());
        }
        session=new Sessions();
    }
    
    public AddSessionFrame() {
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

        AddSessionButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DayComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        MonthComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        AttendanceButton = new javax.swing.JButton();
        DurationTextField = new javax.swing.JTextField();
        NumberComboBox = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        LocationTextField = new javax.swing.JTextField();
        YearComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TrainingComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Session");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        AddSessionButton.setText("Save");
        AddSessionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSessionButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Location");

        DayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel3.setText("Date");

        jLabel13.setText("M");

        MonthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel1.setText("Number");

        AttendanceButton.setText("Add Attendance ");
        AttendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendanceButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Y");

        YearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014" }));

        jLabel5.setText("Duration");

        jLabel12.setText("D");

        jLabel6.setText("Training Name");

        TrainingComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TrainingComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddSessionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DurationTextField)
                    .addComponent(AttendanceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LocationTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NumberComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TrainingComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrainingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NumberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(DayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(MonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DurationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AttendanceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddSessionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void AddSessionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSessionButtonActionPerformed
        try{
            training=trainings.get(this.TrainingComboBox.getSelectedIndex()-1);
        session.setSessionnumber(BigDecimal.valueOf(Double.valueOf(training.getTrainingnumber().toString()+String.format("%d", this.NumberComboBox.getSelectedIndex()+1))));
        students=frame.retrive();
        System.out.println(students);
        session.setDurations(BigInteger.valueOf(Integer.valueOf(this.DurationTextField.getText())));
        session.setDates(new Date(Integer.valueOf((String)this.DayComboBox.getSelectedItem()),Integer.valueOf((String)this.MonthComboBox.getSelectedItem()),Integer.valueOf((String)this.YearComboBox.getSelectedItem())));
        session.setLocationname(this.LocationTextField.getText());
        session.setTrainerid(training.getTrainerid());
        session.setLocationnumber(training.getLocationid());
        session.setStudentCollection(students);
        em.getTransaction().begin();
        em.persist(session);
        em.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Done");
        this.TrainingComboBox.removeAllItems();
        this.NumberComboBox.removeAllItems();
        initialData();
        this.LocationTextField.setText("");
        this.NumberComboBox.setSelectedIndex(0);
        this.DurationTextField.setText("");
        this.TrainingComboBox.setSelectedIndex(0);
         }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Check Your Enteries");
        }    
    }//GEN-LAST:event_AddSessionButtonActionPerformed

    private void AttendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendanceButtonActionPerformed
        qr=em.createNamedQuery("Student.findAll");
        List<Student> temp=qr.getResultList();
        frame= new StudantsList(temp);
        frame.setVisible(true);
        frame.setSize( 350, 600 );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("Attendance");
    }//GEN-LAST:event_AttendanceButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void TrainingComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TrainingComboBoxItemStateChanged
       if ( evt.getStateChange() == ItemEvent.SELECTED ){
            this.NumberComboBox.removeAllItems();
            
        //System.out.println(this.TrainingComboBox.getSelectedIndex()-1);
        int selectedLocationIndex=this.TrainingComboBox.getSelectedIndex()-1;
        
        if(selectedLocationIndex>-1){
                for(int i =1 ;i<=trainings.get(selectedLocationIndex).getNumberofsessions().intValue();i++){
                    this.NumberComboBox.addItem(i);
                    //System.out.println(i);
                }
                
                
            }
        //else{
          //  this.TrainingComboBox.addItem("select a training");
        //}
        
        else{
            //this.NumberComboBox.removeAllItems();
            this.NumberComboBox.addItem("Please select a training first");
        }
       }
    }//GEN-LAST:event_TrainingComboBoxItemStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.TrainingComboBox.removeAllItems();
        this.NumberComboBox.removeAllItems();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSessionButton;
    private javax.swing.JButton AttendanceButton;
    private javax.swing.JComboBox DayComboBox;
    private javax.swing.JTextField DurationTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField LocationTextField;
    private javax.swing.JComboBox MonthComboBox;
    private javax.swing.JComboBox NumberComboBox;
    private javax.swing.JComboBox TrainingComboBox;
    private javax.swing.JComboBox YearComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
