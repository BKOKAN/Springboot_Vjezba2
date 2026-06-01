package VjezbaSpring2.vjezba2.dto;

import VjezbaSpring2.vjezba2.domain.HardwareType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.Message;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HardwareDTO {

    @NotBlank(message = "Naziv nemoze biti prazan")
    private String naziv;
    @PositiveOrZero(message = "Cijena mora biti positivna")
    private double cijena;
    @NotBlank(message = "Tip hardwara nemoze biti prazan")
    private HardwareType tip;
    @PositiveOrZero(message = "Id mora biti pozitivan")
    private int id;
}