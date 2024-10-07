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

public class login {

    login() throws IOException {
        JFrame f = new JFrame("MINIBUSTAR Customer Login");
        f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\3.gif")))));;

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(300, 280, 80, 30);
        final JTextField text = new JTextField();
        text.setBounds(370, 280, 100, 30);
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(300, 320, 80, 30);
        final JPasswordField value = new JPasswordField();
        value.setBounds(370, 320, 100, 28);
        JButton b = new JButton("Log in");
        b.setBounds(390, 400, 80, 30);
        JButton b2 = new JButton("Register");
        b2.setBounds(290, 400, 100, 30);
        b.setBounds(460, 400, 80, 30);
        JButton b3 = new JButton("Login as Admin");
        b3.setBounds(650, 35, 150, 30);
        JLabel titleimage = new JLabel(new ImageIcon("D:\\title.png"));
        f.add(value);
        f.add(l1);
        f.add(l2);
        f.add(b);
        f.add(b2);
        f.add(b3);
        f.add(text);
        f.add(titleimage);
        f.setSize(870, 520);
        titleimage.setSize(820, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String userName = text.getText();
                String password = new String(value.getPassword());

                File file = new File("D:\\login.txt");
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
                            JOptionPane.showMessageDialog(f, "Welcome to MiniBustar.");
                            new moviepage();
                        }
                    }

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (check == false) {
                    JOptionPane.showMessageDialog(f, "You've entered wrong username and password.", "Alert", JOptionPane.WARNING_MESSAGE);
                }
                
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    new reg();
                } catch (IOException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
                f.dispose();
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    new adminlog();
                } catch (IOException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
                f.dispose();
            }
        });

    }
}
