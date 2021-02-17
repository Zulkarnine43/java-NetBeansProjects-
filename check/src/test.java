import java.sql.*;
public class test {
    private Connection con;
   // private Statement st;
    private PreparedStatement st;
    private ResultSet rs;
    
    public test(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1/db";
            String uname="root";
            String pw="";
            con=DriverManager.getConnection(url,uname,pw); 
            //String query="SELECT * FROM dbconnect" +  "WHERE name =? and age=?";
            String query="insert into dbconnect(name,age)" +  "values (?,?)";
            st=con.prepareStatement(query);
            st.setString(1,"zulkarNine");
            st.setInt(2,2000);
            st.executeUpdate();
//            st=con.createStatement();
//            rs=st.executeQuery(query);
//            
//            while(rs.next()){
//                System.out.println("Name is"+rs.getString("age"));
//            }
        }catch(Exception e){
           e.printStackTrace();
            
        }
    }
    
}
