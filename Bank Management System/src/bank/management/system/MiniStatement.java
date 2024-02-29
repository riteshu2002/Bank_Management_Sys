
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.sql.*;
public class MiniStatement extends JFrame{
    
    
    MiniStatement( String pinnumber){
        setTitle("Mini Statement");
        setLayout(null);
        
        JLabel mini = new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);
        
        JLabel bank = new JLabel("Bank Of Baroda");
        bank.setBounds(150,20,100,20);
        add(bank);
        
        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);
        
        JLabel balance = new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);
        
        try{
            Conn conn = new Conn();
          ResultSet rs=  conn.s.executeQuery("select * from login where pin = '"+pinnumber+"' ");
          while(rs.next()){
              // to show card number in 1234XXXXXXXX3456 form
              card.setText("Card Number: "+ rs.getString("Card_Number").substring(0,4)+ "xxxx-xxxx"+ rs.getString("Card_Number").substring(12));
                           
          }
          
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{
            Conn conn = new Conn();
            int bal=0;
            ResultSet as = conn.s.executeQuery("SELECT * FROM bank where pin = '" + pinnumber + "' ");
            
            while(as.next()){
                mini.setText(mini.getText()+ "<html>"+ as.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + as.getString("type")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ as.getString("amount")+"<br><br></html>");
                
//               mini.append("<html>")
//            .append(rs.getString("date")).append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
//            .append(rs.getString("type")).append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
//            .append(rs.getString("amount")).append("<br><br>")
//            .append("</html>");
               
               
               if(as.getString("type").equals("Deposite")){
                        bal += Integer.parseInt( as.getString("amount"));
                    }else{
                        bal -= Integer.parseInt(as.getString("amount"));
                    }
            }
            balance.setText("Your Current account balance is Rs: "+bal);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        setSize(400,400);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    
    
    
    public static void main(String[] args){
        new MiniStatement("");
    }
}
