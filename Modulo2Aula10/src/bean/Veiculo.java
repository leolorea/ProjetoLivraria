package bean;

public class Veiculo {
	
	private String potencia;
	private String placa;
	private String modelo;
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
@Override
public String toString() {
	return "Veicul: " + this.modelo + " Placa: " + this.placa + " Potencia: " + this.potencia; 
}
}
