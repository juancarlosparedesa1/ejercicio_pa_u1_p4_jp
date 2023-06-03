package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.repository.modelo.Vehiculo;

public interface VehiculoService {
	public void guardar(Vehiculo vehiculo);

	public Vehiculo Seleccionar(String placa);

	public void actualizar(Vehiculo vehiculo);

	public void eliminar(String placa);

}
