package com.example.Examen.presentacion.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.Examen.negocio.servicio.NConsultarEmpleado;


@Controller("cBusqueda")
public class CBusqueda {
	
	@Autowired
	NConsultarEmpleado nConsultarEmpleado;
	
	List<Map<String, Object>> listaEmpleado;
	private String sexo;
	private String puesto;
	
	@PostConstruct
	public void init() {
		inicializarObjetos();
	}

	public void inicializarObjetos() {
		try {
			listaEmpleado = new ArrayList<>();
			sexo="";
			puesto="";
		}catch (Exception e) {
			System.out.println("Error");;
		}
	}
	
	public void listarEmpleado() {
		listaEmpleado = nConsultarEmpleado.buscarEmpleado(sexo, puesto);
	}

	public List<Map<String, Object>> getListaEmpleado() {
		return listaEmpleado;
	}

	public void setListaEmpleado(List<Map<String, Object>> listaEmpleado) {
		this.listaEmpleado = listaEmpleado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
}
