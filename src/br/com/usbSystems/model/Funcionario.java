package br.com.usbSystems.model;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private Endereco endereco;
	private double salario;

	
	public Funcionario() {}

	public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	 
	public abstract double getBonus();
	public abstract String getDetalhamento();
	
	
	
	
	
	
	
	
}
