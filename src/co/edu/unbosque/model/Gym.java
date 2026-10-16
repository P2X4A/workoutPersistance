package co.edu.unbosque.model;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.PersonaImplDAO;

public class Gym {

	private ArrayList<Persona> entrenamientoRegistrado = new ArrayList<>();
	private PersonaImplDAO personaDAO = new PersonaImplDAO();

	public void registrarEntrenamiento(String diaEntrenado, String musculosEntrenados, int totalEjercicios, LocalDateTime fechaRegistro) throws IOException {

		Persona persona = new Persona(diaEntrenado, musculosEntrenados, totalEjercicios, fechaRegistro);
		//Guardar en arrayList
		entrenamientoRegistrado.add(persona);
		//Guardar en el DAO
		personaDAO.guardar(persona);
		personaDAO.guardarBinario(persona);
	}
	
	

	public ArrayList<Persona> getEntrenamientoRegistrado() {
		return entrenamientoRegistrado;
	}
}
