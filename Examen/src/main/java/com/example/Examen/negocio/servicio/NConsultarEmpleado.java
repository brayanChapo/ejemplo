package com.example.Examen.negocio.servicio;

import java.util.List;
import java.util.Map;

public interface NConsultarEmpleado {
	public List<Map<String, Object>> buscarEmpleado(String sexo, String puesto);
}
