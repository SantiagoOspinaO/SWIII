package co.com.swiii.registrotemperatura.service.historicotemperatura.implement;

import co.com.swiii.registrotemperatura.converter.HistoricoTemperaturaConverter;
import co.com.swiii.registrotemperatura.model.HistoricoTemperatura;
import co.com.swiii.registrotemperatura.repository.HistoricoTemperaturaRepository;
import co.com.swiii.registrotemperatura.service.historicotemperatura.HistoricoTemperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoTemperaturaServiceImpl implements HistoricoTemperaturaService {

    @Autowired
    private HistoricoTemperaturaConverter historicoTemperaturaConverter;
    @Autowired
    private HistoricoTemperaturaRepository historicoTemperaturaRepository;

    @Override
    public void save(HistoricoTemperatura historicoTemperatura) {
        historicoTemperaturaRepository.save(historicoTemperaturaConverter.modelToEntity(historicoTemperatura));
    }

    @Override
    public HistoricoTemperatura findById(Long id) {
        return historicoTemperaturaConverter.entityToModel(historicoTemperaturaRepository.findById(id));
    }

    @Override
    public List<HistoricoTemperatura> findAll() {
        return historicoTemperaturaConverter.entityToModel(historicoTemperaturaRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        historicoTemperaturaRepository.deleteById(id);
    }
}
