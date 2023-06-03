package com.example.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("manual")
public class ValorMatriculaManualService implements ValorMatriculaService {

	@Override
	public BigDecimal CalcularValorMatricual(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valorMatriculaManual = precio.multiply(new BigDecimal(0.1));
		return precio.add(valorMatriculaManual);
	}

}
