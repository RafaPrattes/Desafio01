package br.com.rafaela.animais;

public class Animal {
//propriedades
	private String nome;
	private int idade;
	private String tipoAnimal;
//construtor
	public Animal(String nome, int idade, String tipoAnimal) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.tipoAnimal = tipoAnimal;
	}
	
	public void cadastrar() {
		System.out.println("Animal cadastrado com sucesso!");
	}
	
	public void consulta() {
		System.out.println("Consulta marcada com sucesso!");
	}
	
	public void fazerSom() {
		System.out.println("Animal fazendo som");
	}	
	
	public void imprimirInformacoes() {
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(tipoAnimal);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
}
