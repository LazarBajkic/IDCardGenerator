import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class UserIDFillout extends JFrame{
    
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

    void setLabelSize(JLabel label){
        label.setPreferredSize(new Dimension(200, 30));
    }

    void CreateGUI(){
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        
        panel = new JPanel();
        panel.setSize(250, 500);
        panel.setLocation(125, 10);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel.add(nameLbl);
        panel.add(name);
        panel.add(ageLbl);
        panel.add(age);
        panel.add(addressLbl);
        panel.add(address);
        panel.add(DOBLbl);
        panel.add(DOB);
        panel.add(issuedLbl);
        panel.add(issued);
        panel.add(validUntLbl);
        panel.add(validUnt);
        panel.add(phoneNumLbl);
        panel.add(phoneNum);
        
        this.add(panel);
    }
}
