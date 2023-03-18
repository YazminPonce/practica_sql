/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql_nube;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author yazmi
 */
public class ConexionNube {
    Connection conn;
    
    public Connection open(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://us-east.connect.psdb.cloud/sql_bts?sslMode=VERIFY_IDENTITY",
                    "frvlmzqwkzgiwges33d5",
                    "pscale_pw_E6Ql9pq9QHKCEbYhZZ1usVO1GEeHePPjexiKPerBDKx");
            return conn;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }
    
    public void close(){
    if(conn != null){
        try {
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Seccion cerrada");
        }
    }
    }
}
