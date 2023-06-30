package calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class myFrame extends JFrame implements ActionListener {

	//private JFrame frame;
	private JPanel panel;
	private JMenuBar menuBar;
	
	//MENU CATEGORIES
	private JMenu editMenu;
	private JMenu matrixMenu;
	private JMenu helpMenu;
	
	//EDIT CATEGORIES
	private JMenuItem exitItem;
	
	//MATRIX CATEGORIES
	private JMenuItem createMatr;
	private JMenuItem loadMatr;
	
	
	myFrame()
	{
		//frame = new JFrame();
		
		panel = new JPanel();
		menuBar = new JMenuBar();
		
		//MENU CATEGORIES
		editMenu = new JMenu("Edit");
		matrixMenu = new JMenu("Matrix");
		helpMenu = new JMenu("Help");
		
//EDIT CATEGORIES
		exitItem = new JMenuItem("Exit");
		
//MATRIX CATEGORIES
		createMatr = new JMenuItem("Create");
		loadMatr = new JMenuItem("Load");

//ADD ACTION LISTENER
		exitItem.addActionListener(this);
		createMatr.addActionListener(this);
		loadMatr.addActionListener(this);

//SET MNEMONIC aka keyboard shortcuts case insensitive
		matrixMenu.setMnemonic(KeyEvent.VK_M); // Alt + M for Matrix
		createMatr.setMnemonic(KeyEvent.VK_C);// C for Create
//SET ICONS
		//VIDEO IN 3:04:00
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30)); //top bottom left right
		panel.setLayout(new GridLayout(0,1)); //rows columns
		
//		panel.add(button);
//		
//		panel.add(button1);
//		panel.add(button2);
//		panel.add(button3);
//		panel.add(button4);
//		
//		panel.add(label);
		
		this.add(panel, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		this.pack();
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		menuBar.add(editMenu);
		menuBar.add(matrixMenu);
		menuBar.add(helpMenu);
		
		matrixMenu.add(createMatr);
		matrixMenu.add(loadMatr);
		
		editMenu.add(exitItem);
		
		
		this.setJMenuBar(menuBar);
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == createMatr) {
			System.out.println("Enter number of rows and columns: ");

		}
		
		if(e.getSource() == loadMatr) {
			
		}
		
		if(e.getSource() == exitItem) {
			System.exit(0);
		}
	}

	
}
