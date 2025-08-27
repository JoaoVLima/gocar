package gocar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Toyota", "Corolla", 2020, 90000, 50, 12, 4, true, "Automático", 470, "Sedan", 6, true));
        carros.add(new Carro("Honda", "Civic", 2019, 85000, 47, 13, 4, true, "Manual", 430, "Sedan", 4, false));
        carros.add(new Carro("Fiat", "Uno", 2015, 30000, 40, 15, 2, false, "Manual", 290, "Hatch", 2, false));
        carros.add(new Carro("Volkswagen", "Gol", 2017, 35000, 45, 14, 4, false, "Manual", 320, "Hatch", 2, false));
        carros.add(new Carro("Ford", "Ka", 2018, 42000, 43, 13, 4, false, "Manual", 300, "Hatch", 2, false));
        carros.add(new Carro("Chevrolet", "Onix", 2021, 70000, 48, 16, 4, true, "Automático", 370, "Hatch", 4, false));
        carros.add(new Carro("Hyundai", "HB20", 2020, 65000, 47, 15, 4, true, "Automático", 360, "Hatch", 4, false));
        carros.add(new Carro("Renault", "Kwid", 2019, 35000, 40, 18, 4, false, "Manual", 290, "Hatch", 2, false));
        carros.add(new Carro("Peugeot", "208", 2021, 80000, 44, 14, 4, true, "Automático", 310, "Hatch", 4, false));
        carros.add(new Carro("Citroën", "C3", 2018, 50000, 45, 14, 4, true, "Manual", 300, "Hatch", 2, false));
        carros.add(new Carro("Nissan", "Sentra", 2017, 60000, 50, 12, 4, true, "Automático", 510, "Sedan", 6, false));
        carros.add(new Carro("Mitsubishi", "Lancer", 2016, 75000, 55, 11, 4, true, "Automático", 490, "Sedan", 6, true));
        carros.add(new Carro("Kia", "Cerato", 2020, 95000, 50, 12, 4, true, "Automático", 500, "Sedan", 6, true));
        carros.add(new Carro("Jeep", "Renegade", 2019, 105000, 60, 10, 4, true, "Automático", 525, "SUV", 6, true));
        carros.add(new Carro("Chevrolet", "Prisma", 2018, 58000, 48, 13, 4, false, "Manual", 410, "Sedan", 4, false));
        carros.add(new Carro("Volkswagen", "Virtus", 2020, 85000, 50, 14, 4, true, "Automático", 475, "Sedan", 6, true));
        carros.add(new Carro("Ford", "Focus", 2017, 78000, 52, 12, 4, true, "Manual", 420, "Hatch", 4, false));
        carros.add(new Carro("Toyota", "Yaris", 2021, 88000, 47, 15, 4, true, "Automático", 370, "Hatch", 4, false));
        carros.add(new Carro("Honda", "Fit", 2019, 72000, 46, 14, 4, true, "Manual", 380, "Hatch", 4, false));
        carros.add(new Carro("Hyundai", "Creta", 2021, 110000, 55, 12, 4, true, "Automático", 500, "SUV", 6, true));
        carros.add(new Carro("Renault", "Sandero", 2018, 45000, 48, 14, 4, false, "Manual", 320, "Hatch", 2, false));
        carros.add(new Carro("Peugeot", "2008", 2020, 95000, 50, 12, 4, true, "Automático", 410, "SUV", 6, true));
        carros.add(new Carro("Citroën", "Aircross", 2019, 78000, 52, 13, 4, true, "Automático", 390, "SUV", 4, true));
        carros.add(new Carro("Nissan", "Versa", 2021, 88000, 47, 15, 4, true, "Automático", 480, "Sedan", 6, false));
        carros.add(new Carro("Kia", "Sportage", 2021, 130000, 60, 11, 4, true, "Automático", 503, "SUV", 6, true));
        carros.add(new Carro("Mitsubishi", "ASX", 2020, 125000, 58, 11, 4, true, "Automático", 510, "SUV", 6, true));
        carros.add(new Carro("Chevrolet", "Tracker", 2021, 120000, 55, 12, 4, true, "Automático", 480, "SUV", 6, true));
        carros.add(new Carro("Volkswagen", "T-Cross", 2021, 118000, 54, 12, 4, true, "Automático", 500, "SUV", 6, true));
        carros.add(new Carro("Ford", "EcoSport", 2020, 105000, 52, 13, 4, true, "Automático", 410, "SUV", 6, false));
        carros.add(new Carro("Toyota", "Hilux", 2021, 220000, 80, 9, 4, true, "Automático", 1000, "Picape", 6, true));
        carros.add(new Carro("Honda", "HR-V", 2021, 115000, 55, 12, 4, true, "Automático", 470, "SUV", 6, true));
        carros.add(new Carro("Hyundai", "Tucson", 2020, 130000, 60, 11, 4, true, "Automático", 488, "SUV", 6, true));
        carros.add(new Carro("Renault", "Duster", 2021, 95000, 50, 12, 4, true, "Manual", 475, "SUV", 4, false));
        carros.add(new Carro("Peugeot", "3008", 2021, 180000, 65, 10, 4, true, "Automático", 520, "SUV", 6, true));
        carros.add(new Carro("Citroën", "C4 Cactus", 2021, 100000, 52, 12, 4, true, "Automático", 410, "SUV", 4, false));
        carros.add(new Carro("Nissan", "Kicks", 2021, 110000, 55, 13, 4, true, "Automático", 470, "SUV", 6, true));
        carros.add(new Carro("Kia", "Seltos", 2021, 125000, 57, 12, 4, true, "Automático", 480, "SUV", 6, true));
        carros.add(new Carro("Mitsubishi", "Outlander", 2021, 180000, 70, 10, 4, true, "Automático", 560, "SUV", 6, true));
        carros.add(new Carro("Chevrolet", "Spin", 2020, 90000, 52, 12, 7, true, "Automático", 550, "Minivan", 6, false));
        carros.add(new Carro("Volkswagen", "Jetta", 2020, 135000, 60, 11, 4, true, "Automático", 500, "Sedan", 6, true));
        carros.add(new Carro("Ford", "Fusion", 2019, 160000, 65, 10, 4, true, "Automático", 520, "Sedan", 6, true));
        carros.add(new Carro("Toyota", "Etios", 2018, 50000, 45, 14, 4, false, "Manual", 310, "Hatch", 2, false));
        carros.add(new Carro("Honda", "City", 2020, 95000, 47, 14, 4, true, "Automático", 420, "Sedan", 6, false));
        carros.add(new Carro("Hyundai", "Elantra", 2019, 110000, 55, 12, 4, true, "Automático", 490, "Sedan", 6, true));
        carros.add(new Carro("Renault", "Logan", 2018, 48000, 48, 14, 4, false, "Manual", 310, "Sedan", 2, false));
        carros.add(new Carro("Peugeot", "408", 2017, 60000, 52, 12, 4, true, "Automático", 420, "Sedan", 6, false));
        carros.add(new Carro("Citroën", "C5", 2016, 70000, 55, 11, 4, true, "Automático", 470, "Sedan", 6, true));
        carros.add(new Carro("Nissan", "Altima", 2019, 140000, 60, 11, 4, true, "Automático", 490, "Sedan", 6, true));
        carros.add(new Carro("Kia", "Optima", 2018, 120000, 58, 12, 4, true, "Automático", 500, "Sedan", 6, true));
        carros.add(new Carro("Mitsubishi", "Pajero", 2020, 220000, 75, 8, 4, true, "Automático", 800, "SUV", 8, true));

        boolean rodando = true;

        while (rodando) {
            System.out.println("\n--- GoCar Loja de Carros ---");
            System.out.println("1 - Ver modelos disponíveis");
            System.out.println("2 - Procurar por marca e ver detalhes");
            System.out.println("3 - Fechar aplicativo");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nModelos disponíveis:");
                    for (Carro c : carros) {
                        System.out.println("- " + c.getMarca() + " " + c.getModelo());
                    }
                    break;

                case 2:
                    System.out.print("Digite a marca que deseja pesquisar: ");
                    String marcaBusca = sc.nextLine();


                    boolean encontrou = false;
                    for (Carro c : carros) {
                        if (c.getMarca().equalsIgnoreCase(marcaBusca)) {
                            c.exibirInfo();
                            encontrou = true;
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Nenhum carro encontrado para a marca: " + marcaBusca);
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
