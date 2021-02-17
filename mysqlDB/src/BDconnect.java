import java.sql.*;
public class BDconnect {
    private Connection con;
    private Statement st;
    private ResultSet rs; 
    
    
    public BDconnect(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=(Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1/db","root","");
   // st=con.createStatement();
}catch(Exception e){
    System.out.println("Error has="+e);
}
    }
    public void getData(){
        try{
            String query="select * from dbconnect";
            st=con.createStatement();
            rs=st.executeQuery(query);
            System.out.println("Records From Database");
            while(rs.next()){
                 String name=rs.getString("name");
                 String age=rs.getString("age");
                 System.out.println("Name is="+name+" age is"+age);
            }
            
            
        }catch(Exception e){
            System.out.println("Error has="+e);
        }
    }
}
