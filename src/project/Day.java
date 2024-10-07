
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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Day {
    Day() throws IOException{
         JFrame f=new JFrame("MINIBUSTAR DinTheDay");   
          f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\din.jpg")))));
    final JLabel text = new JLabel("Timings for Din The Day:");
    text.setFont(new Font("arial",Font.BOLD,20));
        text.setBounds(200,40,450,100);
        text.setForeground(Color.black);
        f.add(text); 
    text.setSize(400,100);    
    JCheckBox checkBox1 = new JCheckBox("10.50 A.M.");  
        checkBox1.setBounds(200,150, 150,50);  
        JCheckBox checkBox2 = new JCheckBox("1.30 P.M");  
        checkBox2.setBounds(200,200, 150,50);  
         JCheckBox checkBox3 = new JCheckBox("4.10 P.M");  
        checkBox3.setBounds(200,250, 150,50);
        f.add(checkBox1);  
        f.add(checkBox2);
        f.add(checkBox3);
        f.setSize(900,500);  
        f.setLayout(null);  
        f.setVisible(true);  
     final JLabel text2 = new JLabel("Number of Tickets:");
    text2.setFont(new Font("arial",Font.BOLD,20));
        text2.setBounds(200,350,450,100);
        text2.setForeground(Color.black);
        f.add(text2); 
     String languages[]={"1","2","3","4","5"};        
    final JComboBox cb=new JComboBox(languages);    
    cb.setBounds(200,450,50,20);
    
 f.add(text); 
    
    f.setLayout(null);    
    f.setSize(1000,600);    
    f.setVisible(true);  
    f.add(cb);
    JButton b=new JButton("Select");  
    b.setBounds(300,450,75,20);  
     b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 int a=JOptionPane.showConfirmDialog(f,"Do you want to confirm the purchase?");  
if(a==JOptionPane.YES_OPTION){  
     try {  
         new end();
         f.dispose();
     } catch (IOException ex) {
         Logger.getLogger(Day.class.getName()).log(Level.SEVERE, null, ex);
     }
}         

        }
}); 
      f.add(b);
    }
}
