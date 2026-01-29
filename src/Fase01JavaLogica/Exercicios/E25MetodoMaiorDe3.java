package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E25MetodoMaiorDe3 {

    // Método que processa a lógica de comparação
    public static int encontrarMaior(int a, int b, int c) {
        int maior = a; // Assume que o primeiro é o maior

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        return maior; // Retorna o "vencedor"
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- COMPARADOR DE 3 NÚMEROS ---");
        System.out.print("Digite o 1º: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2º: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o 3º: ");
        int n3 = sc.nextInt();

        // Chamada do método passando os valores lidos
        int resultado = encontrarMaior(n1, n2, n3);

        System.out.println("\nO maior valor entre eles é: " + resultado);

        sc.close();
    }
}