package java10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;

public class LocalVariableTypeInferenceTest {
    // Example 1
    @Test
    public void whenVarInitWithString_thenGetStringTypeVar() {
        var message = "Hello Java";
        var idToNameMap = new HashMap<Integer, String>();
        System.out.println(message instanceof String);
        System.out.println(idToNameMap instanceof Map);
    }

    // Example 2
    @Test
    public void mapTest() {
        var obj = new Object() {};
        System.out.println(obj.getClass().equals(Object.class));
    }

    // Example 3
    @Test
    public void listTest() {
        // For example, if we use it with the diamond operator introduced in Java 7:
        var empList = new ArrayList<>();

        var empList1 = new ArrayList<Employee>();
    }

    // Illegal Use of var

    // public var = "hello"; // error: 'var' is not allowed here

    @Test
    public void workingWithVar() {
        // var n; // error: cannot use 'var' on variable without initializer

        // var emptyList = null; // error: variable initializer is 'null'

        // var p = (String s) -> s.length() > 10; // error: lambda expression needs an explicit target-type

        // var arr = { 1, 2, 3 }; // error: array initializer needs an explicit target-type
    }

    // Guidelines for Using var
    @Test
    public void workingWithVar2() {
        // var result = obj.prcoess(); trong các tình huống mà mã có thể trở nên khó đọc hơn

        // var x = emp.getProjects.stream()
        //  .findFirst()
        //  .map(String::length)
        //  .orElse(0); Một tình huống khác mà tốt nhất bạn nên tránh var  là trong các luồng có đường ống dài

        // var empList = new ArrayList<Employee>(); Nếu chúng ta muốn nó là ArrayList <Employee> , chúng ta sẽ phải rõ ràng

        // Sử dụng var  với các kiểu non-denotable có thể gây ra lỗi không mong muốn
        // Ví dụ: nếu chúng ta sử dụng var  với cá thể lớp ẩn danh:
        var obj = new Object() {};
        assertFalse(obj.getClass().equals(Object.class));

        // obj = new Object(); // error: Object ko thể chuyển đổi thành <anonymous Object> Điều này là do loại obj  được suy ra không phải là Đối tượng
    }
}
class Employee {
    Long id;
    String name;
}
