/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package favoritesites;
import java.sql.*;
/**
 *
 * @author honorr
 */
public class Database {
    public static String database_url = "jdbc:mysql://localhost:3306/favorite_sites";
    public static String database_user = "root";
    public static String database_password = "12345678";
    
    public static Connection connectingDatabase(){
        Connection connection = null;
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(database_url,database_user,database_password);
            return connection;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
