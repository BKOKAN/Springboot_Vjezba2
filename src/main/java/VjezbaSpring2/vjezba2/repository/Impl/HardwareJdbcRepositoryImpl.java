package VjezbaSpring2.vjezba2.repository.Impl;

import VjezbaSpring2.vjezba2.domain.Hardware;
import VjezbaSpring2.vjezba2.mapper.HardwareRowMapper;
import VjezbaSpring2.vjezba2.repository.HardwareRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class HardwareJdbcRepositoryImpl implements HardwareRepository {

    private final JdbcTemplate jdbcTemplate;
    private final HardwareRowMapper rowMapper = new HardwareRowMapper();

    public HardwareJdbcRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Hardware> findAll() {

        String sql = " SELECT * FROM hardware ";

        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public Hardware findBySifra(String sifra) {

        String sql = " SELECT * FROM hardware WHERE sifra = ? ";

        return jdbcTemplate.queryForObject(sql,rowMapper,sifra);
    }

    @Override
    public Hardware findbyId(Long id) {

        String sql = " SELECT * FROM hardware WHERE id = ? ";

        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }

    @Override
    public Hardware addHardware(Hardware hardware) {

        String sql = " INSERT INTO hardware (sifra, naziv, cijena, tip, kolicina) VALUES (?, ?, ?, ?, ?) ";

        jdbcTemplate.update(
                sql,
                hardware.getSifra(),
                hardware.getNaziv(),
                hardware.getCijena(),
                hardware.getTip().name(),
                hardware.getKolicina()
        );

        return findBySifra(hardware.getSifra());
    }

    @Override
    public Hardware updateHardware(Long id, Hardware hardware) {

        String sql = " UPDATE hardware SET naziv = ?, cijena = ?, tip = ?, kolicina = ? WHERE id = ? ";

        jdbcTemplate.update(
                sql,
                hardware.getNaziv(),
                hardware.getCijena(),
                hardware.getTip().name(),
                hardware.getKolicina(),
                id
        );


        return findbyId(id);
    }

    @Override
    public boolean delete(Long id) {

        String sql = " DELETE FROM hardware WHERE id = ? ";

        return jdbcTemplate.update(sql, id) > 0;
    }
}