package Encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniver() {
		this.idade = this.idade + 1;
		
	}
	
	

	public Pessoa(String pessoa, int idade, String sexo) {
		super();
		this.nome = pessoa;
		this.idade = idade;
		this.sexo = sexo;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String Nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
