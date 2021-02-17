/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jahed
 */
public class CalculatorFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorFrame
     */
    private String num1="";
    private String num2="";
    private String operator="";
    public CalculatorFrame() {
        
        initComponents();
        this.setTitle("Calculator"); // that is the code you looking for
    }
    private void settitel(){
        JFrame jframe = new JFrame("Calculator");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        caculatorDisplay = new javax.swing.JTextField();
        deleteOneDigit = new javax.swing.JButton();
        Mod = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        allClear = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        multiplication = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        add = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        substract = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        equel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        caculatorDisplay.setEditable(false);
        caculatorDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        caculatorDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        caculatorDisplay.setText("0.0");

        deleteOneDigit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteOneDigit.setText("<--");
        deleteOneDigit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteOneDigitMouseClicked(evt);
            }
        });

        Mod.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Mod.setText("%");
        Mod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModMouseClicked(evt);
            }
        });

        divide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        divide.setText("/");
        divide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divideMouseClicked(evt);
            }
        });

        allClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        allClear.setText("C");
        allClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allClearMouseClicked(evt);
            }
        });

        seven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seven.setText("7");
        seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenMouseClicked(evt);
            }
        });

        eight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eight.setText("8");
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightMouseClicked(evt);
            }
        });

        nine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nine.setText("9");
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineMouseClicked(evt);
            }
        });

        multiplication.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        multiplication.setText("*");
        multiplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplicationMouseClicked(evt);
            }
        });

        four.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        four.setText("4");
        four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourMouseClicked(evt);
            }
        });

        five.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        five.setText("5");
        five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveMouseClicked(evt);
            }
        });

        six.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        six.setText("6");
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixMouseClicked(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setText("+");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        one.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        one.setText("1");
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneMouseClicked(evt);
            }
        });

        two.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        two.setText("2");
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoMouseClicked(evt);
            }
        });

        three.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        three.setText("3");
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeMouseClicked(evt);
            }
        });

        substract.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        substract.setText("-");
        substract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                substractMouseClicked(evt);
            }
        });

        zero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        zero.setText("0");
        zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zeroMouseClicked(evt);
            }
        });

        dot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot.setText(".");
        dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dotMouseClicked(evt);
            }
        });

        equel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equel.setText("=");
        equel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caculatorDisplay)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(one, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(allClear, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(seven, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(four, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteOneDigit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Mod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(equel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caculatorDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteOneDigit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void zeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroMouseClicked
        if(operator.isEmpty()){
            if(num1.equals("0"))
                caculatorDisplay.setText(num1);
            else{
                num1+="0";
                caculatorDisplay.setText(num1);
            }
        }
        else{
            if(num2.equals("0"))
                caculatorDisplay.setText(num2);
            else{
                num2+="0";
                caculatorDisplay.setText(num2);
            }
        }
    }//GEN-LAST:event_zeroMouseClicked

    private void dotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotMouseClicked
        // TODO add your handling code here:
        if(operator.isEmpty()){
            if(num1.isEmpty()){
                num1+="0.";
                caculatorDisplay.setText(num1);
            }
            else if(num1.equals("0")){
                num1+=".";
                caculatorDisplay.setText(num1);
            }  
            else{
                boolean haveDot=false; 
                for(int i =0; i<num1.length();i++){
                    if(num1.charAt(i)=='.'){
                        haveDot = true;
                        break;
                    }
                }
                if(!haveDot){
                    num1+=".";
                    caculatorDisplay.setText(num1);
                }
                else{
                    caculatorDisplay.setText(num1);
                }
            }
        }
        else{
            if(num2.equals("0")||num2.isEmpty()){
                num2+="0.";
                caculatorDisplay.setText(num2);
            }
            else if(num2.equals("0")){
                num2+=".";
                caculatorDisplay.setText(num2);
            }   
            else{
                boolean haveDot=false; 
                for(int i =0; i<num2.length();i++){
                    if(num2.charAt(i)=='.'){
                        haveDot = true;
                        break;
                    }
                }
                if(!haveDot){
                    num2+=".";
                    caculatorDisplay.setText(num2);
                }
                else{
                    caculatorDisplay.setText(num2);
                }
            }
        }
    }//GEN-LAST:event_dotMouseClicked

    private void oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseClicked
        // TODO add your handling code here:
        if(operator.isEmpty()){
            if(num1.equals("0")){
                num1="1";
                caculatorDisplay.setText(num1);
            }
                
            else{
                num1+="1";
                caculatorDisplay.setText(num1);
            }
        }
        else{
            if(num2.equals("0")){
                num2="1";
                caculatorDisplay.setText(num2);
            }
                
            else{
                num2+="1";
                caculatorDisplay.setText(num2);
            }
        }
    }//GEN-LAST:event_oneMouseClicked

    private void twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseClicked
        // TODO add your handling code here:
        if(operator.isEmpty()){
            if(num1.equals("0")){
                num1="2";
                caculatorDisplay.setText(num1);
            }
                
            else{
                num1+="2";
                caculatorDisplay.setText(num1);
            }
        }
        else{
            if(num2.equals("0")){
                num2="2";
                caculatorDisplay.setText(num2);
            }
                
            else{
                num2+="2";
                caculatorDisplay.setText(num2);
            }
        }
    }//GEN-LAST:event_twoMouseClicked

    private void threeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseClicked
        // TODO add your handling code here:
        if(operator.isEmpty()){
            if(num1.equals("0")){
                num1="3";
                caculatorDisplay.setText(num1);
            }
                
            else{
                num1+="3";
                caculatorDisplay.setText(num1);
            }
        }
        else{
            if(num2.equals("0")){
                num2="3";
                caculatorDisplay.setText(num2);
            }
                
            else{
                num2+="3";
                caculatorDisplay.setText(num2);
            }
        }
    }//GEN-LAST:event_threeMouseClicked

    private void fourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseClicked
        // TODO add your handling code here:
        if(operator.isEmpty()){
            if(num1.equals("0")){
                num1="4";
                caculatorDisplay.setText(num1);
            }
                
            else{
                num1+="4";
                caculatorDisplay.setText(num1);
            }
        }
        else{
            if(num2.equals("0")){
                num2="4";
                caculatorDisplay.setText(num2);
            }
                
            else{
                num2+="4";
                caculatorDisplay.setText(num2);
            }
        }
    }//GEN-LAST:event_fourMouseClicked

    private void fiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseClicked
        // TODO add your handling code here:
        if(operator.isEmpty()){
            if(num1.equals("0")){
                num1="5";
                caculatorDisplay.setText(num1);
            }
                
            else{
                num1+="5";
                caculatorDisplay.setText(num1);
            }
        }
        else{
            if(num2.equals("0")){
                num2="5";
                caculatorDisplay.setText(num2);
            }
                
            else{
                num2+="5";
                caculatorDisplay.setText(num2);
            }
        }
    }//GEN-LAST:event_fiveMouseClicked

    private void sixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseClicked
        // TODO add your handling code here:
        if(operator.isEmpty()){
            if(num1.equals("0")){
                num1="6";
                caculatorDisplay.setText(num1);
            }
                
            else{
                num1+="6";
                caculatorDisplay.setText(num1);
            }
        }
        else{
            if(num2.equals("0")){
                num2="6";
                caculatorDisplay.setText(num2);
            }
                
            else{
                num2+="6";
                caculatorDisplay.setText(num2);
            }
        }
    }//GEN-LAST:event_sixMouseClicked

    private void sevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseClicked
        // TODO add your handling code here:
        if(operator.isEmpty()){
            if(num1.equals("0")){
                num1="7";
                caculatorDisplay.setText(num1);
            }
                
            else{
                num1+="7";
                caculatorDisplay.setText(num1);
            }
        }
        else{
            if(num2.equals("0")){
                num2="7";
                caculatorDisplay.setText(num2);
            }
                
            else{
                num2+="7";
                caculatorDisplay.setText(num2);
            }
        }
    }//GEN-LAST:event_sevenMouseClicked

    private void eightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseClicked
        // TODO add your handling code here:
        if(operator.isEmpty()){
            if(num1.equals("0")){
                num1="8";
                caculatorDisplay.setText(num1);
            }
                
            else{
                num1+="8";
                caculatorDisplay.setText(num1);
            }
        }
        else{
            if(num2.equals("0")){
                num2="8";
                caculatorDisplay.setText(num2);
            }
                
            else{
                num2+="8";
                caculatorDisplay.setText(num2);
            }
        }
    }//GEN-LAST:event_eightMouseClicked

    private void nineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseClicked
        // TODO add your handling code here:
        if(operator.isEmpty()){
            if(num1.equals("0")){
                num1="9";
                caculatorDisplay.setText(num1);
            }
                
            else{
                num1+="9";
                caculatorDisplay.setText(num1);
            }
        }
        else{
            if(num2.equals("0")){
                num2="9";
                caculatorDisplay.setText(num2);
            }
                
            else{
                num2+="9";
                caculatorDisplay.setText(num2);
            }
        }
    }//GEN-LAST:event_nineMouseClicked

    private void allClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allClearMouseClicked
        // TODO add your handling code here:
        num1="";
        num2="";
        operator="";
        caculatorDisplay.setText("0.0");
    }//GEN-LAST:event_allClearMouseClicked

    private void deleteOneDigitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteOneDigitMouseClicked
        // TODO add your handling code here:
        if(operator.isEmpty()){
            int lastDigit = num1.length()-1;
            String newNum=""; 
            if(!num1.isEmpty()||!num1.equals("0")||!num1.equals("0.0")){
                for(int i=0;i<lastDigit;i++)
                    newNum+=num1.charAt(i);
                num1=newNum;
                if(!num1.isEmpty())
                    caculatorDisplay.setText(num1);
                else
                    caculatorDisplay.setText("0.0");
            }
        }
        else{
            int lastDigit = num2.length()-1;
            String newNum=""; 
            if(!num2.isEmpty()||!num2.equals("0")||!num2.equals("0.0")){
                for(int i=0;i<lastDigit;i++)
                    newNum+=num2.charAt(i);
                num2=newNum;
                if(!num2.isEmpty())
                    caculatorDisplay.setText(num2);
                else
                    caculatorDisplay.setText("0.0");
            }
        }
    }//GEN-LAST:event_deleteOneDigitMouseClicked

    private void ModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModMouseClicked
        // TODO add your handling code here:
        if(num2.isEmpty())
            operator="%";
    }//GEN-LAST:event_ModMouseClicked

    private void divideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideMouseClicked
        // TODO add your handling code here:
        if(num2.isEmpty())
            operator="/";
    }//GEN-LAST:event_divideMouseClicked

    private void multiplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicationMouseClicked
        // TODO add your handling code here:
        if(num2.isEmpty())
            operator="*";
    }//GEN-LAST:event_multiplicationMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
        if(num2.isEmpty())
            operator="+";
    }//GEN-LAST:event_addMouseClicked

    private void substractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_substractMouseClicked
        // TODO add your handling code here:
        if(num2.isEmpty())
            operator="-";
    }//GEN-LAST:event_substractMouseClicked

    private void equelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equelMouseClicked
        // TODO add your handling code here:
        if(!num2.isEmpty()){
            switch(operator){
                case "+":
                    try{
                        caculatorDisplay.setText( String.valueOf(String.format("%.6f", Double.valueOf(num1)+Double.valueOf(num2))));
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(rootPane, e);
                        caculatorDisplay.setText("0.0");
                    }
                    
                    num1="";
                    num2="";
                    operator="";
                    break;
                case "-":
                    try{
                        caculatorDisplay.setText( String.valueOf(String.format("%.6f", Double.valueOf(num1)-Double.valueOf(num2))));
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(rootPane, e);
                        caculatorDisplay.setText("0.0");
                    }
                    
                    num1="";
                    num2="";
                    operator="";
                    break;
                case "*":
                    try{
                        caculatorDisplay.setText( String.valueOf(String.format("%.6f", Double.valueOf(num1)*Double.valueOf(num2))));
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(rootPane, e);
                        caculatorDisplay.setText("0.0");
                    }
                    
                    num1="";
                    num2="";
                    operator="";
                    break;
                case "/":
                    try{
                        caculatorDisplay.setText( String.valueOf(String.format("%.6f", Double.valueOf(num1)/Double.valueOf(num2))));
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(rootPane, e);
                        caculatorDisplay.setText("0.0");
                    }
                    
                    num1="";
                    num2="";
                    operator="";
                    break;
                case "%":
                    try{
                        caculatorDisplay.setText( String.valueOf(Double.valueOf(num1)%Double.valueOf(num2)));
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(rootPane, e);
                        caculatorDisplay.setText("0.0");
                    }
                    
                    num1="";
                    num2="";
                    operator="";
                    break;
                
            }
        }
            
    }//GEN-LAST:event_equelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
                
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mod;
    private javax.swing.JButton add;
    private javax.swing.JButton allClear;
    private javax.swing.JTextField caculatorDisplay;
    private javax.swing.JButton deleteOneDigit;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equel;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiplication;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton substract;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
