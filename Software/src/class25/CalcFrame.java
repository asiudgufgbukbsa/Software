package class25;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcFrame extends JFrame
{
	JTextField txtExpr = new JTextField();

	public CalcFrame()
	{
		String[] lbls =
		{ "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "=", "C" };
		setLayout(new BorderLayout());
		add(txtExpr, BorderLayout.NORTH);
		JPanel panel = new JPanel(new GridLayout(4, 4));
		txtExpr.setEditable(false);
		txtExpr.setHorizontalAlignment(JTextField.RIGHT);
		add(panel, BorderLayout.CENTER);
		for (String lbl : lbls)
		{
			JButton btn = new JButton(lbl);
			btn.addActionListener(new CalActionListener());
			panel.add(btn);
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 200);
		setVisible(true);
	}

	class CalActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JButton btn = (JButton) e.getSource();
			String expr = txtExpr.getText();
			switch (btn.getText())
			{
			case "C":
			{
				txtExpr.setText("");
				break;
			}
			case "=":
			{				
				String reg = "[/+-/*//]";
				Pattern pattern = Pattern.compile(reg);
				Matcher matcher = pattern.matcher(expr);
				if (matcher.find())
				{
					String op = expr.substring(matcher.start(), matcher.end());
					int num1 = Integer.parseInt(expr.substring(0, matcher.start()));
					int num2 = Integer.parseInt(expr.substring(matcher.end()));
					int result = 0;
					switch (op)
					{
					case "+":
					{
						result = num1 + num2;
						break;
					}
					case "-":
					{
						result = num1 - num2;
						break;
					}
					case "*":
					{
						result = num1 * num2;
						break;
					}
					case "/":
					{
						result = num1 / num2;
						break;
					}

					}
				txtExpr.setText("" + result);
				}
				break;
			}
			default:
				expr = expr + btn.getText();
				txtExpr.setText(expr);
			}
		}
	}

	public static void main(String[] args)
	{
		new CalcFrame();

	}

}
