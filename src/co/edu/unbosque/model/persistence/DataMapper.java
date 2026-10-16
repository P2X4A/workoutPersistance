package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.Persona;

public class DataMapper {

	public PersonaDTO toDTOFromEntity(Persona persona) {
		return new PersonaDTO(
				persona.getDiaEntrenado(),
				persona.getMusculosEntrenados(),
				persona.getTotalEjercicios(),
				persona.getFechaRegistro());
	}
	
	public Persona toEntityFromDTO(PersonaDTO personaDTO) {
		return new Persona(
				personaDTO.getDiaEntrenado(),
				personaDTO.getMusculosEntrenados(),
				personaDTO.getTotalEjercicios(),
				personaDTO.getFechaRegistro());
	}
}
