package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E01Dobro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um numero: ");
            int num = sc.nextInt();
            int dobro = (num * 2);
    System.out.println("O dobro do seu número é: " + dobro);
    sc.close();
    }
}
