
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


public class moviepage {
    moviepage() throws IOException{
    JFrame f = new JFrame("MINIBUSTAR Home Page");

        final JLabel label = new JLabel();
    label.setFont(new Font("arial",Font.BOLD,20));
        label.setBounds(580,100,450,100);
        label.setForeground(Color.black);
        f.add(label); 
        f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\4.png")))));
        f.setSize(1000, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JButton n = new JButton("ShowTimes");
        n.setBounds(850,180,120,40);
        f.add(n);
         n.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
    
                new table();

            }
        });
         JLabel text=new JLabel("Hawa");
         text.setFont(new Font("arial",Font.BOLD,20));
        text.setBounds(90,360,450,100);
        text.setForeground(Color.black);
        f.add(text);
        JLabel image=new JLabel(new ImageIcon("D:\\h.png"));
        image.setSize(240,620);
        f.add(image);
        JButton b = new JButton("Get Tickets");
        b.setBounds(50,420,140,20);
        f.add(b);
        b.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 try {
                     new hawa();
                 } catch (IOException ex) {
                     Logger.getLogger(moviepage.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 f.dispose();
        }
             });
        JLabel text2=new JLabel("Poran");
        text2.setFont(new Font("arial",Font.BOLD,20));
        text2.setBounds(260,360,450,100);
        text2.setForeground(Color.black);
        f.add(text2);
        JLabel image2=new JLabel(new ImageIcon("D:\\poran.png"));
        image2.setSize(580,620);
        f.add(image2);
        JButton b2 = new JButton("Get Tickets");
        b2.setBounds(220,420,140,20);
        f.add(b2);
        b2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 try {
                     new poran();
                 } catch (IOException ex) {
                     Logger.getLogger(moviepage.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 f.dispose();
        }
             });
        JLabel text3=new JLabel("Din-The Day");
         text3.setFont(new Font("arial",Font.BOLD,20));
        text3.setBounds(400,360,450,100);
        text3.setForeground(Color.black);
        f.add(text3);
        JLabel image3=new JLabel(new ImageIcon("D:\\dd.png"));
        image3.setSize(920,620);
        f.add(image3);
        JButton b3 = new JButton("Get Tickets");
        b3.setBounds(390,420,140,20);
        f.add(b3);
        b3.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 try {
                     new Day();
                 } catch (IOException ex) {
                     Logger.getLogger(moviepage.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 f.dispose();
        }
             });
        JLabel text4=new JLabel("Bullet Train");
         text4.setFont(new Font("arial",Font.BOLD,20));
        text4.setBounds(580,360,450,100);
        text4.setForeground(Color.black);
        f.add(text4);
        JLabel image4=new JLabel(new ImageIcon("D:\\train.png"));
        image4.setSize(1260,620);
        f.add(image4);
        JButton b4 = new JButton("Coming Soon..");
        b4.setBounds(560,420,140,20);
        f.add(b4);
        b4.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 try {
                     new coming();
                 } catch (IOException ex) {
                     Logger.getLogger(moviepage.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 f.dispose();
        }
             });
        JLabel text5=new JLabel("Black Adam");
         text5.setFont(new Font("arial",Font.BOLD,20));
        text5.setBounds(750,360,450,100);
        text5.setForeground(Color.black);
        f.add(text5);
        JLabel image5=new JLabel(new ImageIcon("D:\\ba.png"));
        image5.setSize(1600,620);
        f.add(image5);
        JButton b5 = new JButton("Coming Soon..");
        b5.setBounds(730,420,140,20);
        f.add(b5);
        b5.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 try {
                     new coming();
                 } catch (IOException ex) {
                     Logger.getLogger(moviepage.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 f.dispose();
        }
             });
    }
}
