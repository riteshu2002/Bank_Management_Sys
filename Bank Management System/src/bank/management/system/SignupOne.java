
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    // declaring globally
    long random;
    JTextField nameTextField, fnameTextField,emailTextField, addressTextField, cityTextField, stateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,married,unmarried;
    JDateChooser dateChooser;
    
    SignupOne(){
        setLayout(null);
        Random ran = new Random(); // for creating random form numbers
         random= Math.abs((ran.nextLong() % 9000L)+ 1000L);
        
        JLabel formno = new JLabel("Application Form No - "+random);
        formno.setFont(new Font("Raleway", Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personDetail = new JLabel("Page 1: Personal Details");
        personDetail.setFont(new Font("Raleway", Font.BOLD,22));
        personDetail.setBounds(290,80,400,30);
        add(personDetail);
        
         JLabel name= new JLabel("Name:");  // Name label
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
         nameTextField = new JTextField(); // Name Input box
        nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname= new JLabel("Father's Name:"); // Father's name label
        fname.setFont(new Font("Raleway", Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
          fnameTextField = new JTextField(); // father Name Input box
        fnameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob= new JLabel("Date of Birth:"); // Dob label
       dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
         dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
        
        JLabel gender= new JLabel("Gender:"); // gender label
       gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
         male= new JRadioButton("Male"); // male radio button
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
         female = new JRadioButton("Female"); // female radio button
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup(); // for selecting only one gender
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email= new JLabel("Email Address:"); // email label
       email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
          emailTextField = new JTextField(); // email Input box
        emailTextField.setFont(new Font("Raleway", Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel marital =new JLabel("Marital Status:");// Marital status label
        marital.setFont(new Font("Raleway", Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
          married= new JRadioButton("Married"); // married radio button
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
         unmarried = new JRadioButton("Unmarried"); // Unmarried radio button
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup maritalgroup = new ButtonGroup(); // for selecting only one gender
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        
        JLabel address = new JLabel("Address:"); // Address label
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
         addressTextField = new JTextField(); // Adree Input box
        addressTextField.setFont(new Font("Raleway", Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:"); // city label
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField = new JTextField(); // city Input box
        cityTextField.setFont(new Font("Raleway", Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        
        JLabel state= new JLabel("State:"); // state label
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
          stateTextField = new JTextField(); // state Input box
        stateTextField.setFont(new Font("Raleway", Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        
        JLabel pincode = new JLabel("Pin code:"); // pincode label
        pincode.setFont(new Font("Raleway", Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pinTextField = new JTextField(); // pincode Input box
        pinTextField.setFont(new Font("Raleway", Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
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
        String formno = "" +random;
        String name= nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
            if(male.isSelected()){
                gender= "Male";
            }else if(female.isSelected()){
                gender  = "Female";
            }
        String email = emailTextField.getText();
        String marital = null;
            if(married.isSelected()){
                marital= "Married";
            }else if(unmarried.isSelected()){
                marital = "Unmarried";
            }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required"); 
            }else{
                Conn c = new Conn();
                // writing mysql query
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);
                // signupTwo obejct
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        new SignupOne();
    }
}
