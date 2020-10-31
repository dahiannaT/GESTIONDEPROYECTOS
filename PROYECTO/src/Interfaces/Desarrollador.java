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


public class Desarrollador extends javax.swing.JFrame {

   conexionSQL cc = new conexionSQL();
        Connection con = cc.conexion();
        
    public Desarrollador() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        lblIdD = new javax.swing.JLabel();
        lblNomd = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        lblTelD = new javax.swing.JLabel();
        lblCorreod = new javax.swing.JLabel();
        txtIdD = new javax.swing.JTextField();
        txtNomD = new javax.swing.JTextField();
        txtPuestoD = new javax.swing.JTextField();
        txtTelD = new javax.swing.JTextField();
        txtCorreoD = new javax.swing.JTextField();
        btnNuevoD = new javax.swing.JButton();
        btnListarD = new javax.swing.JButton();
        btnActualizarD = new javax.swing.JButton();
        btnEliminarD = new javax.swing.JButton();
        btnGuardarD = new javax.swing.JButton();
        btnRD = new javax.swing.JButton();
        txtBusquedaD = new javax.swing.JTextField();
        lblBuscarD = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDesarrolladores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desarrolladores");

        lblIdD.setText("Id:");

        lblNomd.setText("Nombre:");

        lblPuesto.setText("Puesto:");

        lblTelD.setText("Telefono:");

        lblCorreod.setText("Correo:");

