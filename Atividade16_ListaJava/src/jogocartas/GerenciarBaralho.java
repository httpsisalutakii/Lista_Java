package jogocartas;

import java.util.Collections;

public class GerenciarBaralho {
	public void embaralharCartas(JogoCartas jogo) {
        Collections.shuffle(jogo.getBaralho());
        System.out.println("Cartas embaralhadas.");
    }
}
