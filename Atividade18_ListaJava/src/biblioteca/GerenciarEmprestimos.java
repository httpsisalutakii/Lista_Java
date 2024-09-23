package biblioteca;

public class GerenciarEmprestimos {
	public void emprestarLivro(Biblioteca biblioteca, String titulo) {
        if (biblioteca.getLivros().getOrDefault(titulo, false)) {
            biblioteca.getLivros().put(titulo, false);
            System.out.println("Livro " + titulo + " emprestado.");
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void devolverLivro(Biblioteca biblioteca, String titulo) {
        biblioteca.getLivros().put(titulo, true);
        System.out.println("Livro " + titulo + " devolvido.");
    }
}
