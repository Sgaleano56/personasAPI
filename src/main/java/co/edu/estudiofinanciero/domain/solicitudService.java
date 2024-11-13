package co.edu.estudiofinanciero.domain;

import java.util.List;

/**
 *
 * @author Juan Luis Mendivelso Vargas, Sebastian Alejandro Galeano Diaz
 */

public interface solicitudService {

    List<solicitud> listar();

    solicitud listarId(int id);

    solicitud add(solicitud p);

    solicitud edit(solicitud p);

    solicitud delete(int id);
}
