package VjezbaSpring2.vjezba2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hardware {
    private String sifra;
    private String naziv;
    private BigDecimal cijena;
    private HardwareType tip;
    private Long id;
    private Integer kolicina;

}