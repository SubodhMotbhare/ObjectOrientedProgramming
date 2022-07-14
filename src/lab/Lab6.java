package lab;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import lab.MysqlCon;
import net.proteanit.sql.DbUtils;

import com.mysql.jdbc.Connection;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class Lab6 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	
	
	public String name,city,runs,role,age,player;
	//public int player;
	PreparedStatement pst;
	ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab6 window = new Lab6();
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
	Connection con = null;
	private JTable table;
	private JTextField tdel;

	public Lab6() {
		initialize();
		table_load();

	}
	
	public void table_load() {
		try {
			pst = con.prepareStatement("select * from cricket");
			rs = pst.executeQuery();
			// System.out.print(rs);
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		con = (Connection) MysqlCon.dbconnect();

		frame = new JFrame();
		frame.setBounds(100, 100, 1122, 745);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Indian Cricket Team");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblNewLabel.setBounds(132, 32, 417, 58);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setBounds(89, 156, 82, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("City");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(89, 210, 82, 41);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Role");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_2.setBounds(89, 261, 82, 41);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Age");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_3.setBounds(89, 315, 82, 41);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Runs");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1_4.setBounds(89, 372, 82, 41);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		t1 = new JTextField();
		t1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		t1.setBounds(183, 156, 285, 41);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		t2.setColumns(10);
		t2.setBounds(183, 210, 285, 41);
		frame.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		t3.setColumns(10);
		t3.setBounds(183, 264, 285, 41);
		frame.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("Times New Roman", Font.BOLD, 22));
		t4.setColumns(10);
		t4.setBounds(183, 318, 285, 41);
		frame.getContentPane().add(t4);
		
		t5 = new JTextField();
		t5.setFont(new Font("Times New Roman", Font.BOLD, 22));
		t5.setColumns(10);
		t5.setBounds(183, 372, 285, 41);
		frame.getContentPane().add(t5);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					//player = tpid.getText();
					name = t1.getText();
					city = t2.getText();
					role = t3.getText();
					age = t4.getText();
					runs = t5.getText();
				//	System.out.println(player);
//					System.out.println(name);
//					System.out.println(role);
//					System.out.println(city);
//					System.out.println(runs);
//					System.out.println(age);
					
					pst = con.prepareStatement("Insert into cricket(name, city, role, age, runs)values(?,?,?,?,?)");
//					pst.setString(1, player);
					pst.setString(1,name);
					pst.setString(2,city);
					pst.setString(3,role);
					pst.setString(4,age);
					pst.setString(5,runs);

					pst.executeUpdate();  
				    JOptionPane.showMessageDialog(null,"Record Added Successfully");
				  
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					
//				System.out.print(table_load());	
//					
//					    pst = con.prepareStatement("select * from cricket");
//					    rs = pst.executeQuery();
////					    rs.next();
////					    System.out.println(rs.getString(1));
//					    table.setModel(DbUtils.resultSetToTableModel(rs));
//////				
////				    	
				
//					con.close();  
					
				}
				catch(Exception e) {
					System.out.println(e);
					
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(491, 511, 116, 46);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player  = tdel.getText();
				int p1=Integer.parseInt(player);
				try {
					pst = con.prepareStatement("update cricket set name= ?,city=?,role=?,age=?,runs=? where pid =?");
					
		            pst.setString(1,t1.getText() );
		            pst.setString(2, t2.getText());
		            pst.setString(3, t3.getText());
		            pst.setString(4, t4.getText());
		            pst.setString(5, t5.getText());
		            pst.setInt(6, p1);
		            pst.executeUpdate();
		            JOptionPane.showMessageDialog(null, "Record Updated!!!!!");
		            table_load();
		            
		            t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					tdel.setText("");
		           
//					con.close();
		            
				}
				catch(Exception e3) {
					System.out.println(e3);
				}
				
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnUpdate.setBounds(668, 511, 122, 46);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player  = tdel.getText();
				int p1=Integer.parseInt(player);
				try {
					pst = con.prepareStatement("delete from cricket where pid =" +p1);
					
//		            pst.setString(1, player);
		            pst.executeUpdate();
		            JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
		            table_load();
		            
		            t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
//					tpid.setText("");
		           
//					con.close();
		            
				}
				catch(Exception e3) {
					System.out.println(e3);
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDelete.setBounds(853, 511, 111, 46);
		frame.getContentPane().add(btnDelete);
		
		table = new JTable();
		table.setBounds(480, 113, 549, 333);
		frame.getContentPane().add(table);
		
		JLabel del = new JLabel("Enter the PID for delete");
		del.setFont(new Font("Tahoma", Font.BOLD, 16));
		del.setBounds(27, 459, 217, 38);
		frame.getContentPane().add(del);
		
		tdel = new JTextField();
		tdel.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {

				try {

					String id = tdel.getText();
					int pd=Integer.parseInt(id);

					pst = con.prepareStatement("select name,city,role,age,runs from cricket where pid = ?");
					pst.setInt(1, pd);
					ResultSet rs = pst.executeQuery();

					if (rs.next() == true) {

						String name = rs.getString(1);
						String city = rs.getString(2);
						String role = rs.getString(3);
						String age= rs.getString(4);
						String runs= rs.getString(5);

						t1.setText(name);
						t2.setText(city);
						t3.setText(role);
						t4.setText(age);
						t5.setText(runs);

					}

				}

				catch (SQLException ex) {

				}

			}

		});
		tdel.setFont(new Font("Tahoma", Font.BOLD, 16));
		tdel.setBounds(256, 459, 201, 38);
		frame.getContentPane().add(tdel);
		tdel.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(491, 511, 116, 46);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
					 Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(668, 622, 136, 41);
		frame.getContentPane().add(btnNewButton_1);
	}
}
