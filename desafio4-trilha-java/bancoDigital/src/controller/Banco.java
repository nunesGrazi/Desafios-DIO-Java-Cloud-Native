package controller;

import model.Cliente;
import model.Conta;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void listarClientes() {
		//Listas clientes do banco a partir de seu código
		Set<String> codigosUnicos = getContas().stream()
				.map(conta -> "Nome: " + conta.getCliente().getNome() +
						" - Código: " + conta.getCliente().getCodigo())
				.collect(Collectors.toSet());

		codigosUnicos.forEach(System.out::println);
	}

}
