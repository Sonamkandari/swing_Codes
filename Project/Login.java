
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//all the packages can be imported with the help ofthis
 // here we extends the Jframe also have to implement the  Action Listener Interface with it
public class Login extends JFrame implements  ActionListener{
//defining buttons and textfields globally
JTextField cardField;
JPasswordField Pinfield;
   JButton myobj, myobj1,myobj2;
    Login(String string){// here we make a constructor
       setTitle("Automated Teller Machine");
       setLayout(null);
      
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); //we used and image  now we have to put the image o the jframe whic we have made
          ////we passes the icon in  the jlabel
          /* for making the changes in the image we have make object of image class */
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);//
        JLabel label=new JLabel(i3);
        label.setBounds(80,10,100,100);//custum layout
          /* now we are pasting this jlabel on the frame */
        add(label);// we use add function whenever we wanted to add any components on the frame
       
        JLabel text =new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));//change the font AND size
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno =new JLabel("Card No:");
        cardno.setFont(new Font("Osward",Font.BOLD,28));//change the font AND size
        cardno.setBounds(110,140,150,30);
        add(cardno);
        // we needed a box in front of the card no 
        //there fore we use a text field
        cardField = new JTextField();
        cardField.setBounds(250, 140, 250, 30);
        cardField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardField);
        
       
        JLabel Pin =new JLabel("Pin:");
        Pin.setFont(new Font("Osward",Font.BOLD,28));//change the font AND size
        Pin.setBounds(110,200,180,30);
        add(Pin);

        Pinfield = new JPasswordField();
        Pinfield .setBounds(250, 200, 250, 28);
        Pinfield.setFont(new Font("Arial",Font.BOLD,14));
        add(Pinfield );
        
        /*now we are creating Buttons */
      myobj = new JButton("Sign in");
      myobj.setBounds(250,280,100,30);
      myobj.setBackground(Color.BLACK); //back ground color of Button
      myobj.setForeground(Color.white); // text color of Button
      myobj.addActionListener(this);
      add(myobj);

       /*now we are creating another Buttons */
       myobj1 = new JButton("Clear");
       myobj1.setBounds(400,280,100,30);
       myobj1.setBackground(Color.BLACK); //back ground color of Button
       myobj1.setForeground(Color.white); // text color of Button
       //adding action listener
       myobj1.addActionListener(this);
       add(myobj1);

       /*now we are creating another Buttons i.e signup Button */
       myobj2 = new JButton("Sign up");
       myobj2.setBounds(325,330,100,30);
       myobj2.setBackground(Color.BLACK); //back ground color of Button
       myobj2.setForeground(Color.white); // text color of Button
       myobj2.addActionListener(this);
       add(myobj2);
       

        /*now we need the whole frame to change the color of the frame */
        getContentPane().setBackground(Color.white);
        setSize(800,447);// it is the function used  to set the size of the frame
        setVisible(true);//this function is use to make the frame  visible
        setLocation(350,200); //it help to set the position of the frame
    }
    public static void main(String[] args) {
        new Login ("icons/logo.jpj");//object of the class
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()==myobj1){
        cardField.setText("");//AGR KUCH likha hoga to vo show hoga iss sey
        Pinfield.setText("");

      }else if(ae.getSource()==myobj1){
        

      }else if(ae.getSource()==myobj2){
        setVisible(false);
          new Signup1(getWarningString()).setVisible(true);
      }
      
    }
}

