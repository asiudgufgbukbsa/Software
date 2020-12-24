package class17;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventDemo extends JFrame
{
	JLabel lbl = new JLabel("��������İ�ť");	
	public EventDemo()
	{
		setLayout(new BorderLayout());		
		add(lbl, BorderLayout.CENTER);
		JButton btn= new JButton("����Ұ�");		
		ActionListener listener = new ActionListernerDemo();
		btn.addActionListener(listener);	
		
		
		add(btn, BorderLayout.SOUTH);		
		
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventDemo();
	}
	
	class ActionListernerDemo implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{		
			lbl.setText("��ť�������");
		}	
	}	

}


