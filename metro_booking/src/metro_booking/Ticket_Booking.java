package metro_booking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Ticket_Booking {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket_Booking window = new Ticket_Booking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ticket_Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 22));
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 798, 765);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(281, 28, 400, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(45, 141, 242, 65);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(45, 243, 242, 72);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(45, 349, 242, 65);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(45, 444, 242, 72);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		t1.setBounds(294, 141, 333, 65);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Nagole", "Habsiguda ", "Tarnaka"}));
		c1.setBounds(294, 243, 333, 72);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Madhapur", "Hitech City", "Durgam Cheruvu"}));
		c2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		c2.setBounds(297, 349, 330, 65);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6"}));
		c3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		c3.setBounds(297, 444, 330, 72);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n =t1.getText();
				String f =(String) c1.getSelectedItem();
				String t =(String) c2.getSelectedItem();
				String no =(String) c3.getSelectedItem();
				int not =Integer.parseInt(no);
				int bill=not*80;
				if(f.equals(t))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Check It !");
				}
				else
				{
					
				JOptionPane.showMessageDialog(btnNewButton, "Hello "+n + "\nFrom "+f + "\nTo : "+t + "\nNo. Tickets : "+no + "\nYour bill : "+bill);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(191, 569, 220, 72);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\hmr1.jpg"));
		lblNewLabel_5.setBounds(21, 32, 204, 98);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
