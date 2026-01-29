package Fase01JavaLogica.Desafios;

import java.util.Scanner;

public class D04InverterNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um inteiro positivo: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Erro: digite um número positivo.");
        } else if (n == 0) {
            System.out.println("Invertido: 0");
        } else {
            int inv = 0;

            while (n > 0) {
                int digito = n % 10;
                inv = inv * 10 + digito;
                n = n / 10;
            }

            System.out.println("Invertido: " + inv);
        }

        sc.close();
    }
}
