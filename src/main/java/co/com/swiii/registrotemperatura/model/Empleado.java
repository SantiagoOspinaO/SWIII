package co.com.swiii.registrotemperatura.model;

import java.util.Date;
import java.util.List;

public class Empleado {

    private Long id;
    private String nombre;
    private Date fechaNacimiento;
    private List<HistoricoTemperatura> historicoTemperaturas;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<HistoricoTemperatura> getHistoricoTemperaturas() {
        return historicoTemperaturas;
    }

    public void setHistoricoTemperaturas(List<HistoricoTemperatura> historicoTemperaturas) {
        this.historicoTemperaturas = historicoTemperaturas;
    }
}
