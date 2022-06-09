package java8;

import intefaceall.sayable;
import org.junit.Test;

public class FunctionalInterfacesTest implements sayable {


    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    @Test
    public void functionInterfaceTest() {
        // Example 1
        FunctionalInterfacesTest fie = new FunctionalInterfacesTest();
        fie.say("Hello there");
    }
}
