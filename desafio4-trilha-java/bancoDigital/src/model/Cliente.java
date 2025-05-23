package model;

public class Cliente {

	private static int SEQUENCIAL = 1;
	private final int codigo;
	private String nome;

	public Cliente() {
		this.codigo = SEQUENCIAL++;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

}
