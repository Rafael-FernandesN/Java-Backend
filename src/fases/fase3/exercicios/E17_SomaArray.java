package fases.fase3.exercicios;

import java.util.Scanner;

public class E17_SomaArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5]; // array
        int soma = 0;               // acumulador

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
