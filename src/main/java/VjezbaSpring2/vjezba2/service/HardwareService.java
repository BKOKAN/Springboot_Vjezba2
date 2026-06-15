<<<<<<< HEAD
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
=======
package VjezbaSpring2.vjezba2.service;

import VjezbaSpring2.vjezba2.domain.Hardware;
import VjezbaSpring2.vjezba2.dto.HardwareDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HardwareService {

    List<HardwareDTO> getAllHardware();

    HardwareDTO addHardware(Hardware hardware);

    HardwareDTO getHardwareBySifra(String sifra);

    HardwareDTO findbyId(int id);

    HardwareDTO updateHardware(int id, Hardware hardware);

    boolean delete(int id);
}
>>>>>>> 63eace67769c12d1d994a30de2d83ede7e46ecc5
