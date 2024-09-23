package carro;

public class GerenciarVelocidadeCarro {
	public void acelerar(Carro carro, double incremento) {
        carro.setVelocidadeAtual(carro.getVelocidadeAtual() + incremento);
    }

    public void frear(Carro carro, double decremento) {
        carro.setVelocidadeAtual(Math.max(0, carro.getVelocidadeAtual() - decremento));
    }

    public void exibirVelocidadeAtual(Carro carro) {
        System.out.println("Velocidade Atual: " + carro.getVelocidadeAtual() + " km/h");
    }
}
