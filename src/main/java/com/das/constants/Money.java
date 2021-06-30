package com.das.constants;

public enum Money {
	GANANCIAS(0.3);
	private double valor;
	
	private Money(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
}
