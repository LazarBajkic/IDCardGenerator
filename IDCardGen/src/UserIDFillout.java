import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;

public class UserIDFillout extends JFrame implements ActionListener{
    
    JTextField name;
    JTextField age;
    JTextField address;
    JTextField Email;
    JTextField phoneNum;

    JLabel nameLbl;
    JLabel ageLbl;
    JLabel addressLbl;
    JLabel EmailLbl;
    JLabel phoneNumLbl;

    JButton confirm;
    JPanel panel;

    String uname = "root";
    String password = "Ceramida";
    String url = "jdbc:mysql://localhost:3306/UserIDInfo";

    UserIDFillout(){
        
        name = new JTextField();
        age = new JTextField();
        address = new JTextField();
        Email = new JTextField();
        phoneNum = new JTextField();

        nameLbl = new JLabel("Enter name");
        ageLbl = new JLabel("Enter age");
        addressLbl = new JLabel("Enter address");
        EmailLbl = new JLabel("Enter email");
        phoneNumLbl = new JLabel("Enter phone number");
        
        confirm = new JButton("Confirm");
        setButtonProperties(confirm);

        setSizeTextField(name);
        setSizeTextField(age);
        setSizeTextField(address);
        setSizeTextField(Email);
        setSizeTextField(phoneNum);

        setLabelSize(nameLbl);
        setLabelSize(ageLbl);
        setLabelSize(addressLbl);
        setLabelSize(EmailLbl);
        setLabelSize(phoneNumLbl);
        
        CreateGUI();
    
    }

    void setSizeTextField(JTextField field){
        field.setPreferredSize(new Dimension(200, 30));
        field.setBackground(Color.GRAY);
        field.setForeground(Color.magenta);
        field.setFont((new Font("Tahoma",Font.BOLD,15)));
        field.setBorder(new RoundBorder(5));

    }

    void setButtonProperties(JButton btn){
        btn.setPreferredSize(new Dimension(200, 30));
        btn.setLocation(10,400);
        btn.setFocusable(false);
        btn.setBackground(Color.gray);
        btn.setForeground(Color.MAGENTA);
        btn.setFont((new Font("Tahoma",Font.BOLD,15)));
        btn.addActionListener(this);
        btn.setBorder(new RoundBorder(10));
    }

    public void setLabelSize(JLabel label){
        label.setPreferredSize(new Dimension(250, 30));
        label.setFont(new Font("Tahoma", Font.BOLD, 15));
        label.setForeground(Color.magenta);
    }

    void CreateGUI(){
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setResizable(false);

        panel = new JPanel();
        panel.setSize(250, 550);
        panel.setLocation(125, 10);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.setBackground(Color.LIGHT_GRAY);

        panel.add(nameLbl);
        panel.add(name);
        panel.add(ageLbl);
        panel.add(age);
        panel.add(phoneNumLbl);
        panel.add(phoneNum);
        panel.add(addressLbl);
        panel.add(address);
        panel.add(EmailLbl);
        panel.add(Email);
        panel.add(confirm);

        
        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==confirm && !name.getText().isEmpty()  && !age.getText().isEmpty() && !phoneNum.getText().isEmpty()  && !address.getText().isEmpty()  && !Email.getText().isEmpty()){
                
                GivenCardCopy GCC = new GivenCardCopy();
                String nameStr = name.getText();
                String ageStr = age.getText();
                String phoneStr = phoneNum.getText();
                String addressStr = address.getText();
                String EmailStr = Email.getText();

                GCC.SetNameText(nameStr);
                GCC.SetAgeText(ageStr);
                GCC.SetPhoneText(phoneStr);
                GCC.SetAddressText(addressStr);
                GCC.SetEmailText(EmailStr);
                
                String query = "Insert into UserIDs(Name,Age,Address,Email,PhoneNum) values ('"+nameStr+"','"+ageStr+"','"+addressStr+"','"+EmailStr+"','"+phoneStr+"')";
                
                try {
                    Connection con = DriverManager.getConnection(url,uname,password);
                    Statement stm = con.createStatement();
                    stm.executeUpdate(query);
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

                this.dispose();
        }
        
        else{
            JOptionPane.showMessageDialog(null,"You must fill out all the fields");
        }
    }

    public String GetNameStr(){
        return name.getText();
    }

    public String GetAge(){
        return age.getText();
    }

    public String GetPhone(){
        return phoneNum.getText();
    }

    public String GetAddress(){
        return address.getText();
    }
    
    public String GetEmail(){
        return Email.getText();
    }
    
}
