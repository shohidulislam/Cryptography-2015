package java4.hbs.client;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

//import Login.thehandler;

public class Signup extends JFrame {
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JTextField item4;
	private JTextField item5;
	private JTextField item6;
	private JTextField item7;
	private JButton    item8;
	private JButton    item9;
	
	//private JPasswordField passwordField;
	
	public Signup(){ 
		super("SignUp     Wellcom to  Hair dressing shop");
		 setBackground(Color.green);
		setLayout( null);
		
		item1 = new JTextField("First Name");
		item1.setBounds(110, 10, 200, 30);
		add(item1);
		
		
		
		item2 = new JTextField("Last name");
		item2.setBounds(110, 30, 200, 30);
		add(item2);;
		/*
		
		passwordField = new JPasswordField("Mypass");
		passwordField.setBounds(110, 50, 140, 30);
		add(passwordField);*/
		
		item3 = new JTextField("Address");
		item3.setBounds(110, 50, 200, 30);
		add(item3);
		
		item4 = new JTextField("Email");
		item4.setBounds(110, 70, 200, 30);
		add(item4);
		
		item5 = new JTextField("Mobile no");
		item5.setBounds(110, 90, 200, 30);
		add(item5);
		
		item6 = new JTextField("Enter Password");
		item6.setBounds(110, 110, 200, 30);
		add(item6);
		
		item7 = new JTextField("Confirm Password");
		item7.setBounds(110, 130, 200, 30);
		add(item7);
		
		item8 = new JButton("Cancel");
		item8.setBounds(110, 170, 90, 25);
		add(item8);
		item9 = new JButton("Ok");
		item9.setBounds(260, 170, 50, 25);
		add(item9);
		
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		item4.addActionListener(handler);
		item5.addActionListener(handler);
		item6.addActionListener(handler);
		item7.addActionListener(handler);
		item8.addActionListener(handler);
		item9.addActionListener(handler);
		//passwordField.addActionListener(handler);
}	
	
		private class thehandler implements ActionListener{
			public void actionPerformed(ActionEvent event){
				
			String string = "";
				
				if(event.getSource()==item1)
						string=String.format("field 1: %s", event.getActionCommand());
				
				else if(event.getSource()==item2)
						string=String.format("field 2: %s", event.getActionCommand());
				else if(event.getSource()==item3)
					string=String.format("field 3: %s", event.getActionCommand());
				else if(event.getSource()==item4)
					string=String.format("field 4: %s", event.getActionCommand());
				else if(event.getSource()==item5)
					string=String.format("field 5: %s", event.getActionCommand());
				else if(event.getSource()==item6)
					string=String.format("field 6: %s", event.getActionCommand());
				else if(event.getSource()==item7)
					string=String.format("field 7: %s", event.getActionCommand());
				/*else if(event.getSource()==item8)
					string=String.format("field 8: %s", event.getActionCommand());
				else if(event.getSource()==item9)
					string=String.format("field 9: %s", event.getActionCommand());
					else if(event.getSource()==item3)
						string=String.format("Password enter: %s", event.getActionCommand());
					else if(event.getSource()==passwordField)
						string=String.format("password field  is : %s",event.getActionCommand());*/
					else if(event.getSource()==item8)
						string=String.format(" Are you sure? : Press OK ",event.getActionCommand());
					else if(event.getSource()==item9)
						string=String.format(" Confirm? : Press OK ",event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
			}
			
		}

		public void setDefalutCloseOperation(int exitOnClose) {
			// TODO Auto-generated method stub
			
		}

}
