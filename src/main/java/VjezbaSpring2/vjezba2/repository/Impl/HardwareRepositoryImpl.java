package VjezbaSpring2.vjezba2.repository.Impl;

import VjezbaSpring2.vjezba2.domain.Hardware;
import VjezbaSpring2.vjezba2.domain.HardwareType;
import VjezbaSpring2.vjezba2.repository.HardwareRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class HardwareRepositoryImpl implements HardwareRepository {

    private final List<Hardware> hardwareList = new ArrayList<>();

    public HardwareRepositoryImpl() {

        hardwareList.add(
                new Hardware("CPU-001", "Ryzen 7 7800X3D",
                        399.99, HardwareType.CPU, 10));

        hardwareList.add(
                new Hardware("GPU-001", "RTX 4070",
                        649.99, HardwareType.GPU, 5));

        hardwareList.add(
                new Hardware("RAM-001", "Kingston Fury 32GB",
                        129.99, HardwareType.RAM, 20));
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
}