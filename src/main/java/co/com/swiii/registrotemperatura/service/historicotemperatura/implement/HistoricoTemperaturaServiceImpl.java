package co.com.swiii.registrotemperatura.service.historicotemperatura.implement;

import co.com.swiii.registrotemperatura.converter.EmpleadoConverter;
import co.com.swiii.registrotemperatura.model.Empleado;
import co.com.swiii.registrotemperatura.repository.EmpleadoRepository;
import co.com.swiii.registrotemperatura.service.historicotemperatura.HistoricoTemperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoTemperaturaServiceImpl implements HistoricoTemperaturaService {

    @Autowired
    private EmpleadoConverter empleadoConverter;
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public void save(Empleado empleado) {
        empleadoRepository.save(empleadoConverter.modelToEntity(empleado));
    }

    @Override
    public Empleado findById(Long id) {
        return empleadoConverter.entityToModel(empleadoRepository.findById(id));
    }

    @Override
    public List<Empleado> findAll() {
        return empleadoConverter.entityToModel(empleadoRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        empleadoRepository.deleteById(id);
    }
}
