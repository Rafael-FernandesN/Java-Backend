package Fase01JavaLogica.Desafios;

import java.util.Scanner;

public class D02MenuCalculadoraEmLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja entrar na calculadora? 0/1");
        System.out.println("0 = não");
        System.out.println("1 = sim");
        int opcao = sc.nextInt();

        if (opcao != 1) {
            System.out.println("Saindo...");
            sc.close();
            return;
        }

        while (true) {
            System.out.println("\nMenu de Calculadora: ");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");
            System.out.print("Digite uma opcao: ");
            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Digite o primeiro valor: ");
            double primeiroValor = sc.nextDouble();

            System.out.print("Digite o segundo valor: ");
            double segundoValor = sc.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + (primeiroValor + segundoValor));
                    break;
                case 2:
                    System.out.println("Resultado: " + (primeiroValor - segundoValor));
                    break;
                case 3:
                    System.out.println("Resultado: " + (primeiroValor * segundoValor));
                    break;
                case 4:
                    if (segundoValor == 0) {
                        System.out.println("Erro: não é possível dividir por zero.");
                    } else {
                        System.out.println("Resultado: " + (primeiroValor / segundoValor));
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        sc.close();
    }
}
