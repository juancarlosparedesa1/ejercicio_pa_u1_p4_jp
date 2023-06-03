package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.repository.modelo.Matricula;
import com.example.demo.matriculacion.repository.modelo.Vehiculo;

public interface MatriculaRepository {
	public void insertar(Matricula matricula);
	public void Matricular(String identificacion, String placa);

}
