package com.culysoft.springdemo;

public class Carro implements Veiculo {

	@Override
	public void dirigir() {
		System.out.println("Estou a dirigir o carro...");
	}
}
