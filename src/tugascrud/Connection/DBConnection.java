/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascrud.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hello
 */
public class DBConnection {
        public static Connection open(){
        Connection con;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3306/tugascrud";
            //latihanjava stands for yout database name.
            
            String username ="root";
            String password="";
            con = (Connection) DriverManager.getConnection(url, username, password);
            //root is the username
            //secret is the password
            return con;
        }
        catch (Exception e){
              System.err.println(e);
              return null;
        }
    }
}
