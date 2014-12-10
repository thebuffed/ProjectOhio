package gameGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import userPackage.User;

public class GUI extends JFrame implements ActionListener, KeyListener {
	
	private static final long serialVersionUID = 1L;
	
	private Container c;
	
	//Text stuff
	private JPanel pnlTextStuff;
	private final JLabel lblInfo = new JLabel("Situation...");
	private final JLabel lblCommand = new JLabel("Command...");
	private JTextArea txtInfo;
	private JTextField txtCommand;
	
	//Buttons
	private JPanel pnlButtons;
	
	private final JButton btnInventory = new JButton("Inventory");
	
	//Stats
	private JPanel pnlStatistics;
	private JLabel lblStrength;
	private JLabel lblDefense;
	private JLabel lblAgility;
	private JButton btnLevelUp;
	
	private JProgressBar health;
	private JProgressBar experience;
	private JProgressBar enemyHealth;
	
	public GUI() {
		// Setting the initial container
		this.setTitle("Game");
		this.setSize(800, 500);
		this.setLocation(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		c = this.getContentPane();
		
		//All Text
		pnlTextStuff = new JPanel();
		pnlTextStuff.setLayout(new GridLayout(1,1));
		txtInfo = new JTextArea(20, 35);
		JScrollPane scrollPane = new JScrollPane(txtInfo);
		txtInfo.setEditable(false);
		txtCommand = new JTextField(5);
		txtCommand.addKeyListener(this);
		//pnlTextStuff.add(lblInfo);
		//pnlTextStuff.add(txtInfo);
		//pnlTextStuff.add(lblCommand);
		//pnlTextStuff.add(txtCommand);
		
		Box box2 = Box.createVerticalBox();
		box2.add(Box.createVerticalStrut(10));
		box2.add(lblInfo);
		box2.add(Box.createVerticalStrut(5));
		box2.add(txtInfo);
		box2.add(Box.createVerticalStrut(20));
		box2.add(lblCommand);
		box2.add(Box.createVerticalStrut(5));
		box2.add(txtCommand);
		pnlTextStuff.add(box2);
		
		//Buttons
		pnlButtons = new JPanel();
		pnlButtons.setLayout(new FlowLayout());

		pnlButtons.add(btnInventory) ;
		
		//Statistics
		pnlStatistics = new JPanel();
		pnlStatistics.setLayout(new GridLayout(1, 1));
		//pnlStatistics.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		
		lblStrength = new JLabel("Strength: ");
		lblDefense = new JLabel("Defense: ");
		lblAgility = new JLabel("Agility: ");
		btnLevelUp = new JButton("Level Up...");
		btnLevelUp.setEnabled(false);
	
		//Progress Bars
		health = new JProgressBar();
		health.setStringPainted(true);
		health.setForeground(Color.RED);
		health.setString("Health...");
		
		experience = new JProgressBar();
		experience.setStringPainted(true);
		experience.setForeground(Color.BLUE);
		experience.setString("Exp...");
		
		enemyHealth = new JProgressBar();
		enemyHealth.setStringPainted(true);
		enemyHealth.setForeground(Color.BLACK);
		enemyHealth.setString("Enemy Health...");
		
		health.setValue(24);
		enemyHealth.setValue(43);
		
		Box box = Box.createVerticalBox();
		box.add(Box.createVerticalStrut(10));
		box.add(lblStrength);
		box.add(Box.createVerticalStrut(30));
		box.add(lblDefense);
		box.add(Box.createVerticalStrut(30));
		box.add(lblAgility);
		box.add(Box.createVerticalStrut(30));
		box.add(btnLevelUp);
		box.add(Box.createVerticalStrut(90));
		box.add(health);
		box.add(Box.createVerticalStrut(30));
		box.add(experience);
		box.add(Box.createVerticalStrut(50));
		box.add(enemyHealth);
		pnlStatistics.add(box);
		
		
		c.add(pnlTextStuff, BorderLayout.WEST);
		c.add(pnlButtons, BorderLayout.SOUTH);
		c.add(pnlStatistics, BorderLayout.EAST);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new GUI();
		//file = JOptionPane.showInputDialog("Please enter a filename.");
		//JOptionPane.showMessageDialog(null, "Please enter a valid filename");
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
			JOptionPane.showMessageDialog(null, "Working Baby!");
		
	}
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
