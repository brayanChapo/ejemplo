package com.example.Examen.negocio.servicio.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Examen.negocio.servicio.NConsultarEmpleado;
import com.example.Examen.persistencia.mapper.MapperConsulta;
import com.example.Examen.util.Constantes;
import com.example.Examen.util.exception.persistencia.NegocioExcepcion;
import com.example.Examen.util.exception.persistencia.PersistenciaExcepcion;


public class NConsultarEmpleadoImpl implements NConsultarEmpleado{
	
	@Autowired
	MapperConsulta mapConsulta;
	
	@Override
	public List<Map<String, Object>> buscarEmpleado(String sexo, String puesto) {
		List<Map<String, Object>> buscarEmpleado = new ArrayList<>();
		try {
			buscarEmpleado = mapConsulta.obtenerListaEmpleado(sexo, puesto);
		} catch (PersistenciaExcepcion e) {
			throw new NegocioExcepcion(Constantes.ERROR_NEGOCIO_CONSULTA_REGISTRO, e);
		} catch (Exception e) {
			throw new NegocioExcepcion(
					Constantes.ERROR_GENERAL_LOGICA_NEGOCIO, e);
		}
		return buscarEmpleado;
	}

}
