package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E02Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        int soma = num + num2;
        System.out.println("Resultado: " + soma);
        sc.close();
    }
}
