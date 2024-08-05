package com.springboot.db.connection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class InsertImage {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "username", "password");

            PreparedStatement prepareStatement = connection.prepareStatement("insert into imagetable values(?,?)");

            prepareStatement.setString(1,"prabhakar");

            FileInputStream fin=new FileInputStream("d:\\g.jpg");   // path
            prepareStatement.setBinaryStream(2,fin,fin.available());

            int i=prepareStatement.executeUpdate();

            System.out.println(i+" records affected");

            connection.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
