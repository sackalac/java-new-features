package java8;


import org.junit.Test;

import java.sql.*;



public class JDBCImprovementsTest implements DriverAction{

    @Test
    public void driverActionExample(){
        try{
            // Creating driver instance
            Driver driver = new com.mysql.jdbc.Driver();
            // Creating Action Driver
            DriverAction da = new JDBCImprovementsTest();
            // Registering driver by passing driver and driverAction
            DriverManager.registerDriver(driver, da);
            // Creating connection
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mkmoi111");
            //Here student is database name, root is username and password is mysql
            Statement stmt=con.createStatement();
            // Executing SQL query
            ResultSet rs=stmt.executeQuery("select * from user");
            while(rs.next()){
                System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
            }
            // Closing connection
            con.close();
            // Calling deregisterDriver method
            DriverManager.deregisterDriver(driver);
        }catch(Exception e){ System.out.println(e);}
    }

    @Override
    public void deregister() {
        System.out.println("Driver deregistered");
    }
}
