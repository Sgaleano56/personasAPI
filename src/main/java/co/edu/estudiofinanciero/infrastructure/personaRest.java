package co.edu.estudiofinanciero.infrastructure;

import co.edu.estudiofinanciero.domain.persona;
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
import co.edu.estudiofinanciero.domain.personaService;

/**
 *
 * @author Juan Luis Mendivelso Vargas, Sebastian Alejandro Galeano Diaz
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/personasrest"})
public class personaRest {

    @Autowired
    personaService service;
    
    // Persona
    @GetMapping("/persona")
    public List<persona> listar() {
        return service.listar();
    }

    @PostMapping("/persona/add")
    public persona agregar(@RequestBody persona p) {
        return service.add(p);
    }

    @GetMapping("/persona/{id}")
    public persona listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping("/persona/{id}")
    public persona editar(@RequestBody persona p, @PathVariable("id") int id) {
        p.setPersona_id(id);
        return service.edit(p);
    }
    
    @DeleteMapping("/persona/{id}")
    public persona delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
}
