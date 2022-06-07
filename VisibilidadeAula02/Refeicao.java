package VisibilidadeAula02;

public class Refeicao {
	
	String prato ;
	double duracao;
	boolean ingredientes;
	
	
	void status () {
		System.out.println("Prato: " + this.prato);
		System.out.println("Tempo de preparo: " + this.duracao + " minutos");
		System.out.println("Temos todos os ingredientes? " + this.ingredientes);
		
	}
	
	void preparar() {
		if (this.ingredientes == true) {
			System.out.println("Podemos começar o preparo");
		}else {
			System.out.println("Precisamos comprar os ingredientes");
		}
	}
	
	void comprar() {
		this.ingredientes = false;
		
	}
	
	void comecar() {
		this.ingredientes = true;
	}
	
	
	
	
}
