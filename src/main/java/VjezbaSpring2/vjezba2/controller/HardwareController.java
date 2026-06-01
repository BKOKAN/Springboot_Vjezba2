package VjezbaSpring2.vjezba2.controller;

import VjezbaSpring2.vjezba2.domain.Hardware;
import VjezbaSpring2.vjezba2.dto.HardwareDTO;
import VjezbaSpring2.vjezba2.service.HardwareService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hardware")
public class HardwareController {

    private final HardwareService service;

    public HardwareController(HardwareService service) {
        this.service = service;
    }

    @GetMapping
    public List<HardwareDTO> getAllHardware() {
        return service.getAllHardware();
    }

    @GetMapping("/{sifra}")
    public HardwareDTO getHardwareBySifra(@PathVariable String sifra) {
        return service.getHardwareBySifra(sifra);
    }

    @GetMapping("/{id}")
    public HardwareDTO findbyId(@PathVariable int id){
        return service.findbyId(id);
    }

    @PostMapping
    public HardwareDTO create(@RequestBody Hardware hardware) {
        return service.addHardware(hardware);
    }

    @PutMapping("/{id}")
    public HardwareDTO updateHardware(
            @PathVariable int id,
            @RequestBody Hardware hardware) {

        return service.updateHardware(id, hardware);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }
}