package co.edu.estudiofinanciero.domain;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Juan Luis Mendivelso Vargas, Sebastian Alejandro Galeano Diaz
 */

public interface personaRepository extends Repository<persona, Integer> {

    List<persona> findAll();

    persona findById(int id);

    persona save(persona p);

    void delete(persona p);
}
