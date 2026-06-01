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
                        element.getTip()))
                .toList();
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
                hardware.getTip()
        );
    }
}