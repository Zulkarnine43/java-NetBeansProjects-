package main;
import java.util.Scanner;
import pkg1.*;
import pkg2.*;
/**
 *
 * @author Zulkar Nine
 */
public class main {
    public static void main(String[] args) {      
     String name;
     int id,batch;
     float cgpa;
            Scanner scanner = new Scanner(System.in);
  
            System.out.println("enter your name");
            name = scanner.nextLine();
            
            System.out.println("enter your id");
            id = scanner.nextInt();
            
            System.out.println("enter your batch");
            batch = scanner.nextInt();
            
            System.out.println("enter your cgpa");
            cgpa = scanner.nextFloat();
            
           
            System.out.println("Given Deatils are");
            System.out.println("\n");
            
                  
        ClassA objectA=new ClassA();
        ClassB objectB=new ClassB();
           
       objectA.displayA(name,id);
       objectB.displayB(batch,cgpa);   
       
    }
}
