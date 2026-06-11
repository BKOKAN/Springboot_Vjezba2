package VjezbaSpring2.vjezba2.service;

import VjezbaSpring2.vjezba2.domain.Hardware;
import VjezbaSpring2.vjezba2.dto.HardwareDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HardwareService {

    List<HardwareDTO> getAllHardware();

    HardwareDTO addHardware(Hardware hardware);

    HardwareDTO getHardwareBySifra(String sifra);

    HardwareDTO findbyId(Long id);

    HardwareDTO updateHardware(Long id, Hardware hardware);

    boolean delete(Long id);
}
