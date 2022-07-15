import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.math.BigDecimal;

public class ThirdFrame extends JFrame implements ActionListener
{
	private JLabel c1Label,c2label,c3Label;
	private JButton b1, b2, b3, backBtn,exitBtn;
	private JTextField userTF , value_1 , value_2 , value_3, value_4 , value_5 , value_6, value_7, value_8, value_9,value_10,value_11,value_12;
	//private JPasswordField passPF;
	private JComboBox c1combo,c2combo,c3combo,c4combo,c5combo,c6combo,c7combo,c8combo,c9combo,c10combo,c11combo,c12combo,c13combo,c14combo;
	private JPanel panel;
	private SecondFrame ff;
	
	public ThirdFrame(SecondFrame ff)
	{
		super("CGPA Calculator");
		this.setSize(1200, 650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.ff = ff;
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		c1Label = new JLabel("Total CGPA");
		c1Label.setBounds(50, 30, 1100, 30);
		c1Label.setBackground(Color.CYAN);
		c1Label.setOpaque(true);
		panel.add(c1Label);
		
		c3Label = new JLabel("How Many Semester");
		c3Label.setBounds(540,120,200,30);
		c3Label.setOpaque(true);
		panel.add(c3Label);
		
		
		
		String items7[] = new String []{"1", "2", "3", "4", "5", "6","7", "8", "9", "10", "11", "12"};
		c7combo = new JComboBox(items7);
		c7combo.setBounds(540, 150, 200, 30);
		panel.add(c7combo);
		
		
		b3 = new JButton("Calculate");
		b3.setBounds(540,220,200,30);
		b3.addActionListener(this);
		panel.add(b3);
		
		
		
		String items14[] = new String []{"Semester-1"};
		c14combo = new JComboBox(items14);
		c14combo.setBounds(50, 80, 200, 30);
		panel.add(c14combo);
		
		value_12 = new JTextField();
		value_12.setBounds(280,80,200,30);
		panel.add(value_12);
		
		
		
		String items1[] = new String []{"Semester-2"};
		c1combo = new JComboBox(items1);
		c1combo.setBounds(50, 120, 200, 30);
		panel.add(c1combo);
		
		value_1 = new JTextField();
		value_1.setBounds(280,120,200,30);
		panel.add(value_1);
		
		
		String items2[] = new String []{"Semester-3"};
		c2combo = new JComboBox(items2);
		c2combo.setBounds(50, 160, 200, 30);
		panel.add(c2combo);
		
		value_2 = new JTextField();
		value_2.setBounds(280,160,200,30);
		panel.add(value_2);
		
		
		String items3[] = new String []{"Semester-4"};
		c3combo = new JComboBox(items3);
		c3combo.setBounds(50, 200, 200, 30);
		panel.add(c3combo);
		
		value_3 = new JTextField();
		value_3.setBounds(280,200,200,30);
		panel.add(value_3);

		
	    String items4[] = new String []{"Semester-5"};
		c4combo = new JComboBox(items4);
		c4combo.setBounds(50, 240, 200, 30);
		panel.add(c4combo);
		
		value_4 = new JTextField();
		value_4.setBounds(280,240,200,30);
		panel.add(value_4);
		
		String items5[] = new String []{"Semester-6"};
		c5combo = new JComboBox(items5);
		c5combo.setBounds(50, 280, 200, 30);
		panel.add(c5combo);
		
		value_5 = new JTextField();
		value_5.setBounds(280,280,200,30);
		panel.add(value_5);
		
		
		
        String items6[] = new String []{"Semester-7"};
		c6combo = new JComboBox(items6);
		c6combo.setBounds(50, 320, 200, 30);
		panel.add(c6combo);
		
		
		value_6 = new JTextField();
		value_6.setBounds(280,320,200,30);
		panel.add(value_6);
		
		
		String items9[] = new String []{"Semester-8"};
		c9combo = new JComboBox(items9);
		c9combo.setBounds(50, 360, 200, 30);
		panel.add(c9combo);
		
		
		value_7 = new JTextField();
		value_7.setBounds(280,360,200,30);
		panel.add(value_7);
		
		
		
		String items10[] = new String []{"Semester-9"};
		c10combo = new JComboBox(items10);
		c10combo.setBounds(50, 400, 200, 30);
		panel.add(c10combo);
		
		value_8 = new JTextField();
		value_8.setBounds(280,400,200,30);
		panel.add(value_8);
		
		
		
		
		String items11[] = new String []{"Semester-10"};
		c11combo = new JComboBox(items11);
		c11combo.setBounds(50, 440, 200, 30);
		panel.add(c11combo);
		
		value_9 = new JTextField();
		value_9.setBounds(280,440,200,30);
		panel.add(value_9);
		
		
		
		String items12[] = new String []{"Semester-11"};
		c12combo = new JComboBox(items12);
		c12combo.setBounds(50, 480, 200, 30);
		panel.add(c12combo);
		
		value_10 = new JTextField();
		value_10.setBounds(280,480,200,30);
		panel.add(value_10);
		
		
		
		String items13[] = new String []{"Semester-12"};
		c13combo = new JComboBox(items13);
		c13combo.setBounds(50, 520, 200, 30);
		panel.add(c13combo);
		
		value_11 = new JTextField();
		value_11.setBounds(280,520,200,30);
		panel.add(value_11);
		
		
		
		
		
		
		c2label = new JLabel("");
		c2label.setBounds(540, 300, 120, 30);
		c2label.setOpaque(true);
		panel.add(c2label);
		
		
		backBtn = new JButton("Back");
		backBtn.setBounds(220, 568, 70, 30);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(540, 568, 80, 30);
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
		
		double seven=Double.parseDouble(nam + value_7.getText());
		double eight=Double.parseDouble(nam + value_8.getText());
		double nine=Double.parseDouble(nam + value_9.getText());
		double ten=Double.parseDouble(nam + value_10.getText());
		double eleven=Double.parseDouble(nam + value_11.getText());
		double twelve=Double.parseDouble(nam + value_12.getText());
		int num1 = Integer.parseInt(c7combo.getSelectedItem().toString());
		
		
		
		double sum = ((one+two+three+four+five+six+seven+eight+nine+ten+eleven+twelve)/num1);
		         
				  c2label.setText("The Cgpa is = " +String.format("%.2f" , sum));
				  
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