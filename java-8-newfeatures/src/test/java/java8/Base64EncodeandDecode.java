package java8;

import org.junit.Before;
import org.junit.Test;

import java.util.Base64;

public class Base64EncodeandDecode {
    Base64.Encoder encoder = null;

    @Before
    public void setUp() {
        // Getting encoder
        encoder = Base64.getEncoder();
    }

    @Test
    public void base64Basic() {
        // Creating byte array
        byte byteArr[]  = {1,2};
        // encoding byte array
        byte byteArr2[] = encoder.encode(byteArr);
        System.out.println("Encoded byte array: "+byteArr2);
        byte byteArr3[] = new byte[5];                // Make sure it has enough size to store copied bytes
        int x = encoder.encode(byteArr,byteArr3);    // Returns number of bytes written
        System.out.println("Encoded byte array written to another array: "+byteArr3);
        System.out.println("Number of bytes written: "+x);

        // Encoding string
        String str = encoder.encodeToString("JavaTpoint".getBytes());
        System.out.println("Encoded string: "+str);
        // Getting decoder
        Base64.Decoder decoder = Base64.getDecoder();
        // Decoding string
        String dStr = new String(decoder.decode(str));
        System.out.println("Decoded string: "+dStr);
    }

    @Test
    public void haha() {
        ABCD<String> a = new ABCD<String>() {
            @Override
            String show(String a, String b) {
                return a.concat(b);
            } // diamond operator is empty, compiler infer type
        };
        String result = a.show("Java","9");
        System.out.println(result);
    }

    public static void main(String[] args) {
        int _ = 10; // creating variable
        System.out.println(_);
    }

}
abstract class ABCD<T>{
    abstract T show(T a, T b);
}
