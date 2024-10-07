
package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class adminlog {

    adminlog() throws IOException {
        JFrame f = new JFrame("MINIBUSTAR Admin Login");
        f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\adminlog.jpg")))));
        JLabel titleimage = new JLabel(new ImageIcon("D:\\adminpanel.png"));
        final JPasswordField value = new JPasswordField();
        value.setBounds(370, 320, 100, 30);
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(300, 280, 80, 30);
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(300, 320, 80, 30);
        JButton b = new JButton("Sign in");
        b.setBounds(460, 400, 80, 30);
        final JTextField text = new JTextField();
        text.setBounds(370, 280, 100, 30);
        f.add(value);
        f.add(l1);
        f.add(l2);
        f.add(b);
        f.add(text);
        f.setSize(870, 520);
        titleimage.setSize(820, 300);
        f.add(titleimage);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {




                String userName = text.getText();
                String password = new String(value.getPassword());

                File file = new File("D:\\admin.txt");
                boolean check;
                check = false;

                try {
                    
                    Scanner in = new Scanner(file);
                    while (in.hasNextLine()) {
                    String user = in.nextLine();
                    String pass = in.nextLine();

                    if (userName.equals(user) && password.equals(pass)) {

                        check = true;
                        f.setVisible(false);
                        new adminpanel();
                    } 
                }

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(adminlog.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (check == false){
                     JOptionPane.showMessageDialog(f,"You've entered wrong username and password.","Alert",JOptionPane.WARNING_MESSAGE);     
                }
                
            }
        });
    }
}

