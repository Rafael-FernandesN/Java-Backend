package Fase01JavaLogica.CheckPoints;

import java.util.Scanner;

public class CP03MenuComSwitchEmLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para ver sua tabuada: ");
        int n = sc.nextInt();
        if ( n % 2 == 0 ) {
            System.out.println("é par");
        }else {
            System.out.println("é impar");
        }

        System.out.println("--- TABUADA DO " + n + " ---");

        // O laço vai de 1 até 10
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            // Exibindo de forma organizada: N x i = Resultado
            System.out.println(n + " x " + i + " = " + resultado);
        }

        System.out.println("-------------------------");

        sc.close();
    }
}
