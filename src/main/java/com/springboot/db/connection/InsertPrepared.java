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

            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","prabhakar","prabha225");

            PreparedStatement stmt=con.prepareStatement("insert into USERS values(?,?,?,?,?,?,?,?,?)");

            stmt.setInt(1,101);//1 specifies the first parameter in the query
            stmt.setString(2,"Ratan");
            //stmt ect values

            int i=stmt.executeUpdate();

            System.out.println(i+" records inserted");

            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
