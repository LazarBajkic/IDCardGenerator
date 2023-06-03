import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;

public class GivenCardCopy extends JFrame{
    
    JPanel card;
    JLabel name;
    JLabel age;
    JLabel phoneNum;
    JLabel address;
    JLabel Email;

    UserIDFillout UF = new UserIDFillout();

    GivenCardCopy(){

        name = new JLabel("");
        age = new JLabel("");
        phoneNum = new JLabel("");
        address = new JLabel("");
        Email = new JLabel("");

        UF.setLabelSize(name);
        UF.setLabelSize(age);
        UF.setLabelSize(phoneNum);
        UF.setLabelSize(address);
        UF.setLabelSize(Email);
        UF.dispose();

        CreateGUI();   

    }

    void CreateGUI(){

        this.setSize(500,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);

        card = new JPanel();
        card.setSize(300, 200);
        card.setLocation(85, 10);
        card.setBackground(Color.GRAY);
        card.setLayout(new FlowLayout(FlowLayout.LEFT));
        card.setBorder(new RoundBorder(10));
        
        card.add(name);
        card.add(age);
        card.add(phoneNum);
        card.add(address);
        card.add(Email);
    
        this.add(card);
    }

    public void SetNameText(String nameStr){
        name.setText("Name: \n"+nameStr);
    }

    public void SetAgeText(String ageStr){
        age.setText("Age: \n"+ageStr);
    }

    public void SetPhoneText(String phoneStr){
        phoneNum.setText("Phone number: \n"+phoneStr);
    }

    public void SetAddressText(String addressStr){
        address.setText("Address: \n"+addressStr);
    }

    public void SetEmailText(String EmailStr){
        Email.setText("Email: \n"+EmailStr);
    }

}
