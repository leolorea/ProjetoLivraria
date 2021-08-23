package beans;

public class Produto {

		
	    private String descricao;
	    private String marca;
	    private float valor;
	    private boolean promocao = false;

	    // setters + getters
	    
	    public Produto() {}
	    
	    public Produto(String descricao, String marca, float valor, boolean promocao) {
	    	this.descricao = descricao;
	    	this.marca = marca;
	    	this.valor = valor;
	    	this.promocao = promocao;
	    }


	    public String getDescricao() {
	        return descricao;
	    }
	 
	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }
	 
	    public String getMarca() {
	        return marca;
	    }
	 
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	 
	    public float getValor() {
	        return valor;
	    }
	 
	    public void setValor(float valor) {
	        if (valor < 0) {
	            this.valor=0;
	        } else {
	            this.valor = valor;
	        }
	    }
	    
	    public void setPromocao(int tempromo) {
	    	if (tempromo == 1) {
	    		this.promocao = true;}else {this.promocao=false;
	    	}
	    }
	 
	    public String detalhe() {
	        return "Produto:" + descricao + " - Marca: " + marca;
	    }
	    
	    @Override
	    public String toString() {
	   
	    return this.descricao +" " +this.marca + " " +this.valor + " " +this.promocao;
	    }
	}


