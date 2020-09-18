package co.com.swiii.registrotemperatura.repository;

import co.com.swiii.registrotemperatura.entity.HistoricoTemperaturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoTemperaturaRepository extends JpaRepository<HistoricoTemperaturaEntity, Long> {
}
