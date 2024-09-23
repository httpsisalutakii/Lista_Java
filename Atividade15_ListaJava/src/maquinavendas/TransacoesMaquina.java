package maquinavendas;

public class TransacoesMaquina {
	private double saldoInserido;

    public void inserirDinheiro(double valor) {
        saldoInserido += valor;
        System.out.println("Dinheiro inserido: R$" + valor);
    }

    public void selecionarProduto(MaquinadeVendas maquina, String produto) {
        Double preco = maquina.getEstoque().get(produto);
        if (preco != null && saldoInserido >= preco) {
            saldoInserido -= preco;
            System.out.println("Produto " + produto + " comprado por R$" + preco);
            System.out.println("Troco: R$" + saldoInserido);
            saldoInserido = 0;
        } else {
            System.out.println("Saldo insuficiente ou produto não encontrado.");
        }
    }
}
