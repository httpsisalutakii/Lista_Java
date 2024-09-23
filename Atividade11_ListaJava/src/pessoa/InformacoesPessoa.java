package pessoa;

public class InformacoesPessoa {
	public void exibirInformacoes(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Profissão: " + pessoa.getProfissao());
    }
}
