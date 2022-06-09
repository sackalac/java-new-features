package java9;

import org.junit.Test;

import java.util.*;

public class SafeVarargsAnnotationTest {

    @SafeVarargs
    private void display(List<String>... products) { // Not using @SaveVarargs
        for (List<String> product : products) {
            System.out.println(product);
        }
    }

    @Test
    public void notUseSaveVarargs() {
        SafeVarargsAnnotationTest p = new SafeVarargsAnnotationTest();
        List<String> list = new ArrayList<String>();
        list.add("Laptop");
        list.add("Tablet");
        p.display(list);

    }
}
