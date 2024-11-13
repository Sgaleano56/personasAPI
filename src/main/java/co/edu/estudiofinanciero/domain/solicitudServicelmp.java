package co.edu.estudiofinanciero.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Luis Mendivelso Vargas, Sebastian Alejandro Galeano Diaz
 */

@Service
public class solicitudServicelmp implements solicitudService {

    @Autowired
    private solicitudRepository s_repositorio;

    @Override
    public List<solicitud> listar() {
        return s_repositorio.findAll();
    }

    @Override
    public solicitud listarId(int id) {
        return s_repositorio.findById(id);
    }

    @Override
    public solicitud add(solicitud p) {
        return s_repositorio.save(p);
    }

    @Override
    public solicitud edit(solicitud p) {
        return s_repositorio.save(p);
    }

    @Override
    public solicitud delete(int id) {
        solicitud solicitud = s_repositorio.findById(id);
        if (solicitud != null) {
            s_repositorio.delete(solicitud);
        }
        return solicitud;
    }
}
