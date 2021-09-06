package beans;

import java.math.BigDecimal;

public class ContaBancaria {
	private BigDecimal saldo;
	private BigDecimal limite;

	public ContaBancaria(BigDecimal saldo, BigDecimal limite) {
		this.saldo = saldo;
		this.limite = limite;
	}

	public void deposita(BigDecimal valorDeposito) {
		saldo = valorDeposito.add(saldo);
		
		
		try {if (valorDeposito.compareTo(new BigDecimal("1000")) ==1) {
			throw new depositoIrregularException();
		}}catch(depositoIrregularException e) {
			System.out.println("Valor de deposito não permitido");
		}
	}
	
	public void saque(BigDecimal valorSaque) {
	try {
		if (valorSaque.compareTo(saldo)==1 || valorSaque.compareTo(new BigDecimal("500"))==1){
			throw new SaldoInsuficienteException();
			
			
		}else {
			this.saldo = saldo.subtract(valorSaque);
		}
	}catch(SaldoInsuficienteException e) {System.out.println("Saldo Insuficiente!");}
	}
	
	@Override
	public String toString() {
		
		return "saldo : " + this.saldo.toString() + " limite: " + this.limite.toString();
	}
	
}
