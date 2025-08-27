package gocar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- GoCar Loja de carros e Mecanica  ---");
        System.out.println();
        System.out.println("Veja a seguir nossos carros:");
        System.out.println();


        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 90000, 30, 10, 4, false);
        Carro carro2 = new Carro("Fiat", "Uno", 2015, 40000, 40, 15, 2, true);
        Carro carro3 = new Carro("Honda", "Civic", 2018, 80000, 50, 20, 4, true);

        boolean rodando = true;

        while (rodando) {
            System.out.println("\n--- GoCar Loja de Carros ---");
            System.out.println("1 - Ver modelos disponíveis");
            System.out.println("2 - Selecionar marca e ver detalhes");
            System.out.println("3 - Fechar aplicativo");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nModelos disponíveis:");
                    System.out.println("- " + carro1.getMarca() + " " + carro1.getModelo());
                    System.out.println("- " + carro2.getMarca() + " " + carro2.getModelo());
                    System.out.println("- " + carro3.getMarca() + " " + carro3.getModelo());
                    break;

                case 2:
                    System.out.println("\nEscolha a marca:");
                    System.out.println("1 - Toyota");
                    System.out.println("2 - Fiat");
                    System.out.println("3 - Honda");
                    System.out.println("4 - Voltar");
                    System.out.print("Digite a opção: ");
                    int escolha = sc.nextInt();

                    switch (escolha) {
                        case 1: carro1.exibirInfo(); break;
                        case 2: carro2.exibirInfo(); break;
                        case 3: carro3.exibirInfo(); break;
                        case 4: break; // volta pro menu
                        default: System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando aplicativo...");
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}