/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique
 */
public class d4_CrearC extends javax.swing.JFrame {
private String numCuenta;
DateFormat df= DateFormat.getDateInstance();
    private String nip;
    /**
     * Creates new form d4_CrearC
     */
    public d4_CrearC() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
          int [] parte = new int[4];    /*4 enteros que almacenan un valor aleatorio entre 1000 y 9999*/
        parte[0] = 9465;
        parte[1] = (int) (Math.random()*8999+1000);
        parte[2] = (int) (Math.random()*8999+1000);
        parte[3] = (int) (Math.random()*8999+1000);
        this.nip=""+parte[3];
        /*Hago cast de los valores y los concateno en numeroCuenta*/
        this.numCuenta = parte[0]+"-"+parte[1]+"-"+parte[2]+"-"+parte[3];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearC = new javax.swing.JLabel();
        loguito1 = new javax.swing.JLabel();
        loguito = new javax.swing.JLabel();
        text6 = new javax.swing.JLabel();
        text7 = new javax.swing.JLabel();
        text8 = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        text10 = new javax.swing.JLabel();
        tipo_cuenta = new javax.swing.JComboBox();
        nom = new javax.swing.JTextField();
        am = new javax.swing.JTextField();
        saldo = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        ap = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        nac = new javax.swing.JTextField();
        telef = new javax.swing.JTextField();
        text12 = new javax.swing.JLabel();
        texto1 = new javax.swing.JLabel();
        text11 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        pr = new javax.swing.JTextField();
        dir = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(810, 550));
        getContentPane().setLayout(null);

        CrearC.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        CrearC.setForeground(new java.awt.Color(0, 51, 0));
        CrearC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/crearcuentatxt.png"))); // NOI18N
        getContentPane().add(CrearC);
        CrearC.setBounds(290, 20, 200, 130);

        loguito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/logochiqui.png"))); // NOI18N
        loguito1.setToolTipText("EJECUTIVO");
        loguito1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loguito1MouseClicked(evt);
            }
        });
        getContentPane().add(loguito1);
        loguito1.setBounds(20, 20, 90, 70);

        loguito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/crearcuenta.png"))); // NOI18N
        loguito.setToolTipText("EJECUTIVO");
        loguito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loguitoMouseClicked(evt);
            }
        });
        getContentPane().add(loguito);
        loguito.setBounds(680, 0, 120, 130);

        text6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text6.setForeground(new java.awt.Color(0, 102, 51));
        text6.setText("Tipo de cuenta:");
        getContentPane().add(text6);
        text6.setBounds(380, 380, 160, 17);

        text7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text7.setForeground(new java.awt.Color(0, 102, 51));
        text7.setText("Fecha de nacimiento:");
        getContentPane().add(text7);
        text7.setBounds(380, 280, 160, 17);

        text8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text8.setForeground(new java.awt.Color(0, 102, 51));
        text8.setText("Saldo:");
        getContentPane().add(text8);
        text8.setBounds(380, 330, 160, 17);

        text5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text5.setForeground(new java.awt.Color(0, 102, 51));
        text5.setText("Apellido paterno");
        text5.setToolTipText("");
        getContentPane().add(text5);
        text5.setBounds(10, 170, 160, 17);

        texto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(0, 102, 51));
        texto.setText("Nacionalidad");
        getContentPane().add(texto);
        texto.setBounds(380, 220, 160, 17);

        text10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text10.setForeground(new java.awt.Color(0, 102, 51));
        text10.setText("Apellido materno");
        getContentPane().add(text10);
        text10.setBounds(10, 220, 160, 17);

        tipo_cuenta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "credito", "debito" }));
        getContentPane().add(tipo_cuenta);
        tipo_cuenta.setBounds(530, 370, 230, 30);
        getContentPane().add(nom);
        nom.setBounds(150, 270, 220, 30);
        getContentPane().add(am);
        am.setBounds(150, 220, 220, 30);
        getContentPane().add(saldo);
        saldo.setBounds(530, 320, 230, 30);

        Aceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Aceptar.setForeground(new java.awt.Color(0, 51, 0));
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar);
        Aceptar.setBounds(350, 465, 110, 30);
        getContentPane().add(ap);
        ap.setBounds(150, 170, 220, 30);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(530, 270, 230, 30);
        getContentPane().add(nac);
        nac.setBounds(530, 220, 220, 30);
        getContentPane().add(telef);
        telef.setBounds(150, 320, 220, 30);

        text12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text12.setForeground(new java.awt.Color(0, 102, 51));
        text12.setText("Teléfono");
        getContentPane().add(text12);
        text12.setBounds(10, 320, 160, 17);

        texto1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto1.setForeground(new java.awt.Color(0, 102, 51));
        texto1.setText("Direccion/colonia");
        getContentPane().add(texto1);
        texto1.setBounds(10, 380, 160, 17);

        text11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text11.setForeground(new java.awt.Color(0, 102, 51));
        text11.setText("Nombre:");
        getContentPane().add(text11);
        text11.setBounds(10, 270, 160, 17);

        texto2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        texto2.setForeground(new java.awt.Color(0, 102, 51));
        texto2.setText("Pais Residencia");
        getContentPane().add(texto2);
        texto2.setBounds(380, 180, 160, 17);
        getContentPane().add(pr);
        pr.setBounds(530, 180, 220, 30);
        getContentPane().add(dir);
        dir.setBounds(150, 380, 220, 30);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_NE/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(-20, 0, 800, 550);

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
        String nombre,tc,apepat,apemat,direccion,nacionalidad,pais;
         String fn =df.format(jDateChooser1.getDate());
        int telefono;
                float sal=0;
        apepat=ap.getText();
        apemat=am.getText();
        nombre=nom.getText();
        telefono=Integer.parseInt(telef.getText());
         direccion=dir.getText();
         pais=pr.getText();
         nacionalidad=nac.getText();
        sal=Float.parseFloat(saldo.getText());
        tc=tipo_cuenta.getSelectedItem().toString();
      
        
        if(sal<0.0){
            JOptionPane.showMessageDialog(null,"Error en saldo, solo admite numeros positivos");
        }else{
            try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:BANCONE","sa","sasa");
       // Connection con;
        //con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BANCONE; user=sa; password=sasa;");
     
        Statement stmt=con.createStatement();
        stmt.executeQuery("insert into CLIENTE values('"+numCuenta+"','"+apepat+"','"+apemat+"','"+nombre+"',"+telefono+",'"+direccion+"','"+pais+"','"+nacionalidad+"','"+nip+"','"+fn+"','"+tc+"',"+sal+")");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"Datos ingresados");
                JOptionPane.showMessageDialog(null," Su número cuenta: "+numCuenta+"\nNIP: "+nip);  
                this.dispose();
            //JOptionPane.showMessageDialog(null,e);
        }
          
            
        }
        
    }//GEN-LAST:event_AceptarActionPerformed

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
            java.util.logging.Logger.getLogger(d4_CrearC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d4_CrearC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d4_CrearC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d4_CrearC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d4_CrearC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel CrearC;
    private javax.swing.JTextField am;
    private javax.swing.JTextField ap;
    private javax.swing.JTextField dir;
    private javax.swing.JLabel fondo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel loguito;
    private javax.swing.JLabel loguito1;
    private javax.swing.JTextField nac;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField pr;
    private javax.swing.JTextField saldo;
    private javax.swing.JTextField telef;
    private javax.swing.JLabel text10;
    private javax.swing.JLabel text11;
    private javax.swing.JLabel text12;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text7;
    private javax.swing.JLabel text8;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JComboBox tipo_cuenta;
    // End of variables declaration//GEN-END:variables
}
