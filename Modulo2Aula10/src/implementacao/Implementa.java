package implementacao;

import java.util.Scanner;

import bean.Veiculo;
import dao.VeiculoDAO;

public class Implementa {

	public static void main(String[] args) {
		
		int menu = 0;
		VeiculoDAO dao = new VeiculoDAO();
		Scanner scanner = new Scanner(System.in);
		
		while (menu!=5) {
			System.out.println("Digite 1 para adicionar um veiculo");
			System.out.println("Digite 2 para atualizar um veiculo");
			System.out.println("Digite 3 para consultar um veiculo");
			System.out.println("Digite 4 para remover um veiculo");
			System.out.println("Digite 5 para ver o menu");
			menu = scanner.nextInt();
			
			switch (menu) {
			
			case 1:
				dao.adicionar(new Veiculo());
				
				break;
				
			case 2:
				dao.atualizar();
				break;
				
			case 3:
				dao.consultar();
				break;
				
			case 4:dao.apagar();
				break;
				
			default :
				
				System.out.println("Digite 1 para adicionar um veiculo");
				System.out.println("Digite 2 para atualizar um veiculo");
				System.out.println("Digite 3 para consultar um veiculo");
				System.out.println("Digite 4 para remover um veiculo");
				System.out.println("Digite 5 para ver o menu");
					break;
			
			}
			scanner.close();
			
		
	

	}

}
}
