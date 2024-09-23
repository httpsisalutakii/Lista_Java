package redesocial;

public class BuscarUsuarios {
	public void buscarUsuario(RedeSocial rede, String usuario) {
        if (rede.getUsuarios().contains(usuario)) {
            System.out.println("Usuário " + usuario + " encontrado.");
        } else {
            System.out.println("Usuário " + usuario + " não encontrado.");
        }
    }
}
