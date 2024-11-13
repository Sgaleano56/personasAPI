package co.edu.estudiofinanciero.infrastructure;

import co.edu.estudiofinanciero.domain.producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.estudiofinanciero.domain.productoService;

/**
 *
 * @author Juan Luis Mendivelso Vargas, Sebastian Alejandro Galeano Diaz
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/productorest"})
public class productoRest {

    @Autowired
    productoService pservice;

    // ProductoRest
    @GetMapping("/producto")
    public List<producto> listarP() {
        return pservice.listar();
    }

    @PostMapping("/producto/add")
    public producto agregarP(@RequestBody producto p) {
        return pservice.add(p);
    }

    @GetMapping("/producto/{id}")
    public producto listarIdP(@PathVariable("id") int id) {
        return pservice.listarId(id);
    }

    @PutMapping("/producto/{id}")
    public producto editarP(@RequestBody producto p, @PathVariable("id") int id) {
        p.setProducto_id(id);
        return pservice.edit(p);
    }

    @DeleteMapping("/producto/{id}")
    public producto deleteP(@PathVariable("id") int id) {
        return pservice.delete(id);
    }
}
