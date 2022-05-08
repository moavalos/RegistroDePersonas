package dominio;

public class Persona {
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private Persona persona;
	private Ciudad ciudad;
	private Integer cp;
	private String calle;
	private Integer numero;
	private Provincia provincia;
	private String nombreCiudad;
	private String nombreProvincia;

	// AGREGACION
//	public Persona(String nombre, String apellido, Direccion direccion) {
//		this.nombre = nombre;
//		this.apellido = apellido;
//		this.direccion = direccion;
//	}
//
	public Persona(String nombre, String apellido, Direccion direccion, Ciudad ciudad, Provincia provincia ) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = new Direccion(this.calle, this.numero, ciudad);
		this.ciudad = new Ciudad(this.cp, this.nombreCiudad, provincia);
		this.provincia = new Provincia(this.nombreProvincia);
		
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
