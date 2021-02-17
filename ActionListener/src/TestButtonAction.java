
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class TestButtonAction {
    public static void main(String[] args) {
        Frame f=new Frame("TestButton");
        f.setSize(200,200);
        Button hw =new Button("Hello world");
        f.add(hw);
        
        hw.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
         System.exit(0);
     }
              
    });
        f.setVisible(true);
    }
}
