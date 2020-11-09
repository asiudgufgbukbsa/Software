package class11;

public class InstrumentTest
{
	
	void testPlay(Instrument instrument)
	{
		instrument.play();
	}
	
	public static void main(String[] args)
	{
		InstrumentTest instrumentTest = new InstrumentTest();
		Violin violin = new Violin();
		Piano piano = new Piano();
		instrumentTest.testPlay(piano);
		instrumentTest.testPlay(violin);
		
	}
}
