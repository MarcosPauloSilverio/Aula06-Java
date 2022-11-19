package Aula06.marcos;

public class Aula06 {
	
	//Declaração dos Atributos
	private String Nome;
	
	private String sobrenome;
	
	private int idade;
	
	private String dataNascimento;


	//Declaração dos Métodos
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
