package Aula06.marcos;

public class Pessoa {
	
	//Declaração dos Atributos
	private String Nome;	
	private String Sobrenome;
	private int Idade;	
	private String Endereco;	
	private Date DataNascimento;
	private Date AnoAtual;

	private String Nome2;

	//Declaração dos Métodos
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getSobrenome() {
		return Sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	
	public void getIdade() {
		return Idade;
	}
	
	public void setIdade(int idade) {
		Idade = idade;
	}
	
	public void getEndereco() {
		return Endereco;
	}
	
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	public void getDataNascimento() {
		return DataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}
	
	public void getAnoAtual() {
		return AnoAtual;
	}
	
	public setAnoAtual(String anoAtual) {
		AnoAtual = anoAtual;
	}

}
