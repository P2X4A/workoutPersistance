package co.edu.unbosque.model.persistence;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

import co.edu.unbosque.model.Persona;

public class FileHandler {

	public static void guardarArchivoPlano(String nombreArchivo, String informacionArchivoPlano) throws IOException{ 
		File archivo = new File(nombreArchivo); 
		FileWriter archivoEscritor = new FileWriter(archivo); 
		BufferedWriter archivoEnMemoria = new BufferedWriter(archivoEscritor); 
		archivoEnMemoria.write(informacionArchivoPlano); 
		archivoEnMemoria.newLine(); 
		archivoEnMemoria.close(); 
		archivoEscritor.close(); }
	
	public static void guardarArchivoBinario(String nombreArchivoBinario, Persona persona) throws IOException{
		try (FileOutputStream crearArchivoBinario = new FileOutputStream(nombreArchivoBinario);
			 BufferedOutputStream salidaBinarioMemoria = new BufferedOutputStream(crearArchivoBinario);
			 ObjectOutputStream salidaArchivoBinario = new ObjectOutputStream(salidaBinarioMemoria)) {
			
			salidaArchivoBinario.writeObject(persona);
			salidaArchivoBinario.flush();
		}
	}
}
