package co.edu.estudiofinanciero.domain;

import java.util.List;

/**
 *
 * @author Juan Luis Mendivelso Vargas, Sebastian Alejandro Galeano Diaz
 */

public interface personaService {

    List<persona> listar();

    persona listarId(int id);

    persona add(persona p);

    persona edit(persona p);

    persona delete(int id);
}
