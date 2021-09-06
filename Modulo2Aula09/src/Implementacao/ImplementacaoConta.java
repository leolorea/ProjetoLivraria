package Implementacao;

import java.math.BigDecimal;
import java.util.Scanner;

import beans.ContaBancaria;

public class ImplementacaoConta {
	static ContaBancaria conta;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu = 0;

	
		
		while (menu != 4) {
			
			System.out.println("Digite 1 para criar nova conta");
			System.out.println("Digite 2 para sacar");
			System.out.println("Digite 3 para depositar");
			System.out.println("Digite 4 para criar nova conta");
			System.out.println("Digite 5 para ver o saldo");
			System.out.println("Digite 6 para ver o menu");

			menu = scanner.nextInt();
			switch (menu) {

			case 1:
				System.out.println("Digite o valor do deposito inicial e limite");
				String depositoInicial = scanner.next();
				String limiteInicial = scanner.next();

				conta = new ContaBancaria(new BigDecimal(depositoInicial), new BigDecimal(limiteInicial));
				break;
			case 2:
				System.out.println("Digite o valor do saque");
				String saque = scanner.next();

				conta.saque(new BigDecimal(saque));

				break;
				
			case 3:
				System.out.println("Digite o valor do deposito");
				String deposito = scanner.next();

				conta.deposita(new BigDecimal(deposito));

				break;
			case 4:
					System.out.println("Saindo...");
				break;
				
			case 5: 
				System.out.println(conta);
				break;
			default:
				System.out.println("Digite 1 para criar nova conta");
				System.out.println("Digite 2 para sacar");
				System.out.println("Digite 3 para depositar");
				System.out.println("Digite 4 para criar nova conta");
				System.out.println("Digite 5 para ver o menu");
				break;
			}
		}
	}

}
