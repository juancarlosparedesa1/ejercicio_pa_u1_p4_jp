package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.repository.modelo.Propietario;

public interface PropietarioService {
	public void crear(Propietario propietario);

	public Propietario Seleccionar(String identificacion);

	public void actualizar(Propietario propietario);

	public void eliminar(String identificacion);
}
