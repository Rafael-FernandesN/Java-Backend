package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E23MetodoDobro {

    // 1. Criamos o método fora do main, mas dentro da classe
    // 'static' permite que o main o chame diretamente
    // 'int' antes do nome significa que ele RETORNA um número inteiro
    public static int calcularDobro(int n) {
        return n * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDigitado = sc.nextInt();

        // 2. Chamamos o método e guardamos o retorno em uma variável
        int resultado = calcularDobro(numeroDigitado);

        // 3. Exibimos o resultado
        System.out.println("O dobro é: " + resultado);

        sc.close();
    }
}