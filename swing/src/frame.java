/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class frame {
    public static void main(String[] args) {
        JFrame frame=new JFrame("myFrame");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JButton btn1=new JButton("click");
        btn1.setBounds(20, 20, 100, 40);
        frame.add(btn1);
        
                ;
    }
}
