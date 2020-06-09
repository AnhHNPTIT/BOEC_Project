/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.DriverManager;
import javax.jms.Connection;

/**
 *
 * @author hoang
 */
public class DBConnect {
    public static java.sql.Connection getConnection(){
        java.sql.Connection cons = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cons = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping?autoReconnect=true&useSSL=false", "root", "271297");
        } catch (Exception e){
            e.printStackTrace();
        }
        return cons;
    }
    
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
