package model;

public class ContaCorrente extends Conta {

	private double limite;
	public ContaCorrente(Cliente cliente, double saldoInicial) {
		super(cliente);
		saldo = saldoInicial;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		System.out.printf("%s realizou um deposito de: %.2f. Em sua conta corrente\n", cliente.getNome(), valor);
	}

	@Override
	public void sacar(double valor) {
		if (saldo - valor >= -limite) {
			saldo -= valor;
			System.out.printf("%s realizou um saque de: %.2f. Em sua conta corrente\n", cliente.getNome(), valor);
		} else {
			System.out.printf("Limite excedido na conta: %s\n", cliente.getNome());
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Corrente ---");
		super.imprimirInfosComuns();
	}
	
}
