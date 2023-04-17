package br.ufrn.imd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TrianguloTest {
	private Triangulo triangulo;
	
	@Test
	public void testeItsIsosceles() {
		triangulo = new Triangulo(14, 14, 15);
		assertTrue(triangulo.itsIsosceles());
	}
	@Test
	public void testeItsEscaleno() {
		triangulo = new Triangulo(11,12,14);
		assertTrue(triangulo.itsEscaleno());
	}
	@Test
	public void testeItsEquilatero() {
		triangulo = new Triangulo(15, 15, 15);
		assertTrue(triangulo.itsEquilatero());
	}

	//Testar exceções
	@Test(expected = Exception.class)
	public void testeConstrutor() throws NaoTrianguloException{
		triangulo = new Triangulo(0, 15, 14);	
	}
	
}
