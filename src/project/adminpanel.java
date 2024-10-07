
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


public class adminpanel {
    adminpanel() throws IOException{
        JFrame f = new JFrame("MINIBUSTAR");
        f.setSize(870, 520);
        f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\adminp.jpg")))));
         f.setLayout(null);
        f.setVisible(true);
         JLabel text=new JLabel("Welcome To Admin Panel");
         text.setFont(new Font("arial",Font.BOLD,30));
        text.setBounds(270,100,450,100);
        text.setForeground(Color.black);
        f.add(text);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b = new JButton("Movie List");
        b.setBounds(50,220,240,80);
        f.add(b);
        b.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {

                 new table();

        }
             });
        JButton b2 = new JButton("Login List");
        b2.setBounds(50,320,240,80);
        f.add(b2);
        b2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {

                 new loglist();
        }
             });
    }
}
