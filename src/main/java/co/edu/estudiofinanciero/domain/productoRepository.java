package co.edu.estudiofinanciero.domain;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Juan Luis Mendivelso Vargas, Sebastian Alejandro Galeano Diaz
 */

public interface productoRepository extends Repository<producto, Integer> {

    List<producto> findAll();

    producto findById(int id);

    producto save(producto p);

    void delete(producto p);
}
