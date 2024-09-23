package funcionario;

public class CalcularSalarios {
	public double calcularSalarioLiquido(Funcionario Funcionario) {
        double impostos = calcularImpostos(Funcionario.getSalario());
        double beneficios = calcularBeneficios(Funcionario.getSalario());
        return Funcionario.getSalario() - impostos + beneficios;
    }

    private double calcularImpostos(double salario) {
        return salario * 0.2;
    }

    private double calcularBeneficios(double salario) {
        return salario * 0.1;
    }
}
