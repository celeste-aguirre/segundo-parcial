package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;

import java.util.Map;


public class PolizaCombinadoFamiliar extends Poliza implements SegurosGenerales, SegurosDeVida {

private Vivienda casa;
private Persona beneficiario;
private Map<Persona, TipoDeBeneficiario> beneficiarios;

public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		super(numeroDePoliza, asegurado, sUMA_ASEGURADA, pRIMA);
		this.beneficiarios= new HashMap<Persona, TipoDeBeneficiario>();
	}

public void agregarBienAsegurado(Vivienda casa) {
	this.setCasa(casa);
}

@Override
public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario tipo) {
	beneficiarios.put(hijo, tipo);
	
}

@Override
public Integer obtenerCantidadDeBeneficiarios() {
	return beneficiarios.size();
}

public Vivienda getCasa() {
	return casa;
}
public void setCasa(Vivienda casa) {
	this.casa = casa;
}
public Persona getBeneficiario() {
	return beneficiario;
}
public void setBeneficiario(Persona beneficiario) {
	this.beneficiario = beneficiario;
}
@Override
public void agregarBienAsegurado(Auto auto) {
}


}
