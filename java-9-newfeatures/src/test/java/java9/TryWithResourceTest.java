package java9;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResourceTest {

    // Example
    // old JAVA 7
    @Test
    public void exampleOldJava7() throws FileNotFoundException {
        // inside resource block
        try(FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");){
            String greeting = "Welcome to javaTpoint.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }

        // outside resource block
        // sẽ bị lỗi compile vì java 7, 8 không vho phép
        FileOutputStream fileStream1 = new FileOutputStream("javatpoint.txt");
        try(fileStream1){
            String greeting = "Welcome to javaTpoint.";
            byte b[] = greeting.getBytes();
            fileStream1.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    // Example 1
    // JAVA 9
    @Test
    public void exampleJava9 () throws FileNotFoundException {
        FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");
        try(fileStream){
            String greeting = "Welcome to javaTpoint.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
