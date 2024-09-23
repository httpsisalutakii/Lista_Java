package maquinavendas;

import java.util.Map.Entry;

public class GerenciarEstoque {
	 public void cadastrarProduto(MaquinadeVendas maquina, String produto, double preco) {
	        maquina.getEstoque().put(produto, preco);
	        System.out.println("Produto " + produto + " cadastrado na máquina com preço de R$" + preco);
	    }

	    public void exibirEstoque(MaquinadeVendas maquina) {
	        System.out.println("Estoque da Máquina:");
	        for (Entry<String, Double> entry : maquina.getEstoque().entrySet()) {
	            System.out.println("Produto: " + entry.getKey() + " - Preço: R$" + entry.getValue());
	        }
	    }
}
