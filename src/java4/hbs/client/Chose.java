package java4.hbs.client;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class Chose extends JFrame {

	private JPanel contentPane;
	private ObservingTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chose frame = new Chose();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Chose() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 99);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new ObservingTextField();
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Datepick");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String lang= null;
	               final Locale locale=getLocale(lang);
	               DatePicker dp= new DatePicker(textField,locale);
	               Date selectedDate = dp.parseDate(textField.getText());
	               dp.setSelectedDate(selectedDate);
	               dp.start(textField);
			}

			private Locale getLocale(String loc) {
				// TODO Auto-generated method stub
				
				
				if (loc != null && loc.length()>0)
	                 return new Locale(loc);
	 else
				return Locale.US;
			}

		
				// TODO Auto-generated method stub

			
			
		});
		contentPane.add(btnNewButton, BorderLayout.EAST);
	}

}
