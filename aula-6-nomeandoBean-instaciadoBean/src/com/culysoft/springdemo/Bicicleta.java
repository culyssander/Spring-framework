package com.culysoft.springdemo;

public class Bicicleta implements Veiculo {
	
	public Bicicleta() {
		System.out.println("Criado o objecto bicicleta...");
	}
	
	@Override
	public void dirigir() {
		System.out.println("Estou a dirigir a bicicleta...");
	}

}
