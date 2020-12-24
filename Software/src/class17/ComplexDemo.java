package class17;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComplexDemo extends JFrame
{
	public ComplexDemo()
	{
		super("²¦ºÅÆ÷");
		setLayout(new BorderLayout());
		JTextField txt = new JTextField();
		add(txt, BorderLayout.NORTH);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 3));
		add(panel, BorderLayout.CENTER);
		String[] lbls = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#", "²¦ºÅ","¹Ò¶Ï", "<-"};
		for (String lbl : lbls)
		{
			JButton btn = new JButton(lbl);
			panel.add(btn);
		}
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	public static void main(String[] args)
	{
		new ComplexDemo();

	}

}
