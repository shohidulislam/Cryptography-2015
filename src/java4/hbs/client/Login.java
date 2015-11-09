
package java4.hbs.client;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
	
	public class Login extends JFrame{
		
		private JTextField item1;
		private JTextField item2;
		private JButton item3;
		private JButton item4;
		private JButton item5;
		private JPasswordField passwordField;
		
		public Login(){
			super("LogIn     Wellcom to  Hair dressing shop");
			setLayout( null);
			
			item1 = new JTextField(10);
			item1.setBounds(110, 10, 140, 30);
			add(item1);
			
			
			
			item2 = new JTextField("uneditbale", 10);
			item2.setEditable(false);
			/*add(item3);*/
			
			passwordField = new JPasswordField("Mypass");
			passwordField.setBounds(110, 50, 140, 30);
			add(passwordField);
			
			item3 = new JButton("Enter");
			item3.setBounds(200, 100, 75, 25);
			add(item3);
			
			item4 = new JButton("Cancel");
			item4.setBounds(100, 100, 75, 25);
			add(item4);
			
			item5 = new JButton("SignUp");
			item5.setBounds(150, 150, 75, 40);
			add(item5);
			
			thehandler handler = new thehandler();
			item1.addActionListener(handler);
			item2.addActionListener(handler);
			item3.addActionListener(handler);
			item4.addActionListener(handler);
			item5.addActionListener(handler);
			passwordField.addActionListener(handler);
	}	
		
			private class thehandler implements ActionListener{
				public void actionPerformed(ActionEvent event){
					
				String string = "";
					
					if(event.getSource()==item1)
							string=String.format("field 1: %s", event.getActionCommand());
					else if(event.getSource()==item2)
							string=String.format("field 2: %s", event.getActionCommand());
						else if(event.getSource()==item3)
							string=String.format("Password enter: %s", event.getActionCommand());
						else if(event.getSource()==passwordField)
							string=String.format("password field  is : %s",event.getActionCommand());
						else if(event.getSource()==item4)
							string=String.format(" Are you sure? : %s",event.getActionCommand());
						else if(event.getSource()==item5)
							string=String.format(" Enter UserDetails : %s",event.getActionCommand());
				
				JOptionPane.showMessageDialog(null, string);
				}
				
			}

			public void setDefalutCloseOperation(int exitOnClose) {
				// TODO Auto-generated method stub
				
			}
	}



