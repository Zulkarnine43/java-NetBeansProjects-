import java.sql.*;
import java.util.Scanner;
public class data {
     private Connection con;
     private Statement st;
     
        public data() throws ClassNotFoundException, SQLException{
       
        try{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://127.0.0.1/db";
        String username="root";
        String pwd="";
        con=DriverManager.getConnection(url,username,pwd);
        }catch(Exception e){
            System.out.println("error has="+e);
        }
    }   
        
        void SendData(){
            
            try{
              Scanner sc=new Scanner(System.in);
              System.out.println("Insert student name=");
              String name= sc.nextLine();
             // String name="zulkar";
            //  String age="Nine";
              System.out.println("Insert age age=");
              String age= sc.nextLine();

            st=con.createStatement();
           String query="insert into dbconnect(name,age)values('"+name+"','"+age+"')";
          //String query="insert into dbconnect(name,age)values('name','age')";
  
         st.executeUpdate(query);
       
      System.out.println("Inserted records into the table...");
           
            }catch(Exception e){
            e.printStackTrace();
        }
    }
        
}
