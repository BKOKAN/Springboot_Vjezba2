package VjezbaSpring2.vjezba2.dto;

import VjezbaSpring2.vjezba2.domain.HardwareType;

public class HardwareDTO {

    private String naziv;
    private double cijena;
    private HardwareType tip;

    public HardwareDTO() {
    }

    public HardwareDTO(String naziv, double cijena, HardwareType tip) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.tip = tip;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public HardwareType getTip() {
        return tip;
    }

    public void setTip(HardwareType tip) {
        this.tip = tip;
    }
}