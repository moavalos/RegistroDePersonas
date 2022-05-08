package dominio;

import dominio.Persona;

public class RegistrarPersona {

	private Persona[] padron;
	Integer CANTIDAD_MAXIMA = 200;
	Integer cantidadDePersonas;

	public RegistrarPersona() {
		this.padron = new Persona[CANTIDAD_MAXIMA];
		cantidadDePersonas = 0;
	}

	public void registrarPersona(Persona nueva) {
		padron[cantidadDePersonas++] = nueva;
	}

	public Persona[] listadoDePersonas(String provincia) {
		Persona resultado[] = new Persona[calcularCantidadDePersonas(provincia)];
		Integer cantidadDePersonasAgregadas = 0;
		for(int i=0; i<cantidadDePersonas; i++) {
			if(padron[i].getCiudad().getNombre().equals(provincia)) {
				resultado[cantidadDePersonasAgregadas++] = padron[i];
			}
		}
		return resultado;
	}
	
	public Integer calcularCantidadDePersonas(String provincia) {
		Integer calcularCantidad = 0;
		for(int i=0; i<cantidadDePersonas; i++) {
			if(padron[i].getCiudad().getNombre().equals(provincia)) {
				calcularCantidad++;
			}
		}
		return calcularCantidad;
	}

}
