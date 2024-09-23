package produto;

public class GerenciarEstoque {
	public double calcularValorTotalEmEstoque(Produto produto) {
        return produto.getPreco() * produto.getQuantidadeEstoque();
    }

    public boolean verificarDisponibilidade(Produto produto) {
        return produto.getQuantidadeEstoque() > 0;
    }
}
