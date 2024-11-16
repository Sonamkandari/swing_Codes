\
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;


//import com.toedter.calendar.JDateChooser;
public class Signup1 extends JFrame implements ActionListener {
    Long random;
   //globally declaring the text field
   JTextField nameField;
   JTextField FnameField; JTextField emailField;JTextField addressField; JTextField cityField;JTextField
    stateField; JTextField piField;
    JButton next;
    JRadioButton male, female,other,married,unmarried;
    //creatig a constructor of the above class
    Signup1(String string){
        setLayout(null);
        Random ran=new Random();//it is used for random numbers
        random=(Math.abs(ran.nextLong() % 9000L)+ 1000L);// it is used to print the random numbers

        JLabel Formno=new JLabel("APPLICATION FORM NUMBER."+ random);
        // we can make  changes in its font size and colors
        Formno.setFont(new Font("Raleway",Font.BOLD,38));
        //set it on the frame
        Formno.setBounds(140,20,700,40);
        add( Formno);


        JLabel PersonalDetails=new JLabel("Page 1:Personal Details");
        PersonalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        PersonalDetails.setBounds(290,80,400,30);
        add(PersonalDetails);

        JLabel Name=new JLabel("Name :");
        Name.setFont(new Font("Raleway",Font.BOLD,20));
        Name.setBounds(100,130,100,30);
        add(Name);
        nameField = new JTextField();
        nameField.setBounds(300, 130, 400, 30);
        nameField.setFont(new Font("Arial",Font.BOLD,14));
        add(nameField); 

      
        JLabel FName=new JLabel("Father's Name :");
        FName.setFont(new Font("Raleway",Font.BOLD,20));
        FName.setBounds(100,180,200,30);
        add(FName);
        FnameField = new JTextField();
        FnameField.setBounds(300, 180, 400, 30);
        FnameField.setFont(new Font("Arial",Font.BOLD,14));
        add(FnameField); 

        JLabel DOB=new JLabel ("Date Of Birth:");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,230,200,30);
        add(DOB);
        //we have to aad a callender here 
        //firstly we have to import a java file here
        // JDateChooser dateChoose = new JDateChooser();
        // dateChoose.setFont(new Font("Raleway", Font.BOLD, 14)); // Correct font size
        // dateChoose.setBounds(300, 230, 200, 30); // Corrected bounds, aligns with other text fields
        // add(dateChoose);


        JLabel G=new JLabel ("Gender:");
        G.setFont(new Font("Raleway",Font.BOLD,20));
        G.setBounds(100,280,200,30);
        add(G);
        male=new JRadioButton("Male");
        male.setBounds(300,280,120,30);
        male.setBackground(Color.WHITE);
        add(male);
         female=new JRadioButton("Female");
        female.setBounds(450,280,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        other=new JRadioButton("Other");
        other.setBounds(600,280,120,30);
        other.setBackground(Color.WHITE);
        add(other);
        // we use this class so that it can chose one gander at a time
        ButtonGroup gendeGroup= new ButtonGroup();
        gendeGroup.add(male);
        gendeGroup.add(female);
        gendeGroup.add(other);

        
        JLabel email=new JLabel ("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,330,200,30);
        add(email);
        emailField = new JTextField();
        emailField.setBounds(300, 330, 400, 30);
        emailField.setFont(new Font("Arial",Font.BOLD,14));
        add(emailField); 

        JLabel status=new JLabel ("Merital Status:");
        status.setFont(new Font("Raleway",Font.BOLD,20));
        status.setBounds(100,380,200,30);
        add(status);
         married=new JRadioButton("Married");
        married.setBounds(300,380,120,30);
        married.setBackground(Color.WHITE);
        add(married);
         unmarried=new JRadioButton("Unmarrid");
        unmarried.setBounds(450,380,120,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        // we use this class so that it can chose one gander at a time
        ButtonGroup statusGroup1= new ButtonGroup();
        statusGroup1.add(married);
        statusGroup1.add(unmarried);


        JLabel address=new JLabel ("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,430,200,30);
        add(address);
        addressField = new JTextField();
        addressField.setBounds(300, 430, 400, 30);
        addressField.setFont(new Font("Arial",Font.BOLD,14));
        add(addressField); 

        JLabel city=new JLabel ("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20)); 
        city.setBounds(100,480,200,30);
        add(city);
        cityField = new JTextField();
        cityField.setBounds(300, 480, 400, 30);
        cityField.setFont(new Font("Arial",Font.BOLD,14));
        add(cityField); 

        JLabel state=new JLabel ("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20)); 
        state.setBounds(100,530,200,30);
        add(state);
        stateField = new JTextField();
        stateField.setBounds(300, 530, 400, 30);
        stateField.setFont(new Font("Arial",Font.BOLD,14));
        add(stateField); 


        JLabel Pincode =new JLabel("Pin Code:");
        Pincode.setFont(new Font("Raleway",Font.BOLD,20)); 
        Pincode.setBounds(100,580,200,30);
        add(Pincode);
        piField = new JTextField();
        piField.setBounds(300, 580, 400, 30);
        piField.setFont(new Font("Arial",Font.BOLD,14));
        add(piField); 

    next=new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Railway",Font.BOLD,14));
    next.setBounds(620,660,80,30);
    next.addActionListener(this);
    add(next);
    
    getContentPane().setBackground(Color.WHITE);
    setTitle("New Account Application Form - Page 2");
    setLayout(null);
    setSize(900,850);
    setLocation(350,10);
    setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        String Formno=""+random;// with the help of double quots  it get conveted into a string
        String Name=nameField.getText();
        String FName=FnameField.getText();

        String G=null;
        if(male.isSelected()){
            G="male";
        }else if(female.isSelected()){
            G="female";
        }else if(other.isSelected()){
            G="other";
        }

        String email=emailField.getText();
        String status=null;
        if(married.isSelected()){
           status ="married";
        }else if(unmarried.isSelected()){
            status="unmarried";
        }

        String address=addressField.getText();
        String city=cityField.getText();
        String state=stateField.getText();
        String pincode=piField.getText();
    //validation for name
        try{
            if(Name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }else{
             conn C= new conn();     
             String query="insert into MyTable values('"+Formno+"','"+Name+"','"+FName+"','"+G+"','"+email+"','"+status+"' ,'"+address+"','"+city+"','"+state+"','"+pincode+"')" ; 
             C.S.executeUpdate(query);
           }

        }catch(Exception exception){
         System.out.println(exception);

        }
    }
        public static void main(String[] args) {
        new Signup1("New Account Application Form - Page 2");     
 
   }
}
