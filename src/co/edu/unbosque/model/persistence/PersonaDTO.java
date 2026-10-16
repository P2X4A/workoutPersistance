package co.edu.unbosque.model.persistence;

import java.time.LocalDateTime;

public class PersonaDTO {

	private String diaEntrenado;
	private String musculosEntrenados;
	private int totalEjercicios;
	private LocalDateTime fechaRegistro;

	public PersonaDTO(String diaEntrenado, String musculosEntrenados, int totalEjercicios,
			LocalDateTime fechaRegistro) {
		this.diaEntrenado = diaEntrenado;
		this.musculosEntrenados = musculosEntrenados;
		this.totalEjercicios = totalEjercicios;
		this.fechaRegistro = fechaRegistro;
	}

	public String getDiaEntrenado() {
		return diaEntrenado;
	}

	public String getMusculosEntrenados() {
		return musculosEntrenados;
	}

	public int getTotalEjercicios() {
		return totalEjercicios;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

}
