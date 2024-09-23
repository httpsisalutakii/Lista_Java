package banco;

public class GerenciarClientes {
	public void cadastrarCliente(Banco banco, String cliente) {
        System.out.println("Cliente " + cliente + " cadastrado no banco " + banco.getNomeBanco());
    }
}
