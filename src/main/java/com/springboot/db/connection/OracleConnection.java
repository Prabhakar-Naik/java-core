package com.springboot.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class OracleConnection {

    public static void main(String[] args) {

        try {
            // step 1 load the Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step 2 create the connection object
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","prabhakar","prabha225");

            // step 3 create the statement object
            Statement statement = connection.createStatement();

            //step 4 Execute the query
            ResultSet resultSet = statement.executeQuery("select * from users");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "
                +resultSet.getString(4)+" "+resultSet.getString(5)+" "+resultSet.getString(6)+" "
                +resultSet.getString(7)+" "+resultSet.getInt(8)+" "+resultSet.getInt(9));
            }
            // step 5 close the connection
            connection.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Execute every time.");
        }
    }
}
