package java8;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ForEachLooptTest {
    List<String> gamesList = new ArrayList<String>();

    @Before
    public void setUp() {
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        gamesList.add("Anh");
    }

    // Example 1
    @Test
    public void forEachList() {
        System.out.println("------------Iterating by passing lambda expression--------------");
        gamesList.forEach(games -> System.out.println(games));
        System.out.println("------------Iterating by passing method reference---------------");
        gamesList.forEach(System.out::println);
    }

    // Example 2
    @Test
    public void forEachOrderedExample() {
        System.out.println("------------Iterating by passing lambda expression---------------");
        gamesList.stream().forEachOrdered(games -> System.out.println(games));
        System.out.println("------------Iterating by passing method reference---------------");
        gamesList.stream().forEachOrdered(System.out::println);
    }
}
