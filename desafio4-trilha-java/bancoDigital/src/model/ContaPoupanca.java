package model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, double saldoInicial) {
		super(cliente);
		saldo = saldoInicial;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		System.out.printf("%s realizou um deposito de: %.2f. Em sua conta poupança\n", cliente.getNome(), valor);
	}

	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.printf("%s realizou um saque de: %.2f. Em sua conta poupança\n", cliente.getNome(), valor);
		} else {
			System.out.printf("Saldo insuficiente na conta: %s\n", cliente.getNome());
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Poupanca ---");
		super.imprimirInfosComuns();
	}
}
