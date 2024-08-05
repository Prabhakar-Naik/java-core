package com.springboot.db.connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class Procedure {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // if you want to work with mysql postgresql and nosql just get the configurations
        // do it as it ease from small changes

        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","username","password");

        CallableStatement stmt=con.prepareCall("{call insertR(?,?)}");

        stmt.setInt(1,1011);
        stmt.setString(2,"Amit");
        stmt.execute();

        con.close();
        System.out.println("success");

    }
}
