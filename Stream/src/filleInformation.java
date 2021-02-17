import java.io.File;
public class filleInformation {
    public static void main(String[] args) {
        File obj=new File("C:\\Users\\DELL\\Documents\\file\\file.txt");
        if(obj.exists()){
            System.out.println("File Name is "+obj.getName());
             System.out.println("Absolute Path is "+obj.getAbsolutePath());
              System.out.println("File Read is "+obj.canRead());
               System.out.println("File write is "+obj.canWrite());
                System.out.println("File length is "+obj.length());
        }else{
             System.out.println("File Name is Not Found");
        }
        
    }
    
}
