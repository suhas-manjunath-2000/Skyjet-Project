/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyjet;

/**
 *
 * @author admin
 */import java.sql.*;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {
Connection conn=null;

Statement s=null;
boolean stat=false;
 String uname=null;
 int pnr;
    /**
     * Creates new form login
     */
    public login() {
        
       
        
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

        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        backimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(871, 590));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nyala", 3, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("SKYJET");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 20, 230, 100);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skyjet/MAIN Logo.PNG"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(0, 0, 197, 110);

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setFont(new java.awt.Font("Nyala", 2, 48)); // NOI18N
        jLabel2.setText("SIGN UP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 110, 170, 51);

        jLabel3.setFont(new java.awt.Font("Nyala", 2, 24)); // NOI18N
        jLabel3.setText("USERNAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 220, 120, 25);

        jLabel4.setFont(new java.awt.Font("Nyala", 2, 24)); // NOI18N
        jLabel4.setText("PASSWORD:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 270, 130, 25);
        getContentPane().add(username);
        username.setBounds(350, 220, 210, 25);
        getContentPane().add(password);
        password.setBounds(350, 270, 210, 25);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Nyala", 2, 24)); // NOI18N
        jButton1.setText("SIGN UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 340, 120, 30);

        jLabel5.setFont(new java.awt.Font("Nyala", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOT A REGISTERED FLYER ?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 420, 210, 13);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Nyala", 3, 10)); // NOI18N
        jButton2.setText("CREATE I.D");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 420, 90, 20);

        backimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skyjet/login.jpg"))); // NOI18N
        getContentPane().add(backimg);
        backimg.setBounds(0, 0, 880, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
createid cd=new createid();
cd.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
{
  Class.forName("java.sql.Driver");
  conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/skyjet","root","server");
  s=conn.createStatement();
  String n=username.getText();
  String pass=new String(password.getPassword());
  String query="select password from users where name='"+n+"';";
  ResultSet rs=s.executeQuery(query);
  String pas=rs.getString("password");
  if(rs.last()==false)
  {
         JOptionPane.showMessageDialog(null,"username doesnt exist");
  }
  
  if(pas.equals(pass))
  {
      stat=true;
      uname=n;
      login l=new login();
      l.setVisible(false);
      String qq="select pnr from users where name='"+n+"';";
      ResultSet r=s.executeQuery(qq);
      pnr =r.getInt("pnr");
      
      
  }
  else if(pas.compareTo(pass)!=0)
  {
      JOptionPane.showMessageDialog(null,"wrong password");
  }
  
}catch(Exception e)
{
    System.out.println(e.getMessage());
}
    }//GEN-LAST:event_jButton1ActionPerformed
  public  String data()
    {
        
        return uname;
    }
  public int ipnr()
  {
      return pnr;
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backimg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
