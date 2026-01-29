package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E10TrocaDeValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double primeiroValor = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double segundoValor = sc.nextDouble();

        double temp = primeiroValor;
        primeiroValor = segundoValor;
        segundoValor = temp;
        System.out.println("TROCA DE VALORES ACONTECENDO!!!!!......");
        System.out.println("Primeiro valor: " + primeiroValor);
        System.out.println("Segundo valor: " + segundoValor);

        sc.close();
    }
}
