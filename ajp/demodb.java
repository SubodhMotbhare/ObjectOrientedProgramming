import java.lang.*;
import java.io.*;
import java.sql.*;

public class demodb
{
public static void main(String s[]) throws Exception
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306//student","root", "");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("Select *from student");
while(rs.next())
{
System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
}
con.close();
}
}
