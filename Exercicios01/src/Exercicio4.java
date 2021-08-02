import java.util.Scanner;

public class Exercicio4 {
	static String a;
	public static void main (String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a distância em centímetros do inimigo : ");
		
		int distancia = scanner.nextInt();
		
		if (distancia <= 70) {
			System.out.println("Arma ativada");
			}else {System.out.println("Arma desativada");}
		
		System.out.println(a);
		
		scanner.close();
	}
	

}
