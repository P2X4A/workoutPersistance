package co.edu.unbosque.model.persistence;

import java.io.IOException;

public interface IDAO <T> {

	void guardar(T persona) throws IOException;
}
