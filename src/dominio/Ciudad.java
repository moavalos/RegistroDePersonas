package dominio;

public class Ciudad {
	private Integer codigoPostal;
	private String nombre;
	private Provincia provincia;

	// composicion
	// conviene mas en este caso
	public Ciudad(Integer codigoPostal, String nombre, String provincia) {
		this.codigoPostal = codigoPostal;
		this.nombre = nombre;
		this.provincia = new Provincia();
	}

	public Ciudad(Integer codigoPostal, String nombre, Provincia provincia) {
		this.codigoPostal = codigoPostal;
		this.nombre = nombre;
		this.provincia = provincia;
	}

	public Ciudad() {

	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public String toString() {
		return "Ciudad [codigoPostal=" + codigoPostal + ", nombre=" + nombre + ", provincia=" + provincia + "]";
	}

}
