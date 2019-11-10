package dto;

public class VendedorDTO {
	
	public VendedorDTO() {};
	
	public VendedorDTO(String nome, int ano, long quantidadePedidos) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.quantidadePedidos = quantidadePedidos;
	}
	
	private String nome;
	private int ano;
	private long quantidadePedidos;
	
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
	public long getQuantidadePedidos() {
		return quantidadePedidos;
	}
	public void setQuantidadePedidos(int quantidadePedidos) {
		this.quantidadePedidos = quantidadePedidos;
	}

}
