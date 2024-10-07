package project;

import javax.swing.*;
import java.awt.*;

import java.io.IOException;

 
 class SplashScreenDemo {

    SplashScreenDemo()
    {
JFrame frame=new JFrame();
    JLabel image=new JLabel(new ImageIcon("D:\\2.gif"));
    JLabel text=new JLabel("Welcome To Minibustar");
    JProgressBar progressBar=new JProgressBar();
    JLabel message=new JLabel();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setVisible(true);

        image.setSize(900,300);
        frame.add(image);

        text.setFont(new Font("arial",Font.BOLD,40));
        text.setBounds(270,300,450,100);
        text.setForeground(Color.black);
        frame.add(text);

        message.setBounds(430,470,450,100);//Setting the size and location of the label
        message.setForeground(Color.black);//Setting foreground Color
        message.setFont(new Font("arial",Font.BOLD,20));//Setting font properties
        frame.add(message);//adding label to the frame

        progressBar.setBounds(270,400,450,100);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.BLACK);
        progressBar.setValue(0);
        frame.add(progressBar);

        int i=0;//Creating an integer variable and intializing it to 0
 
        while( i<=100)
        {
            try{
                Thread.sleep(20);
                progressBar.setValue(i);//Setting value of Progress Bar
                message.setText("LOADING... "+Integer.toString(i)+"%");//Setting text of the message JLabel
                i++;
                if(i==100)
                    frame.dispose();
            }catch(Exception e){
                e.printStackTrace();
            }
 
 
 
        }
    }
}
public class Project {

    public static void main(String[] args) throws IOException {

        new SplashScreenDemo();//Creating object of SplashScreenDemo class

        new login();

         
                        }
}
