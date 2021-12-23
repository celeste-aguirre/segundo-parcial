package ar.edu.unlam.pb2.eva03;

public interface SegurosDeVida  {

	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario tipo);

	public Integer obtenerCantidadDeBeneficiarios();
	public Persona getAsegurado();
	public Double getPremio();
	void agregarBienAsegurado(Vivienda casa);

	

	
}
