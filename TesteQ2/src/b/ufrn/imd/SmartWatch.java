package b.ufrn.imd;

public class SmartWatch {
	
	public String calcRiscoOverTraining(int bpm, double distancia)throws ArgumentoInvalidoException{
		try {
			if(bpm <0 || distancia<0) {
				throw new ArgumentoInvalidoException("Argumento inválido : Valor negativo");
			}
			if(bpm>100 && distancia>10) {
				return "ALTO RISCO";
			}
			
		} catch (ArgumentoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		return "NAO_HA_RISCO";
	}
	
}
