package beans;

import java.util.Random;

public class ContaPoupanca {
	
	private Cliente cliente;
	private double saldo;
	private String numero;
	
	
	public ContaPoupanca(Cliente cliente) {
		this.cliente = cliente;
		
		 Random r = new Random();
		    String randomNumber = String.format("%04d", Integer.valueOf(r.nextInt(1001)));
		    System.out.println("Seu numero da conta poupança é: " + randomNumber);
		    this.numero = randomNumber;
	}
	
	public void definirLimite() {
		System.out.println("Operação invalida para essa operação");
	}
	
public double extrato() {
		
		return this.saldo;
	}
	
	public void depositaCC(double valorDeposito) {
		this.saldo = saldo + valorDeposito;
		System.out.println("Deposito efetuado com sucesso!");
		extrato();
	}
	
	public void saque(double valorSaque) {
		if (saldo>valorSaque) {
			this.saldo = saldo - valorSaque;
			System.out.println("Saque efetuado com sucesso!");
		}else {System.out.println("Saldo insuficiente!");}
		extrato();
	}
}
