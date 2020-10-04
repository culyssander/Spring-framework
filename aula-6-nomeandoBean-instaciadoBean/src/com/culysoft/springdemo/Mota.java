package com.culysoft.springdemo;

public class Mota implements Veiculo {
	
	public Mota() {
		System.out.println("Criado o objecto Mota...");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dirigir() {
		System.out.println("Estou a dirigir a mota");

	}

}
