package co.com.swiii.registrotemperatura.entity;

import co.com.swiii.registrotemperatura.model.Empleado;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="historicotemperatura")
public class HistoricoTemperaturaEntity {

    @Id
    @GeneratedValue
    @Column(name="idHistoricoTemperatura")
    private Long idHistoricoTemperatura;

    @Column(name="fechaMuestreo")
    private Date fechaMuestreo;

    @Column(name="temperatura")
    private double temperatura;

    @Column(name="empleado")
    private Empleado empleado;

    public Long getIdHistoricoTemperatura() {
        return idHistoricoTemperatura;
    }

    public void setIdHistoricoTemperatura(Long idHistoricoTemperatura) {
        this.idHistoricoTemperatura = idHistoricoTemperatura;
    }

    public Date getFechaMuestreo() {
        return fechaMuestreo;
    }

    public void setFechaMuestreo(Date fechaMuestreo) {
        this.fechaMuestreo = fechaMuestreo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
