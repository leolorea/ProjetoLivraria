package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Veiculo;

public class VeiculoDAO {

	List<Veiculo> listaVeiculos = new ArrayList<>();

	public void adicionar(Veiculo veiculo) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite para adicionar o modelo do veiculo");
		String modelo = scanner.next();
		System.out.println("Digite para adicionar a placa do veiculo");
		String placa = scanner.next();
		System.out.println("Digite para adcionar a potencia do veiculo");
		String potencia = scanner.next();

		veiculo.setModelo(modelo);
		veiculo.setPlaca(placa);
		veiculo.setPotencia(potencia);

		listaVeiculos.add(veiculo);
	}

	public void atualizar() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a placa do veiculo que deseja atualizar:");
		String placaConsulta = scanner.next();

		for (Veiculo veiculo2 : listaVeiculos) {

			if (veiculo2.getPlaca().equals(placaConsulta)) {

				System.out.println("Digite para atualizar o modelo do veiculo");
				String modelo = scanner.next();
				System.out.println("Digite para atualizar a placa do veiculo");
				String placa = scanner.next();
				System.out.println("Digite para atualizar a potencia do veiculo");
				String potencia = scanner.next();

				veiculo2.setModelo(modelo);
				veiculo2.setPlaca(placa);
				veiculo2.setPotencia(potencia);

			
			}
		}

	}

	public void consultar() {

		for (Veiculo veiculo : listaVeiculos) {
			System.out.println(veiculo);
		}

	}

	public void apagar() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a placa do veiculo que deseja atualizar:");
		String placaConsulta = scanner.next();

		for (Veiculo veiculo : listaVeiculos) {
			if (veiculo.getPlaca().equals(placaConsulta)) {

				listaVeiculos.remove(veiculo);
			}
		}
	}
	

}
