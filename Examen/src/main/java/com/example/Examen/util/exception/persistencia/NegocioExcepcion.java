package com.example.Examen.util.exception.persistencia;

public class NegocioExcepcion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NegocioExcepcion() {
	}

	public NegocioExcepcion(String mensaje) {
		super(mensaje);
	}

	public NegocioExcepcion(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
}
