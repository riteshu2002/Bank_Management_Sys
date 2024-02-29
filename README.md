# Bank_Management_Sys




This Java program represents a simple Automated Teller Machine (ATM) login system implemented using Swing for the graphical user interface (GUI) and JDBC for database connectivity.
Project Overview:
The banking management system comprises two main functionalities: user login and user signup. It utilizes a MySQL database for storing user information and accounts.

##  Features:
   # User Login:

        Allows existing users to log in using their card number and PIN.
        
        Upon successful login, users are directed to the transaction page where they can perform banking operations.
        
## User Signup:

  New users can sign up by providing personal details through a multi-page form.
  
  The signup process involves entering personal information such as name, father's name, email, address, etc.
  
  Data entered during signup is stored in the MySQL database for future authentication and banking operations.
## Components:
### Login Class:

  Represents the login interface where users enter their card number and PIN to access their accounts.
  
  Upon login, it validates the user's credentials against the database and redirects to the transaction page if successful.
  ### SignupOne Class:

    Implements the first page of the signup form where users provide personal details like name, date of birth, gender, email, etc.
    
    Validates the entered data and stores it in the database upon successful completion.
### SignupTwo Class:

  Represents the second page of the signup form where users provide additional information like account type, account number, etc.
  
  Completes the signup process by storing the additional information in the database.
### Conn Class:

    Handles database connectivity by establishing a connection to the MySQL database.
    
    Provides methods for executing SQL queries on the database.
## Technologies Used:
   #### Java: 
        The core programming language used for implementing the banking management system.
  ##### Swing:
        Java's GUI toolkit used for designing the graphical user interfaces.
   #### MySQL:
         Relational database management system used for storing user information and accounts.
  #### JDBC: 
          Java Database Connectivity API used for connecting Java applications with databases.
## Future Improvements:
    Implement robust error handling and validation mechanisms.
    
    Enhance security features such as encryption of sensitive data like PINs.
    
    Implement additional banking functionalities like fund transfers, balance inquiries, etc.
    
    Improve the user experience with better-designed GUIs and smoother navigation.
