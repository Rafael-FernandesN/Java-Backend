package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E12ContarDeNAte0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double n = sc.nextDouble();
        for  (double i = n; i >= 0; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
