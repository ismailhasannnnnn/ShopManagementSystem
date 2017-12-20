package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Label;

public class ShopManager {

	public static UserManager userManager = new UserManager();
	public static ShopManager shopManager = new ShopManager();
	
	private JFrame frmShopManager;
	public JTextField usernameField;
	public JTextField passField;
	public JLabel registerLoginLabel;
	public static String user;
	public static String pass;
	public String[] usersPasses = new String[1000];


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopManager window = new ShopManager();
					window.frmShopManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShopManager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShopManager = new JFrame();
		frmShopManager.getContentPane().setBackground(SystemColor.controlHighlight);
		frmShopManager.setTitle("Shop Manager");
		frmShopManager.setBounds(100, 100, 450, 300);
		frmShopManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShopManager.getContentPane().setLayout(null);
		
		JLabel titleLabel = new JLabel("Shop Manager");
		titleLabel.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 28));
		titleLabel.setBounds(129, 11, 197, 38);
		frmShopManager.getContentPane().add(titleLabel);
		
		JLabel choiceLabel = new JLabel("What would you like to do?\r\n");
		choiceLabel.setEnabled(false);
		choiceLabel.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		choiceLabel.setBounds(374, 223, 243, 38);
		frmShopManager.getContentPane().add(choiceLabel);
		
		JLabel loginLabel = new JLabel("Please Login:");
		loginLabel.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		loginLabel.setBounds(167, 60, 114, 32);
		frmShopManager.getContentPane().add(loginLabel);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(129, 103, 57, 14);
		frmShopManager.getContentPane().add(usernameLabel);
		
		JLabel passLabel = new JLabel("Password:");
		passLabel.setBounds(129, 128, 50, 14);
		frmShopManager.getContentPane().add(passLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(192, 100, 134, 20);
		frmShopManager.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		passField = new JTextField();
		passField.setColumns(10);
		passField.setBounds(189, 125, 137, 20);
		frmShopManager.getContentPane().add(passField);
		
		
		registerLoginLabel = new JLabel("");
		registerLoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		registerLoginLabel.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		registerLoginLabel.setBounds(10, 156, 414, 26);
		frmShopManager.getContentPane().add(registerLoginLabel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JButton registerButton = new JButton("Register");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user = usernameField.getText();
				pass = passField.getText();
				registerLoginLabel.setText("Registered.");
				
				if(Arrays.asList(shopManager.usersPasses).contains(ShopManager.user + ";" + ShopManager.pass)) {
					registerLoginLabel.setText("Already registered. Please try again.");
				}
				
				userManager.register();
				
				
				
			}
		});
		registerButton.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		registerButton.setBackground(SystemColor.controlLtHighlight);
		registerButton.setBounds(228, 193, 89, 23);
		frmShopManager.getContentPane().add(registerButton);
		
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user = usernameField.getText();
				pass = passField.getText();
				
				if(Arrays.asList(shopManager.usersPasses).contains(ShopManager.user + ";" + ShopManager.pass)) {
					System.out.println("Logged in!");
					
				}else {
					System.out.println("Incorrect Credentials. Please try again.");
				}
			}
		});
		loginButton.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		loginButton.setBackground(SystemColor.controlLtHighlight);
		loginButton.setBounds(129, 193, 89, 23);
		frmShopManager.getContentPane().add(loginButton);
	}
}
