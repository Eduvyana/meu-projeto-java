package com.bank.model;

import java.math.BigDecimal;

public class Funcionarios extends Pessoa {
	// atributos
	private BigDecimal  salario;
	private String matricula;
	
	public BigDecimal getSalarioAnual() {
		BigDecimal meses = new BigDecimal(13);
		BigDecimal terco = this.salario.divide(new BigDecimal(3));
		return	this.salario.multiply(meses).add(terco);
		
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	

}
