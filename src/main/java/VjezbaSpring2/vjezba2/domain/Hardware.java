<<<<<<< HEAD
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

=======
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

>>>>>>> 63eace67769c12d1d994a30de2d83ede7e46ecc5
}