package br.ufrn.imd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FilmeTest {
	private Filme filme1;
	private Filme filme2;
	
	@Before
	public void setUp() throws FilmeNaoValido {
		filme1 = new Filme("Roberta - Explicando testes", 75,"Roberta Coelho" );
		filme2 = new Filme("Roberta - Explicando testes 2", 60,"Roberta Coelho");
	}
	
	@Test
	public void testgetFilmeMenorDuracao() throws FilmeNaoValido {
		assertEquals("60",filme1.getFilmeMenorDuracao(filme2));
	}
	
	@Test
	public void testIsMesmoDiretor() throws FilmeNaoValido {
		assertTrue(filme1.isMesmoDiretor(filme2));
	}
}
