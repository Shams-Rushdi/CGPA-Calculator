import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstFrame extends JFrame implements ActionListener
{
	private JLabel userLabel, passLabel,l1Label, l2Label;
	private JTextField t1TF;
	private JPasswordField pasPF;
	private JButton nextBtn,exitBtn;
	private JPanel panel;

	public FirstFrame()
	{
		super("CGPA Calculator");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		userLabel = new JLabel("Welcome To Java Project");
		userLabel.setBounds(320, 80, 350, 30);
		panel.add(userLabel);
		
		
		passLabel = new JLabel("Please Enter your Username and Password");
		passLabel.setBounds(320, 130, 350, 30);
		panel.add(passLabel);
		
		
		
		
		
		l1Label = new JLabel("User ID : ");
		l1Label.setBounds(320, 200, 70, 30);
		panel.add(l1Label);
		
		
		t1TF = new JTextField();
		t1TF.setBounds(410,200,100,30);
		panel.add(t1TF);
		
		
		l2Label = new JLabel("Password : ");
		l2Label.setBounds(320, 250, 70, 30);
		panel.add(l2Label);
		
		
		pasPF = new JPasswordField();
		pasPF.setBounds(410, 250, 100, 30);
		panel.add(pasPF);
		
		
		
		
		
		
		
		nextBtn = new JButton("Login");
		nextBtn.setBounds(430, 330, 80, 30);
		panel.add(nextBtn);
		nextBtn.addActionListener(this);
		panel.add(nextBtn);
		
		
		
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(540, 330, 80, 30);
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
		
		else if(command.equals(nextBtn.getText()))
		{
				
		String puname = t1TF.getText();
        String ppaswd = pasPF.getText();
        if 
		(puname.equals("admin") && ppaswd.equals("admin")) 
		{
        SecondFrame sf = new SecondFrame(this);
		sf.setVisible(true);
		this.setVisible(false);
        } 
		else
		{

        JOptionPane.showMessageDialog(null,"Wrong Password / Username");
        t1TF.setText("");
        pasPF.setText("");
        t1TF.requestFocus();
        }
		}
		
		else{}
		
		
	}
	
	
}