package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	static int[] nota  = {5,7,10,3};
	static double media = 0;
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i<4 ;i++) {
			
			media = media + nota[i];
			
			
		}
		double mediafinal = media/nota.length;
		System.out.println(mediafinal);
		
		

	}

}
