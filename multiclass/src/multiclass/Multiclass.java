
package multiclass;
import java.util.Scanner;

//Name: Faruqe Hasan
//Id: 163432560

public class Multiclass {

    public static void main(String[] args) {
        // TODO code application logic here
          
         Scanner sc = new Scanner(System.in); 
         System.out.println("Enter a number like 1,2,3,4...");
         int number = sc.nextInt();
         
         if(number==1){
             hobby my = new hobby();
         }else if(number==2){
              food my = new food();
         }else if(number==3){
                 writer my = new writer();
           }else{
             place my = new place();
         }
    }
    
}
