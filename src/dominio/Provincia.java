package dominio;

public class Provincia {
	private String nombre;

	public Provincia(String nombre) {
		this.nombre = nombre;
	}

	public Provincia() {

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + "]";
	}

}
