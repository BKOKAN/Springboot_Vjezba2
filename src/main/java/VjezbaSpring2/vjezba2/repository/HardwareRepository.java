package VjezbaSpring2.vjezba2.repository;

import VjezbaSpring2.vjezba2.domain.Hardware;

import java.util.List;

public interface HardwareRepository {

    List<Hardware> findAll();

    Hardware findBySifra(String sifra);

    Hardware findbyId(int id);

    Hardware addHardware(Hardware hardware);
    Hardware updateHardware(int Id, Hardware hardware);
    boolean delete(int id);
}