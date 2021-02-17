/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.io.*;
public class outputString {
    public static void main(String[] args) throws FileNotFoundException, IOException {
  FileWriter f=new FileWriter("C:\\Users\\DELL\\Documents\\file\\file.txt");
        f.write("Hello guys");
        f.close();
        System.out.println("write successfully");
    }
    
}
