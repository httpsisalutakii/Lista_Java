package livro;

public class GerenciarEmprestimo {
	public boolean emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            return true;
        }
        return false;
    }

    public void devolverLivro(Livro livro) {
        livro.setDisponivel(true);
    }

    public void verificarDisponibilidade(Livro livro) {
        System.out.println(livro.isDisponivel() ? "Livro disponível." : "Livro indisponível.");
    }
}
