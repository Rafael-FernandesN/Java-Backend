package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E13SomaDe1AteN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double n = sc.nextDouble();
        double soma = 0;
        for (double i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println(soma);
        sc.close();
    }
}
