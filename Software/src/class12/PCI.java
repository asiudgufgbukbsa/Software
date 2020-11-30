package class12;

public interface PCI
{
	public void start();
	public void stop();
	String type = "adffa";
	public static final String type2 = "asdf";
}

interface PCI2
{
	
}


abstract class AbstractPCIClass
{
	public abstract void start();
	public abstract void stop();
	public void test()
	{
		System.out.println("****");
		
	}
}

class Temp implements PCI, PCI2
{

	@Override
	public void start()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop()
	{
		// TODO Auto-generated method stub
		
	}
	
}