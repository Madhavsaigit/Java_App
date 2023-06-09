package Account_data;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Registration_data {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_data window = new Registration_data();
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
	public Registration_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setBounds(100, 100, 904, 801);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(308, 37, 452, 81);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(36, 158, 251, 73);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gender");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(36, 277, 251, 73);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Branch");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(36, 393, 251, 73);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Programming lang");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(36, 507, 251, 73);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t1.setBounds(308, 158, 371, 73);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		r1.setBounds(308, 277, 171, 60);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		r2.setBounds(508, 277, 171, 60);
		frame.getContentPane().add(r2);
		
		JComboBox co = new JComboBox();
		co.setFont(new Font("Tahoma", Font.PLAIN, 20));
		co.setModel(new DefaultComboBoxModel(new String[] {"Select ", "CSE", "AIML", "DS", "IOT", "CS"}));
		co.setBounds(308, 392, 371, 74);
		frame.getContentPane().add(co);
		
		JCheckBox cb1 = new JCheckBox("C++");
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cb1.setBounds(308, 520, 140, 54);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("JAVA");
		cb2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cb2.setBounds(464, 520, 140, 54);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("PYTHON");
		cb3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cb3.setBounds(621, 520, 140, 54);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n =t1.getText();
				String g;
				if(r1.isSelected())
				{
					g = "Female";
				}
				else if(r2.isSelected())
				{
					g = "Male";
				}
				else
				{
					g = "Invalid";
				}
				String b=(String) co.getSelectedItem();
				String Pl = " ";
				if(cb1.isSelected())
				{
					Pl =Pl + "C++";
				}
				else if(cb2.isSelected()) 
				{
					Pl =Pl + "JAVA";
				}
				else
				{
					Pl =Pl + "PYTHON";
				}
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aiml","root","mrec");
					String q = "insert into registration values('"+n+"', '"+g+"', '"+b+"','"+Pl+"')";
					Statement sta=con.createStatement();
					sta.execute(q);
					con.close();
					//JOptionPane.showMessageDialog(btnNewButton,"Done");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(272, 624, 232, 73);
		frame.getContentPane().add(btnNewButton);
	}
}
