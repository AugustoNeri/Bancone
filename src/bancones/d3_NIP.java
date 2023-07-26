/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique
 */
public class d3_NIP extends javax.swing.JFrame {

    /**
     * Creates new form d3_NIP
     */
    public d3_NIP() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        nip1.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NIP = new javax.swing.JLabel();
        loguito1 = new javax.swing.JLabel();
        loguito = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        nip_c = new javax.swing.JPasswordField();
        nip_n = new javax.swing.JPasswordField();
        nip_ant = new javax.swing.JPasswordField();
        nip1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        numcuenta2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(810, 550));
        getContentPane().setLayout(null);

        NIP.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        NIP.setForeground(new java.awt.Color(0, 51, 0));
        NIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/niptxt.png"))); // NOI18N
        getContentPane().add(NIP);
        NIP.setBounds(260, 50, 255, 130);

        loguito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/logochiqui.png"))); // NOI18N
        loguito1.setToolTipText("EJECUTIVO");
        loguito1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loguito1MouseClicked(evt);
            }
        });
        getContentPane().add(loguito1);
        loguito1.setBounds(20, 20, 90, 70);

        loguito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/nip.png"))); // NOI18N
        loguito.setToolTipText("EJECUTIVO");
        loguito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loguitoMouseClicked(evt);
            }
        });
        getContentPane().add(loguito);
        loguito.setBounds(660, 10, 150, 130);

        text3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text3.setForeground(new java.awt.Color(0, 102, 51));
        text3.setText("NIP Nuevo:");
        getContentPane().add(text3);
        text3.setBounds(130, 310, 160, 17);

        text4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text4.setForeground(new java.awt.Color(0, 102, 51));
        text4.setText("Confirme NIP Nuevo:");
        getContentPane().add(text4);
        text4.setBounds(130, 360, 160, 17);

        text5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text5.setForeground(new java.awt.Color(0, 102, 51));
        text5.setText("NIP Anterior:");
        getContentPane().add(text5);
        text5.setBounds(130, 260, 160, 17);

        Aceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Aceptar.setForeground(new java.awt.Color(0, 51, 0));
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar);
        Aceptar.setBounds(350, 420, 110, 25);
        getContentPane().add(nip_c);
        nip_c.setBounds(330, 350, 350, 30);
        getContentPane().add(nip_n);
        nip_n.setBounds(330, 300, 350, 30);
        getContentPane().add(nip_ant);
        nip_ant.setBounds(330, 250, 350, 30);
        getContentPane().add(nip1);
        nip1.setBounds(70, 410, 110, 40);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 800, 550);

        numcuenta2.setText("jLabel1");
        getContentPane().add(numcuenta2);
        numcuenta2.setBounds(60, 120, 80, 30);

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jMenu1.setForeground(new java.awt.Color(0, 153, 0));
        jMenu1.setText("OPCIONES");
        jMenu1.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jMenuItem2.setText("Atras");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jMenuItem3.setText("Usuario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 51));
        jMenuItem1.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loguito1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loguito1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loguito1MouseClicked

    private void loguitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loguitoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loguitoMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        this.dispose();
        new b_Usuarios().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
        String na,nc,nn;
        int confirmar;
         confirmar=JOptionPane.YES_NO_OPTION;
        na=nip_ant.getText();
        nn=nip_n.getText();
        nc=nip_c.getText();
        nipregreso(numcuenta2.getText());
        String cuenta=numcuenta2.getText();
        if(nip_ant.getText().equals(nip1.getText())){
            if(nn==nc){
                JOptionPane.showConfirmDialog(null,"Seguro que desea eliminar la cuenta?","Confirmacion",confirmar);
                if(confirmar==JOptionPane.YES_OPTION){
                         try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:BANCONE","sa","sasa");
       // Connection con;
        //con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BANCONE; user=sa; password=sasa;");
     
        Statement stmt=con.createStatement();
        stmt.executeQuery(" update CLIENTE set NIP='"+nn+"' where NUM_CUENTA='"+cuenta+"'");
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null,"Nip actUalizado");
        }
         }
              
            }
           
        }else{
            JOptionPane.showMessageDialog(null,"nip incorrecto");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    
    
    public void nipregreso(String nip){
         try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//Permite elegir los controlafdores en los cuales hara la conexion entre java y la base de datos
               Connection con=DriverManager.getConnection("jdbc:odbc:BANCONE","sa","sasa");
       Statement stmt=con.createStatement();//Se reconocen las instrucciones de SQL
        ResultSet rs=stmt.executeQuery("SELECT NIP FROM CLIENTE WHERE NUM_CUENTA='"+nip+"'");//mete los valores a la base dedatos
        
        while(rs.next()){
            nip1.setText(rs.getString("NIP"));
            
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(d3_NIP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(d3_NIP.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(d3_NIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d3_NIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d3_NIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d3_NIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d3_NIP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel NIP;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel loguito;
    private javax.swing.JLabel loguito1;
    private javax.swing.JLabel nip1;
    private javax.swing.JPasswordField nip_ant;
    private javax.swing.JPasswordField nip_c;
    private javax.swing.JPasswordField nip_n;
    public static javax.swing.JLabel numcuenta2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    // End of variables declaration//GEN-END:variables
}