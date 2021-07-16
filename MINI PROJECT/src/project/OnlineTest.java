package project;

import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.*;
import javax.swing.*;

public class OnlineTest extends JFrame implements ActionListener{
	    JLabel l,l1;  
	    JRadioButton jb[]=new JRadioButton[5];  
	    JButton b1,b2;  
	    ButtonGroup bg;  
	    int count=0,ans=0,x=1,y=1,now=0;  
	    int m[]=new int[10];  
	    Timer timer;
		int second,minute;
		String ddSecond,ddMinute;
		DecimalFormat dFormat=new DecimalFormat();
		
	    public OnlineTest(String s)  
	    {  
	        super(s);  
	        l=new JLabel();  
	        add(l);  
	        l1=new JLabel("");
	        add(l1);
	    	l1.setBounds(480,10,100,30);
	    	
	    	l1.setText("05:00");
	    	second=00;
	    	minute=05;
	    	countdownTimer();
	    	timer.start();
	        bg=new ButtonGroup();  
	        for(int i=0;i<5;i++)  
	        {  
	            jb[i]=new JRadioButton();     
	            add(jb[i]);  
	            bg.add(jb[i]);  
	        }  
	        b1=new JButton("Next");  
	        b2=new JButton("Bookmark");  
	        b1.addActionListener(this);  
	        b2.addActionListener(this);  
	        add(b1);add(b2);  
	        set();  
	        l.setBounds(30,40,450,20);  
	        jb[0].setBounds(50,80,150,20);  
	        jb[1].setBounds(50,110,150,20);  
	        jb[2].setBounds(50,140,150,20);  
	        jb[3].setBounds(50,170,150,20);  
	        b1.setBounds(100,240,100,30);  
	        b2.setBounds(270,240,100,30);  
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        setLayout(null);  
	        setLocation(250,100);  
	        setVisible(true);  
	        setSize(600,350);  
	    }  
	    public void actionPerformed(ActionEvent e)  
	    {  
	        if(e.getSource()==b1)  
	        {  
	            if(check())  
	                count=count+1;  
	                ans++;  
	                set();    
	            if(ans==10)  
	            {  
	                b1.setEnabled(false);  
	                b2.setText("Result");  
	            }  
	        }  
	        if(e.getActionCommand().equals("Bookmark"))  
	        {  
	            JButton bk=new JButton("Bookmark"+x);  
	            bk.setBounds(480,20+30*x,100,30);  
	            add(bk);  
	            bk.addActionListener(this);  
	            m[x]=ans;  
	            x++;  
	            ans++;  
	            set();    
	            if(ans==10)  
	                b2.setText("Result");  
	            setVisible(false);  
	            setVisible(true);  
	        }  
	        for(int i=0,y=1;i<x;i++,y++)  
	        {  
	        if(e.getActionCommand().equals("Bookmark"+y))  
	        {  
	            if(check())  
	                count=count+1;  
	            now=ans;  
	            ans=m[y];  
	            set();  
	            ((JButton)e.getSource()).setEnabled(false);  
	            ans=now;  
	        }  
	        }  
	      
	        if(e.getActionCommand().equals("Result"))  
	        {  
	            if(check())  
	                count=count+1;  
	                ans++;  
	            
	            JOptionPane.showMessageDialog(this,"correct ans="+count);System.exit(0);  
	        }  
	    }  
	    void set()  
	    {  
	        jb[4].setSelected(true);  
	        if(ans==0)  
	        {  
	            l.setText("Que1: Who is known as Father of JAVA Programming Language?");  
	            jb[0].setText("James Gosling");jb[1].setText("M.P Java");jb[2].setText("Charel Babbage");jb[3].setText("Blais Pascal");   
	        }  
	        if(ans==1)  
	        {  
	            l.setText("Que2: Which provides the runtime environment for java byte code to be executed?");  
	            jb[0].setText("JDK");jb[1].setText("JVM");jb[2].setText("JRE");jb[3].setText("JAVAC");  
	        }  
	        if(ans==2)  
	        {  
	            l.setText("Que3: Which package is directly available to our class without importing it?");  
	            jb[0].setText("swing");jb[1].setText("applet");jb[2].setText("net");jb[3].setText("lang");  
	        }  
	        if(ans==3)  
	        {  
	            l.setText("Que4: Which of these is returned by operator '&' ?");  
	            jb[0].setText("Integer");jb[1].setText("Character");jb[2].setText("Boolean");jb[3].setText("Float");  
	        }  
	        if(ans==4)  
	        {  
	            l.setText("Que5: Which of the following are not JAVA keywords?");  
	            jb[0].setText("double");jb[1].setText("switch");jb[2].setText("then");jb[3].setText("instanceof");  
	        }  
	        if(ans==5)  
	        {  
	            l.setText("Que6: Which one is a template for creating different objects?");  
	            jb[0].setText("A class");jb[1].setText("An Array");jb[2].setText("Interface");jb[3].setText("Method");  
	        }  
	        if(ans==6)  
	        {  
	            l.setText("Que7: JAVA Language was initially called as _________ ");  
	            jb[0].setText("Sumatra");jb[1].setText("J++");jb[2].setText("Oak");jb[3].setText("Pine");  
	        }  
	        if(ans==7)  
	        {  
	            l.setText("Que8: which feature of OOPS has a super-class sub-class concept?");  
	            jb[0].setText("Hierarchical Inheritance");jb[1].setText("Single Inheritance");jb[2].setText("Multiple Inheritance");jb[3].setText("Multilevel Inheritance");         
	        }  
	        if(ans==8)  
	        {  
	            l.setText("Que9: which function is not present in Applet class?");  
	            jb[0].setText("init");jb[1].setText("main");jb[2].setText("start");jb[3].setText("destroy");  
	        }  
	        if(ans==9)  
	        {  
	            l.setText("Que10: Which of the following are not Java modifiers?");  
	            jb[0].setText("public");jb[1].setText("private");jb[2].setText("friendly");jb[3].setText("transient");  
	        }  
	        l.setBounds(30,40,450,20);  
	        for(int i=1,j=0;i<=90;i+=30,j++)  
	            jb[j].setBounds(50,80+i,200,20);  
	    }  
	    boolean check()  
	    {  
	        if(ans==0)  
	            return(jb[0].isSelected());  
	        if(ans==1)  
	            return(jb[1].isSelected());  
	        if(ans==2)  
	            return(jb[3].isSelected());  
	        if(ans==3)  
	            return(jb[1].isSelected());  
	        if(ans==4)  
	            return(jb[2].isSelected());  
	        if(ans==5)  
	            return(jb[0].isSelected());  
	        if(ans==6)  
	            return(jb[2].isSelected());  
	        if(ans==7)  
	            return(jb[0].isSelected());  
	        if(ans==8)  
	            return(jb[1].isSelected());  
	        if(ans==9)  
	            return(jb[2].isSelected());  
	        return false;  
	    }  
	    public static void main(String s[])  
	    {  
	       OnlineTest o= new OnlineTest("JAVA TEST");  
	    }
	    public void countdownTimer() {
			  timer=new Timer(1000, new ActionListener(){


		public void actionPerformed(ActionEvent e) {
			second--;
			ddSecond=dFormat.format(second);
			ddMinute=dFormat.format(minute);
			l1.setText(ddMinute+":"+ddSecond);
			
			if(second==-1) {
				second=59;
				minute--;
				ddSecond=dFormat.format(second);
				ddMinute=dFormat.format(minute);
				l1.setText(ddMinute+":"+ddSecond);
			
			}
			if(minute==00)
			if(second==00) {
				timer.stop();
				JOptionPane.showMessageDialog(null, this,"time up", second);
				JOptionPane.showMessageDialog(null, this,"correct ans="+count, ans);System.exit(ABORT);
			}
		}
		});
		 }
		
	}  

