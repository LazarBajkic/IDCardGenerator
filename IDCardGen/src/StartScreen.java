import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class StartScreen extends JFrame implements ActionListener{
    
    JButton createID;
    JLabel logo; 
    ImageIcon logoImg = new ImageIcon("IDGenLogo.png");

    StartScreen(){

        createID = new JButton("Create ID");
        createID.setSize(200,30);
        createID.setLocation(140,400);
        createID.setFocusable(false);
        createID.setBackground(Color.gray);
        createID.setForeground(Color.MAGENTA);
        createID.setFont((new Font("Tahoma",Font.BOLD,15)));
        createID.addActionListener(this);

        logo = new JLabel(logoImg);
        logo.setSize(350,250);
        logo.setLocation(40,50);

        CreateGUI();
    }

    void CreateGUI(){
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setResizable(false);

        this.add(logo);
        this.add(createID);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==createID){
            new UserIDFillout();
            this.dispose();
        }
    }
}
