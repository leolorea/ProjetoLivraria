import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite o ano de seu nascimento: ");
		Scanner scanner = new Scanner(System.in);
		int anoNascimento;
		anoNascimento = scanner.nextInt();
		int agora = 2021;
		int idade = agora - anoNascimento; 
		System.out.println("Em 31 de dezembro de 2021 você terá : " + idade + " anos");
		scanner.close();

	}

}
