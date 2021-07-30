import java.util.Scanner;

public class Exercicio6 {
	
public static void main (String[] args) {
	
	String cupom = "DIADEFESTA";	
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o valor da compra : ");
	int valorCompra = scanner.nextInt();
	
	System.out.println("Digite o cupom");
	String cupomDigitado = scanner.next();
	System.out.println(cupomDigitado);
	
	if (cupomDigitado.equals(cupom)) 
	{System.out.println("Você recebeu um desconto de 3%, o valor final será de  R$ " + (valorCompra*1.03));
	}else {System.out.println("cumpom inválido");}
	
	scanner.close();
	
	
	
}
}
