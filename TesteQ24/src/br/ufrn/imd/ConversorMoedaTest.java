package br.ufrn.imd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ConversorMoedaTest {
	private ConversorMoeda cm;
	
	@Before
	public void setUp() {
		cm = new ConversorMoeda();
	}
	
	@Test
	public void testConverterUSDBRL() throws IllegalArgumentException {
		assertEquals(0,cm.converterUSDBRL(0),0.01);
	}
	
	@Test
	public void testConverterEURBRL() throws IllegalArgumentException {
		assertEquals(0,cm.converterEURBRL(0),0.01);
	}
	
	@Test(expected = Exception.class)
	public void testConverterNegativoUSDBRL() throws IllegalArgumentException {
		cm.converterUSDBRL(0);
	}
	
	@Test(expected = Exception.class)
	public void testConverterNegativoEURBRL() throws IllegalArgumentException {
		cm.converterEURBRL(0);
	}
	
	
	
	
}
