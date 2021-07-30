import java.util.Scanner;

public class Exercício5 {
	
	public static void main (String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Informe o peso do primeiro lixo");
	int lixoA = scanner.nextInt();
	System.out.println("Informe o peso do segundo lixo");
	int lixoB = scanner.nextInt();
	System.out.println("Informe o peso do terceiro lixo");
	int lixoC = scanner.nextInt();
	
	
	if (lixoA < lixoB || lixoA< lixoC) {
		System.out.println(	"O primeiro lixo deve ser carregado");
	}else if(lixoB < lixoA || lixoB < lixoC) {
		System.out.println("O segundo lixo deve ser carregado");
	}else { System.out.println("O terceiro lixo deve ser carregado");}
	
	scanner.close();
}
}
