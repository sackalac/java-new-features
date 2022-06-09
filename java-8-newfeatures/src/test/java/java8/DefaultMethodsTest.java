package java8;

import org.junit.Test;

public class DefaultMethodsTest implements SayableD{

    public void sayMore(String msg){        // implementing abstract method
        System.out.println(msg);
    }

    @Test
    public void defaultMethod() {
        DefaultMethodsTest dm = new DefaultMethodsTest();
        dm.say();   // calling default method
        dm.sayMore("Work is worship");  // calling abstract method
    }
}
interface SayableD{
    // Default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);
}