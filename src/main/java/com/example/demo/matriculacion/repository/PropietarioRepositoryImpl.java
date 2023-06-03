package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.repository.modelo.Propietario;
import com.example.demo.matriculacion.repository.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository {

	private List<Propietario> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Propietario propietario) {
		baseDatos.add(propietario);

	}

	@Override
	public Propietario Seleccionar(String identificacion) {
		Propietario propietarioEncontrado = new Propietario();
		for (Propietario prop : baseDatos) {
			if (identificacion.equals(prop.getIdentificacion())) {
				propietarioEncontrado = prop;

			}

		}
		return propietarioEncontrado;
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.eliminar(propietario.getIdentificacion());
		this.insertar(propietario);
	}

	@Override
	public void eliminar(String identificacion) {
		Propietario prop = this.Seleccionar(identificacion);
		baseDatos.remove(prop);

	}

}
