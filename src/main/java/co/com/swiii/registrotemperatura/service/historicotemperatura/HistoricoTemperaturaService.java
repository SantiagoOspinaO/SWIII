package co.com.swiii.registrotemperatura.service.historicotemperatura;

import co.com.swiii.registrotemperatura.model.HistoricoTemperatura;

import java.util.List;

public interface HistoricoTemperaturaService {

    void save(HistoricoTemperatura historicoTemperatura);

    HistoricoTemperatura findById(Long id);

    List<HistoricoTemperatura> findAll();

    void deleteById(Long id);
}
