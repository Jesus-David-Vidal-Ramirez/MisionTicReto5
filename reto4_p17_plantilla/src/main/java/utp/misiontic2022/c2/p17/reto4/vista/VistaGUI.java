/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p17.reto4.vista;

import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.p17.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;

/**
 *
 * @author JESÚS
 */
public class VistaGUI extends javax.swing.JFrame {

    /**
     * Creates new form VistaGUI
     */
    private ControladorRequerimientos controlador;
    private Vistarequerimiento1 Vista1;
    private Vistarequerimiento2 Vista2;
    private Vistarequerimiento3 Vista3;
    public VistaGUI() {
        controlador = new ControladorRequerimientos();
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

        jPanel1 = new javax.swing.JPanel();
        Menu = new javax.swing.JTabbedPane();
        Consulta1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jButtonEjecutar1 = new javax.swing.JButton();
        Consulta2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jButtonEjecutar2 = new javax.swing.JButton();
        Consulta3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table3 = new javax.swing.JTable();
        jButtonEjecutar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Consulta # 1");

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Table1);

        jButtonEjecutar1.setText("Ejecutar");
        jButtonEjecutar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEjecutar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Consulta1Layout = new javax.swing.GroupLayout(Consulta1);
        Consulta1.setLayout(Consulta1Layout);
        Consulta1Layout.setHorizontalGroup(
            Consulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consulta1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Consulta1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Consulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Consulta1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Consulta1Layout.createSequentialGroup()
                        .addComponent(jButtonEjecutar1)
                        .addGap(245, 245, 245))))
        );
        Consulta1Layout.setVerticalGroup(
            Consulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consulta1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonEjecutar1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        Menu.addTab("Consulta 1", Consulta1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Consulta # 2");

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Table2);

        jButtonEjecutar2.setText("Ejecutar");
        jButtonEjecutar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEjecutar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Consulta2Layout = new javax.swing.GroupLayout(Consulta2);
        Consulta2.setLayout(Consulta2Layout);
        Consulta2Layout.setHorizontalGroup(
            Consulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consulta2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Consulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consulta2Layout.createSequentialGroup()
                        .addGap(0, 217, Short.MAX_VALUE)
                        .addGroup(Consulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Consulta2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(212, 212, 212))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Consulta2Layout.createSequentialGroup()
                                .addComponent(jButtonEjecutar2)
                                .addGap(246, 246, 246))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Consulta2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        Consulta2Layout.setVerticalGroup(
            Consulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consulta2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEjecutar2)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        Menu.addTab("Consulta 2", Consulta2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Consulta # 3");

        Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Table3);

        jButtonEjecutar3.setText("Ejecutar");
        jButtonEjecutar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEjecutar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Consulta3Layout = new javax.swing.GroupLayout(Consulta3);
        Consulta3.setLayout(Consulta3Layout);
        Consulta3Layout.setHorizontalGroup(
            Consulta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consulta3Layout.createSequentialGroup()
                .addGroup(Consulta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consulta3Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel2))
                    .addGroup(Consulta3Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jButtonEjecutar3)))
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Consulta3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );
        Consulta3Layout.setVerticalGroup(
            Consulta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consulta3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEjecutar3)
                .addGap(37, 37, 37))
        );

        Menu.addTab("Consulta 3", Consulta3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEjecutar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEjecutar1ActionPerformed
        ArrayList<Requerimiento_1> requerimiento1 = new ArrayList<>();
        
        try{
            requerimiento1 = controlador.consultarRequerimiento1();
            Vista1 = new Vistarequerimiento1(requerimiento1);
            Table1.setModel(Vista1);
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonEjecutar1ActionPerformed

    private void jButtonEjecutar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEjecutar2ActionPerformed
         ArrayList<Requerimiento_2> requerimiento2 = new ArrayList<>();
        try{
            requerimiento2 = controlador.consultarRequerimiento2();
            Vista2 = new Vistarequerimiento2(requerimiento2);
            Table2.setModel(Vista2);
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonEjecutar2ActionPerformed

    private void jButtonEjecutar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEjecutar3ActionPerformed
         ArrayList<Requerimiento_3> requerimiento3 = new ArrayList<>();
        try{
            requerimiento3 = controlador.consultarRequerimiento3();
            Vista3 = new Vistarequerimiento3(requerimiento3);
            Table3.setModel(Vista3);
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonEjecutar3ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Consulta1;
    private javax.swing.JPanel Consulta2;
    private javax.swing.JPanel Consulta3;
    private javax.swing.JTabbedPane Menu;
    private javax.swing.JTable Table1;
    private javax.swing.JTable Table2;
    private javax.swing.JTable Table3;
    private javax.swing.JButton jButtonEjecutar1;
    private javax.swing.JButton jButtonEjecutar2;
    private javax.swing.JButton jButtonEjecutar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}