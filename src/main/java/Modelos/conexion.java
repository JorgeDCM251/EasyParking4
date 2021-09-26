/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author kadi
 */
public class conexion {
    //ATRIBUTOS DE CONEXIÓN
    
    public Connection conn;
    public String host = "localhost:3306";
    public String dataBase = "EASYPARKING4";
    public String user = "root";
    public String password = "";
    
    //METODOS
    
    public void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.dataBase+"?zeroDateTimeBehavior=CONVERT_TO_NULL",this.user,this.password);
            System.out.print("Conexión exitosa");    
        } catch (Exception error) {
            System.out.print("Error de conexión"+error);            
        }
    }
    public void desconectar(){
        conn = null;
    }
    
    
}
