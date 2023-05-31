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

import javax.swing.JButton;

public class UserIDFillout extends JFrame implements ActionListener{
    
    JTextField name;
    JTextField age;
    JTextField address;
    JTextField DOB;
    JTextField issued;
    JTextField validUnt;
    JTextField phoneNum;

    JLabel nameLbl;
    JLabel ageLbl;
    JLabel addressLbl;
    JLabel DOBLbl;
    JLabel issuedLbl;
    JLabel validUntLbl;
    JLabel phoneNumLbl;
    
    JButton confirm;
    JPanel panel;

    UserIDFillout(){
        
        name = new JTextField();
        age = new JTextField();
        address = new JTextField();
        DOB = new JTextField();
        issued = new JTextField();
        validUnt = new JTextField();
        phoneNum = new JTextField();

        nameLbl = new JLabel("Enter name");
        ageLbl = new JLabel("Enter age");
        addressLbl = new JLabel("Enter address");
        DOBLbl = new JLabel("Enter date of birth");
        issuedLbl = new JLabel("Enter date issued");
        validUntLbl = new JLabel("Enter expiration date");
        phoneNumLbl = new JLabel("Enter phone number");
        
        confirm = new JButton("Confirm");
        setButtonProperties(confirm);
        confirm.addActionListener(this);

        setSizeTextField(name);
        setSizeTextField(age);
        setSizeTextField(address);
        setSizeTextField(DOB);
        setSizeTextField(issued);
        setSizeTextField(validUnt);
        setSizeTextField(phoneNum);

        setLabelSize(nameLbl);
        setLabelSize(ageLbl);
        setLabelSize(addressLbl);
        setLabelSize(DOBLbl);
        setLabelSize(issuedLbl);
        setLabelSize(validUntLbl);
        setLabelSize(phoneNumLbl);
    
        CreateGUI();
    
    }

    void setSizeTextField(JTextField field){
        field.setPreferredSize(new Dimension(200, 30));
    }

    void setButtonProperties(JButton btn){
        btn.setPreferredSize(new Dimension(200, 30));
        btn.setLocation(10,400);
        btn.setFocusable(false);
        btn.setBackground(Color.gray);
        btn.setForeground(Color.MAGENTA);
        btn.setFont((new Font("Tahoma",Font.BOLD,15)));
        btn.addActionListener(this);
    }

    void setLabelSize(JLabel label){
        label.setPreferredSize(new Dimension(200, 30));
    }

    void CreateGUI(){
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);

        panel = new JPanel();
        panel.setSize(250, 550);
        panel.setLocation(125, 10);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel.add(nameLbl);
        panel.add(name);
        panel.add(ageLbl);
        panel.add(age);
        panel.add(phoneNumLbl);
        panel.add(phoneNum);
        panel.add(addressLbl);
        panel.add(address);
        panel.add(DOBLbl);
        panel.add(DOB);
        panel.add(issuedLbl);
        panel.add(issued);
        panel.add(validUntLbl);
        panel.add(validUnt);
        panel.add(confirm);
        
        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==confirm && !name.getText().isEmpty()  && !age.getText().isEmpty() && !phoneNum.getText().isEmpty()  && !address.getText().isEmpty()  && !DOB.getText().isEmpty()  && !issued.getText().isEmpty()  && !validUnt.getText().isEmpty()){
                new GivenCardCopy();
        }else {
            JOptionPane.showMessageDialog(null,"You must fill out all the fields");
        }
    }
    
}
