package model;

public class VendedorDTO {
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getQuantidadePedidos() {
		return quantidadePedidos;
	}
	public void setQuantidadePedidos(int quantidadePedidos) {
		this.quantidadePedidos = quantidadePedidos;
	}
	public VendedorDTO(String nome, int ano, int quantidadePedidos) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.quantidadePedidos = quantidadePedidos;
	}
	
	private String nome;
	private int ano;
	private int quantidadePedidos;

}
