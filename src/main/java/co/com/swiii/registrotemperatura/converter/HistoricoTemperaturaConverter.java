package co.com.swiii.registrotemperatura.converter;

import co.com.swiii.registrotemperatura.entity.HistoricoTemperaturaEntity;
import co.com.swiii.registrotemperatura.model.HistoricoTemperatura;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class HistoricoTemperaturaConverter {

    public HistoricoTemperatura entityToModel(HistoricoTemperaturaEntity historicoTemperaturaEntity) {

        var historicotemperatura = new HistoricoTemperatura();
        historicotemperatura.setIdHistoricoTemperatura(historicoTemperaturaEntity.getIdHistoricoTemperatura());
        historicotemperatura.setFechaMuestreo(historicoTemperaturaEntity.getFechaMuestreo());
        historicotemperatura.setTemperatura(historicoTemperaturaEntity.getTemperatura());
        historicotemperatura.setEmpleado(historicoTemperaturaEntity.getEmpleado());
        return historicotemperatura;
    }

    public HistoricoTemperaturaEntity modelToEntity(HistoricoTemperatura historicoTemperatura) {

        var historicoTemperaturaEntity = new HistoricoTemperaturaEntity();
        historicoTemperaturaEntity.setIdHistoricoTemperatura(historicoTemperatura.getIdHistoricoTemperatura());
        historicoTemperaturaEntity.setFechaMuestreo(historicoTemperatura.getFechaMuestreo());
        historicoTemperaturaEntity.setTemperatura(historicoTemperatura.getTemperatura());
        historicoTemperaturaEntity.setEmpleado(historicoTemperatura.getEmpleado());

        return historicoTemperaturaEntity;
    }

    public List<HistoricoTemperatura> entityToModel(List<HistoricoTemperaturaEntity> historicoTemperaturasEntities) {

        List<HistoricoTemperatura> historicoTemperaturas = new ArrayList<>(historicoTemperaturasEntities.size());
        historicoTemperaturasEntities.forEach(entity -> {
            historicoTemperaturas.add(entityToModel(entity));
        });
        return historicoTemperaturas;
    }

    public HistoricoTemperatura entityToModel(Optional<HistoricoTemperaturaEntity> historicoTemperaturaEntity) {
        HistoricoTemperatura historicoTemperatura = null;
        if (historicoTemperaturaEntity.isPresent()) {
            historicoTemperatura = new HistoricoTemperatura();
            historicoTemperatura.setIdHistoricoTemperatura(historicoTemperaturaEntity.get().getIdHistoricoTemperatura());
            historicoTemperatura.setFechaMuestreo(historicoTemperaturaEntity.get().getFechaMuestreo());
            historicoTemperatura.setTemperatura(historicoTemperaturaEntity.get().getTemperatura());
            historicoTemperatura.setEmpleado(historicoTemperaturaEntity.get().getEmpleado());

            return historicoTemperatura;
        }
        return historicoTemperatura;
    }
}
