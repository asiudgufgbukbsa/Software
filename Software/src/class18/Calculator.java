package class18;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame
{
	JTextField txt = new JTextField();
	public Calculator()
	{
		super("¼ÆËãÆ÷");
		setLayout(new BorderLayout());
		add(txt, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		String[] lbls = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/" , "=", "C"};
		for (String lbl : lbls)
		{
			JButton btn = new JButton(lbl);
			btn.addActionListener(new CalActionListen());
			panel.add(btn);
		}
		add(panel, BorderLayout.CENTER);		
		setLocationRelativeTo(null);
		setSize(400, 500);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new Calculator();
	}
	
	class CalActionListen implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			JButton btn = (JButton) e.getSource();			
			String expr = txt.getText();
			String lbl = btn.getText();
			if(lbl.equals("="))
			{
				
			}
			else if(lbl.equals("C"))
			{
				expr = "";
			}
			else {
				expr = expr + lbl;				
			}
			txt.setText(expr);
			
			
		}
		
	}

}
