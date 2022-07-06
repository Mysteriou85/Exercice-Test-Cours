package testString;

public class IsBlank {
    public static void main(String[] args) {
        String cVide = "";
        System.out.println(cVide.isBlank());
        System.out.println(cVide.isEmpty());

        String cVide2 = "    ";
        System.out.println(cVide2.isBlank());

        String cVide3 = "arzeear";
        System.out.println(cVide3.isBlank());
    }
}
