package jogocartas;

import java.util.ArrayList;
import java.util.List;

public class JogoCartas {
	private List<String> baralho;

    public JogoCartas() {
        this.baralho = new ArrayList<>();
        String[] cores = {"Vermelho", "Azul", "Verde", "Amarelo"};
        String[] valores = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "Pular", "Inverter"};
        for (String cor : cores) {
            for (String valor : valores) {
                baralho.add(cor + " " + valor);
            }
        }
    }

    public List<String> getBaralho() {
        return baralho;
    }
}
