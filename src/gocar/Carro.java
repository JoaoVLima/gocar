package gocar;

public class Carro extends Veiculo {
    int portas;
    boolean arCondicionado;
    String tipoCambio;
    int capacidadePortaMalas;
    String tipoCarroceria;
    int airbags;
    boolean tetoSolar;

    public Carro(String marca, String modelo, int ano, double precoBase, double tanqueCombustivel, double consumoMedio,
                 int portas, boolean arCondicionado, String tipoCambio, int capacidadePortaMalas,
                 String tipoCarroceria, int airbags, boolean tetoSolar) {
        super(marca, modelo, ano, precoBase, tanqueCombustivel, consumoMedio);
        this.portas = portas;
        this.arCondicionado = arCondicionado;
        this.tipoCambio = tipoCambio;
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.tipoCarroceria = tipoCarroceria;
        this.airbags = airbags;
        this.tetoSolar = tetoSolar;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + portas);
        System.out.println("Ar Condicionado: " + (arCondicionado ? "Sim" : "Não"));
        System.out.println("Câmbio: " + tipoCambio);
        System.out.println("Porta-Malas: " + capacidadePortaMalas + "L");
        System.out.println("Carroceria: " + tipoCarroceria);
        System.out.println("Airbags: " + airbags);
        System.out.println("Teto Solar: " + (tetoSolar ? "Sim" : "Não"));
        System.out.println("----------------------");
    }
}
