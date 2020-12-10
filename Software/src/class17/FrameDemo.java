package class17;

import javax.swing.JFrame;

public class FrameDemo extends JFrame
{
	public FrameDemo()
	{
		setSize(500, 400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new FrameDemo();

	}

}
