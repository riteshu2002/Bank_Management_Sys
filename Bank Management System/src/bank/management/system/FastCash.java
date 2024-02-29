// using same code as Transaction class 
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton deposite,fastCash,ministatement,withdrawl,pinchange,balance,exit;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text= new JLabel("Select Withdrawl Amount");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD,16));        
        image.add(text);
        
          deposite = new JButton("Rs 100"); // Dposite label
        deposite.setBounds(170,415,150,30);
        deposite.addActionListener(this);
        image.add(deposite);
        
         withdrawl = new JButton("Rs 500"); // cash withdrawl label
        withdrawl.setBounds(355,415,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
         fastCash = new JButton("Rs 1000"); // fast cash label
        fastCash.setBounds(170,450,150,30);
        fastCash.addActionListener(this);
        image.add(fastCash);
        
          ministatement = new JButton("Rs 2000"); // Mini Statement label
         ministatement.setBounds(355,450,150,30);
         ministatement.addActionListener(this);
        image.add( ministatement);
        
         pinchange = new JButton("Rs 5000"); //PIN change label
         pinchange.setBounds(170,485,150,30);
         pinchange.addActionListener(this);
        image.add( pinchange);
        
        balance = new JButton("Rs 10000"); //Balance Enquiry label
         balance.setBounds(355,485,150,30);
         balance.addActionListener(this);
        image.add( balance);
        
         exit = new JButton("Back"); //Exit label
         exit.setBounds(355,520,150,30);
         exit.addActionListener(this);
        image.add(exit);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
            
        }else {
            String amount = ((JButton)ae.getSource()).getText().substring(3); //500
            Conn c= new Conn();
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where PIN = '"+pinnumber+"' ");
                int balance=0;
                while(rs.next()){ // next() is use to iterate through each row of same pin
                    if(rs.getString("type").equals("Deposite")){
                        balance += Integer.parseInt( rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                // checking if the amount is sufficient or not
                if(ae.getSource()!=exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl' , '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"RS"+amount+" Debited Successfully");
                
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    public static void main(String []args){
        new FastCash("");
    }
}
