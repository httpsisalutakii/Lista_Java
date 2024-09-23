package agenda;

public class GerenciarContatos {
	public void adicionarContato(Agenda agenda, String nome, String telefone) {
        agenda.getContatos().put(nome, telefone);
        System.out.println("Contato adicionado: " + nome + " - " + telefone);
    }

    public void editarContato(Agenda agenda, String nome, String novoTelefone) {
        agenda.getContatos().put(nome, novoTelefone);
        System.out.println("Contato atualizado: " + nome + " - " + novoTelefone);
    }

    public void removerContato(Agenda agenda, String nome) {
        agenda.getContatos().remove(nome);
        System.out.println("Contato removido: " + nome);
    }

    public void buscarContatoPorNome(Agenda agenda, String nome) {
        String telefone = agenda.getContatos().get(nome);
        if (telefone != null) {
            System.out.println("Contato encontrado: " + nome + " - " + telefone);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}
