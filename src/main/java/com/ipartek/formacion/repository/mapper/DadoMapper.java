package com.ipartek.formacion.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ipartek.formacion.domain.Dado;

public class DadoMapper implements RowMapper<Dado> {

	@Override
	public Dado mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dado d = new Dado();
		d.setId(rs.getInt("id"));
		d.setNumero(rs.getInt("id_usuario"));
		d.setFecha(rs.getTimestamp("fecha"));
		return d;
	}

}
