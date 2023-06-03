package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matriculacion.repository.PropietarioRepository;
import com.example.demo.matriculacion.repository.modelo.Vehiculo;
import com.example.demo.matriculacion.service.PropietarioService;
import com.example.demo.matriculacion.service.VehiculoService;

@SpringBootApplication
public class EjercicioPaU1P4JpApplication implements CommandLineRunner {

	@Autowired
	private VehiculoService service;
	@Autowired
	private PropietarioService propietarioService;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// 1.crear un vehiuculo
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("hyundai");
		vehiculo.setModelo("s22");
		vehiculo.setPlaca("abv122");
		vehiculo.setPrecio(new BigDecimal(5000));
		vehiculo.setTipo("a");
		this.service.guardar(vehiculo);

		vehiculo.setMarca("asdfas");
		this.service.actualizar(vehiculo);
	}

}
