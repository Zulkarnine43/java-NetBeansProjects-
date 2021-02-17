
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class checkWrite {
    public static void main(String[] args) throws IOException {
   Scanner sc=new Scanner(System.in);
   File file=new File("C:\\Users\\DELL\\Documents\\file\\file2.txt");
   if (file.createNewFile())
{
    System.out.println("File is created!");
} else {
    System.out.println("File already exists.");
}
   
   try{
   String text="Hello guys! How are you? what happended ?";
   FileWriter fw=new FileWriter("C:\\Users\\DELL\\Documents\\file\\file2.txt");
   fw.write(text);
   fw.close();
   System.out.println("Write successfully");
   }catch(IOException e){
       e.printStackTrace();
   }
}
}
