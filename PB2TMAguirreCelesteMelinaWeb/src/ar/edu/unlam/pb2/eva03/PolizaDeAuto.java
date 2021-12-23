package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends Poliza implements SegurosGenerales{
	

	private Auto auto;
	
	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		super(numeroDePoliza, asegurado, sUMA_ASEGURADA, pRIMA);
	}

	public void agregarBienAsegurado(Auto auto) {
		this.setAuto(auto);
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	
	//SACAR
	@Override
	public void agregarBienAsegurado(Vivienda casa) {
	}


	

	
	

}