public class BasicCalculator {
    // somando dois valores
    public static void main(String[] args) {
        int numeroUm = 5;
        int numeroDois = 8;

        int somar = somar(numeroUm, numeroDois);
        int subtrair = subtrair(numeroUm, numeroDois);
        int multiplicar = multiplicar(numeroUm, numeroDois);
        double dividir = dividir(numeroUm, numeroDois);

        System.out.println(somar);
        System.out.println(subtrair);
        System.out.println(multiplicar);
        System.out.println(dividir);
    }
    public static int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

    public static int subtrair(int numeroUm, int numeroDois) {
        return numeroUm - numeroDois;
    }

    public static int multiplicar(int numeroUm, int numeroDois) {
        return numeroUm * numeroDois;
    }

    public static int dividir(int numeroUm, int numeroDois) {
        return numeroUm / numeroDois;
    }
}
