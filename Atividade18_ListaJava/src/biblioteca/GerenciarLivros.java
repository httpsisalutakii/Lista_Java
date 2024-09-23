package biblioteca;

public class GerenciarLivros {
	public void cadastrarLivro(Biblioteca biblioteca, String titulo) {
        biblioteca.getLivros().put(titulo, true);
        System.out.println("Livro " + titulo + " cadastrado na biblioteca.");
    }
}
