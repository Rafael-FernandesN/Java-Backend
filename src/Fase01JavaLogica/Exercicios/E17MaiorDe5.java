package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E17MaiorDe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        float num1 = sc.nextInt();
        System.out.println("Digite um numero: ");
        float num2 = sc.nextInt();
        System.out.println("Digite um numero: ");
        float num3 = sc.nextInt();
        System.out.println("Digite um numero: ");
        float num4 = sc.nextInt();
        System.out.println("Digite um numero: ");
        float num5 = sc.nextInt();
        float  maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }if (num4 > maior) {
            maior = num4;
        }if (num5 > maior) {
            maior = num5;
        }
        System.out.println("Maior:"+maior);
        sc.close();
    }
}
