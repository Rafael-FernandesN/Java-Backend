package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E15MostrarParesAteN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor = sc.nextDouble();
        for  (double i = 1; i <= valor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
