package java8;

import model.Product;
import org.junit.Before;
import org.junit.Test;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorTest {
    List<Product> productsList = new ArrayList<Product>();

    @Before
    public void setUp() {
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
    }

    // Example 1
    // Fetching data as a List
    @Test
    public void fetchingDataList() {
        List<Float> productPriceList =
                productsList.stream()
                        .map(x->x.getPrice())         // fetching price
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);
    }

    // Example 2
    // Converting Data as a Set
    @Test
    public void convertDateAsSet() {
        Set<Float> productPriceList =
                productsList.stream()
                        .map(x->x.getPrice())         // fetching price
                        .collect(Collectors.toSet());   // collecting as list
        System.out.println(productPriceList);
    }

    // Example 3
    // using sum method
    @Test
    public void usingSumMethod() {
        Double sumPrices = productsList
                .stream()
                .collect(Collectors.summingDouble(x -> x.getPrice()));  // collecting as list
        System.out.println("Sum of prices: " + sumPrices);
        Integer sumId = productsList
                .stream()
                .collect(Collectors.summingInt(x -> x.getId()));
        System.out.println("Sum of id's: " + sumId);
    }

    // Example 4
    // Getting Product Average Price
    @Test
    public void averagePrice() {
        Double average = productsList.stream()
                .collect(Collectors.averagingDouble(p->p.getPrice()));
        System.out.println("Average price is: "+average);
    }

    // Example 5
    // Counting Elements
    @Test
    public void countingElements() {
        Set<Float>productPriceList =
                productsList.stream()
                        .map(x->x.getPrice())         // fetching price
                        .collect(Collectors.toSet());   // collecting as list
        System.out.println(productPriceList);
    }
}
