package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E18Validação {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        while (num1 <= 0) {
            System.out.println("Invalido!!!");
            System.out.println("Digite novamente: ");
            num1 = sc.nextInt();
        }
        System.out.println("Valido");
        sc.close();
    }
}
