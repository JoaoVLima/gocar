package gocar;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- GoCar Loja de carros e Mecanica  ---");
        System.out.println();
        System.out.println("Veja a seguir nossos carros:");
        System.out.println();


        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 90000, 30, 10, 4, false);
        Carro carro2 = new Carro("Fiat", "Uno", 2015, 40000, 40, 15, 2, true);
        Carro carro3 = new Carro("Honda", "Civic", 2018, 80000, 50, 20, 4, true);

        carro1.exibirInfo();
        carro2.exibirInfo();
        carro3.exibirInfo();
    }
}