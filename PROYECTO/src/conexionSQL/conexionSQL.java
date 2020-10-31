/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dahianna
 */
public class conexionSQL {
    
    Connection conectar =null;
    String host="localhost";
        String port="5432";
        String db_name="dbproyecto";
        String username="postgres";
        String password="123456";
    public Connection conexion ()
    {
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+password+"");
                    
                    JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Conexion Fallida" + e.getMessage());
        }
       return conectar;
    }
    
}
