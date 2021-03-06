package java8;

import org.junit.Test;

import java.util.*;

public class JavaTypeInferenceTest {

    public static void showList(List<Integer>list){
        if(!list.isEmpty()){
            list.forEach(System.out::println);
        }else System.out.println("list is empty");
    }

    @Test
    public void typeInterface() {
        // An old approach(prior to Java 7) to create a list
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(11);
        showList(list1);
        // Java 7
        List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type
        list2.add(12);
        showList(list2);
        // Compiler infers type of ArrayList, in Java 8
        showList(new ArrayList<>());

    }
}
