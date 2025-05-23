package view;

import controller.Banco;
import interfaces.IConta;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		System.out.println("--- Ações ---");

		List<Conta> contas = new ArrayList<Conta>();

		Cliente jose = new Cliente();
		jose.setNome("José Amaro Gonçalves dos Santos");
		
		Conta correnteJose = new ContaCorrente(jose, 1200);

		correnteJose.depositar(100);

		Cliente ana = new Cliente();
		ana.setNome("Ana Cristina de Souza Silva");

		Conta correnteAna = new ContaCorrente(ana, 2000);
		Conta poupancaAna = new ContaPoupanca(ana, 0);

		poupancaAna.depositar(1000);
		correnteAna.sacar(100);

		System.out.println("--- Lista de Clientes do Banco ---");

		contas.add(correnteAna);
		contas.add(poupancaAna);
		contas.add(correnteJose);

		Banco banco = new Banco();
		banco.setNome("Itaú");
		banco.setContas(contas);
		banco.listarClientes();

		correnteJose.imprimirExtrato();
		correnteAna.imprimirExtrato();
		poupancaAna.imprimirExtrato();
	}

}
