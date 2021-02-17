import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
       String url="jdbc:mysql://127.0.0.1/db";
       String username="root";
       String pwd="";
       
       String query="Select* FROM dbconnect";
        
        Class.forName("com.mysql.jdbc.Driver");
    Connection connection=(Connection)DriverManager.getConnection(url,username,pwd);
    Statement statement=connection.createStatement();
    ResultSet result=statement.executeQuery(query);
    result.next();
    
    String name=result.getString("name");
    System.out.println("Name is="+name);
    connection.close();
    statement.close();
    
    }
}
