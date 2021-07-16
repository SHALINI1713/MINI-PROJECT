package pro;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

import proj.Instruction;

public class LogIn extends JFrame implements ActionListener{
	   
	   JLabel l,l1,l2;
	   JTextField t;
	   JPasswordField pf;
	   JCheckBox c1;
	   JButton b,b1;
	   public LogIn() {
		     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		     setLayout(null); 
	         setLocation(250,100);  
	         setVisible(true);  
	         setSize(600,350);
	         
	          l = new JLabel("LOGIN FOR TEST");
		      l.setBounds(210, 20, 200, 50);
		      l.setFont(new Font("Times New Roman", Font.BOLD, 20));
		      add(l);
		      l1 = new JLabel("USER_NAME");
		      l1.setBounds(130, 100, 200, 30);
		      l1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		      add(l1);
		      t = new JTextField();
		      t.setBounds(300, 100, 200, 30);
		      t.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		      add(t);
		      l2 = new JLabel("PASSWORD");
		      l2.setBounds(130, 150, 200, 30);
		      l2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		      add(l1);
		      pf = new JPasswordField();
		      pf.setBounds(300, 150, 200, 30);
		      pf.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		      add(pf);
		      b = new JButton("LOGIN");
		      b.addActionListener(this);
		      b.setBounds(140, 230, 150, 40);
		      b.setFont(new Font("Times New Roman", Font.BOLD, 18));
		      add(b);
		      b1 = new JButton("RESET");
		      b1.addActionListener(this);
		      b1.setBounds(300, 230, 150, 40);
		      b1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		      add(b1);
		      c1 = new JCheckBox("Show Password");
		      c1.addActionListener(this);
		      c1.setBounds(300, 180, 200, 30);
		      c1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		      add(c1);
		   }
	public static void main(String[] args) {
		LogIn li=new LogIn();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			String ut=t.getText();
			String pt=pf.getText();
			
			if(ut.equalsIgnoreCase("shalu") && pt.equalsIgnoreCase("sk@123")) {
				JOptionPane.showMessageDialog(this,"Login for test");
				Instruction i=new Instruction();
			} 
			else{
				JOptionPane.showMessageDialog(this,"Invalid Username or Password");
			}
		}
		if(e.getSource()==b1) {
			t.setText("");
			pf.setText("");
		}
		
		if(e.getSource()==c1) {
			if(c1.isSelected()) {
				pf.setEchoChar((char)0);
			}else {
				pf.setEchoChar('*');
			}
		}
		
	}

}
