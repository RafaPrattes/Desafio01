package br.com.rafaela.animais;

public class Gato extends Animal {
	
	private String cor;

	public Gato(String nome, int idade, String tipoAnimal, String cor) {
		super(nome, idade, tipoAnimal);
		this.cor = cor;
	}
	
	public void arranhar() {
		System.out.println("gato está arranhando");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void fazerSom() {
		super.fazerSom();
		System.out.println("Miau");
	}
	
	
}
