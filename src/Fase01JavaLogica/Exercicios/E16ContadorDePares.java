package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E16ContadorDePares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criamos um array de 5 posições
        int[] n = new int[5];
        int pares = 0; // O contador começa fora do loop

        // 1. Preenchendo o array
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            n[i] = sc.nextInt();
        }

        // 2. Verificando quem é par
        for (int i = 0; i < 5; i++) {
            if (n[i] % 2 == 0) {
                pares++; // Se for par, aumenta o contador em 1
            }
        }

        System.out.println("Quantidade de numeros pares: " + pares);
        sc.close();
    }
}