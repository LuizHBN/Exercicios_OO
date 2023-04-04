package br.com.usbSystems.model;

public class Desenvolvedor extends Funcionario {
	
	public Integer ramal;

	public Desenvolvedor() {
		super();
	}

	public Desenvolvedor(String nome, String cpf, Endereco endereco, double salario, Integer ramal) {
		super(nome, cpf, endereco, salario);
		this.ramal = ramal;
	}

	
	
	public Integer getRamal() {
		return ramal;
	}

	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}
	
	
	public double getBonus() {
		return this.getSalario() *0.02;
	}
	
	public String getDetalhamento() {
		return "Nome: " + this.getNome()
		+ "\nRamal" + this.getRamal()
		+ "\nEndereco: " + this.getEndereco().getEnderecoCompleto()
		+ "\nSalario Mensal: " + this.getSalario()
		+ "\nBonus Semestral: " + this.getBonus();
	}
	
	
	
}
