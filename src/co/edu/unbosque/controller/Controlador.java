package co.edu.unbosque.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import co.edu.unbosque.model.Gym;
import co.edu.unbosque.view.Consola;

public class Controlador {

	private Gym gimnasio;
	private Consola consola;

	public Controlador() {
		gimnasio = new Gym();
		consola = new Consola();
	}

	public void ejecutar() {

		int opcion;
		do {

			opcion = consola.mostrarMenu();
			switch (opcion) {
			case 1:
				registrarEntrenamiento();
				break;
			case 2:
				listarEntrenamientos();
				break;
			default:
				consola.mostrarMensaje("Opcion invalida, intente de nuevo: ");
				break;
			}
		} while (opcion != 3);

	}

	private void registrarEntrenamiento() {
		String dia = consola.pedirDia();
		String musculoEntrenado = consola.pedirMusculoEntrenado();
		int ejercicios = consola.pedirTotalEjercicios();
		LocalDateTime tiempo = LocalDateTime.now();
		
		try {
			gimnasio.registrarEntrenamiento(dia, musculoEntrenado, ejercicios, tiempo );
		} catch (IOException e) {
			consola.mostrarMensaje("Pasó un error, por favor intente de nuevo: " + e.getMessage());
		}
		
	}
	
	private void listarEntrenamientos() {
		consola.mostrarMensaje("Entrenamientos: " + gimnasio.getEntrenamientoRegistrado());
	}


}
