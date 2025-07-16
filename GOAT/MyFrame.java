import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
    
    JPanel loginPanel;
    JLabel loginLabel, usernameLabel, pwLabel;
    JTextField usernameField;
    JPasswordField pwField;
    JButton button;
    
    MyFrame(){
        
        // Initializing Here
        loginPanel = new JPanel();
        loginLabel = new JLabel();
        loginLabel.setText("Login Here");
        usernameLabel = new JLabel("Username : ");
        pwLabel = new JLabel("Password : ");
        usernameField = new JTextField();
        pwField = new JPasswordField();
        button = new JButton("Login");
        
        // panel
        loginPanel.setLayout(null);
        loginPanel.setBackground(new Color(135, 206, 235));
        
        // changing backgrounds and fonts
        loginLabel.setForeground(new Color(0, 0, 128));
        loginLabel.setFont(new Font("Italic", Font.BOLD, 25));
        usernameLabel.setForeground(new Color(0, 0, 128));
        usernameLabel.setFont(new Font("Italic", Font.BOLD, 15));
        pwLabel.setForeground(new Color(0, 0, 128));
        pwLabel.setFont(new Font("Italic", Font.BOLD, 15));
        button.setBackground(new Color(150, 150, 150));
        button.setForeground(Color.GREEN);
        
        // setting action listener for button
        button.setFocusable(false);
        button.addActionListener(e -> {
            String username = usernameField.getText();
            String password = String.valueOf(pwField.getPassword());
            
          if(username.equals("Football GOAT") && password.equals("Cristiano Ronaldo")){
              JOptionPane.showMessageDialog(null, " Login Successfull! ");
              NewFrame newFrame = new NewFrame();
              this.dispose();
          }
          else{
              JOptionPane.showMessageDialog(null, " Incorrect password or username! ");
              
          }
            
        });
        
        // Setting the bounds
        loginLabel.setBounds(185, 50, 300, 100);
        usernameLabel.setBounds(100, 150, 100, 30);
        pwLabel.setBounds(100, 200, 100, 30);
        usernameField.setBounds(190, 150, 150,30);
        pwField.setBounds(190, 200, 150,30);
        button.setBounds(190, 270, 100, 30);
       
        
        // Adding to the login panel
        loginPanel.add(loginLabel);
        loginPanel.add(usernameLabel);
        loginPanel.add(pwLabel);
        loginPanel.add(usernameField);
        loginPanel.add(pwField);
        loginPanel.add(button);
        
        // Creating frame 
        this.add(loginPanel);
        this.setTitle("Login Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
}