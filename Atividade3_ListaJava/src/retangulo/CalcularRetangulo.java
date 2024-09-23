package retangulo;

public class CalcularRetangulo {
	public double calcularArea(Retangulo retangulo) {
        return retangulo.getLargura() * retangulo.getAltura();
    }

    public double calcularPerimetro(Retangulo retangulo) {
        return 2 * (retangulo.getLargura() + retangulo.getAltura());
    }
}
