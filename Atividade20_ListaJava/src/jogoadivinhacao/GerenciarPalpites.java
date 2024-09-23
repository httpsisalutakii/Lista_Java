package jogoadivinhacao;

public class GerenciarPalpites {
	public void fazerPalpite(JogoAdivinhacao jogo, int palpite) {
        if (palpite == jogo.getNumeroAleatorio()) {
            System.out.println("Parabéns! Você acertou o número: " + palpite);
        } else if (palpite > jogo.getNumeroAleatorio()) {
            System.out.println("O número é menor que " + palpite);
        } else {
            System.out.println("O número é maior que " + palpite);
        }
    }
}
