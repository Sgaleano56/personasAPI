package co.edu.estudiofinanciero.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Luis Mendivelso Vargas, Sebastian Alejandro Galeano Diaz
 */

@Service
public class productoServicelmp implements productoService{

    @Autowired
    private productoRepository p_repositorio;

    @Override
    public List<producto> listar() {
        return p_repositorio.findAll();
    }

    @Override
    public producto listarId(int id) {
        return p_repositorio.findById(id);
    }

    @Override
    public producto add(producto p) {
        return p_repositorio.save(p);
    }

    @Override
    public producto edit(producto p) {
        return p_repositorio.save(p);
    }
    
    @Override
    public producto delete(int id) {
        producto producto = p_repositorio.findById(id);
        if (producto != null) {
            p_repositorio.delete(producto);
        }
        return producto;
    }
}
