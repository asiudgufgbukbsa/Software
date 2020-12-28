package class25;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class KeyDemo extends JFrame
{

	private JPanel contentPane;
	private JTextField txtID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					KeyDemo frame = new KeyDemo();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KeyDemo()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtID = new JTextField();
		txtID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char ch = e.getKeyChar();
				if( (ch > '9' || ch < '0') && ch != 'x' && ch != 'X' )
					e.consume();				
			}
		});
		
		txtID.setBounds(31, 48, 327, 21);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JButton btnCheck = new JButton("检验");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sID = txtID.getText();
				if(sID.trim().length() != 18)
				{
					JOptionPane.showMessageDialog(null, "长度不对啊。。", "身份证检验", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				int[] coes = {7,  9, 10,  5,  8,  4,  2,  1,  6,  3,  7,  9,  10,  5,  8,  4,  2};
				int sum = 0;
				char[] chars = sID.toCharArray();
				for (int i = 0; i < chars.length -1; i++)
				{
					int value = Integer.parseInt(chars[i] + "");
					sum += value * coes[i]; 
				}
				int remainder = sum % 11;
				String[] checking_codes = "1,0,X,9,8,7,6,5,4,3,2".split("[,]");
				if(checking_codes[remainder].equals(chars[17] + ""))
					JOptionPane.showMessageDialog(null, "检验通过");
				else {
					JOptionPane.showMessageDialog(null, "检验不通过");
				}
				

				
			}
		});
		btnCheck.setBounds(70, 116, 93, 23);
		contentPane.add(btnCheck);
		
		
	}
}
