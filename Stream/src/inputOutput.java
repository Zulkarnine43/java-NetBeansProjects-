//import java.io.*;
//public class inputOutput {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) throws IOException {
//        // TODO code application logic here
//         FileInputStream in = null;
//      FileOutputStream out = null;
//
//      try {
//         in = new FileInputStream("C:\\Users\\DELL\\Documents\\file\\file.txt");
//         out = new FileOutputStream("output.txt");
//         
//         int c;
//         while ((c = in.read()) != -1) {
//            out.write(c);
//         }
//      }finally {
//         if (in != null) {
//            in.close();
//         }
//         if (out != null) {
//            out.close();
//         }
//      }
//    }
//    
//}
