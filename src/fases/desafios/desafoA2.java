package fases.desafios;

public class desafoA2 {
    public static void main(String[] args) {
        int acumulador = 0;
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                acumulador = acumulador + i;
            }
        }
        System.out.println(acumulador);
    }
}
