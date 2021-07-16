package proj;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import pro.LogIn;
import project.OnlineTest;

public class Instruction  extends JFrame implements ActionListener{
	   JLabel l,l1,l2,l3;
	   JButton b1,b2; 
   public Instruction(){
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       setLayout(null);  
       setLocation(250,100);  
       setVisible(true);  
       setSize(600,350); 
       setTitle("JAVA TEST");
       
       l=new JLabel("INSTRUCTIONS:");  
       l.setFont(new Font("Times New Roman", Font.BOLD, 20));
       l.setBounds(30,40,450,20); 
       add(l); 
       l1=new JLabel("1.Basic JAVA Questions");  
       l1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       l1.setBounds(50,90,450,20); 
       add(l1); 
       l2=new JLabel("2.Total Questions : 10");  
       l2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       l2.setBounds(50,120,450,20); 
       add(l2); 
       l3=new JLabel("3.Time Duration : 5Mins"); 
       l3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       l3.setBounds(50,150,450,20); 
       add(l3); 
   
       b1=new JButton("START");  
       b1.addActionListener(this); 
       b1.setBounds(100,220,100,30); 
       add(b1);
       b2=new JButton("EXIT");
       b2.addActionListener(this);
       b2.setBounds(270,220,100,30);
       add(b2);
   }
	public static void main(String[] args) {
		Instruction i=new Instruction();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			 OnlineTest o= new OnlineTest("JAVA TEST"); 
		}
		else {
			LogIn li=new LogIn();
		}
	}

}
