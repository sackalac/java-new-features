package java12;

public class StringClassNewMethods {
    public static void main(String[] args) {
        String text = "Hello Baeldung!\nThis is Java 12 article.";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);
    }
}
