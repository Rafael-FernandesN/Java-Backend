package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E14Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para ver sua tabuada: ");
        int n = sc.nextInt();

        System.out.println("--- TABUADA DO " + n + " ---");

        // O laço vai de 1 até 10
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            // Exibindo de forma organizada: N x i = Resultado
            System.out.println(n + " x " + i + " = " + resultado);
        }

        System.out.println("-------------------------");

        sc.close();
    }
}