package br.com.usbSystems.model;

public class Gerente extends Funcionario {
	
	public Integer sala;
	public Integer ramal;
	public double faturamentoSemestral;
	
	
	public Gerente() {
		super();
	}


	public Gerente(String nome, String cpf, Endereco endereco, double salario,Integer sala, Integer ramal, double faturamentoSemestral ) {
		super(nome, cpf, endereco, salario);
		this.faturamentoSemestral = faturamentoSemestral;
		this.ramal = ramal;
		this.sala = sala;
	}
	
	
	

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}

	public Integer getRamal() {
		return ramal;
	}

	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}

	public double getFaturamentoSemestral() {
		return faturamentoSemestral;
	}

	public void setFaturamentoSemestral(double faturamentoSemestral) {
		this.faturamentoSemestral = faturamentoSemestral;
	}
	
	
	public double getBonus() {
		return this.getFaturamentoSemestral() *0.05;
	}
	
	
	public String getDetalhamento() {
		return "Nome: " + this.getNome()
		+ "\nSala: " + this.getSala()
		+ "\nRamal" + this.getRamal()
		+ "\nEndereco: " + this.getEndereco().getEnderecoCompleto()
		+ "\nSalario Mensal: " + this.getSalario()
		+ "\nFaturamento Semestral: " + this.getFaturamentoSemestral()
		+ "\nBonus Semestral: " + this.getBonus();
	}
	
	
	
	
	
	
	 
	

	
}
