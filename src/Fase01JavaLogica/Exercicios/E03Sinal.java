package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E03Sinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("Seu número é positivo");
        }else if (num < 0){
            System.out.println("Seu número é negativo");
        }else {
            System.out.println("Seu número é zero");
        }sc.close();
    }
}
