package classes;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opcaoGeral;
        
        do {
			System.out.println("\n### MENU IPHONE ###");
	        System.out.println("1 - Reprodutor Musical");
	        System.out.println("2 - Aparelho Telefonico");
	        System.out.println("3 - Navegador Internet");
	        System.out.println("0 - Sair");
	        System.out.print("Escolha: ");
	        opcaoGeral = scanner.nextInt();
	        scanner.nextLine();
			
	        switch (opcaoGeral) {
            case 1:
            	int opcao1;
            	
            	do {
        			System.out.println("\n### menu reprodutor musical ###");
        	        System.out.println("1 - Selecionar musica");
        	        System.out.println("2 - Pausar");
        	        System.out.println("3 - Tocar");
        	        System.out.println("0 - Sair");
        	        System.out.print("Escolha: ");
        	        opcao1 = scanner.nextInt();
        	        scanner.nextLine();
        			
        	        switch (opcao1) {
                    case 1:
                        System.out.println("Digite a música que deseja tocar");
                        String musica = scanner.nextLine();
                        iphone.selecionarMusica(musica);
                    
                        break;
                    case 2:
                    	iphone.pausar();
                        
                        break;
                    case 3:
                    	iphone.tocar();
                        
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
        	        
        		} while (opcao1 != 0);
                
                break;
            case 2:
            	int opcao2;
            	
            	do {
        			System.out.println("\n### menu aparelho telefonico ###");
        	        System.out.println("1 - Ligar");
        	        System.out.println("2 - Atender");
        	        System.out.println("3 - Iniciar correio de voz");
        	        System.out.println("0 - Sair");
        	        System.out.print("Escolha: ");
        	        opcao2 = scanner.nextInt();
        	        scanner.nextLine();
        			
        	        switch (opcao2) {
                    case 1:
                    	iphone.ligar("11999999999");
                    
                        break;
                    case 2:
                    	iphone.atender();
                        
                        break;
                    case 3:
                    	iphone.iniciarCorreioVoz();
                        
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
        	        
        		} while (opcao2 != 0);
                
                break;
            case 3:
            	int opcao3;
            	
            	do {
        			System.out.println("\n### menu navegador internet ###");
        	        System.out.println("1 - Ligar");
        	        System.out.println("2 - Atender");
        	        System.out.println("3 - Iniciar correio de voz");
        	        System.out.println("0 - Sair");
        	        System.out.print("Escolha: ");
        	        opcao3 = scanner.nextInt();
        	        scanner.nextLine();
        			
        	        switch (opcao3) {
                    case 1:
                    	iphone.exibirPagina("https://www.google.com");                   
                        break;
                    case 2:
                    	iphone.adicionarNovaAba();                       
                        break;
                    case 3:
                    	iphone.atualizarPagina();                     
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
        	        
        		} while (opcao3 != 0);       
                
                break;
            default:
                System.out.println("Opção inválida!");
        }
	        
		} while (opcaoGeral != 0);
			
		scanner.close();
    }
}
