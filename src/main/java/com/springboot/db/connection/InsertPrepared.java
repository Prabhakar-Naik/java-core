package com.springboot.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class InsertPrepared {

    public static void main(String[] args) {

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","username","password");

            PreparedStatement statement=connection.prepareStatement("insert into USERS values(?,?,?,?,?,?,?,?,?)");

            statement.setInt(1,101);//1 specifies the first parameter in the query
            statement.setString(2,"Ratan");
            //stmt ect values

            int i=statement.executeUpdate();

            System.out.println(i+" records inserted");

            connection.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
