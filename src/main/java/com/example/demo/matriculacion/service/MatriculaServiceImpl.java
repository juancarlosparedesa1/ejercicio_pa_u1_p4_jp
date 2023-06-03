package com.example.demo.matriculacion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.repository.MatriculaRepository;
import com.example.demo.matriculacion.repository.PropietarioRepository;
import com.example.demo.matriculacion.repository.VehiculoRepository;
import com.example.demo.matriculacion.repository.modelo.Matricula;
import com.example.demo.matriculacion.repository.modelo.Propietario;
import com.example.demo.matriculacion.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;
	@Autowired
	private VehiculoRepository vehiculoRepository;
	@Autowired
	private PropietarioRepository propietarioRepository;
	@Autowired
	@Qualifier("manual")
	private VehiculoService vehiculoService;

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);

	}

	@Override
	public void Matricular(String identificacion, String placa) {

		Propietario prop = this.propietarioRepository.Seleccionar(identificacion);
		Vehiculo vehi = this.vehiculoRepository.Seleccionar(placa);

		Matricula matricula = new Matricula();
		matricula.setFechaMatricula(LocalDateTime.now());
		matricula.setPropietario(prop);
		matricula.setVehiculo(vehi);

		BigDecimal valorMatricula = this.calcularValorMatricula(vehi.getPrecio());
		matricula.setValorMatricula(valorMatricula);

		if (vehi.getTipo().equalsIgnoreCase("m")) {
			valorMatricula = this.vehiculoService.CalcularValorMatricual(vehi.getPrecio());
		} else if (vehi.getTipo().equalsIgnoreCase("a")) {
			valorMatricula = this.vehiculoService.CalcularValorMatricual(vehi.getPrecio());
		}
		this.matriculaRepository.insertar(matricula);

	}

}
