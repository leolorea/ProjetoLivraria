import java.util.Scanner;

public class Exercicio02 {
	
	public static void main (String[] args) {
		
		System.out.println("Quantos minutos de duração tem o filme?");
		Scanner scanner = new Scanner(System.in);
		int tempoFilme = scanner.nextInt();

		System.out.println("O filme tem duração de " + (tempoFilme *60) + " segundos");
		System.out.println("O filme tem duração de " + (tempoFilme /(double) 60) + " horas");
		
		scanner.close();
	
	}

}
