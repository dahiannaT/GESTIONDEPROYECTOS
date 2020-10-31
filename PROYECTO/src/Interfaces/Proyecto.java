/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import conexionSQL.conexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Proyecto extends javax.swing.JFrame {

    conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    
    public Proyecto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIdP = new javax.swing.JLabel();
        txtIdP = new javax.swing.JTextField();
        lblTiempoP = new javax.swing.JLabel();
        txtTiempoP = new javax.swing.JTextField();
        lblAvanceP = new javax.swing.JLabel();
        txtAvanceP = new javax.swing.JTextField();
        lblNomP = new javax.swing.JLabel();
        txtNomP = new javax.swing.JTextField();
        lblCostoP = new javax.swing.JLabel();
        txtCostoP = new javax.swing.JTextField();
        lblReqP = new javax.swing.JLabel();
        txtReqP = new javax.swing.JTextField();
        btbGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProyecto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyectos");

        lblIdP.setText("Id:");

        lblTiempoP.setText("Tiempo:");

        lblAvanceP.setText("Avance:");

        lblNomP.setText("Nombre:");

        lblCostoP.setText("Costo:");

        lblReqP.setText("Requisitos:");

        btbGuardar.setText("Guardar");
        btbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        TablaProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProyectoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProyecto);

        jLabel1.setText("Buscar:");

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblIdP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(lblTiempoP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTiempoP, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNomP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomP, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAvanceP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAvanceP, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCostoP)
                                .addGap(18, 18, 18)
                                .addComponent(txtCostoP, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btbGuardar)
                                .addGap(52, 52, 52)
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnListar)
                                .addGap(61, 61, 61)
                                .addComponent(btnActualizar)
                                .addGap(54, 54, 54)
                                .addComponent(btnEliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblReqP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtReqP)))))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdP)
                    .addComponent(txtIdP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoP)
                    .addComponent(txtTiempoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvanceP)
                    .addComponent(txtAvanceP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomP)
                    .addComponent(txtNomP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCostoP)
                    .addComponent(txtCostoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReqP)
                    .addComponent(txtReqP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbGuardar)
                    .addComponent(btnNuevo)
                    .addComponent(btnListar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
       listarProyecto();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbGuardarActionPerformed
        insertarProyecto();
    }//GEN-LAST:event_btbGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void TablaProyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProyectoMouseClicked
         int filaSelec = TablaProyecto.rowAtPoint(evt.getPoint());
        
        txtIdP.setText(TablaProyecto.getValueAt(filaSelec,0).toString());
        txtNomP.setText(TablaProyecto.getValueAt(filaSelec,1).toString());
        txtTiempoP.setText(TablaProyecto.getValueAt(filaSelec,2).toString());
        txtCostoP.setText(TablaProyecto.getValueAt(filaSelec,3).toString());
        txtReqP.setText(TablaProyecto.getValueAt(filaSelec,4).toString());
        txtAvanceP.setText(TablaProyecto.getValueAt(filaSelec,5).toString());
 
    }//GEN-LAST:event_TablaProyectoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarProyecto();
        listarProyecto();
        limpiarCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        filtrarProyecto(txtBusqueda.getText());
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu men =new Menu();
          men.setVisible(true);
          dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarProyecto();
        limpiarCampos();
        listarProyecto();
    }//GEN-LAST:event_btnActualizarActionPerformed

    
      public void insertarProyecto() {

        try {
         
          String query = "insert into Proyecto (id_proyecto, nombreProyecto, tiempo, costo, requisitos, avance) values (?,?,?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, Integer.parseInt(txtIdP.getText()));
            pst.setString(2, txtNomP.getText());
            pst.setString(3, txtTiempoP.getText());
            pst.setInt(4, Integer.parseInt(txtCostoP.getText()));           
            pst.setString(5, txtReqP.getText());
            pst.setInt(6, Integer.parseInt(txtAvanceP.getText()));

            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro Proyecto Guardado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Proyecto No Guardado" + e.getMessage());
        }
    }
      
      public void limpiarCampos(){
        txtIdP.setText("");
        txtNomP.setText("");
        txtTiempoP.setText("");
        txtCostoP.setText("");
        txtReqP.setText("");
        txtAvanceP.setText("");
    }
     
      public void listarProyecto(){
        String[] titulos ={"id_proyecto", "nombreProyecto", "tiempo", "costo", "requisitos" ,"avance"};
        String[] registros= new String[6];
        
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        
        String query = "select * from Proyecto";
        try {
            Statement st =con.createStatement();
            ResultSet rs= st.executeQuery(query);
            
            while(rs.next()){
                registros[0]=rs.getString("id_proyecto");
                registros[1]=rs.getString("nombreProyecto");
                registros[2]=rs.getString("tiempo");
                registros[3]=rs.getString("costo");
                registros[4]=rs.getString("requisitos");
                registros[5]=rs.getString("avance");
                modelo.addRow(registros);                
            }
            
            TablaProyecto.setModel(modelo);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al listar Proyecto" + e.getMessage());       
        }   
    }

       public void eliminarProyecto(){
    int filaSelec =TablaProyecto.getSelectedRow();
    
        try {
            String query=" delete from Proyecto where id_proyecto="+TablaProyecto.getValueAt(filaSelec,0);
            
            Statement st=con.createStatement();
            
            int n=st.executeUpdate(query);
            
            if (n>=0){
             JOptionPane.showMessageDialog(null, "Registro Proyecto Eliminado");   
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Proyecto No Eliminado" + e.getMessage()); 
        }
    
    }
      
       
       public void filtrarProyecto(String valor){
        String[] titulos ={"id_proyecto", "nombreProyecto", "tiempo", "costo", "requisitos" ,"avance"};
        String[] registros= new String[7];
        
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        
        String query = "select * from Proyecto where nombreProyecto like '%"+ valor + "%' ";
        try {
            Statement st =con.createStatement();
            ResultSet rs= st.executeQuery(query);
            
            while(rs.next()){
                registros[0]=rs.getString("id_proyecto");
                registros[1]=rs.getString("nombreProyecto");
                registros[2]=rs.getString("tiempo");
                registros[3]=rs.getString("costo");
                registros[4]=rs.getString("requisitos");
                registros[5]=rs.getString("avance");
                modelo.addRow(registros);                
            }
            
            TablaProyecto.setModel(modelo);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al filtrar Proyecto" + e.getMessage());       
        }   
    }
     
       
       public void actualizarProyecto() {

        try {
         
          String query = "update Proyecto Set nombreProyecto=?, tiempo=?, costo=?, requisitos=?, avance=? where id_proyecto =?";

            int filaSelect=TablaProyecto.getSelectedRow();
          
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, txtNomP.getText());
            pst.setString(2, txtTiempoP.getText());
            pst.setInt(3, Integer.parseInt(txtCostoP.getText()));
            pst.setString(4, txtReqP.getText());
            pst.setInt(5, Integer.parseInt(txtAvanceP.getText())); 
            pst.setInt(6, Integer.parseInt(txtIdP.getText()));
                    
            pst.executeUpdate();
            pst.close();
            JOptionPane.showMessageDialog(null, "Registro Proyectos Actualizado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Proyectos No Actualizado" + e.getMessage());
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
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProyecto;
    private javax.swing.JButton btbGuardar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvanceP;
    private javax.swing.JLabel lblCostoP;
    private javax.swing.JLabel lblIdP;
    private javax.swing.JLabel lblNomP;
    private javax.swing.JLabel lblReqP;
    private javax.swing.JLabel lblTiempoP;
    private javax.swing.JTextField txtAvanceP;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCostoP;
    private javax.swing.JTextField txtIdP;
    private javax.swing.JTextField txtNomP;
    private javax.swing.JTextField txtReqP;
    private javax.swing.JTextField txtTiempoP;
    // End of variables declaration//GEN-END:variables

}
