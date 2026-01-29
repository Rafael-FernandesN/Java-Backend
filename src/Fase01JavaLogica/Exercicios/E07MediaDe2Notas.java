package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E07MediaDe2Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota + nota2) / 2.0;
        System.out.println("Sua média é: " + media);
        sc.close();
    }
}
