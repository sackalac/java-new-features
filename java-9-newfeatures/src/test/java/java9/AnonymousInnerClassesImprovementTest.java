package java9;

import java9.model.ABCD;
import org.junit.Test;

public class AnonymousInnerClassesImprovementTest {

    @Test
    public void typeInferExample() {
        ABCD<String> a = new ABCD<>() { // diamond operator is empty
            public String show(String a, String b) {
                return a+b;
            }
        };
        String result = a.show("Java","9");
        System.out.println(result);
    }
}
