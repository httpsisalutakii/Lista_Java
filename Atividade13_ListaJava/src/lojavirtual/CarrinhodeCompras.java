package lojavirtual;

public class CarrinhodeCompras {
	private double valorTotal;

    public void adicionarProdutoAoCarrinho(String produto, double preco) {
        System.out.println("Produto " + produto + " adicionado ao carrinho com preço de R$" + preco);
        valorTotal += preco;
    }

    public double calcularTotalCompra() {
        return valorTotal;
    }

    public void aplicarDesconto(double percentualDesconto) {
        valorTotal -= valorTotal * (percentualDesconto / 100);
    }
}
