package model;

public class Sealed {
    public static void main(String... args) {
        JungleAnimal j = new Snake();

        if (j instanceof Snake s) {
            System.out.println(s.getClass());
        } else if (j instanceof Monkey m) {
            // do logic
            System.out.println(m.getClass());
        }
    }
}