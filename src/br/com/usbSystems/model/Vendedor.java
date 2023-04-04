package br.com.usbSystems.model;

public class Vendedor extends Funcionario {

	public double vendasSemestrais;

	public Vendedor() {
		super();
	}

	public Vendedor(String nome, String cpf, Endereco endereco, double salario, double vendasSemestrais) {
		super(nome, cpf, endereco, salario);
		this.vendasSemestrais = vendasSemestrais;
	}

	
	
	
	public double getVendasSemestrais() {
		return vendasSemestrais;
	}

	public void setVendasSemestrais(double vendasSemestrais) {
		this.vendasSemestrais = vendasSemestrais;
	}
	
	
	

	public double getBonus() {
		return this.getVendasSemestrais() *0.015;
	}
	

	public String getDetalhamento() {
		return "Nome: " + this.getNome()
		+ "\nEndereco: " + this.getEndereco().getEnderecoCompleto()
		+ "\nSalario Mensal: " + this.getSalario()
		+ "\nBonus Semestral: " + this.getBonus();
	}
	
	
	
	
	
	
}
