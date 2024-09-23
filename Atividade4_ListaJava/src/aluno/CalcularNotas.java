package aluno;

public class CalcularNotas {
	public double calcularNotas(Aluno aluno) {
        double soma = 0;
        for (double nota : aluno.getNotas()) {
            soma += nota;
        }
        return soma / aluno.getNotas().length;
    }
}
