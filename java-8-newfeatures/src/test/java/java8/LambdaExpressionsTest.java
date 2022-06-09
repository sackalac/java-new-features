package java8;

import intefaceall.Addable;
import intefaceall.Drawable;
import model.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsTest {

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    List<Product> list=new ArrayList<Product>();
    List<Product> list2=new ArrayList<Product>();

    @Before
    public void setup() {
        // add nums
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // add list
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));

        // add list2
        list.add(new Product(1,"Samsung A5",17000f));
        list.add(new Product(3,"Iphone 6S",65000f));
        list.add(new Product(2,"Sony Xperia",25000f));
        list.add(new Product(4,"Nokia Lumia",15000f));
        list.add(new Product(5,"Redmi4 ",26000f));
        list.add(new Product(6,"Lenevo Vibe",19000f));
    }

    // Example 1
    // Foreach Loop
    @Test
    public void forEachNums(){
        numbers.forEach( (n) -> { System.out.println(n); } );
    }

    // Example 2
    // (input) -> input.toUpperCase()
    // đầu vào -> đầu ra
    @Test
    public void callFunctionInterface(){
        int width=10;
        Drawable d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();
    }

    // Example 3
    // Lambda expression without return keyword. \
    @Test
    public void withoutReturnKeyword(){
        Addable ad1=(a, b)->(a+b);
        System.out.println(ad1.add(10,20));
    }

    // Example 4
    // Creating Thread
    @Test
    public void callThread(){
        //Thread Example without lambda
        Runnable r1=new Runnable(){
            public void run(){
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
        //Thread Example with lambda
        Runnable r2=()->{
            System.out.println("Thread2 is running...");
        };
        Thread t2=new Thread(r2);
        t2.start();
    }

    // Example 5
    // Comparator
    @Test
    public void comparatorWithStream(){
        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list,(p1, p2)->{
            return p1.getName().compareTo(p2.getName());
        });
        for(Product p:list){
            System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
        }
    }

    // Example 6
    // Filter Collection Data
    @Test
    public void withoutStream(){
        // using lambda to filter data
        Stream<Product> filtered_data = list2.stream().filter(p -> p.getPrice() > 20000);

        // using lambda to iterate through collection
        filtered_data.forEach(
                product -> System.out.println(product.getName()+": "+product.getPrice())
        );
    }

}
