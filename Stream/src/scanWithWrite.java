
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class scanWithWrite {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\DELL\\Documents\\file\\file.txt"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n to finish");
        String text = "";
        while (!text.equals("n")) {
            System.out.println("enter first name");
            text = scanner.next();
            pw.write(text + ",");
            System.out.println("enter last name");
            text = scanner.next();
            pw.write(text + ",");
        }
        pw.close();
    }
    
}
