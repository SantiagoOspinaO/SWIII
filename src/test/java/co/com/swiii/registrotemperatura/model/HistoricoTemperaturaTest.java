package co.com.swiii.registrotemperatura.model;

import co.com.swiii.registrotemperatura.model.exception.BusinessException;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HistoricoTemperaturaTest {

    @Test
    public void requerirFechaMuestreo(){
        try{
            HistoricoTemperatura historicoTemperatura = new HistoricoTemperatura.HistoricoTemperaturaBuilder().build();
        } catch (BusinessException bException){
            assertEquals(HistoricoTemperatura.FECHA_MUESTREO_VACIA, bException.getMessage());
        }
    }

}
