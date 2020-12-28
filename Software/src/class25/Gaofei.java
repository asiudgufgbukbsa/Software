package class25;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gaofei extends JFrame
{
	JLabel lblGaofei = new JLabel();
	int max_x, max_y;
	public Gaofei()
	{
		setLayout(null);
		lblGaofei.setBounds(0, 0, 200, 400);
		add(lblGaofei);	
		
		ImageIcon icon = new ImageIcon("resource/cartoon.png");		
		Image img = icon.getImage().getScaledInstance(lblGaofei.getWidth(), lblGaofei.getHeight(), java.awt.Image.SCALE_DEFAULT);
		icon.setImage(img);
		lblGaofei.setIcon(icon);
		
		
		lblGaofei.addMouseListener(new RunGaofei());
		lblGaofei.addMouseMotionListener(new RunGaofei());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(500, 600);
		max_x = this.getWidth() - lblGaofei.getWidth();
		max_y = this.getHeight() - lblGaofei.getHeight();
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new Gaofei();

	}

	class RunGaofei implements MouseListener, MouseMotionListener
	{

		@Override
		public void mouseClicked(MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e)
		{
			Random random = new Random();
			lblGaofei.setLocation(random.nextInt(max_x), random.nextInt(max_y));
			
		}

		@Override
		public void mouseExited(MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e)
		{
			Random random = new Random();
			lblGaofei.setLocation(random.nextInt(max_x), random.nextInt(max_y));
			
		}
		
	}
}
