
package project;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class end {
    end() throws IOException{
         JFrame f=new JFrame("MINIBUSTAR DinTheDay");   
          f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\end.png")))));
          f.setSize(1000,600);  
        f.setLayout(null);  
        f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
