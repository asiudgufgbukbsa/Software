package class17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FrameDemo extends JFrame
{
	public FrameDemo()
	{
		setSize(500, 400);

		setLayout(new GridLayout(3, 3));

		Container container = getContentPane();
		Color color = new Color(255, 20, 20);
		container.setBackground(color);

		for (int i = 0; i < 9; i++)
		{
			JButton btn = new JButton("" + i);
			add(btn);
		}

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	void changeColor()
	{
		for (int i = 0; i <= 255; i++)
			for (int j = 0; j <= 255; j++)
			{
				getContentPane().setBackground(new Color(i, 255, j));
				try
				{
					Thread.sleep(50);
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

	public static void main(String[] args)
	{
		FrameDemo demo = new FrameDemo();
		demo.changeColor();

	}

}
