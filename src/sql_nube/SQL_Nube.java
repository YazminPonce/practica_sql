/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sql_nube;

/**
 *
 * @author yazmi
 */
public class SQL_Nube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ConexionNube connMySQL = new ConexionNube();
         
        try {
            connMySQL.open();
            System.err.println("Conexion establecida con MySQL.");
            
              connMySQL.close();
             System.err.println("Se ha cerrado la conexion");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
      
    }
    
}
