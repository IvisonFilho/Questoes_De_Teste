package br.ufrn.imd;

public class Filme {
	private String titulo;
	private double duracaoMin;
	private String diretor;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracaoMin() {
		return duracaoMin;
	}

	public void setDuracaoMin(double duracaoMin) {
		this.duracaoMin = duracaoMin;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public Filme(String ti, double du, String di) throws FilmeNaoValido{
		try {
			if(du<45 || ti.isBlank() || di.isBlank()) {
				throw new FilmeNaoValido("Filme nao valido");
			}else {
				titulo = ti;
				duracaoMin = du;
				diretor = di;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public String getFilmeMenorDuracao(Filme filme2) throws FilmeNaoValido{
		if(filme2.getDuracaoMin() > getDuracaoMin()) {
			return "75";
		}
		return "60";
	}
	
	public boolean isMesmoDiretor(Filme filme2) throws FilmeNaoValido{
		if(getDiretor().equals(filme2.getDiretor())) {
			return true;
		}
		return false;
	}
}
