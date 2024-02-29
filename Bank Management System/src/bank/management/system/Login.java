
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // for action listener
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    // ActionListener interface use to make button functionable
    
    JButton login,clear,signup; // defining globally so we can use these outside the constructors
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setTitle("Automated Teller Machine");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label); // it will add the icon on the frame
        
        JLabel text= new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        JLabel cardno= new JLabel("Card No: "); // Card Number 
        cardno.setFont(new Font("Balwey", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);
        
        cardTextField = new JTextField(); // card number input field
        cardTextField.setBounds(300,150,250,30);
        add(cardTextField);
        
        JLabel pin= new JLabel("PIN:"); // PIN 
        pin.setFont(new Font("Balwey", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);
        
         pinTextField = new JPasswordField(); // PIN input field
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);
        
        login = new JButton("Sign-in"); // Sign in button
        login.setBounds(300,300,100,30);
        login.addActionListener(this); // for button functionality
        add(login);
        
        clear = new JButton("Clear");  // clear button
        clear.setBounds(430,300,100,30);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("Sign-Up"); // sign up button
        signup.setBounds(300,350,230,30);
        signup.addActionListener(this);
        add(signup);
        
         getContentPane().setBackground(Color.WHITE);
        setSize(800,480); // sets the dimension of your frame
        setVisible(true);
        
       // start from 28:46 min
    }
    public void actionPerformed(ActionEvent ae){
        // Here we will define the funtions of buttons
        if(ae.getSource()== clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource()== login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where Card_Number = '"+cardnumber+"' and PIN ='"+pinnumber+"'";
            try{
               ResultSet rs= conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Inavalid Credentials");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()== signup){
            setVisible(false);
            new SignupOne().setVisible(true);
            
        }
        
    }
    public static void main(String[] args){
        new Login();
    }
}
