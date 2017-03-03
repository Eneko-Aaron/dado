package com.ipartek.formacion.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ipartek.formacion.domain.Historial;
import com.ipartek.formacion.domain.Usuario;

public class HistorialMapper implements RowMapper<Historial> {

	@Override
	public Historial mapRow(ResultSet rs, int rowNum) throws SQLException {
		Historial h = new Historial();
		Usuario u = new  Usuario();
		u.setNombre(rs.getString("nombre"));
		u.setId(rs.getInt("id"));
		h.setU(u);
		h.setFecha(rs.getTimestamp("fecha"));
		return h;
	}

}
