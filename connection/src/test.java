import java.sql.*;
public class test {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    
    public test() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
             String url="jdbc:mysql://127.0.0.1/db";
            String username="root";
            String pwd="";
            con=DriverManager.getConnection(url,username,pwd);
        }catch(Exception e){
            System.out.println("Error is="+e); 
        }
    }
    
  public  void getdata(){
        try{
           String query="select * from dbconnect";
            st=con.createStatement();
            rs=st.executeQuery(query);
            
               while(rs.next()){
                 String name=rs.getString("name");
                 String age=rs.getString("age");
                 System.out.println("Name is="+name+" age is"+age);
            }
            }
                 
        catch(Exception e){
            System.out.println("Error has="+e);
        }
  }
    
}