        btnNuevoD.setText("Nuevo");
        btnNuevoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDActionPerformed(evt);
            }
        });

        btnListarD.setText("Listar");
        btnListarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDActionPerformed(evt);
            }
        });

        btnActualizarD.setText("Actualizar");
        btnActualizarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDActionPerformed(evt);
            }
        });

        btnEliminarD.setText("Eliminar");
        btnEliminarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDActionPerformed(evt);
            }
        });

        btnGuardarD.setText("Guardar");
        btnGuardarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDActionPerformed(evt);
            }
        });

        btnRD.setForeground(new java.awt.Color(204, 0, 0));
        btnRD.setText("Regresa");
        btnRD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCorreod)
                                .addComponent(lblTelD)
                                .addComponent(lblPuesto)
                                .addComponent(lblIdD))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomd)
                                .addGap(9, 9, 9)))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarD)
                            .addComponent(btnNuevoD))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtIdD, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNomD)
                        .addComponent(txtPuestoD)
                        .addComponent(txtTelD)
                        .addComponent(txtCorreoD, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnListarD)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRD, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnActualizarD)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarD)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdD)
                    .addComponent(txtIdD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomd)
                    .addComponent(txtNomD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuesto)
                    .addComponent(txtPuestoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelD)
                    .addComponent(txtTelD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreod)
                    .addComponent(txtCorreoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarD)
                    .addComponent(btnActualizarD)
                    .addComponent(btnEliminarD)
                    .addComponent(btnNuevoD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarD)
                    .addComponent(btnRD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        txtBusquedaD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaDKeyReleased(evt);
            }
        });

        lblBuscarD.setText("Buscar:");

        TablaDesarrolladores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaDesarrolladores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDesarrolladoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDesarrolladores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblBuscarD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBusquedaD, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusquedaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscarD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDActionPerformed
        insertarDesarrollador();
    }//GEN-LAST:event_btnGuardarDActionPerformed

    private void btnNuevoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoDActionPerformed

    private void btnListarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDActionPerformed
       listarDesarrollador();
    }//GEN-LAST:event_btnListarDActionPerformed

    private void TablaDesarrolladoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDesarrolladoresMouseClicked
        int filaSelec = TablaDesarrolladores.rowAtPoint(evt.getPoint());
        
        txtIdD.setText(TablaDesarrolladores.getValueAt(filaSelec,0).toString());
        txtNomD.setText(TablaDesarrolladores.getValueAt(filaSelec,1).toString());
        txtPuestoD.setText(TablaDesarrolladores.getValueAt(filaSelec,2).toString());
        txtTelD.setText(TablaDesarrolladores.getValueAt(filaSelec,3).toString());
        txtCorreoD.setText(TablaDesarrolladores.getValueAt(filaSelec,4).toString());
 
    }//GEN-LAST:event_TablaDesarrolladoresMouseClicked

    private void btnEliminarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDActionPerformed
       eliminarDesarrollador();
        listarDesarrollador();
        limpiarCampos();
    }//GEN-LAST:event_btnEliminarDActionPerformed

    private void txtBusquedaDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaDKeyReleased
        FiltrarDesarrollador(txtBusquedaD.getText());
    }//GEN-LAST:event_txtBusquedaDKeyReleased

    private void btnRDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRDActionPerformed
         Menu men =new Menu();
          men.setVisible(true);
          dispose();
    }//GEN-LAST:event_btnRDActionPerformed

    private void btnActualizarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDActionPerformed
        actualizarDesarrollador();
        limpiarCampos();
        listarDesarrollador();
    }//GEN-LAST:event_btnActualizarDActionPerformed

    
    public void insertarDesarrollador() {

        try {
         
          String query = "insert into Desarrolladores (id_desarrollador, nombreDesarrollador, puesto, numTel, correo) values (?,?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, Integer.parseInt(txtIdD.getText()));
            pst.setString(2, txtNomD.getText());
            pst.setString(3, txtPuestoD.getText());
            pst.setInt(4, Integer.parseInt(txtTelD.getText()));            
            pst.setString(5, txtCorreoD.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro Desarrollador Guardado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Desarrollador No Guardado" + e.getMessage());
        }
    }
    
     public void limpiarCampos(){
    txtIdD.setText("");
    txtNomD.setText("");
    txtPuestoD.setText("");
    txtTelD.setText("");
    txtCorreoD.setText("");
}
     
      public void listarDesarrollador(){
        String[] titulos ={"id_desarrollador", "nombreDesarrollador", "puesto", "numTel", "correo"};
        String[] registros= new String[6];
        
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        
        String query = "select * from Desarrolladores";
        try {
            Statement st =con.createStatement();
            ResultSet rs= st.executeQuery(query);
            
            while(rs.next()){
                registros[0]=rs.getString("id_desarrollador");
                registros[1]=rs.getString("nombreDesarrollador");
                registros[2]=rs.getString("puesto");
                registros[3]=rs.getString("numTel");
                registros[4]=rs.getString("correo");
                
                modelo.addRow(registros);                
            }
            
            TablaDesarrolladores.setModel(modelo);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al listar Desarrolladores" + e.getMessage());       
        }   
    }

       public void actualizarDesarrollador() {

        try {
         
          String query = "update Desarrolladores Set nombreDesarrollador=?, puesto=?, numTel=?, correo=? where id_desarrollador =?";

            int filaSelect=TablaDesarrolladores.getSelectedRow();
          
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, txtNomD.getText());
            pst.setString(2, txtPuestoD.getText());
            pst.setInt(3, Integer.parseInt(txtTelD.getText()));  
            pst.setString(4, txtCorreoD.getText());
            pst.setInt(5, Integer.parseInt(txtIdD.getText()));
                    
            pst.executeUpdate();
            pst.close();
            JOptionPane.showMessageDialog(null, "Registro Desarrollador Actualizado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Desarrollador No Actualizado" + e.getMessage());
        }
    }
       
       public void eliminarDesarrollador(){
    int filaSelec =TablaDesarrolladores.getSelectedRow();
    
        try {
            String query=" delete from Desarrolladores where id_desarrollador="+TablaDesarrolladores.getValueAt(filaSelec,0);
            
            Statement st=con.createStatement();
            
            int n=st.executeUpdate(query);
            
            if (n>=0){
             JOptionPane.showMessageDialog(null, "Registro Desarrollador Eliminado");   
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro Desarrollador No Eliminado" + e.getMessage()); 
        }
    
    }
    
       
       public void FiltrarDesarrollador(String valor){
        String[] titulos ={"id_desarrollador", "nombreDesarrollador", "puesto", "numTel", "correo"};
        String[] registros= new String[6];
        
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        
        String query = "select * from Desarrolladores where nombreDesarrollador like '%"+ valor + "%' ";
        try {
            Statement st =con.createStatement();
            ResultSet rs= st.executeQuery(query);
            
            while(rs.next()){
                registros[0]=rs.getString("id_desarrollador");
                registros[1]=rs.getString("nombreDesarrollador");
                registros[2]=rs.getString("puesto");
                registros[3]=rs.getString("numTel");
                registros[4]=rs.getString("correo");
                
                modelo.addRow(registros);                
            }
            
            TablaDesarrolladores.setModel(modelo);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al Filtrar Desarrolladores" + e.getMessage());       
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
            java.util.logging.Logger.getLogger(Desarrollador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desarrollador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desarrollador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desarrollador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desarrollador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDesarrolladores;
    private javax.swing.JButton btnActualizarD;
    private javax.swing.JButton btnEliminarD;
    private javax.swing.JButton btnGuardarD;
    private javax.swing.JButton btnListarD;
    private javax.swing.JButton btnNuevoD;
    private javax.swing.JButton btnRD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarD;
    private javax.swing.JLabel lblCorreod;
    private javax.swing.JLabel lblIdD;
    private javax.swing.JLabel lblNomd;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblTelD;
    private javax.swing.JTextField txtBusquedaD;
    private javax.swing.JTextField txtCorreoD;
    private javax.swing.JTextField txtIdD;
    private javax.swing.JTextField txtNomD;
    private javax.swing.JTextField txtPuestoD;
    private javax.swing.JTextField txtTelD;
    // End of variables declaration//GEN-END:variables
}
