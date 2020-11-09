package class12;

public class PCITest
{

	public static void main(String[] args)
	{
		PCI soundcard = new SoundCard();
		PCI network = new NetworkCard();
		soundcard.start();
		soundcard.stop();
		network.start();
		network.stop();

	}

}
