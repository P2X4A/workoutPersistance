package co.edu.unbosque.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Persona implements Serializable{

	private String diaEntrenado;
	private String musculosEntrenados;
	private int totalEjercicios;
	private LocalDateTime fechaRegistro;
	private static final long serialVersionUID = 1L;

	public Persona(String diaEntrenado, String musculosEntrenados, int totalEjercicios, LocalDateTime fechaRegistro) {
		this.diaEntrenado = diaEntrenado;
		this.musculosEntrenados = musculosEntrenados;
		this.totalEjercicios = totalEjercicios;
		this.fechaRegistro = fechaRegistro;
	}

	public String getDiaEntrenado() {
		return diaEntrenado;
	}

	public void setDiaEntrenado(String diaEntrenado) {
		this.diaEntrenado = diaEntrenado;
	}

	public String getMusculosEntrenados() {
		return musculosEntrenados;
	}

	public void setMusculosEntrenados(String musculosEntrenados) {
		this.musculosEntrenados = musculosEntrenados;
	}

	public int getTotalEjercicios() {
		return totalEjercicios;
	}

	public void setTotalEjercicios(int totalEjercicios) {
		this.totalEjercicios = totalEjercicios;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String informacionArchivoPlano() {
		return "Dia Entrenado: " + diaEntrenado + "_" + "Musculos Trabajados: " + musculosEntrenados + "-" + "Total De Ejercicios: " + totalEjercicios + "-" + "Fecha Registro: " + fechaRegistro;
	}

}
