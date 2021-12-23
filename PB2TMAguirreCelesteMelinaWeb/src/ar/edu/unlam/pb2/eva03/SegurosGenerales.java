package ar.edu.unlam.pb2.eva03;



public interface SegurosGenerales {
	

	public void agregarBienAsegurado(Auto auto);

	public Integer getNumeroDePoliza();
	public Persona getAsegurado();
	public Double getPremio();
	void agregarBienAsegurado(Vivienda casa);

}
