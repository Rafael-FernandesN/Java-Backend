package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E09Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        System.out.println("Digite o desconto do produto: ");
        double desconto = sc.nextDouble();
        double preçoFinal = preco - (preco * desconto/100);
        System.out.println("A compra saiu por: " + preçoFinal+ " reais");
        sc.close();
    }
}
