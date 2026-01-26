package fases.fase2.exercicios;

import java.util.Scanner;

public class E15MenuSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite N1: ");
                int n1 = sc.nextInt();
                System.out.print("Digite N2: ");
                int n2 = sc.nextInt();
                System.out.println("Resultado: " + (n1 + n2));

            } else if (opcao == 2) {
                System.out.print("Digite N1: ");
                int n1 = sc.nextInt();
                System.out.print("Digite N2: ");
                int n2 = sc.nextInt();
                System.out.println("Resultado: " + (n1 - n2));

            } else if (opcao == 0) {
                System.out.println("Encerrando programa");

            } else {
                System.out.println("Opção inválida");
            }

            System.out.println(); // linha em branco
        }

        sc.close();
    }
}
