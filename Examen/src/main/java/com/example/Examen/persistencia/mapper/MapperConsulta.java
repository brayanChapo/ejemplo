package com.example.Examen.persistencia.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.MANDATORY)
public interface MapperConsulta {
	
	@ResultMap(value="mapConsulta")
	@Select("select e.nombre as nombre_empleado, e.sexo as sexo_empleado, e.activo as estado_empleado, e.puesto as codigo_puesto, p.descripcion as descripcion_puesto"
			+ " from examenprueba.empleado e inner join examenprueba.puesto p on p.puesto = e.puesto"
			+ " where sexo_empleado = #{sexoEmpleado} and codigo_puesto = #{codigoPuesto}")
	public List<Map<String, Object>> obtenerListaEmpleado(@Param("sexoEmpleado") String sexoEmpleado, @Param("codigoPuesto") String codigoPuesto);
			
}
