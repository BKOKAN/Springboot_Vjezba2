
package VjezbaSpring2.vjezba2.service.Impl;

import VjezbaSpring2.vjezba2.domain.Hardware;
import VjezbaSpring2.vjezba2.dto.HardwareDTO;
import VjezbaSpring2.vjezba2.repository.HardwareRepository;
import VjezbaSpring2.vjezba2.service.HardwareService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HardwareServiceImpl implements HardwareService {

    private final HardwareRepository repository;

    public HardwareServiceImpl(HardwareRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<HardwareDTO> getAllHardware() {

        return repository.findAll()
                .stream()
                .map(element -> new HardwareDTO(
                        element.getNaziv(),
                        element.getCijena(),
                        element.getTip(),
                        element.getId(),
                        element.getKolicina()
                ))
                .toList();
    }

    @Override
    public HardwareDTO addHardware(Hardware hardware) {

        Hardware saved = repository.addHardware(hardware);

        return new HardwareDTO(
                saved.getNaziv(),
                saved.getCijena(),
                saved.getTip(),
                saved.getId(),
                saved.getKolicina()
        );
    }

    @Override
    public HardwareDTO getHardwareBySifra(String sifra) {

        Hardware hardware = repository.findBySifra(sifra);

        if (hardware == null) {
            return null;
        }

        return new HardwareDTO(
                hardware.getNaziv(),
                hardware.getCijena(),
                hardware.getTip(),
                hardware.getId(),
                hardware.getKolicina()
        );
    }

    @Override
    public HardwareDTO findbyId(Long id) {
        Hardware hardware = repository.findbyId(id);

        if (hardware == null) {
            return null;
        }

        return new HardwareDTO(
                hardware.getNaziv(),
                hardware.getCijena(),
                hardware.getTip(),
                hardware.getId(),
                hardware.getKolicina()
        );
    }

    @Override
    public HardwareDTO updateHardware(Long id, Hardware hardware) {

        Hardware updated = repository.updateHardware(id, hardware);

        if (updated == null) {
            return null;
        }

        return new HardwareDTO(
                updated.getNaziv(),
                updated.getCijena(),
                updated.getTip(),
                updated.getId(),
                hardware.getKolicina()
        );
    }

    @Override
    public boolean delete(Long id) {
        return repository.delete(id);
    }
}