package co.edu.unbosque.model.persistence;

import java.io.IOException;

import co.edu.unbosque.model.Persona;

public class PersonaImplDAO implements IDAO<Persona> {

    @Override
    public void guardar(Persona persona) throws IOException {
        String nombreArchivo = "Entrenamiento.txt";
        String informacionArchivoPlano = persona.informacionArchivoPlano();

        FileHandler.guardarArchivoPlano(nombreArchivo, informacionArchivoPlano);
    }

    public void guardarBinario(Persona persona) throws IOException {
        String nombreArchivoBinario = "entrenamientoBinario.dat";
        FileHandler.guardarArchivoBinario(nombreArchivoBinario, persona);
    }
}
