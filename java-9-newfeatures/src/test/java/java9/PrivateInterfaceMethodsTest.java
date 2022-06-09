package java9;

import java9.allinterface.Sayable;
import org.junit.Test;

public class PrivateInterfaceMethodsTest implements Sayable {

    // Example1
    @Test
    public void example1() {
        Sayable s = new PrivateInterfaceMethodsTest();
        s.say();
    }

    // Example 2
    @Test
    public void example2() {
        Sayable s = new PrivateInterfaceMethodsTest();
        s.canSay();
    }
}
