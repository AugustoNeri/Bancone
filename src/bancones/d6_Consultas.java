/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancones;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Enrique
 */
public class d6_Consultas extends javax.swing.JFrame {

    /**
     * Creates new form d6_Consultas
     */
    public d6_Consultas() {
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

        consulta = new javax.swing.JComboBox();
        loguito1 = new javax.swing.JLabel();
        loguito2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(810, 550));
        getContentPane().setLayout(null);

        consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "transferencias", "pagos de servicios", "CLIENTE", " " }));
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });
        getContentPane().add(consulta);
        consulta.setBounds(180, 140, 370, 20);

        loguito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/logochiqui.png"))); // NOI18N
        loguito1.setToolTipText("EJECUTIVO");
        loguito1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loguito1MouseClicked(evt);
            }
        });
        getContentPane().add(loguito1);
        loguito1.setBounds(690, 20, 90, 70);

        loguito2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/logochiqui.png"))); // NOI18N
        loguito2.setToolTipText("EJECUTIVO");
        loguito2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loguito2MouseClicked(evt);
            }
        });
        getContentPane().add(loguito2);
        loguito2.setBounds(20, 20, 90, 70);

        TA1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TA1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 210, 730, 220);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 40, 420, 80);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 800, 550);

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

    private void loguito1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loguito1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loguito1MouseClicked

    private void loguito2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loguito2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loguito2MouseClicked

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
        // TODO add your handling code here:
        if(consulta.getSelectedItem().toString()=="transferencias"){
            DefaultTableModel tabla=new DefaultTableModel(); 
            try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:BANCONE","sa","sasa");
        // Connection con=DriverManager.getConnection("jdbc:odbc:HOSPITAL");
        Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery("exec CLI_transfe");  
            DatabaseMetaData meta =con.getMetaData();
        tabla.addColumn("CLIENTE_ORIGEN");
        tabla.addColumn("CLIENTE_DESTINO");
        tabla.addColumn("MONTO");
        tabla.addColumn("FECHA_TRANSFER");
        

        while(rs.next()){
            Object dato[]=new Object[4];
            for(int i=0;i<4;i++){
                dato[i]=rs.getString(i+1);
            }
            tabla.addRow(dato);
          }
         this.TA1.setModel(tabla);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e);
        }
        }
        if(consulta.getSelectedItem().toString()=="pagos de servicios"){
             DefaultTableModel tabla=new DefaultTableModel(); 
            try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:BANCONE","sa","sasa");
        // Connection con=DriverManager.getConnection("jdbc:odbc:HOSPITAL");
        Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery("exec CLI_SERV");  
            DatabaseMetaData meta =con.getMetaData();
        tabla.addColumn("NUM_CUENTA");
        tabla.addColumn("NOM_CLI");
        tabla.addColumn("CLAVE_SERVICIO");
        tabla.addColumn("NOMBRE_SERV");
        tabla.addColumn("PAGO");
        tabla.addColumn("FECHA_PAGO");
        while(rs.next()){
            Object dato[]=new Object[6];
            for(int i=0;i<6;i++){
                dato[i]=rs.getString(i+1);
            }
            tabla.addRow(dato);
          }
         this.TA1.setModel(tabla);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e);
        }
        }
             if(consulta.getSelectedItem().toString()=="CLIENTE"){
             DefaultTableModel tabla=new DefaultTableModel(); 
            try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:BANCONE","sa","sasa");
        // Connection con=DriverManager.getConnection("jdbc:odbc:HOSPITAL");
        Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery("SELECT * FROM CLIENTE");  
            DatabaseMetaData meta =con.getMetaData();
        tabla.addColumn("NUM_CUENTA");
        tabla.addColumn("NOM_CLI");
        tabla.addColumn("FECHA_NACIMIENTO");
        tabla.addColumn("NIP");
        tabla.addColumn("TIPOTARJETA");
        tabla.addColumn("SALDO");
        while(rs.next()){
            Object dato[]=new Object[6];
            for(int i=0;i<6;i++){
                dato[i]=rs.getString(i+1);
            }
            tabla.addRow(dato);
          }
         this.TA1.setModel(tabla);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e);
        }
        }
        
        
    }//GEN-LAST:event_consultaActionPerformed

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
            java.util.logging.Logger.getLogger(d6_Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d6_Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d6_Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d6_Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d6_Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TA1;
    private javax.swing.JComboBox consulta;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loguito1;
    private javax.swing.JLabel loguito2;
    // End of variables declaration//GEN-END:variables
}
