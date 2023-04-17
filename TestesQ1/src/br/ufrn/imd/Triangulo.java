package br.ufrn.imd;

public class Triangulo {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double lado1,double lado2,double lado3) {
		try {
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
			
			if(lado1 == 0) {
				throw new NaoTrianguloException("Triângulo Inválido");
			}else if(lado2 == 0) {
				throw new NaoTrianguloException("Triângulo Inválido");
			}else if(lado3 == 0) {
				throw new NaoTrianguloException("Triângulo Inválido");
			}
		} catch (NaoTrianguloException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public boolean itsIsosceles() {
		if(lado1==lado2 || lado2==lado3 || lado3==lado1) {
			return true;
		}
		return false;
	}
	
	public boolean itsEscaleno() {
		if(lado1!=lado2 && lado2!=lado3) {
			return true;
		}
		return false;
	}
	
	public boolean itsEquilatero() {
		if(lado1 == lado2 && lado2==lado3) {
			return true;
		}
		return false;
	}
}
