package gocar;

public class Carro extends Veiculo {
    int portas;
    boolean arCondicionado;

    public Carro(String marca, String modelo, int ano, double precoBase, double tanqueCombustivel, double consumoMedio, int portas, boolean arCondicionado) {
        super(marca, modelo, ano, precoBase, tanqueCombustivel, consumoMedio);
        this.portas = portas;
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + portas);
        System.out.println("Ar Condicionado: " + (arCondicionado ? "Sim" : "Não"));
        System.out.println("----------------------");
    }
}