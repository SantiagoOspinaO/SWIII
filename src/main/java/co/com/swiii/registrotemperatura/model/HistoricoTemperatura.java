package co.com.swiii.registrotemperatura.model;

import java.util.Date;

public class HistoricoTemperatura {

    private Date fechaMuestreo;
    private Long idHistoricoTemperatura;
    private double temperatura;
    private Empleado empleado;


    public Date getFechaMuestreo() {
        return fechaMuestreo;
    }

    public void setFechaMuestreo(Date fechaMuestreo) {
        this.fechaMuestreo = fechaMuestreo;
    }

    public Long getIdHistoricoTemperatura() {
        return idHistoricoTemperatura;
    }

    public void setIdHistoricoTemperatura(Long idHistoricoTemperatura) {
        this.idHistoricoTemperatura = idHistoricoTemperatura;
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
