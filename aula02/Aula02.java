package aula02;

public class Aula02 {
	
	public static void main(String[] args) {
		//Instanciar
	//	classe obj  nova classe
		Caneta c1 = new Caneta();
		
		//mexendo nos atributos
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar();
        c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Compactor";
		c2.cor = "Vermelha";
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
		Refeicao menu = new Refeicao();
		
		menu.prato = "Pizza";
		menu.duracao = 45;
		menu.comprar();
		menu.status();
		menu.preparar();
		
		
        Refeicao menu2 = new Refeicao();
		
		menu2.prato = "Pizza";
		menu2.duracao = 45;
		menu2.comecar();
		menu2.status();
		menu2.preparar();
		
		
	}

}
