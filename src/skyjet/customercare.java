/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyjet;

/**
 *
 * @author Admin
 */import java.sql.*;
public class customercare extends javax.swing.JFrame {
Connection conn=null;
Statement s=null;
    /**
     * Creates new form customercare
     */
    public customercare() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        country = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        no = new javax.swing.JRadioButton();
        yes = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        backimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 358));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nyala", 3, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("SKYJET");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 0, 230, 50);

        jLabel2.setFont(new java.awt.Font("Nyala", 3, 36)); // NOI18N
        jLabel2.setText("CUSTOMER CARE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 50, 279, 40);

        country.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        country.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "U.S.A", "GERMANY", "INDIA", "CHINA", "JAPAN", "SRI LANKA", "ENGLAND", "FRANCE", "RUSSIA", "AUSTRALIA" }));
        getContentPane().add(country);
        country.setBounds(110, 100, 120, 26);

        jLabel3.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        jLabel3.setText("COUNTRY");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 100, 90, 20);

        jLabel4.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        jLabel4.setText("CONTACT NO.(24X7 toll free)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 160, 240, 20);

        contact.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        getContentPane().add(contact);
        contact.setBounds(260, 160, 170, 20);

        jLabel5.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        jLabel5.setText("Any Comments:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 240, 130, 20);

        message.setColumns(20);
        message.setFont(new java.awt.Font("Nyala", 2, 14)); // NOI18N
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 200, 180, 120);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 280, 70, 29);

        jLabel6.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        jLabel6.setText("Was This Helpful?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 210, 150, 20);

        no.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(no);
        no.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        no.setText("NO");
        getContentPane().add(no);
        no.setBounds(380, 280, 55, 29);

        yes.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(yes);
        yes.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        yes.setText("YES");
        getContentPane().add(yes);
        yes.setBounds(380, 240, 55, 29);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skyjet/MAIN Logo.PNG"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(405, 0, 200, 100);

        jLabel8.setFont(new java.awt.Font("Nyala", 3, 12)); // NOI18N
        jLabel8.setText("Please mention your flight ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 260, 170, 20);

        jLabel9.setFont(new java.awt.Font("Nyala", 3, 12)); // NOI18N
        jLabel9.setText("PNR/ USERNAME in comments");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 280, 180, 13);

        backimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skyjet/customer care.png"))); // NOI18N
        getContentPane().add(backimg);
        backimg.setBounds(0, 0, 600, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
{
  Class.forName("java.sql.Driver");
  conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/skyjet","root","server");
  s=conn.createStatement();
  String n=(String)country.getSelectedItem();
  String mess=message.getText();
  s.executeUpdate("insert into custcare values('"+n+"','"+mess+",);");
  
}catch(Exception e)
{
    System.out.println(e.getMessage());
}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(customercare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customercare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customercare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customercare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customercare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backimg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contact;
    private javax.swing.JComboBox country;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea message;
    private javax.swing.JRadioButton no;
    private javax.swing.JRadioButton yes;
    // End of variables declaration//GEN-END:variables
}