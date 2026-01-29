package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E05MaiorDe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num3 = sc.nextInt();
        int maior = num;
        if  (num2 > maior) {
            maior = num2;

        } if (num3 > maior) {
            maior = num3;
        }
            System.out.println("Maior:"+maior);
        sc.close();
    }
}
