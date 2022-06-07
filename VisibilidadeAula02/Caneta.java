package VisibilidadeAula02;

public class Caneta {
	
	//Atributos
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	//Metodos
	public void status() {  //this = autoreferencia, quem chamou( nesse caso c1) o m�todo status ser� subst por this
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
	    System.out.println("Est� tampada? " + this.tampada);
	}
	public void rabiscar () {
		if (this.tampada == true ) {
			System.out.println("ERRO! N�o posso rabiscar");
		} else {
			System.out.println("Estou Rabiscando");
		}
		
	}
	
	public void tampar() {
		this.tampada = true;
		
	}
	
	public void destampar() {
		this.tampada = false;
		
	}

}
