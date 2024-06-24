package com.Accio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class DatabaseConnection {
    static Connection connection = null;

    public static Connection getConnection(){
        if(connection != null){
            return connection;
        }

        String username = "root";
        String password = "qwerty123";
        String url = "jdbc:mysql://localhost:3306/searchengineapp";

        return getConnection(username , password , url);
    }

    private static Connection getConnection(String username , String password , String url){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url , username , password);
        }
        catch(SQLException | ClassNotFoundException sqlException){
            sqlException.printStackTrace();
        }

        return connection;
    }

    //checking for connection
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        if(con != null){
            System.out.println("Connection successful");
        }
        else{
            System.out.println("Connection failed");
        }
    }
}
