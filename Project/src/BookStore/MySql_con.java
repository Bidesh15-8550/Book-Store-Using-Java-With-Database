
package BookStore;

import java.sql.*;
public class MySql_con {
       public static Connection connectDB() 
{
Connection conn=null;
try
{
Class.forName("com.mysql.jdbc.Driver"); //Register the driver

conn = DriverManager.getConnection("jdbc:mysql://localhost/BookStore","root", "");
System.out.print("Database is connected !");
//Statement stt = conn.createStatement();
return conn;
}
catch(Exception e)
{
System.out.print("Do not connect to DB - Error:"+e);
return null;
} 
}
}
