package calculator;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI /*extends Operations*/ implements ActionListener {
	
	private int count = 0;
	private JLabel label;
	//private JFrame frame;
	//private JPanel panel;
	
	public GUI()
	{
		//frame = new JFrame();
		
		JButton button = new JButton("Click here");
		button.addActionListener(this);
		
		
		JButton button1  = new JButton("+");
		JButton button2 = new JButton("-");
		JButton button3 = new JButton("*");
		JButton button4 = new JButton("/");
		
		//JButton button3 = new JButton("*");
		
		
		
		
		label = new JLabel("Number of clicks: 0");
		
//		panel = new JPanel();
//		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30)); //top bottom left right
//		panel.setLayout(new GridLayout(0,1)); //rows columns
//		
//		panel.add(button);
//		
//		panel.add(button1);
//		panel.add(button2);
//		panel.add(button3);
//		panel.add(button4);
//		
//		panel.add(label);
		
//		frame.add(panel, BorderLayout.CENTER);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setTitle("Calculator");
//		frame.pack();
//		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new myFrame();
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
		
		
	}

}
