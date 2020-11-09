package class12;

public class SoundCard implements PCI
{

	@Override
	public void start()
	{
		System.out.println("Dududu ");
		
	}

	@Override
	public void stop()
	{
		System.out.println("Stop noising");
		
	}

}
