package br.com.rafaela.animais;

public class Cachorro extends Animal{
	
	private String fucinho;
	
	public Cachorro(String nome, int idade, String tipoAnimal, String fucinho) {
		super(nome, idade, tipoAnimal);
		this.fucinho = fucinho;
	}
	
	public void farejar() {
		System.out.println("Cachorro está farejando");
	}

	public String getFucinho() {
		return fucinho;
	}

	public void setFucinho(String fucinho) {
		this.fucinho = fucinho;
	}

	@Override
	public void fazerSom() {
		super.fazerSom();
		System.out.println("Auau");
	}
	
	
}
