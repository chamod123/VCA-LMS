/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vc;

import static com.sun.corba.se.impl.orbutil.CorbaResourceUtil.getText;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author chamods 
 */
public class lecentermarks extends javax.swing.JFrame {
    Connecter conn=new Connecter();
    Statement stm;
    
    public lecentermarks() {
        
        
       initComponents();
       fillbatchcombo();
       fillsubjectcombo();
       fillstudentno();
    }

    
    private void fillbatchcombo(){
        try{
        stm=conn.obtenirconnexion().createStatement();
        ResultSet Rs=stm.executeQuery("Select * from batch");
        while(Rs.next()){
       String bno= Rs.getString("b_no");
        jComboBox2.addItem(bno);
                }
        }catch(Exception e){System.out.println(e);}
    }
        
    private void fillsubjectcombo(){
        try{
        stm=conn.obtenirconnexion().createStatement();
        ResultSet Rs=stm.executeQuery("Select * from subjectheader");
        while(Rs.next()){
       String s_no= Rs.getString("sub_code");
        jComboBox1.addItem(s_no);
                }
        }catch(Exception e){System.out.println(e);}
    }
    
     private void fillstudentno(){
        try{
        stm=conn.obtenirconnexion().createStatement();
        ResultSet Rs=stm.executeQuery("Select * from student");
        while(Rs.next()){
       String st_no= Rs.getString("st_id");
        jComboBox3.addItem(st_no);
                }
        }catch(Exception e){System.out.println(e);}
    }
    
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lecturer Enter Markes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Number", "Part A Mark", "Part B Mark", "Total Mark", "Result"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 990, 180);

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(880, 440, 100, 27);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText(" Enterd Mark");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(780, 150, 117, 27);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Part A");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 120, 41, 19);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Part B");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 160, 42, 19);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Student No");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 82, 78, 19);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(150, 120, 170, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(150, 160, 170, 30);

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject Code" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(152, 50, 180, 30);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Subject Code");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 50, 110, 19);

        jTextField9.setBackground(new java.awt.Color(255, 255, 102));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9);
        jTextField9.setBounds(830, 30, 80, 19);

        jComboBox2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 51, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Batch" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(152, 12, 180, 30);

        jComboBox3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 51, 51));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Student" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(153, 82, 180, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Batch");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 12, 80, 19);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Date");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(730, 30, 35, 19);

        jLabel8.setText("(enter grade to at a time only for one subject)");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(350, 50, 300, 15);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(10, 10, 1010, 210);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bach");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 54, 80, 19);

        jButton4.setBackground(new java.awt.Color(51, 255, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Sing Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(60, 440, 100, 27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1031, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String data1 = jComboBox3.getSelectedItem().toString();
    
    String data2 = jTextField3.getText();
    String data3 = jTextField4.getText();
    int tot = Integer.valueOf(data2) + Integer.valueOf(data3); 
    String grade;
    
        if (tot >= 85) {
            grade = "A+";
        } else if (tot >= 70) {
            grade = "A";
        } else if (tot >= 65) {
            grade = "A-" ;
        } else if (tot >= 60) {
            grade = "B+";
        } else if (tot >= 55){
            grade = "B";
        } else if (tot >= 50) {
            grade = "B-" ;
        } else if (tot >= 45) {
            grade = "C+";
        } else if (tot >= 40){
            grade = "C";
        } else if (tot >= 35) {
            grade = "C-" ;
        } else if (tot >= 30) {
            grade = "D+";
        } else if (tot >= 25){
            grade = "D-";
        } else
            grade = "E";
    
    Object[] row = { data1, data2, data3, tot, grade };

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    model.addRow(row);      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String sb = jComboBox1.getSelectedItem().toString();
       int q =jTable1.getRowCount();
       
       for(int r=0;q!=r;r++){
           
           String a0= String.valueOf(jTable1.getValueAt(r,0));  
           String a1=String.valueOf(jTable1.getValueAt(r,1));           
           String a2=String.valueOf(jTable1.getValueAt(r,2));           
           String a3=String.valueOf(jTable1.getValueAt(r,3));           
           String a4=String.valueOf(jTable1.getValueAt(r,4));
        
           double cd = 0;
           if( a4.equals("A+"))
            cd=4;
            else if( a4.equals("A"))
            cd=4;
           if( a4.equals("A-"))
            cd=3.7;
            else if( a4.equals("B+"))
            cd=3.3;
           if( a4.equals("B"))
            cd=3;
            else if( a4.equals("B-"))
            cd=2.7;
           if( a4.equals("C+"))
            cd=2.3;
            else if( a4.equals("C"))
            cd=2.0;
           if( a4.equals("C-"))
            cd=1.7;
            else if( a4.equals("D+"))
            cd=1.3;
           if( a4.equals("D"))
            cd=1;
            else if( a4.equals("e"))
            cd=0;
           
         
         int w= Integer.valueOf(a0);         
          int x= Integer.valueOf(a1);         
          int y= Integer.valueOf(a2);         
          int z= Integer.valueOf(a3);       
      
       enter(a3,a4,a1,a2,a0,sb,cd);
       }
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       loging l=new loging();
       l.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(lecentermarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lecentermarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lecentermarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lecentermarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lecentermarks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void enter( String a3, String a4, String a1, String a2, String a0,String sb,double cd) {
        
    try {    
      
               stm=conn.obtenirconnexion().createStatement();
               ResultSet Rs=stm.executeQuery("Select gr_no from grade");
               int gn=1;
               while(Rs.next()){
                gn=gn+1; 
               }
                
           
        
          String requete="insert into grade(gr_no,tot,grades,gpoint,p_amark,p_bmark,st_id,sub_code)VALUES('"+gn+"','"+a3+"','"+a4+"','"+cd+"','"+a1+"','"+a2+"','"+a0+"','"+sb+"')";
          stm.executeUpdate(requete); 
          JOptionPane.showMessageDialog(null, "entered sucsecful");
          } catch (SQLException ex) {
               Logger.getLogger(lecentermarks.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        
       }
}
