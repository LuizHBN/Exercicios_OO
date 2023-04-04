package br.com.usbSystems.model;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String CEP;
	private String cidade;
	private String estado;
	
	
	//Construtores
	public Endereco() {
		super();
	}
	public Endereco(String logradouro, int numero, String cEP, String cidade, String estado) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		CEP = cEP;
		this.cidade = cidade;
		this.estado = estado;
	}

    //Getters and Setters 
	
	
	public String getEnderecoCompleto() {
		return  this.getLogradouro()
				+ this.getNumero()
				+ this.getCEP()
		        + this.getCidade()
		        + this.getEstado();
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
