/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascrud;

import tugascrud.Connection.DBConnection;
import tugascrud.Frame.Incoming;

/**
 *
 * @author hello
 */
public class TugasCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBConnection con = new DBConnection();        
        System.out.println(con.open());        
        
        Incoming in = new Incoming();
        in.setVisible(true);
    }
    
}
