package co.edu.estudiofinanciero.infrastructure;

import co.edu.estudiofinanciero.domain.solicitud;
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
import co.edu.estudiofinanciero.domain.solicitudService;

/**
 *
 * @author Juan Luis Mendivelso Vargas, Sebastian Alejandro Galeano Diaz
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/solicitudrest"})
public class solicitudRest {

    @Autowired
    solicitudService sservice;

    // SolicitudRest
    @GetMapping("/solicitud")
    public List<solicitud> listarS() {
        return sservice.listar();
    }

    @PostMapping("/solicitud/add")
    public solicitud agregarS(@RequestBody solicitud p) {
        return sservice.add(p);
    }

    @GetMapping("/solicitud/{id}")
    public solicitud listarIdS(@PathVariable("id") int id) {
        return sservice.listarId(id);
    }

    @PutMapping("/solicitud/{id}")
    public solicitud editarS(@RequestBody solicitud p, @PathVariable("id") int id) {
        p.setSolicitud_id(id);
        return sservice.edit(p);
    }

    @DeleteMapping("/solicitud/{id}")
    public solicitud deleteS(@PathVariable("id") int id) {
        return sservice.delete(id);
    }
}
