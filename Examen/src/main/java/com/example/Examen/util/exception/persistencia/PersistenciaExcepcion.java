package com.example.Examen.util.exception.persistencia;

public class PersistenciaExcepcion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PersistenciaExcepcion() {

	}

	public PersistenciaExcepcion(String mensaje) {
		super(mensaje);
	}

	public PersistenciaExcepcion(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
}
