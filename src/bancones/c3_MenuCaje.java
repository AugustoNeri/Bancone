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
public class c3_MenuCaje extends javax.swing.JFrame {

    /**
     * Creates new form c3_MenuCaje
     */
    public c3_MenuCaje() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JLabel();
        loguito1 = new javax.swing.JLabel();
        loguito = new javax.swing.JLabel();
        pago_serv = new javax.swing.JLabel();
        pago_serv1 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        consul = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        nc2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(810, 550));
        getContentPane().setLayout(null);

        Menu.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        Menu.setForeground(new java.awt.Color(0, 51, 0));
        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/menu.png"))); // NOI18N
        getContentPane().add(Menu);
        Menu.setBounds(250, 80, 300, 100);

        loguito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/logochiqui.png"))); // NOI18N
        loguito1.setToolTipText("EJECUTIVO");
        loguito1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loguito1MouseClicked(evt);
            }
        });
        getContentPane().add(loguito1);
        loguito1.setBounds(20, 20, 90, 70);

        loguito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/cajerochiqui.png"))); // NOI18N
        loguito.setToolTipText("EJECUTIVO");
        loguito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loguitoMouseClicked(evt);
            }
        });
        getContentPane().add(loguito);
        loguito.setBounds(680, 30, 90, 70);

        pago_serv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/pagodeservicios.png"))); // NOI18N
        pago_serv.setToolTipText("EJECUTIVO");
        pago_serv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pago_servMouseClicked(evt);
            }
        });
        getContentPane().add(pago_serv);
        pago_serv.setBounds(120, 240, 140, 130);

        pago_serv1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/transferencias.png"))); // NOI18N
        pago_serv1.setToolTipText("EJECUTIVO");
        pago_serv1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pago_serv1MouseClicked(evt);
            }
        });
        getContentPane().add(pago_serv1);
        pago_serv1.setBounds(530, 220, 140, 130);

        text1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text1.setForeground(new java.awt.Color(0, 102, 51));
        text1.setText("Pago de servicios");
        getContentPane().add(text1);
        text1.setBounds(110, 370, 130, 17);

        text.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text.setForeground(new java.awt.Color(0, 102, 51));
        text.setText("Transferencias");
        getContentPane().add(text);
        text.setBounds(540, 360, 110, 17);

        consul.setIcon(new javax.swing.ImageIcon("C:\\Users\\GuillermoAugusto\\Desktop\\proyectos nedbins\\BancoNE\\src\\Images_NE\\consultas.png")); // NOI18N
        consul.setToolTipText("EJECUTIVO");
        consul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consulMouseClicked(evt);
            }
        });
        getContentPane().add(consul);
        consul.setBounds(350, 210, 90, 110);

        text3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text3.setForeground(new java.awt.Color(0, 102, 51));
        text3.setText("Consultas");
        getContentPane().add(text3);
        text3.setBounds(340, 320, 110, 17);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 800, 550);

        nc2.setText("jLabel1");
        getContentPane().add(nc2);
        nc2.setBounds(60, 120, 60, 30);

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

    private void pago_servMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pago_servMouseClicked
        // TODO add your handling code here:
             String numcuenta1;
        numcuenta1=JOptionPane.showInputDialog("Numero de cuenta");
        
         buscarusuario(numcuenta1);
       
              if(numcuenta1.equals(nc2.getText()))
         {
             JOptionPane.showMessageDialog(null,"Numero de cuenta correcto","Confirmación de inicio de sesión",JOptionPane.INFORMATION_MESSAGE);             
                new d1_Servicios().setVisible(true);
        d1_Servicios.numcuenta22.setText(""+numcuenta1);
         }else
         {
             JOptionPane.showMessageDialog(null,"Numero de cuenta incorrecto","Error",JOptionPane.ERROR_MESSAGE);
            
         }
    }//GEN-LAST:event_pago_servMouseClicked

    private void pago_serv1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pago_serv1MouseClicked
        // TODO add your handling code here:
          
          String numcuenta1;
        numcuenta1=JOptionPane.showInputDialog("Numero de cuenta");
        
         buscarusuario(numcuenta1);
       
              if(numcuenta1.equals(nc2.getText()))
         {
             JOptionPane.showMessageDialog(null,"Numero de cuenta correcto","Confirmación de inicio de sesión",JOptionPane.INFORMATION_MESSAGE);             
            new d2_Transferencias().setVisible(true);
        d2_Transferencias.numcuenta4.setText(""+numcuenta1);
         }else
         {
             JOptionPane.showMessageDialog(null,"Numero de cuenta o NIP incorrecto","Error",JOptionPane.ERROR_MESSAGE);
            
         }
    }//GEN-LAST:event_pago_serv1MouseClicked

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

    private void consulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulMouseClicked
        // TODO add your handling code here:
        new d6_Consultas().setVisible(true);
    }//GEN-LAST:event_consulMouseClicked

    
      public void buscarusuario(String nc){
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//Permite elegir los controlafdores en los cuales hara la conexion entre java y la base de datos
            Connection con=DriverManager.getConnection("jdbc:odbc:BANCONE","sa","sasa");//Permite realizar la conexion
       Statement stmt=con.createStatement();//Se reconocen las instrucciones de SQL
        ResultSet rs=stmt.executeQuery("SELECT NUM_CUENTA FROM CLIENTE WHERE NUM_CUENTA='"+nc+"'");//mete los valores a la base dedatos
        
        while(rs.next()){
            nc2.setText(rs.getString("NUM_CUENTA"));
            
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
            java.util.logging.Logger.getLogger(c3_MenuCaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(c3_MenuCaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(c3_MenuCaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(c3_MenuCaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new c3_MenuCaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel consul;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel loguito;
    private javax.swing.JLabel loguito1;
    private javax.swing.JLabel nc2;
    private javax.swing.JLabel pago_serv;
    private javax.swing.JLabel pago_serv1;
    private javax.swing.JLabel text;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text3;
    // End of variables declaration//GEN-END:variables
}
