/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Shaon
 */
public class test {
 public static void main(String[] args) {
     teacher teacher1;
    teacher1 = new teacher();
    teacher1.name ="Zulkar Nine";
    teacher1.gender="Male";
   // teacher1.phone = 01989419776;
    
    System.out.println("gender:"+teacher1.gender);
        System.out.println("name:"+teacher1.name);
            System.out.println("phone:"+teacher1.phone);
             teacher teacher2;
    teacher2 = new teacher();
    teacher2.name ="Shaon";
    teacher2.gender="Male";
   // teacher1.phone = 01989419776;
    
    System.out.println("gender:"+teacher2.gender);
        System.out.println("name:"+teacher2.name);
            System.out.println("phone:"+teacher2.phone);
 
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int a = sc.nextInt();
            System.out.println("Enter a number:");
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println("Sum is::"+sum);
            

     
 }
               
}
