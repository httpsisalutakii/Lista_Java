package banco;

public class GerenciarContas {
	 public void abrirConta(String cliente) {
	        System.out.println("Conta aberta para o cliente " + cliente);
	    }

	    public void realizarDeposito(String cliente, double valor) {
	        System.out.println("Depósito de R$" + valor + " realizado na conta de " + cliente);
	    }

	    public void realizarSaque(String cliente, double valor) {
	        System.out.println("Saque de R$" + valor + " realizado na conta de " + cliente);
	    }

	    public void realizarTransferencia(String clienteOrigem, String clienteDestino, double valor) {
	        System.out.println("Transferência de R$" + valor + " da conta de " + clienteOrigem + " para " + clienteDestino);
	    }
}
