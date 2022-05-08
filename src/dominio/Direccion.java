package dominio;

public class Direccion {

	private String calle;
	private Integer numero;
	private Ciudad ciudad;

	public Direccion(String calle, Integer numero, Ciudad ciudad) {
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}

	public Direccion(String calle, Integer numero, String ciudad) {
		this.calle = calle;
		this.numero = numero;
		this.ciudad = new Ciudad();
	}

	public Direccion() {

	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}

}
