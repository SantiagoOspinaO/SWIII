package co.com.swiii.registrotemperatura.service.historicotemperatura;

import co.com.swiii.registrotemperatura.model.Empleado;

import java.util.List;

public interface HistoricoTemperaturaService {

    void save(Empleado empleado);
    Empleado findById(Long id);
    List<Empleado> findAll();
    void deleteById(Long id);
}
