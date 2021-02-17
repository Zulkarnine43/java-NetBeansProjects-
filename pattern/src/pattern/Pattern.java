
package pattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int s=n-1;
         for(i=s;i>=0;i++){
          for(j=0;j<i;j++){
            System.out.println(i);
         }
              System.out.println("\n");
    } 
    }
}







