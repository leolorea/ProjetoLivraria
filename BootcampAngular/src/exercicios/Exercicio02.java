package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main (String[] args) {
	
	
		
	String[][][] lista = new String[4][4][4];
	
	for (int i = 1; i< lista.length; i++) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero de telefone: ");
		lista[0][0][i] = scanner.next(); 
		
		System.out.println("Digite a cidade: ");
		lista[0][i][0] = scanner.next();	
		
		System.out.println("Digite o nome:  ");
		lista[i][0][0] = scanner.next();
	}
	
for (int i = 1; i< lista.length; i++) {
		
		System.out.println(" telefone : " + lista[0][0][i]);
		
		System.out.println("cidade: " + lista[0][i][0]);
				
		System.out.println("nome : " + lista[i][0][0]);
		
	
	
	}
	
}
}
