package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E06MenorDe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num3 = sc.nextInt();
        int menor = num;
        if (num2 < menor) {
            menor = num2;
        }if (num3 < menor) {
            menor = num3;
        }
        System.out.println("Menor valor: " + menor);
        sc.close();
    }
}
