package PolimorfismoSobrecarga;

public class Aula13b {

	public static void main(String[] args) {
		Mamifero x = new Mamifero();
		Lobo b = new Lobo();
		Cachorro c = new Cachorro();
		
		c.reagir(2,12.5f);
		c.reagir(17, 4.5f);
	}

}
