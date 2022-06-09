package java8;

import org.junit.Test;

import java.util.StringJoiner;

public class StringJoinerTest {
    // Example 1
    @Test
    public void stringJoinerBasic() {
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Raheem");

        System.out.println(joinNames);
    }

    // Example 2
    // adding prefix and suffix
    @Test
    public void stringJoinerAddpPrefixAndSuffix() {
        StringJoiner joinNames = new StringJoiner(",", "[", "]"); // passing comma(,) as delimiter

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Raheem");

        System.out.println(joinNames);
    }

    // Example 3
    // Merge Two StringJoiner
    @Test
    public void mergeTwoStringJoiner() {
        StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");

        // Creating StringJoiner with :(colon) delimiter
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames2.add("Peter");
        joinNames2.add("Raheem");

        // Merging two StringJoiner
        StringJoiner merge = joinNames.merge(joinNames2);
        System.out.println(merge);
    }

    // Example 4
    // StringJoiner Methods
    @Test
    public void stringJoinerMethods() {
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

        // Prints nothing because it is empty
        System.out.println(joinNames);

        // We can set default empty value.
        joinNames.setEmptyValue("It is empty");
        System.out.println(joinNames);


        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        System.out.println(joinNames);

        // Returns length of StringJoiner
        int length = joinNames.length();
        System.out.println("Length: "+length);

        // Returns StringJoiner as String type
        String str = joinNames.toString();
        System.out.println(str);

        // Now, we can apply String methods on it
        char ch = str.charAt(3);
        System.out.println("Character at index 3: "+ch);

        // Adding one more element
        joinNames.add("Sorabh");
        System.out.println(joinNames);

        // Returns length
        int newLength = joinNames.length();
        System.out.println("New Length: "+newLength);
    }
}
