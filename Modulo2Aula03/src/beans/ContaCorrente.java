package beans;

import java.util.Random;

public class ContaCorrente {
	private double saldo;
	private String numero;
	private Cliente cliente;
	private double limiteEspecial;


	
	public ContaCorrente(Cliente cliente) {
		this.cliente = cliente;
		
		 Random r = new Random();
		    String randomNumber = String.format("%04d", Integer.valueOf(r.nextInt(1001)));
		    System.out.println("Seu numero de conta corrente é: " + randomNumber);
		    this.numero = randomNumber;
		
		
	}
	
	public ContaCorrente (double saldo, String numero, Cliente cliente, double limiteEspecial) {
		
		this.saldo = saldo;
		this.numero = numero;
		this.cliente = cliente;
		this.limiteEspecial = limiteEspecial;
		
		
		
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
	
	public void definirLimite() {
		if(saldo>0 && saldo <1000) {
			this.limiteEspecial = 1000;
		}else if (saldo>1000){
			this.limiteEspecial = 2000;}
		
		System.out.println("O seu limite especial é de : " + this.limiteEspecial);
		}
	
	
	

		
	}


