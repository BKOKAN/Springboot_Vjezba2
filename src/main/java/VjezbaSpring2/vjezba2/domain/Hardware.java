package VjezbaSpring2.vjezba2.domain;

public class Hardware {

    private String sifra;
    private String naziv;
    private double cijena;
    private HardwareType tip;
    private int kolicina;

    public Hardware() {
    }

    public Hardware(String sifra, String naziv, double cijena, HardwareType tip, int kolicina) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cijena = cijena;
        this.tip = tip;
        this.kolicina = kolicina;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
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

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
}