package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.repository.modelo.Propietario;
import com.example.demo.matriculacion.repository.modelo.Vehiculo;

public interface PropietarioRepository {

	public void insertar(Propietario propietario);

	public Propietario Seleccionar(String identificacion);

	public void actualizar(Propietario propietario);

	public void eliminar(String identificacion);

}
