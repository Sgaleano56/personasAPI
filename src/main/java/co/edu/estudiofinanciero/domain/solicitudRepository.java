package co.edu.estudiofinanciero.domain;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Juan Luis Mendivelso Vargas, Sebastian Alejandro Galeano Diaz
 */

public interface solicitudRepository extends Repository<solicitud, Integer>{

    List<solicitud> findAll();

    solicitud findById(int id);

    solicitud save(solicitud p);

    void delete(solicitud p);
}
