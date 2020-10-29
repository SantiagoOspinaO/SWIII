package co.com.swiii.registrotemperatura.controller;

import co.com.swiii.registrotemperatura.converter.HistoricoTemperaturaConverter;
import co.com.swiii.registrotemperatura.model.HistoricoTemperatura;
import co.com.swiii.registrotemperatura.service.historicotemperatura.HistoricoTemperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historicotemperatura")
public class HistoricoTemperaturaController {

    @Autowired
    HistoricoTemperaturaService historicoTemperaturaService;
    @Autowired
    HistoricoTemperaturaConverter historicoTemperaturaConverter;

    @PostMapping("/historicotemperatura")
    public void save(@RequestBody HistoricoTemperatura historicoTemperatura) {
        historicoTemperaturaService.save(historicoTemperatura);
    }

    @GetMapping("/{id}/historicotemperatura")
    public HistoricoTemperatura findByID(@PathVariable(value = "id", required = true) Long id) {
        return historicoTemperaturaService.findById(id);
    }

    @GetMapping("/historicotemperatura")
    public List<HistoricoTemperatura> findAll() {
        return historicoTemperaturaService.findAll();
    }

    @DeleteMapping("/{id}/empleado")
    public void deleteById(@PathVariable(value = "id", required = true) Long id) {
        historicoTemperaturaService.deleteById(id);
    }
}
