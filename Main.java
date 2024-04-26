package br.com.rafaela.main;

import br.com.rafaela.animais.Cachorro;
import br.com.rafaela.animais.Gato;
import br.com.rafaela.animais.Passaro;

public class Main {

	public static void main(String[] args) {
		
		Cachorro objCachorro = new Cachorro("Picuxinho",9,"SRD","Curto");
		objCachorro.farejar();
		objCachorro.imprimirInformacoes();
		
		System.out.println("===================");
		
		Gato objGato = new Gato("Frajolinha",2,"SRD","Preto e branco");
		objGato.arranhar();
		objGato.imprimirInformacoes();
		
		System.out.println("===================");

		Passaro objPassaro = new Passaro("Piupiuzinho",1,"Cacatua","Amarelo");
		objPassaro.voar();
		objPassaro.imprimirInformacoes();
		
	}
		
}
