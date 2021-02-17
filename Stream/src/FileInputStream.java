

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileInputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
     Scanner sc=new Scanner(System.in);
    
    
     PrintWriter pr=new PrintWriter("C:\\Users\\DELL\\Documents\\file\\file.txt");
     
     String text="";
     System.out.println("Enter Your Name");
     text=sc.next();
     pr.write(text+",");
     
     System.out.println("Enter Your id");
     text=sc.next();
     pr.write(text);
     pr.println();
     pr.close();

  File file = new File("C:\\Users\\DELL\\Documents\\file\\file.txt"); 
  BufferedReader br = new BufferedReader(new FileReader(file)); 
  
  String st; 
  while ((st = br.readLine()) != null) 
    System.out.println(st); 
  }
         
    }
   
