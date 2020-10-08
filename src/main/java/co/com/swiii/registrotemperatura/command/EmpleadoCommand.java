package co.com.swiii.registrotemperatura.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
@NoArgsConstructor
public class EmpleadoCommand {

    private Long id;
    private String nombre;
    private Date edad;
    private double temperatura;

}
