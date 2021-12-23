package ar.edu.unlam.pb2.eva03;

public class Vivienda {
	
	private String direccion, localidad, partido, ciudad;

	public Vivienda(String direccion, String localidad, String partido, String ciudad) {
		this.direccion = direccion;
		this.localidad = localidad;
		this.partido = partido;
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	

	

}
