package Fase01JavaLogica.Desafios;

import java.util.Scanner;

public class D03ContarDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um inteiro positivo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Erro: digite um número positivo.");
        } else if (n == 0) {
            System.out.println("Quantidade de dígitos: 1");
        } else {
            int contador = 0;

            while (n > 0) {
                n /= 10;        // corta o último dígito
                contador++;     // conta quantas vezes deu pra cortar
            }

            System.out.println("Quantidade de dígitos: " + contador);
        }

        sc.close();
    }
}
