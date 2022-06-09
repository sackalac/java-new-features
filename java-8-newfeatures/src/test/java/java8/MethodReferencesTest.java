package java8;

import intefaceall.Messageable;
import model.Arithmetic;
import model.Message;
import org.junit.Test;

import java.util.function.BiFunction;

public class MethodReferencesTest {

    public void printnMsg() {
        System.out.println("Hello, printnMsg");
    }
    public void getGo(){
        System.out.println("Được rồi đi thôi ba la ba la ba la");
    }
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void ThreadStatus(){
        System.out.println("Thread is running...");
    }

    // Example 1
    // Referring static method
    @Test
    public void referringStaticMethod(){
        Sayable sayable = MethodReferencesTest::saySomething;
        // Calling interface method
        sayable.say();
    }

    // Example 2
    @Test
    public void callThread(){
        Thread t2=new Thread(MethodReferencesTest::ThreadStatus);
        t2.start();
    }

    // Example 3
    @Test
    public void addStaticMethod(){
        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }

    // Example 4
    // Instance Method
    @Test
    public void referringInstanceMethod(){
        MethodReferencesTest methodReferences = new MethodReferencesTest();
        // Referring non-static method using reference
        Sayable sayable1 = methodReferences::getGo;
        // Calling interface method
        sayable1.say();
        // Referring non-static method using anonymous object
        Sayable sayable2 = new MethodReferencesTest()::getGo; // You can use anonymous object also
        // Calling interface method
        sayable2.say();
    }

    // Example 5
    // Instance Method
    @Test
    public void callPrintnMsg(){
        Thread t3=new Thread(new MethodReferencesTest()::printnMsg);
        t3.start();
    }

    // Example 6
    @Test
    public void callInterfaceMethod(){
        BiFunction<Integer, Integer, Integer> adder1 = new Arithmetic()::addTwo;
        int result1 = adder1.apply(100, 200);
        System.out.println(result1);
    }

    // Example 7
    // Reference to a Constructor
    @Test
    public void referenceConstructor(){
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }

}
interface Sayable{
    // Default method
    void say();
}
