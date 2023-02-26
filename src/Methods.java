public class Methods {
    public static void main(String[] args) {
        String firstName = "Danrlei";
        String lastName = "Oliveira";
        String completeName = completeName(firstName, lastName);

        System.out.println(completeName);
    }

    public static String completeName (String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
}
