package br.com.rafaela.animais;

public class Passaro extends Animal{
	
	private String bico;

	public Passaro(String nome, int idade, String tipoAnimal, String bico) {
		super(nome, idade, tipoAnimal);
		this.bico = bico;
	}
	
	public void voar() {
		System.out.println("Pássaro está voando");
	}

	public String getBico() {
		return bico;
	}

	public void setBico(String bico) {
		this.bico = bico;
	}

	@Override
	public void fazerSom() {
		super.fazerSom();
		System.out.println("Piupiu");
	}
	
}
