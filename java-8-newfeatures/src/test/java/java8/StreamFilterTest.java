package java8;

import model.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilterTest {

    List<Product> productsList = new ArrayList<Product>();

    @Before
    public void setUp() {
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
    }

    @Test
    public void example1() {
        productsList.stream()
                .filter(p -> p.getPrice() > 30000)
                .map(pm -> pm.getPrice() + " " + pm.getName() + " " + pm.getId())
                .forEach(System.out::println);
    }

    @Test
    public void example2() {
        List<Float> pricesList =  productsList.stream()
                .filter(p ->p.getPrice()> 30000)   // filtering price
                .map(pm ->pm.getPrice())          // fetching price
                .collect(Collectors.toList());
        System.out.println(pricesList);
    }
}
