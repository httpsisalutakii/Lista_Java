package triangulo;

public class CalcularAreaTriangulo {
	 public double calcularArea(Triangulo triangulo) {
	        double a = triangulo.getLadoA();
	        double b = triangulo.getLadoB();
	        double c = triangulo.getLadoC();
	        double s = (a + b + c) / 2;
	        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	    }
}
