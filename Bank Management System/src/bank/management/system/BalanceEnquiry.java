
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pinnumber;
    JButton back;
    BalanceEnquiry(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        back = new JButton("Back"); // back button
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        int balance=0;
        Conn c= new Conn();
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where PIN = '"+pinnumber+"' ");               
                while(rs.next()){ // next() is use to iterate through each row of same pin
                    if(rs.getString("type").equals("Deposite")){
                        balance += Integer.parseInt( rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
            }catch(Exception e){
                        System.out.println(e);
             }
        
            JLabel text = new JLabel("Your Current Account Balance is Rs: "+balance);
            text.setForeground(Color.WHITE);
            text.setFont(new Font("Raleway", Font.BOLD,15));
            text.setBounds(170,300,400,30);
            image.add(text);
            
            
            
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transaction(pinnumber).setVisible(true);
        
        
        
    }
    
    public static void main(String[] args){
        new BalanceEnquiry("");
    }
}