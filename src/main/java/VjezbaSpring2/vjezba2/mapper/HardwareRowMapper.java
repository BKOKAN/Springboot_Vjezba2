package VjezbaSpring2.vjezba2.mapper;

import VjezbaSpring2.vjezba2.domain.Hardware;
import VjezbaSpring2.vjezba2.domain.HardwareType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HardwareRowMapper implements RowMapper<Hardware> {

    @Override
    public Hardware mapRow(ResultSet rs, int rowNum) throws SQLException {

        return new Hardware(
                rs.getString("sifra"),
                rs.getString("naziv"),
                rs.getBigDecimal("cijena"),
                HardwareType.valueOf(rs.getString("tip")),
                rs.getLong("id"),
                rs.getInt("kolicina")
        );
    }
}