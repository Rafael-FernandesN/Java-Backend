package fases.fase1.exercicios;

public class E10MaiorMenorLoop {
    public static void main(String[] args) {
        int maior = 1, menor = 1 , n = 5;
        for (int i = 1; i <= n; i++) {
            if (i > maior) {
                maior = i;
            }else if (i < menor) {
                menor = i;
            }
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
