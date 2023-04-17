package br.ufrn.imd;

public class ConversorMoeda {

	private static final double TAXA_CONVERSAO_USD_BRL = 5.20;
	private static final double TAXA_CONVERSAO_EUR_BRL = 6.15;

	public static double converterUSDBRL(double valor) throws IllegalArgumentException {

		if (valor < 0) {
			throw new IllegalArgumentException("O valor não pode ser negativo!");
		}

		return valor * TAXA_CONVERSAO_USD_BRL;
	}

	public static double converterEURBRL(double valor) throws IllegalArgumentException {
		if (valor < 0) {
			throw new IllegalArgumentException("O valor não pode ser negativo!");
		}
		return valor * TAXA_CONVERSAO_EUR_BRL;
	}

}
