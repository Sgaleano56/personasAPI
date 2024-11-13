package co.edu.estudiofinanciero.domain;

import java.util.List;

/**
 *
 * @author Juan Luis Mendivelso Vargas, Sebastian Alejandro Galeano Diaz
 */

public interface productoService {

    List<producto> listar();

    producto listarId(int id);

    producto add(producto p);

    producto edit(producto p);

    producto delete(int id);
}
