package aula02;

public class Caneta {
	
	//Atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	//Metodos
	void status() {  //this = autoreferencia, quem chamou( nesse caso c1) o m�todo status ser� subst por this
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
	    System.out.println("Est� tampada? " + this.tampada);
	}
	void rabiscar () {
		if (this.tampada == true ) {
			System.out.println("ERRO! N�o posso rabiscar");
		} else {
			System.out.println("Estou Rabiscando");
		}
		
	}
	
	void tampar() {
		this.tampada = true;
		
	}
	
	void destampar() {
		this.tampada = false;
		
	}

}
