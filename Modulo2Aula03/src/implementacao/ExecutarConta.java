package implementacao;

import java.util.Scanner;

import beans.Cliente;
import beans.ContaCorrente;
import beans.ContaPoupanca;

public class ExecutarConta {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	
	System.out.println("Abrindo uma conta");
	
	
	 
	 System.out.println("Digite o seu nome:");
	 String nome = scanner.next();
	 System.out.println("Digite o seu endereço:");
	 String endereço = scanner.next();
	 System.out.println("Digite o seu cpf: ");
	 String cpf = scanner.next();
	 System.out.println("Digite o seu rg: ");
	 String rg = scanner.next();
	 
	 Cliente cliente = new Cliente(nome, endereço, cpf, rg);
	 ContaPoupanca poupanca = new ContaPoupanca(cliente);
	 ContaCorrente contaCorrente = new ContaCorrente(cliente);
	 int menu = 0;
	 
	 	System.out.println("Digite 1 para depositar: ");
		System.out.println("Digite 2 para sacar: ");
		System.out.println("Digite 3 para ver extrato: ");
		System.out.println("Digite 4 para sair do sistema...");
		
	 while(menu != 5) {
		menu=  scanner.nextInt();
		
		
		 switch (menu) {
		 
		 
		 case 1 : 
			 
			 System.out.println("Digite o valor que você quer depositar: ");
			 int deposita = scanner.nextInt();
			 contaCorrente.depositaCC(deposita);
			 
			 break;
			 
		 case 2: 
			 
			 System.out.println("Digite o valor que você quer sacar: ");
			 int saca = scanner.nextInt();
			 contaCorrente.saque(saca);
			 break;
			 
		 case 3:
			 
			 System.out.println(contaCorrente.extrato() + poupanca.extrato());
			 
			 break;
			 
		 case 4 :
			 
			 contaCorrente.definirLimite();
			 
		 case 5 :
			 
			 System.out.println("Saindo do sistema...");
			 
		 default:
			 
			 System.out.println("Digite 1 para depositar: ");
				System.out.println("Digite 2 para sacar: ");
				System.out.println("Digite 3 para ver extrato: ");
				System.out.println("Digite 4 para sair do sistema...");
		 
		 
	 }
	 }
	 
	 
	}

}
