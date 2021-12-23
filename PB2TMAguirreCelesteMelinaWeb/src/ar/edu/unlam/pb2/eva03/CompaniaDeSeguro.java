package ar.edu.unlam.pb2.eva03;


import java.util.HashSet;
import java.util.Set;

public class CompaniaDeSeguro {
	
	private Set<Poliza> polizas; 
	private String nombre;
	

	public CompaniaDeSeguro(String nombre) {
		this.setNombre(nombre);
		this.polizas=new HashSet<Poliza>();
	}

	public void agregarPoliza(PolizaCombinadoFamiliar polizaCombinadoFamiliar) {
		polizas.add(polizaCombinadoFamiliar);
	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		return polizas.size();
	}
	
	public void agregarPoliza(PolizaDeAuto polizaDeAuto) {
		polizas.add(polizaDeAuto);
	}

	public void agregarPoliza(PolizaAccidentesPersonales polizaAccidentesPersonales) {
		polizas.add(polizaAccidentesPersonales);
		
	}

	public void denunciarSiniestro(Integer i) {
		for (Poliza poliza : polizas) {
			if (poliza.getNumeroDePoliza().equals(i)) {
				poliza.setFueRobado(true);
				poliza.setTuvoAlgunAccidente(true);
			}
		}
	}

	public Poliza getPoliza(Integer numero) {
		Poliza aux=null;
		for (Poliza poliza : polizas) {
			if (poliza.getNumeroDePoliza().equals(numero)) {
				aux=poliza;
			}
		}
		return aux;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
