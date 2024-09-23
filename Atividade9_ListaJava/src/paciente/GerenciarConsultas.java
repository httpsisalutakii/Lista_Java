package paciente;

public class GerenciarConsultas {
	public void adicionarConsulta(Paciente paciente, String consulta) {
        paciente.getHistoricoConsultas().add(consulta);
    }

    public void exibirConsultas(Paciente paciente) {
        System.out.println("Consultas de " + paciente.getNome() + ":");
        for (String consulta : paciente.getHistoricoConsultas()) {
            System.out.println(consulta);
        }
    }
}
