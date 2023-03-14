/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alejo
 */
public class Conexion {
    private Connection con = null;

    
    String bd="revision_vehicular_bdd";
    String url="jdbc:mysql://localhost:3306/";
   
    String user = "root";
    String pass = "jostin";
    String driver="com.mysql.jdbc.Driver";
    Connection cx;
    
    public Conexion(String bd){
        this.bd=bd;
    }

  
    public Connection conecta() throws SQLException {
        try {
            Class.forName(driver);
            cx =  DriverManager.getConnection(url+bd, user, pass);
            System.out.println("Se conecto a bdd "+bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conecto a la bdd "+bd);
        }
        return cx;
    }
     
    public static void main(String[] args) throws SQLException{
    Conexion conexion= new Conexion("revision_vehicular_bdd");
    conexion.conecta();
}
}
