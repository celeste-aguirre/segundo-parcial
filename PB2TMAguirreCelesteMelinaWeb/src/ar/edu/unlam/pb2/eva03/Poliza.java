package ar.edu.unlam.pb2.eva03;

public class Poliza {
	private Persona asegurado;
	private Double sUMA_ASEGURADA,pRIMA, premio; 
	private Integer numeroDePoliza;
	private Boolean fueRobado,tuvoAlgunAccidente;
	 
	
	public Poliza(Integer numeroDePoliza, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		this.asegurado = asegurado;
		this.sUMA_ASEGURADA = sUMA_ASEGURADA;
		this.pRIMA = pRIMA;
		this.numeroDePoliza = numeroDePoliza;
		this.premio=pRIMA*1.2;
		this.setFueRobado(false);
		setTuvoAlgunAccidente(false);
	}

	//GETTERS AND SETTERS
	public Persona getAsegurado() {
		return asegurado;
	}
	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}
	public Double getsUMA_ASEGURADA() {
		return sUMA_ASEGURADA;
	}
	public void setsUMA_ASEGURADA(Double sUMA_ASEGURADA) {
		this.sUMA_ASEGURADA = sUMA_ASEGURADA;
	}
	public Double getpRIMA() {
		return pRIMA;
	}
	public void setpRIMA(Double pRIMA) {
		this.pRIMA = pRIMA;
	}
	public Double getPremio() {
		return premio;
	}
	public void setPremio(Double premio) {
		this.premio = premio;
	}
	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}
	public void setNumeroDePoliza(Integer numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}
	public Boolean getFueRobado() {
		return fueRobado;
	}
	public void setFueRobado(Boolean fueRobado) {
		this.fueRobado = fueRobado;
	}
	public Boolean tuvoAlgunAccidente() {
		return tuvoAlgunAccidente;
	}
	public Boolean getTuvoAlgunAccidente() {
		return tuvoAlgunAccidente;
	}
	public void setTuvoAlgunAccidente(Boolean tuvoAlgunAccidente) {
		this.tuvoAlgunAccidente = tuvoAlgunAccidente;
	}
	
	
	//SOBRE-ESCRITURA
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDePoliza == null) ? 0 : numeroDePoliza.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Poliza other = (Poliza) obj;
		if (numeroDePoliza == null) {
			if (other.numeroDePoliza != null)
				return false;
		} else if (!numeroDePoliza.equals(other.numeroDePoliza))
			return false;
		return true;
	}


	
	
}
