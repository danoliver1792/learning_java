public class SchoolGrades {
    public static void main(String[] args) {
        int finalMedia = 5;

        if (finalMedia <= 5) {
            System.out.println("Reprovado");
        } else if (finalMedia < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }
    }
}
