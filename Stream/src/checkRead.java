import java.io.*;
import java.util.Scanner;
public class checkRead {
    public static void main(String[] args) throws IOException {
       // File file = new File("C:\\Users\\DELL\\Documents\\file\\file2.txt");
        
//        if(file.createNewFile()){
//            System.out.println("Create successfully");
//        }else{
//            System.out.println("File exists");
//        }
        try{
            //String text="";
            //Scanner sc=new Scanner(System.in);
            //System.out.println("Enter a your text");
            //text=sc.next();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\Documents\\file\\file2.txt")); 
           String val;
           while((val=br.readLine())!=null){
           System.out.println(val); 
        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
