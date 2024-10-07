
package project;

import java.awt.Container;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class loglist extends JFrame{
    loglist(){
        Container c;
        c = this.createRootPane();
        c.setLayout(null);
    java.io.File f = new java.io.File("D:\\login.txt");
     String data[][] = new String[50][5];
        try{
            int i=0;
            Scanner in = new Scanner(f);
            while(in.hasNextLine()){
                String s = in.nextLine();
                data[i]=s.split(",");
                i++;
            }
            in.close();
        }      
        catch(IOException k){
            k.printStackTrace();
        }

        
        String row[] = {"user/pass"};
        JTable table = new JTable(data, row);
        table.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(table);    
    add(sp);          
    setSize(300,400);    
    setVisible(true);
    }
    
}
