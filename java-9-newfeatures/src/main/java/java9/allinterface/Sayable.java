package java9.allinterface;

public interface Sayable {
    default void say() {
        saySomething();
    }
    default void canSay() {
        saySomething(); // Calling private method
        sayPolitely(); //  Calling private static method
    }
    // Private method inside interface
    private void saySomething() {
        System.out.println("Hello... I'm private method");
    }
    // Private static method inside interface
    private static void sayPolitely() {
        System.out.println("I'm private static method");
    }
}
