package com.example.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("automatico")
public class ValorMatriculaAutomaticoService implements ValorMatriculaService {

	@Override
	public BigDecimal CalcularValorMatricual(BigDecimal precio) {
		BigDecimal valorMatriculaAutomatico = precio.multiply(new BigDecimal(0.1));
		return precio.add(valorMatriculaAutomatico);
	}

}
