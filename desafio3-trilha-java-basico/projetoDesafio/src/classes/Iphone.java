package classes;

import interfaces.reprodutorMusical;
import interfaces.aparelhoTelefonico;
import interfaces.navegadorInternet;

public class Iphone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet {

	//reprodutorMusical
	@Override
	public void tocar() {
		System.out.println("Música está tocando...");
	}

	@Override
	public void pausar() {
		System.out.println("Música está pausada");		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada " + musica);	
	}

	//aparelhoTelefonico
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);	
	}

	@Override
	public void atender() {
		System.out.println("Atendendo telefone...");	
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz selecionado");	
	}

	//navegadorInternet
	@Override
	public void exibirPagina(String url) {
		System.out.println("Página " + url + " exibida");	
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");	
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");
	}

}
