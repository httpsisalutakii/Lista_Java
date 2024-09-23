package redesocial;

public class GerenciarAmigos {
	public void adicionarAmigo(RedeSocial rede, String usuario) {
        rede.getUsuarios().add(usuario);
        System.out.println("Amigo " + usuario + " adicionado à rede.");
    }
}
