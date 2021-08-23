package implementacao;

import javax.swing.JOptionPane;


import beans.Produto;
import util.Input;

public class ExecutarProduto {
	
	

	public static void main(String[] args) {
		Produto micro = new Produto();
		String teste = Input.texto("Teste");
		micro.setMarca(teste);
		
		System.out.println(teste);
		
		Produto telefone = new Produto("telefone", "Samsung", 1200, true);
System.out.println(telefone);


String promo = JOptionPane.showInputDialog("Digite 1 para ativar a promoção");


telefone.setPromocao((int) Float.parseFloat(promo));

System.out.println(telefone);
	}

}
