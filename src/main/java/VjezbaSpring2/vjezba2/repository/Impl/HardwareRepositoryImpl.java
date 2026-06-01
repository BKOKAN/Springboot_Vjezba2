package VjezbaSpring2.vjezba2.repository.Impl;

import VjezbaSpring2.vjezba2.domain.Hardware;
import VjezbaSpring2.vjezba2.domain.HardwareType;
import VjezbaSpring2.vjezba2.repository.HardwareRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HardwareRepositoryImpl implements HardwareRepository {

    private final List<Hardware> hardwareList = new ArrayList<>();

    public HardwareRepositoryImpl() {

        hardwareList.add(
                new Hardware("CPU-001", "Ryzen 7 7800X3D",
                        399.99, HardwareType.CPU,1, 10));

        hardwareList.add(
                new Hardware("GPU-001", "RTX 4070",
                        649.99, HardwareType.GPU,2, 5));

        hardwareList.add(
                new Hardware("RAM-001", "Kingston Fury 32GB",
                        129.99, HardwareType.RAM,3, 20));
    }

    @Override
    public List<Hardware> findAll() {
        return hardwareList;
    }

    @Override
    public Hardware findBySifra(String sifra) {

        return (Hardware) hardwareList.stream()
                .filter(element -> element.getSifra().equalsIgnoreCase(sifra))
                .findFirst()
                .get();
    }

    @Override
    public Hardware findbyId(int id){
        return (Hardware) hardwareList.stream()
                .filter(hardware -> hardware.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Hardware addHardware(Hardware hardware) {
        hardwareList.add(hardware);

        return hardware;
    }

    @Override
    public Hardware updateHardware(int id, Hardware hardware) {
        Hardware existing = findbyId(id);

        if (existing == null) {
            return null;
        }

        existing.setNaziv(hardware.getNaziv());
        existing.setCijena(hardware.getCijena());
        existing.setTip(hardware.getTip());
        existing.setKolicina(hardware.getKolicina());

        return existing;
    }

    @Override
    public boolean delete(int id) {
        return hardwareList.removeIf(
                hardware -> hardware.getId() == id
        );
    }
}