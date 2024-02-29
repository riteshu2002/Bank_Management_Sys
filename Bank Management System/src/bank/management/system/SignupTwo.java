// Additional Details page
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;

import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    // declaring globally
    
    JTextField  panno,  aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,income,education,occupation;
    String formno;
    
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
       setTitle("New Account Application Foem - Page 2");
        
       
        
        JLabel additonalDetails = new JLabel("Page 2: Additional Details");
        additonalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additonalDetails.setBounds(290,80,400,30);
        add(additonalDetails);
    //--------------------------------------------------------------------------------------------  RELIGION
         JLabel religious= new JLabel("Religion:");  // Religion label
        religious.setFont(new Font("Raleway", Font.BOLD,20));
        religious.setBounds(100,140,100,30);
        add(religious);
        // Creating dropdown menu for religion
        String valReligion[]={"Hindu","Muslim","Sikh", "Budhist", "Christian","Other" };
         religion = new JComboBox(valReligion); // JComboBox class is used to crate drop down menu
       religion.setBounds(300,140,400,30);
       religion.setBackground(Color.WHITE);
        add(religion);
     //------------------------------------------------------------------------------------------   Religion end-- 
        
     //--------------------------------------------------------------------------------- Category   
        JLabel categories= new JLabel("Category:"); // Father's name label
        categories.setFont(new Font("Raleway", Font.BOLD,20));
        categories.setBounds(100,190,200,30);
        add(categories);
        
        String acategory[]={"General","OBC","SC","ST","Other"};
         category = new JComboBox(acategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
    //---------------------------------------------------------------------------------- category end---
        
     //---------------------------------------------------------------------------------Income   
        JLabel incomes= new JLabel("Income:"); // Income label
       incomes.setFont(new Font("Raleway", Font.BOLD,20));
        incomes.setBounds(100,240,200,30);
        
        add(incomes);
        
        String incomeCat[]={"Null","< 1,50000","< 2,50000","< 5,00,000","Upto 10 Lakhs"};
        income = new JComboBox(incomeCat);
        income.setBounds(300,240,400,30);
         income.setBackground(Color.WHITE);
        add(income);
    //--------------------------------------------------------------------------------------Income end--    
        

    //--------------------------------------------------------------------------------- Edu/Qualification    
        JLabel edu= new JLabel("Education/"); // Education label
      edu.setFont(new Font("Raleway", Font.BOLD,20));
        edu.setBounds(100,290,200,30);
        add(edu);
        
        
        JLabel qual= new JLabel("Qualification:"); // Qualification label
       qual.setFont(new Font("Raleway", Font.BOLD,20));
        qual.setBounds(100,315,200,30);
        add(qual);
        
         String educationval[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
         education = new JComboBox(educationval);
        education.setBounds(300,315,400,30);
         education.setBackground(Color.WHITE);
        add(education);
      //------------------------------------------------------------------------------ edu/qualification end--
        
      //----------------------------------------------------------------------------- Occupation    
        JLabel occu =new JLabel("Occupation");// Marital status label
        occu.setFont(new Font("Raleway", Font.BOLD,20));
        occu.setBounds(100,390,200,30);
        add(occu);
        
         String occupationval[]={"Salaried","Self-Employed","Bussiness","Retired","Student","Other"};
         occupation = new JComboBox(occupationval);
        occupation.setBounds(300,390,400,30);
         occupation.setBackground(Color.WHITE);
        add(occupation);
        
// --------------------------------------------------------------------------------------Occupation end---   

//---------------------------------------------------------------------------------------PAN detail
        JLabel pan = new JLabel("PAN Number:"); // Address label
        pan.setFont(new Font("Raleway", Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan);
        
        panno = new JTextField(); // Adree Input box
        panno.setFont(new Font("Raleway", Font.BOLD,14));
        panno.setBounds(300,440,400,30);
        add(panno);
 //----------------------------------------------------------------------------------------PAN end
 
 //---------------------------------------------------------------------------------------Adhar detail
        JLabel adhar = new JLabel("Adhaar No:"); // adhar label
        adhar.setFont(new Font("Raleway", Font.BOLD,20));
        adhar.setBounds(100,490,200,30);
        add(adhar);
        
        aadhar = new JTextField(); // adhar Input box
         aadhar.setFont(new Font("Raleway", Font.BOLD,14));
         aadhar.setBounds(300,490,400,30);
        add( aadhar);
        
 //----------------------------------------------------------------------------------------Adhar end 
 
 //---------------------------------------------------------------------------Senior Citizen
        JLabel seniorC= new JLabel("Senior citizen:"); // state label
        seniorC.setFont(new Font("Raleway", Font.BOLD,20));
        seniorC.setBounds(100,540,200,30);
        add(seniorC);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
         sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup senior = new ButtonGroup();
        senior.add(syes);
        senior.add(sno);
  //-----------------------------------------------------------------------------------senior citizen end

  //-----------------------------------------------------------------------------------Existing Account      
        
        JLabel existingAC = new JLabel("Existing Account:"); // pincode label
        existingAC.setFont(new Font("Raleway", Font.BOLD,20));
        existingAC.setBounds(100,590,200,30);
        add(existingAC);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
         eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup exsiting = new ButtonGroup();
        exsiting .add(eyes);
        exsiting .add(eno);
//----------------------------------------------------------------------------------Existing account end        

        
         next = new JButton("Next");  // Next button
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE); // setting the backgorund color of the frame
        setSize(850,800); // setting the size of the frame
        setLocation(350,10); // setting the loaction of the frame that on opening where the frame will show on screen
        setVisible(true); // to make frame visible
        
        
    }
    public void actionPerformed(ActionEvent ae){
//        String formno = "" +random;
        String sreligion= (String)religion.getSelectedItem(); // as it return an obejct so we typecast it as string
        String scatogory =(String)category.getSelectedItem();// same se above type cast it as string
        String sincome = (String)income.getSelectedItem();
        String seducation= (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen= null;
            if(syes.isSelected()){
               seniorcitizen = "Yes";
            }else if(sno.isSelected()){
                seniorcitizen  = "No";
            }
        
        String existingAccount = null;
            if(eyes.isSelected()){
                existingAccount= "Yes";
            }else if(eno.isSelected()){
                existingAccount = "No ";
            }
        String span = panno.getText();
        String sadhar = aadhar.getText();
        
        
        try{

                Conn c = new Conn();
                // writing mysql query
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scatogory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+seniorcitizen+"','"+existingAccount+"')";
                c.s.executeUpdate(query);
               
                // signup 3 object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        new SignupTwo("");
    }
}
