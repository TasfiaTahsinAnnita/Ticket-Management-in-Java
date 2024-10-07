
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class coming {
    coming() throws IOException{
        JFrame f=new JFrame("MINIBUSTAR Coming Soon...");
        f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\3.gif")))));;
        JLabel text=new JLabel("This Movie Will be available soon...");
        text.setFont(new Font("arial",Font.BOLD,30));
        text.setBounds(200,150,550,100);
        text.setForeground(Color.black);
        f.add(text);
        f.setLayout(null);
        f.setVisible(true);
                f.setSize(870, 520);
          JButton b=new JButton("Go Back");  
    b.setBounds(320,300,200,50);  
    f.add(b);
    b.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 try {
                     new moviepage();
                 } catch (IOException ex) {
                     Logger.getLogger(coming.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 f.dispose();
        }
             });
    }
    
}
