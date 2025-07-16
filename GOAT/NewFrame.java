import java.awt.*;
import javax.swing.*;

/**
 *
 * @author bijay
 */
public class NewFrame extends JFrame{
    
    NewFrame(){
        
        JLabel label = new JLabel();
        label.setText(" Siuuuuuuuuuuuu ");
        label.setForeground(Color.red);
        label.setFont(new Font("MV Boli", Font.BOLD, 50));
        label.setHorizontalAlignment(JLabel.CENTER);
        
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(135, 206, 235));
        this.setResizable(false);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
