package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.repository.modelo.Matricula;

public interface MatriculaService {
	public void insertar(Matricula matricula);

	public void Matricular(String identificacion, String placa);
}
