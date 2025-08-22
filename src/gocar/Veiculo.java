package gocar;

import java.time.Year;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double precoBase;           // em Reais (R$)
    private double tanqueCombustivel;   // em litros (l)
    private double consumoMedio;        // em km/l

    public Veiculo(String marca, String modelo, int ano, double precoBase, double tanqueCombustivel, double consumoMedio) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setPrecoBase(precoBase);
        this.setTanqueCombustivel(tanqueCombustivel);
        this.setConsumoMedio(consumoMedio);
    }

    public double calcularDepreciacao() {
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - ano;
        double valorFinal = precoBase - (idade * 2000);
        return valorFinal > 0 ? valorFinal : 0;
    }

    public double calcularAutonomia() {
        return tanqueCombustivel * consumoMedio;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço base: R$" + precoBase);
        System.out.println("Tanque: " + tanqueCombustivel + " L");
        System.out.println("Consumo médio: " + consumoMedio + " km/l");
        System.out.println("Valor atual estimado: R$" + calcularDepreciacao());
        System.out.println("Autonomia estimada: " + calcularAutonomia() + " km");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null) {
           throw new Error("Marca precisa ser uma String");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null) {
            throw new Error("Modelo precisa ser uma String");
        }
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        int anoInvencaoCarro = 1886;
        int anoAtual = Year.now().getValue();
        if (ano > anoAtual+1) {
            throw new Error("Ano precisa ser menor que " + anoAtual+1);
        }else if (ano < anoInvencaoCarro) {
            throw new Error("Ano precisa ser mais novo que " + anoInvencaoCarro);
        }
        this.ano = ano;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase < 100) {
            throw new Error("Nosso sistema só aceita valores maiores que R$100,00");
        }else if (precoBase > 200000000) {
            throw new Error("Nosso sistema só aceita valores menores que R$200.000.000,00");
        }
        this.precoBase = precoBase;
    }

    public double getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public void setTanqueCombustivel(double tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
}