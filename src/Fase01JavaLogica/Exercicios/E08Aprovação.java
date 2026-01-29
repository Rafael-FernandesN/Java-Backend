package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E08Aprovação {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        double nota = sc.nextDouble();
        System.out.println("Digite a nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota + nota2) / 2.0;
        System.out.println("Sua média é: " + media);
        if  (media >= 7) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
