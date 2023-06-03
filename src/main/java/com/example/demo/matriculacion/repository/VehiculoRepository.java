package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.repository.modelo.Vehiculo;

public interface VehiculoRepository {
	public void insertar(Vehiculo vehiculo);

	public Vehiculo Seleccionar(String placa);

	public void actualizar(Vehiculo vehiculo);

	public void eliminar(String placa);
}
