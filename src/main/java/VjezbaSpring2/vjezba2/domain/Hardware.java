package VjezbaSpring2.vjezba2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hardware {

    private String sifra;
    private String naziv;
    private double cijena;
    private HardwareType tip;
    private int id;
    private int kolicina;

}