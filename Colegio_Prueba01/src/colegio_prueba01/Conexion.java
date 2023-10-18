package colegio_prueba01;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    String bd = "alumnos";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "dajokaem";
    String password = "1314Dajokaem1516";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion() {

    }
    public Connection Conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url+bd, user, password);
            System.out.println("Se conecto a: "+bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No fue posible la conexion a: "+bd);
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
