package Fase01JavaLogica.Exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E22CalculadoraComSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int primeiroValor = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int segundoValor = sc.nextInt();
        System.out.println("Qual operação deseja fazer?");
        char  operacao = sc.next().charAt(0);
        switch (operacao) {
            case '+':
                int soma = primeiroValor + segundoValor;
                System.out.println("Resultado: " + soma);
                break;
                case '-':
                    int subtracao = primeiroValor - segundoValor;
                    System.out.println("Resultado: " + subtracao);
                    break;
                    case '*':
                        int multiplicacao = primeiroValor * segundoValor;
                        System.out.println("Resultado: " + multiplicacao);
                        break;
                        case '/':
                            int divisao = primeiroValor / segundoValor;
                            System.out.println("Resultado: " + divisao);
                            break;
            default:
                break;

        }
        sc.close();
    }
}
