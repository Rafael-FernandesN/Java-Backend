package fases.fase3.exercicios;

import java.util.Scanner;

public class E16_ArrayBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]  numeros  =  new int [5];

        for (int i=0;i< numeros.length;i++){
            System.out.println("Digite um numero:");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Numeros Digitados:");
        for  (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]);
        }
        sc.close();
    }
}
