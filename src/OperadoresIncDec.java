public class OperadoresIncDec {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println(- numero); // -5
        System.out.println(numero); // 5

        int numeroTwo = 10;
        numeroTwo += 2;
        System.out.println(numeroTwo); // 12

        int numeroThree = 20;
        numeroThree -= 2; // 18
        System.out.println(numeroThree);

        // podemos fazer também:
        int numeroFour = 1;
        numeroFour++; // 2
        System.out.println(numeroFour);

        int numeroFive = 2;
        numeroFive--; // 1
        System.out.println(numeroFive);

        ++numeroFour; // 3
        System.out.println(numeroFour);

        --numeroFive; // 0
        System.out.println(numeroFive);

        boolean variavel = true;
        System.out.println(!variavel); // false
    }
}
