package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida{
	
	
	private Persona persona;
	private TipoDeBeneficiario tipoDeBenificiario;
	private Map<Persona, TipoDeBeneficiario> beneficiarios;
	

	public PolizaAccidentesPersonales(Integer numeroDePoliza, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		super(numeroDePoliza, asegurado, sUMA_ASEGURADA, pRIMA);
		this.beneficiarios= new HashMap<Persona, TipoDeBeneficiario>();
	}

	public void agregarBeneficiario(Persona beficiario, TipoDeBeneficiario tipo){
		beneficiarios.put(beficiario, tipo);
	}
	
	public Integer obtenerCantidadDeBeneficiarios() {
		return beneficiarios.size();
	}
	
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public void agregarBienAsegurado(Vivienda casa) {
	}

	public TipoDeBeneficiario getTipoDeBenificiario() {
		return tipoDeBenificiario;
	}

	public void setTipoDeBenificiario(TipoDeBeneficiario tipoDeBenificiario) {
		this.tipoDeBenificiario = tipoDeBenificiario;
	}

	

	


		
	

	
	
	
}
