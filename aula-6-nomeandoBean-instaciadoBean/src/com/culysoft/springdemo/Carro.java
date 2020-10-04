package com.culysoft.springdemo;

public class Carro implements Veiculo {
	
	public Carro() {
		System.out.println("Criado o objecto Carro...");
	}
	
	public static Mota criarCarro() {
		return new Mota();
	}
	
	@Override
	public void dirigir() {
		System.out.println("Estou a dirigir um carro..." );
	}
	
}
