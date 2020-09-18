package co.com.swiii.registrotemperatura.controller;

import co.com.swiii.registrotemperatura.converter.EmpleadoConverter;
import co.com.swiii.registrotemperatura.model.Empleado;
import co.com.swiii.registrotemperatura.service.empleado.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historicotemperatura")
public class HistoricoTemperaturaController {

    @Autowired
    EmpleadoService empleadoService;
    @Autowired
    EmpleadoConverter empleadoConverter;

    @PostMapping("/empleado")
    public void save(@RequestBody Empleado empleado){
        empleadoService.save(empleado);
    }

    @GetMapping("/{id}/empleado")
    public Empleado findByID(@PathVariable(value = "id", required = true) Long id){
        return empleadoService.findById(id);
    }

    @GetMapping("/empleado")
    public List<Empleado> findAll(){
        return empleadoService.findAll();
    }

    @DeleteMapping("/{id}/empleado")
    public void deleteById(@PathVariable(value = "id", required = true) Long id){
        empleadoService.deleteById(id);
    }
}
