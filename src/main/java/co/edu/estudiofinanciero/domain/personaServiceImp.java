package co.edu.estudiofinanciero.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Luis Mendivelso Vargas, Sebastian Alejandro Galeano Diaz
 */

@Service
public class personaServiceImp implements personaService {

    @Autowired
    private personaRepository repositorio;

    @Override
    public List<persona> listar() {
        return repositorio.findAll();
    }

    @Override
    public persona listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public persona add(persona p) {
        return repositorio.save(p);
    }
    
    @Override
    public persona edit(persona p) {
        return repositorio.save(p);
    }
    
    @Override
    public persona delete(int id) {
        persona persona = repositorio.findById(id);
        if (persona != null) {
            repositorio.delete(persona);
        }
        return persona;
    }
}
