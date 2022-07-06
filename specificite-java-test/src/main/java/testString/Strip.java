package testString;

public class Strip {
    public static void main(String[] args) {
        String string = " blablabla1 ";
        System.out.println("\"" + string + "\" - \"" + string.strip() + "\"");
        String string2 = "   blablabla2    ";
        System.out.println("\"" + string2 + "\" - \"" + string2.stripLeading() + "\"");
        String string3 = "     blablabla3     ";
        System.out.println("\"" + string3 + "\" - \"" + string3.stripTrailing() + "\"");
    }
}
