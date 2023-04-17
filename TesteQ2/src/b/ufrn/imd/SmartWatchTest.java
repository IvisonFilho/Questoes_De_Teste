package b.ufrn.imd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmartWatchTest {
	private SmartWatch sw;
	
	@Test
	public void testRiscoCalcRiscoOverTraining() throws ArgumentoInvalidoException {
		sw=new SmartWatch();
		assertEquals("ALTO RISCO", sw.calcRiscoOverTraining(101, 101));
	}
	
	@Test
	public void testSemRiscoCalcRiscoOverTraining() throws ArgumentoInvalidoException {
		sw = new SmartWatch();
		assertEquals("NAO_HA_RISCO", sw.calcRiscoOverTraining(100, 100));
	}
	//Testando exceção
	@Test(expected = Exception.class)
	public void testExcepCalcRiscoOverTraining() throws ArgumentoInvalidoException{
		sw = new SmartWatch();
		sw.calcRiscoOverTraining(-1, -2);
	}
	
	
}
