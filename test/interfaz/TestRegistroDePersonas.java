package interfaz;

import dominio.Ciudad;
import dominio.Direccion;
import dominio.Persona;
import dominio.Provincia;
import dominio.RegistrarPersona;

public class TestRegistroDePersonas {

	public static void main(String[] args) {
		RegistrarPersona registroDePersonas = new RegistrarPersona();

		Provincia provincia = new Provincia("Cordoba");
		Ciudad ciudad = new Ciudad(1718, "Merlo", provincia);
		Direccion direccion = new Direccion("iturri", 912, ciudad);
		Persona marta = new Persona("marta", "perez", direccion, ciudad, provincia);

		registroDePersonas.registrarPersona(marta);

		Persona[] listado = registroDePersonas.listadoDePersonas("Cordoba");
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] != null) {
				System.out.println(listado[i].toString());
			} else {
				System.out.println("ERROR");
			}
		}

	}
}
