package LabTask2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConvert extends JFrame implements ActionListener{
    
    Container c;
    JLabel imageLabel;
    ImageIcon icon;
    Font f1;
    JTextField inputField1, outputField;
    JButton btnInD, btnUsa, btnAues;
    
    CurrencyConvert(){
     
        initComponent();
        
    }
    void initComponent(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(100, 30, 500, 400);
        this.setTitle("Currency Coverter");
        this.setResizable(false);
        
        c = this.getContentPane();
        c.setLayout(null);
        
        f1 = new Font("Time new Roman", Font.BOLD, 16);
        
        icon = new ImageIcon(getClass().getResource("Currency.png"));
        
        imageLabel =  new JLabel(icon);
        imageLabel.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
        c.add(imageLabel);
        
        inputField1 = new JTextField();
        inputField1.setBounds(140,130, 250, 40);
        inputField1.setFont(f1);
        imageLabel.add(inputField1);
        
        outputField = new JTextField();
        outputField.setBounds(140,193, 250, 40);
        outputField.setFont(f1);
        imageLabel.add(outputField);
        
        
        btnInD = new JButton("IND");
        btnInD.setBounds(50, 280, 90, 40);
        btnInD.setFont(f1);
        btnInD.setBackground(Color.lightGray);
        imageLabel.add(btnInD);
        
        btnUsa = new JButton("USA");
        btnUsa.setBounds(200, 280, 90, 40);
        btnUsa.setFont(f1);
        btnUsa.setBackground(Color.lightGray);
        imageLabel.add(btnUsa);
        
        btnAues = new JButton("AUS");
        btnAues.setBounds(350, 280, 90, 40);
        btnAues.setFont(f1);
        btnAues.setBackground(Color.lightGray);
        imageLabel.add(btnAues);
        
        
        //ActionListener
        btnInD.addActionListener(this);
        btnUsa.addActionListener(this);
        btnAues.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {

     String s1 = inputField1.getText();
     
     if(e.getSource() == btnInD){
         double result , result1;
         
         result1 = Double.parseDouble(s1);
         result = result1 * 0.86;
         
         String S =  Double.toString(result);
         outputField.setText(S);
     }
       
     else if(e.getSource() == btnUsa){
         double result , result1;
         
         result1 = Double.parseDouble(s1);
         result = result1 * 0.0117;
         
         String S =  Double.toString(result);
         outputField.setText(S);
     }
     
     else if(e.getSource() == btnAues){
         double result , result1;
         
         result1 = Double.parseDouble(s1);
         result = result1 * 0.0163;
         
         String S =  Double.toString(result);
         outputField.setText(S);
     }
    }

    
    public static void main(String[] args) {
        CurrencyConvert cn = new CurrencyConvert();
        cn.setVisible(true);
    }
}
