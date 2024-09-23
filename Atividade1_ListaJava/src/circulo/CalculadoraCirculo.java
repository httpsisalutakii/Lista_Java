package circulo;

public class CalculadoraCirculo {
	    public double calcularArea(Circulo circulo) {
	        return Math.PI * Math.pow(circulo.getRaio(), 2);
	    }

	    public double calcularPerimetro(Circulo circulo) {
	        return 2 * Math.PI * circulo.getRaio();
	    }
}
