package aluno;

public class VerificarSituacao {
	 public String verificarNotas(Aluno aluno, CalcularNotas calculadoraNotas) {
	        return calculadoraNotas.calcularNotas(aluno) >= 7.0 ? "Aprovado" : "Reprovado";
	    }
}
