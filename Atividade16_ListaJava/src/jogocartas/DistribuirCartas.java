package jogocartas;

import java.util.ArrayList;
import java.util.List;

public class DistribuirCartas {
	public List<String> distribuirCartas(JogoCartas jogo, int quantidade) {
        List<String> cartasDistribuidas = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            cartasDistribuidas.add(jogo.getBaralho().remove(0));
        }
        return cartasDistribuidas;
    }
}
