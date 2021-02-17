/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop ;
/**
 *
 * @author DELL
 */
public class Oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test test1;
        test1 = new test();
        test1.name = "Sajedul islam";
        test1.id = 163432559;
        test1.phone = 1987667865;
        test1.home = "Norshingdi";
        System.out.println("Name::\n"+ test1.name);
        System.out.println("id::\n"+ test1.id);
        System.out.println("phone::\n"+ test1.phone);
        System.out.println("home::\n"+ test1.home);
        
     
    }
    
}
