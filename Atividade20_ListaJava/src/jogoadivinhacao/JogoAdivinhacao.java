package jogoadivinhacao;

import java.util.Random;

public class JogoAdivinhacao {
	 private int numeroAleatorio;

	    public JogoAdivinhacao() {
	        gerarNumeroAleatorio();
	    }

	    public int getNumeroAleatorio() {
	        return numeroAleatorio;
	    }

	    private void gerarNumeroAleatorio() {
	        Random random = new Random();
	        this.numeroAleatorio = random.nextInt(100) + 1;
	    }
}
