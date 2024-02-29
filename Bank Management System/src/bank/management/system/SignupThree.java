
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox  c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    SignupThree(String formno){
        setLayout(null);
        this.formno = formno;
   
   //-------------------------------------------------------------- Frame Label
        JLabel l1= new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        l1.setBackground(Color.WHITE);
        add(l1);
   //--------------------------------------------------------------frame label end--     
        
       
   // -------------------------------------------------------------------------------------Account Type     
         JLabel type= new JLabel("Account Type:");
       type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        type.setBackground(Color.WHITE);
        add(type);
        
        r1= new JRadioButton("Saving Account"); // Saving Account radio button
        r1.setFont(new Font("Raleway", Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,250,20);
        add(r1);
        
         r2= new JRadioButton("Fixed Deposit Account"); // Fixed Deposit Account radio button
        r2.setFont(new Font("Raleway", Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        
         r3= new JRadioButton("Current Account"); // Current Account radio button
        r3.setFont(new Font("Raleway", Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);
        
         r4= new JRadioButton("Recurring Deposit Account");// Recurring Deposit Account radio button
        r4.setFont(new Font("Raleway", Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup(); // Grouping the buttons so that only one type is selected
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
   // --------------------------------------------------------------------------------------Account Type end--
  
   //------------------------------------------------------------------------------DEMO Details of card and Pin
        JLabel card= new JLabel("Card Number:");
       card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        card.setBackground(Color.WHITE);
        add(card);
        
        JLabel number= new JLabel("XXXX-XXXX-XXXX-3456");
       number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        number.setBackground(Color.WHITE);
        add(number);
        
        JLabel demoCardNo= new JLabel("Your 16 digit Card Number");
       demoCardNo.setFont(new Font("Raleway",Font.BOLD,12));
        demoCardNo.setBounds(100,330,300,20);
        demoCardNo.setBackground(Color.WHITE);
        add(demoCardNo);
        
         JLabel pin= new JLabel("PIN:");
       pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        pin.setBackground(Color.WHITE);
        add(pin);
        
         JLabel pnumber= new JLabel("XXXX");
       pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        pnumber.setBackground(Color.WHITE);
        add(pnumber);
        
        JLabel demoPinNo= new JLabel("Your 4 Digit PIN");
       demoPinNo.setFont(new Font("Raleway",Font.BOLD,12));
        demoPinNo.setBounds(100,400,300,20);
        demoPinNo.setBackground(Color.WHITE);
        add(demoPinNo);
   //-------------------------------------------------------------------------------- DEMO End--     
   
   //-------------------------------------------------------------------------------Services Required
        JLabel services= new JLabel("Services Required:"); //Services Required label
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,400,30);
        services.setBackground(Color.WHITE);
        add(services);
        
        c1= new JCheckBox("ATM CARD"); // ATM checkbox
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
         c2= new JCheckBox("Internet Banking");// Internet Banking checkbox
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
         c3= new JCheckBox("Mobile Banking"); // Mobile Banking checkbox
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4= new JCheckBox("Email/SMS Alerts"); // Email/SMS Alerts checkbox
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5= new JCheckBox("Cheque Book"); // Cheque Book chekbox
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6= new JCheckBox("E-Statement"); // E-Statement checkbox
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7= new JCheckBox("I hereby decalare that the above entered detials are correct to the best of my knowledge.");
        c7.setBackground(Color.WHITE); // Self Declaratiion checkbox
        c7.setFont(new Font("Raleway", Font.BOLD,12));
        c7.setBounds(100,640,600,30);
        add(c7);
             
//--------------------------------------------------------------------------------------Services Required End--

//-----------------------------------------------------------------------------------------Buttons
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,675,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,675,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
//----------------------------------------------------------------------------------------Button END--        

//-------------------------------------------------------setting frame size and location     
        setSize(800,900);
        setLocation(350,0);
        setVisible(true);
        setBackground(Color.WHITE);
        
   //----------------------------------------------------------------------------end frame--
   
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== submit){
            String accountType=null;
            if(r1.isSelected()){
                accountType="Saving Account";
            }else if(r2.isSelected()){
                accountType="Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType="Current Account";
            }else if(r4.isSelected()){
                accountType="Recurring Deposit Account";
            }
            
            // Generating Card Number and PIN using Random method
            Random random = new Random();
            String cardnumber = ""+ Math.abs((random.nextLong() % 90000000L)+5040936000000000L);
            String pinnumber = ""+Math.abs((random.nextLong() % 9000L) + 1000L);
            
            // selecting multiple services
            String facility="";
            if(c1.isSelected()){
                facility = facility+ "ATM Card";
            }else if(c2.isSelected()){
                facility = facility + " Interner Banking";
            }else if(c3.isSelected()){
                facility = facility + " Mobile Banking";
            }else if(c4.isSelected()){
                facility = facility + " Email/SMS Alerts";
            }else if(c5.isSelected()){
            facility = facility + "Cheque Book";

            }else if(c6.isSelected()){
                facility = facility + " E-Statement";
            }
            
            // Now saving all the data in database . By using exception handling
            try{
             if(accountType.equals("")){
                 JOptionPane.showMessageDialog(null,"Please Slect Account Type");
             }   else {
                 Conn conn = new Conn();
                 String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                  String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                 conn.s.executeUpdate(query1);
                 conn.s.executeUpdate(query2);
                 
                 JOptionPane.showMessageDialog(null,"Card Number: " + cardnumber + "\n Pin: "+ pinnumber);
                 
                 setVisible(false);
                 new Deposite(pinnumber).setVisible(true);
             }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()== cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new SignupThree("");
    }
}
