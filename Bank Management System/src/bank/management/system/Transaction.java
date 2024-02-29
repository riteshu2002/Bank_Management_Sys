
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transaction extends JFrame implements ActionListener{
    
    JButton deposite,fastCash,ministatement,withdrawl,pinchange,balance,exit;
    String pinnumber;
    Transaction(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text= new JLabel("Please select your Transaction");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD,16));        
        image.add(text);
        
          deposite = new JButton("Deposite"); // Dposite label
        deposite.setBounds(170,415,150,30);
        deposite.addActionListener(this);
        image.add(deposite);
        
         withdrawl = new JButton("Cash Withdrawl"); // cash withdrawl label
        withdrawl.setBounds(355,415,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
         fastCash = new JButton("Fast Cash"); // fast cash label
        fastCash.setBounds(170,450,150,30);
        fastCash.addActionListener(this);
        image.add(fastCash);
        
          ministatement = new JButton("Mini Statement"); // Mini Statement label
         ministatement.setBounds(355,450,150,30);
         ministatement.addActionListener(this);
        image.add( ministatement);
        
         pinchange = new JButton("Change PIN"); //PIN change label
         pinchange.setBounds(170,485,150,30);
         pinchange.addActionListener(this);
        image.add( pinchange);
        
        balance = new JButton("Balance Enquiry"); //Balance Enquiry label
         balance.setBounds(355,485,150,30);
         balance.addActionListener(this);
        image.add( balance);
        
         exit = new JButton("Exit"); //Exit label
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
            System.exit(0);
            
        }else if(ae.getSource()==deposite){
            setVisible(false);
            new Deposite(pinnumber).setVisible(true);
        }else if(ae.getSource()==withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()==fastCash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource()== balance){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
            
        }else if(ae.getSource()==ministatement){
//            setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
            
        }
    }
    
    public static void main(String []args){
        new Transaction("");
    }
}
