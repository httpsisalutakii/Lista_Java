package triangulo;

public class VerificarTriangulo {
	public boolean isTrianguloValido(Triangulo triangulo) {
        double a = triangulo.getLadoA();
        double b = triangulo.getLadoB();
        double c = triangulo.getLadoC();
        return a + b > c && a + c > b && b + c > a;
    }
}
