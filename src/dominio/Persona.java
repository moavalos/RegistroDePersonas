package dominio;

public class Persona {
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private Persona persona;
	private Ciudad ciudad;
	private Provincia provincia;

	// COMPOSISION. realmente no lo usaria aca, es mas provincia si o si tiene una ciudad y viceversa. persona tambien pero agregacion me parece lo mejor
//	public Persona(String nombre, String apellido, Direccion direccion) {
//		this.nombre = nombre;
//		this.apellido = apellido;
//		this.direccion = direccion;
//	}
//
	public Persona(String nombre, String apellido, String direccion, String ciudad, String provincia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = new Direccion();
		this.ciudad = new Ciudad();
		this.provincia = new Provincia();
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", persona="
				+ persona + "]";
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

}
