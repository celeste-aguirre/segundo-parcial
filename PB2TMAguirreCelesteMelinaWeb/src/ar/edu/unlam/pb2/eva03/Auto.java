package ar.edu.unlam.pb2.eva03;

public class Auto {

	private String marca, modelo;
	private Integer anio;
	private Double SUMA_ASEGURADA;

	public Auto(String marca, String modelo, Integer anio, Double sUMA_ASEGURADA) {
		this.marca=marca;
		this.modelo=modelo;
		this.anio=anio;
		this.SUMA_ASEGURADA=sUMA_ASEGURADA;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public Double getSUMA_ASEGURADA() {
		return SUMA_ASEGURADA;
	}
	public void setSUMA_ASEGURADA(Double sUMA_ASEGURADA) {
		SUMA_ASEGURADA = sUMA_ASEGURADA;
	}

}
