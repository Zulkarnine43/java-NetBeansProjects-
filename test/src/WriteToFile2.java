import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile2 {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("studentfile.txt"));
		String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        text = scanner.next();
        pw.write(text + ",");
        System.out.println("Enter Student ID: ");
        text = scanner.next();
        pw.write(text + ",");

        pw.println();
        pw.close();

    }
}