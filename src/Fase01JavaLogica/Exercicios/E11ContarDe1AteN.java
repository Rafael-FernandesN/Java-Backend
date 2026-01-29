package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E11ContarDe1AteN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que deseja contar: ");
        double valor = sc.nextDouble();
        for (int i = 1; i <= valor; i++) {
            System.out.println(i + " - " + valor);
        }
        sc.close();
    }
}
