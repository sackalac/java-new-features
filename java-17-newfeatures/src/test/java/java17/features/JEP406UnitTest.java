package java17.features;

import features.JEP406;
import org.junit.jupiter.api.Test;
import features.JEP406.Human;
import features.JEP409.Square;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JEP406UnitTest {

    @Test
    void checkObject_shouldMatchWithHuman() {
        var jep406 = new JEP406();

        var human = new Human("John", 31, "Developer");

//        var checkResult = jep406.checkObject(human);

//        assertEquals("Name: John, age: 31 and profession: Developer", checkResult);
    }

    @Test
    void checkShape_shouldMatchWithShape() {
        var jep406 = new JEP406();

        var square = new Square();
//
//        var checkResult = jep406.checkShape(square);
//
//        assertEquals("Just a normal shape", checkResult);
    }

}
