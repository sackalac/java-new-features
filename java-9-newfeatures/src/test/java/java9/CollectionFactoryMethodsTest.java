package java9;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class CollectionFactoryMethodsTest {

    List<String> list = new ArrayList<>();

    @Before
    public void setUp() {
        list.add("Java");
        list.add("JavaFX");
        list.add("Spring");
        list.add("Hibernate");
        list.add("JSP");
    }

    // Example 1
    // List
    @Test
    public void listFactoryMethodExample() {
        List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");
        for(String l:list) {
            System.out.println(l);
        }
    }

    // Example 2
    // Set
    @Test
    public void setFactoryMethodExample() {
        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");
        for(String l:set) {
            System.out.println(l);
        }
    }

    // Example 3
    // Map
    @Test
    public void mapFactoryMethodExample() {
        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");
        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    // Example 4
    // ofEntries
    @Test
    public void mapEntryFactoryMethodExample() {
        // Creating Map Entry
        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
        // Creating Map using map entries
        Map<Integer, String> map = Map.ofEntries(e1,e2);
        // Iterating Map
        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

}
