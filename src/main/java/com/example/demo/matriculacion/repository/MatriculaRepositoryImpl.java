package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.repository.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository {

	private List<Matricula> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Matricula matricula) {
		baseDatos.add(matricula);

	}

	@Override
	public void Matricular(String identificacion, String placa) {
		// TODO Auto-generated method stub

	}

}
