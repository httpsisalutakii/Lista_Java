package contabancaria;

public class GerenciadorTransacao {
	public void depositar(ContaBancaria conta, double valor) {
        if (valor > 0) {
            conta.setSaldo(conta.getSaldo() + valor);
        }
    }

    public boolean sacar(ContaBancaria conta, double valor) {
        if (valor > 0 && valor <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - valor);
            return true;
        }
        return false;
    }
}
