package com.bank.model;

public enum Sexo {
	
	MASCULINO("M"),FEMININO("F");
	
	private String abrev;
	
	Sexo(String abrev) {
		this.abrev = abrev;
	}

	public String getAbrev() {
		return abrev;
	}

	
}
