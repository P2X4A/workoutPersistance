package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {

	private Scanner consola;

	public Consola() {
		consola = new Scanner(System.in);
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	public int mostrarMenu() {
		System.out.println("""
				1. Registrar Entrenamiento
				2. Mostrar Entrenamientos
				3. Salir
				""");
		int opcion = consola.nextInt();
		consola.nextLine();
		return opcion;
	}

	public String pedirDia() {
	    System.out.print("Ingrese dia del entrenamiento: ");
	    String diaEntrenamiento = consola.nextLine();
	    return diaEntrenamiento;
	}

	public String pedirMusculoEntrenado() {
	    System.out.print("Ingrese el musculo entrenado: ");
	    return consola.nextLine().trim();
	}

	public int pedirTotalEjercicios() {
	    System.out.print("Ingrese el total de ejercicios hechos: ");
	    int ejercicios = consola.nextInt();
	    consola.nextLine(); // <-- consume el '\n' que queda en el buffer
	    return ejercicios;
	}
	
}
