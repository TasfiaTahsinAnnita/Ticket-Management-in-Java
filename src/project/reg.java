package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class reg {

    reg() throws IOException {
        JFrame f = new JFrame("MINIBUSTAR");
        f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\3.gif")))));

        final JLabel label = new JLabel();
        label.setBounds(200, 350, 200, 50);
        final JPasswordField value = new JPasswordField();
        value.setBounds(370, 320, 100, 30);
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(300, 280, 80, 30);
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(300, 320, 80, 30);
        JLabel l3 = new JLabel("Contact no.:");
        l3.setBounds(300, 360, 80, 30);
        JButton b = new JButton("Submit");
        b.setBounds(370, 400, 80, 30);
        final JTextField text1 = new JTextField();
        text1.setBounds(370, 280, 100, 30);
        final JTextField text2 = new JTextField();
        text2.setBounds(370, 360, 100, 30);
        JRadioButton r1 = new JRadioButton("A) Male");
        JRadioButton r2 = new JRadioButton("B) Female");
        r1.setBounds(370, 200, 100, 30);
        r2.setBounds(370, 240, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);
        f.add(value);
        f.add(l1);
        f.add(label);
        f.add(text2);
        f.add(l3);
        f.add(l2);
        f.add(b);
        f.add(text1);

        f.setSize(870, 520);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String userName = text1.getText();
                String password = new String(value.getPassword());

                try {
                    File file = new File("D:\\login.txt");
                    PrintWriter fw = new PrintWriter(new FileOutputStream(file, true));

                    fw.append("\n" + userName + "\n" + password + "");

                    fw.close();
                    new login();

                } catch (IOException ex) {
                    Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(f, "Registration completed! \n You can now proceed to Sign in.");
                f.dispose();
            }
        });
    }
}
