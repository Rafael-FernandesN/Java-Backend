
public class Main {
    public static void main(String[] args) {
        int idade = 16;
        boolean documentoValido = false;
        boolean acompanhadoPorResponsavel = true;

        if ((idade >= 18 && documentoValido) || acompanhadoPorResponsavel) {
            System.out.println("Entrada liberada");
        } else {
            System.out.println("Entrada negada");
        }
    }
}

