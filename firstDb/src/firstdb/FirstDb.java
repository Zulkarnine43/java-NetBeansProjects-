
package firstdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class FirstDb {

    public static void main(String[] args) {
        // TODO code application logic here
        String url="jdbc:mysql://localhost:3306/firstdb";
        String username="root";
        String password="";
//        String query="select* from dbconnect";

//String query="ALTER TABLE registration RENAME TO student;";
//String query="ALTER TABLE student MODIFY id int(11) not NULL auto_increment;";
//          String query="insert into dbconnect(name,age) values('Zulkar Nine','21')";

Scanner sc =new Scanner(System.in);

 System.out.println("Enter  firstName");
 String first=sc.next();
 System.out.println("Enter  lastName");
 String last=sc.next();
 System.out.println("Enter  age");
 int age=sc.nextInt();

   String query="insert into student(first,last,age) values('"+first+"','"+last+"','"+age+"')";

//     String query = "CREATE TABLE REGISTRATION " +
//                   "(id INTEGER not NULL, " +
//                   " first VARCHAR(255), " + 
//                   " last VARCHAR(255), " + 
//                   " age INTEGER, " + 
//                   " PRIMARY KEY ( id ))"; 
 
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            st.executeUpdate(query);
            
            
             String sql="select* from student";
            
            ResultSet rs=st.executeQuery(sql);
            
            int count=0;
            while(rs.next()){
                 String firs=rs.getString("first");
                 String las=rs.getString("last");
                 String ag=rs.getString("age");
//                int age=rs.getInt("age");
                count++;
                System.out.println("No=="+count+"First Name is="+firs+"Last Name is="+las+"Age is "+ag);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
