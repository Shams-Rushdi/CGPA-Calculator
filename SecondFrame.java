
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.math.BigDecimal;

public class SecondFrame extends JFrame implements ActionListener
{
	private JLabel c1Label,c2label,c3Label, label;
	private JButton b1, b2, b3, backBtn,exitBtn,nextBtn;
	private JTextField userTF , value_1 , value_2 , value_3, value_4 , value_5 , value_6;
	//private JPasswordField passPF;
	private JComboBox c1combo,c2combo,c3combo,c4combo,c5combo,c6combo,c7combo,c8combo;
	private JPanel panel;
	private FirstFrame ff;
	
	public SecondFrame(FirstFrame ff)
	{
		super("CGPA Calculator");
		this.setSize(800, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.ff = ff;
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		label = new JLabel("Welcome to my Calculator");
		label.setBounds(50, 30, 700, 30);
		label.setBackground(Color.CYAN);
		label.setOpaque(true);
		panel.add(label);
		
		
		c1Label = new JLabel("Course Name ");
		c1Label.setBounds(50, 80, 100, 30);
		c1Label.setOpaque(true);
		panel.add(c1Label);
		
		
		c3Label = new JLabel("How Many Course");
		c3Label.setBounds(540,120,200,30);
		c3Label.setOpaque(true);
		panel.add(c3Label);
		
		
		
		String items7[] = new String []{"1", "2", "3", "4", "5", "6"};
		c7combo = new JComboBox(items7);
		c7combo.setBounds(540, 150, 200, 30);
		panel.add(c7combo);
		
		
		b3 = new JButton("Calculate");
		b3.setBounds(540,220,200,30);
		b3.addActionListener(this);
		panel.add(b3);
		
		
		
		String items1[] = new String []{"OBJECT ORIENTED PROGRAMMING 1 (JAVA", "OPERATING SYSTEM", "OPERATING SYSTEM", "***", "**", "***"};
		c1combo = new JComboBox(items1);
		c1combo.setBounds(50, 120, 200, 30);
		panel.add(c1combo);
		
		value_1 = new JTextField();
		value_1.setBounds(280,120,200,30);
		panel.add(value_1);
		
		
		String items2[] = new String []{"2.	ALGORITHMS", "COMPILER DESIGN", "COMPUTER GRAPHICS", "DATA STRUCTURE", "DATA STRUCTURE", "DISCRETE MATHEMATICS"};
		c2combo = new JComboBox(items2);
		c2combo.setBounds(50, 160, 200, 30);
		panel.add(c2combo);
		
		value_2 = new JTextField();
		value_2.setBounds(280,160,200,30);
		panel.add(value_2);
		
		
		String items3[] = new String []{"OPERATING SYSTEM", "EARCH METHODOLOGY", "SOFTWARE ENGINEERING", "WEB TECHNOLOGIES", "**", "***"};
		c3combo = new JComboBox(items3);
		c3combo.setBounds(50, 200, 200, 30);
		panel.add(c3combo);
		
		value_3 = new JTextField();
		value_3.setBounds(280,200,200,30);
		panel.add(value_3);

		
	    String items4[] = new String []{"OBJECT ORIENTED PROGRAMMING 2", "MALTIMEDIA SYSTEMS", "CSSE", "MOBILE APPLICATION DEVELOPMENT", "BASIC GRAPH THEORY", "**"};
		c4combo = new JComboBox(items4);
		c4combo.setBounds(50, 240, 200, 30);
		panel.add(c4combo);
		
		value_4 = new JTextField();
		value_4.setBounds(280,240,200,30);
		panel.add(value_4);
		
		String items5[] = new String []{"CS MATH", "BASIC GRAPH THEORY", "E-GOVERNANCE", "***", "SE", "***"};
		c5combo = new JComboBox(items5);
		c5combo.setBounds(50, 280, 200, 30);
		panel.add(c5combo);
		
		value_5 = new JTextField();
		value_5.setBounds(280,280,200,30);
		panel.add(value_5);
		
		
		
        String items6[] = new String []{"MALTIMEDIA SYSTEMS", "NET WORK SECURITY", "MODERN PHYSICS", "***", "**", "COE"};
		c6combo = new JComboBox(items6);
		c6combo.setBounds(50, 320, 200, 30);
		panel.add(c6combo);
		
		
		
		value_6 = new JTextField();
		value_6.setBounds(280,320,200,30);
		panel.add(value_6);
		
		
		c2label = new JLabel("");
		c2label.setBounds(540, 300, 120, 30);
		c2label.setOpaque(true);
		panel.add(c2label);
		
		
		backBtn = new JButton("Back");
		backBtn.setBounds(220, 368, 70, 30);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		
		nextBtn = new JButton("Next");
		nextBtn.setBounds(370, 368, 90, 30);
		nextBtn.addActionListener(this);
		panel.add(nextBtn);
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(540, 368, 80, 30);
		panel.add(exitBtn);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		this.add(panel);	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals(exitBtn.getText()))
		{
			System.exit(0);
		}
		
		else if(command.equals(b3.getText()))
		{
			
		//values[i] = Double.parseDouble(stringValues[i]);
		
		//String str1 = firstNum.getText();
     // double fn = Double.parseDouble(str1);
      //double sn = Double.parseDouble(secondNum.getText());
		
		
		
		int nam=0;
		
		double one=Double.parseDouble(nam + value_1.getText());
		double two=Double.parseDouble(nam + value_2.getText());
		double three=Double.parseDouble(nam + value_3.getText());
		double four=Double.parseDouble(nam + value_4.getText());
		double five=Double.parseDouble(nam + value_5.getText());
		double six=Double.parseDouble(nam + value_6.getText());
		int num1 = Integer.parseInt(c7combo.getSelectedItem().toString());
		
		
		
		double sum = ((one+two+three+four+five+six)/num1);
		         
				  c2label.setText("The Cgpa is = " +String.format("%.2f" , sum));
				  
		}
		
		
		else if(command.equals(nextBtn.getText()))
		{
        ThirdFrame sf = new ThirdFrame(this);
		sf.setVisible(true);
		this.setVisible(false);
        }	
		
		
		
		
		if(command.equals(backBtn.getText()))
		{
			//FirstFrame ff = new FirstFrame();
			ff.setVisible(true);
			this.setVisible(false);
		}
		else{}
	}
	
}