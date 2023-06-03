package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository {

	private List<Vehiculo> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Vehiculo vehiculo) {
		baseDatos.add(vehiculo);

	}

	@Override
	public Vehiculo Seleccionar(String placa) {
		Vehiculo vehiculoEncontrado = new Vehiculo();
		for (Vehiculo vehi : baseDatos) {
			if (placa.equals(vehi.getPlaca())) {
				vehiculoEncontrado = vehi;

			}

		}
		return vehiculoEncontrado;
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.eliminar(vehiculo.getPlaca());
		this.insertar(vehiculo);

	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehi = this.Seleccionar(placa);
		baseDatos.remove(vehi);

	}

}
