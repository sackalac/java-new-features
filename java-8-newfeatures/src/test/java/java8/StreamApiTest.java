package java8;

import model.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class StreamApiTest {

    List<Product> productsList = new ArrayList<Product>();

    @Before
    public void setup() {
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
    }

    // không dùng stream
    @Test
    public void withoutStream(){
        List<Float> productPriceList = new ArrayList<Float>();
        for(Product product: productsList){
            if(product.getPrice()<30000){
                productPriceList.add(product.getPrice());
            }
        }
        System.out.println("KO Stream");
        System.out.println(productPriceList);
    }

    // Example 1
    // Sử dung Stream
    @Test
    public void haveStream(){
        List<Float> productPriceListStream = productsList.stream()
                .filter(p -> p.getPrice() > 30000)// filtering data
                .map(p->p.getPrice())        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println("Có Stream");
        System.out.println(productPriceListStream);
    }

    // Example 2
    //Stream Iterating Example
    @Test
    public void iteratingExample(){
        Stream.iterate(1, element->element+1)
                .filter(element->element%5==0)
                .limit(5)
                .forEach(System.out::println);
    }

    // Example 3
    // Filtering and Iterating Collection
    @Test
    public void iteratingCollection(){
        productsList.stream()
                .filter(product -> product.getPrice() == 30000)
                .forEach(product -> System.out.println(product.getName()));
    }

    // Example 4
    // reduce() Method in Collection
    // This is more compact approach for filtering data
    @Test
    public void reduceMethodCollection(){
        Float totalPrice = productsList.stream()
                .map(product->product.getPrice())
                .reduce(0.0f,(sum, price)->sum+price);   // accumulating price
        System.out.println(totalPrice);
        // More precise code
        float totalPrice2 = productsList.stream()
                .map(product->product.getPrice())
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);
    }

    // Example 5
    // Sum by using Collectors Methods
    @Test
    public void sumCollectorsMethod(){
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product->product.getPrice()));
        System.out.println(totalPrice3);
    }

    // Example 6
    // Find Max and Min Product Price
    @Test
    public void findMaxMin(){
        // max() method to get max Product price
        Product productA = productsList.stream().max((product1, product2)->product1.getPrice() > product2.getPrice() ? 1: -1).get();
        System.out.println(productA.getPrice());
        // min() method to get min Product price
        Product productB = productsList.stream().min((product1, product2)->product1.getPrice() > product2.getPrice() ? 1: -1).get();
        System.out.println(productB.getPrice());
    }

}
