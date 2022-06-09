package java8;

import org.junit.Test;

import java.util.Arrays;

public class ParallelArraySortingTest {

    // Example 1
    // Parallel Array Sorting Example
    @Test
    public void parallelArraySorting() {
        // Creating an integer array
        int[] arr = {5,8,1,0,6,9};
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i+" ");
        }
        // Sorting array elements parallel
        Arrays.parallelSort(arr);
        System.out.println("\nArray elements after sorting");
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    // Example 2
    // Parallel Array Sorting Example Passing Start and End Index
    @Test
    public void passingStartAndEndIndex() {
        // Creating an integer array
        int[] arr = {5,8,1,0,6,9,50,-3};
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i+" ");
        }
        // Sorting array elements parallel and passing start, end index
        Arrays.parallelSort(arr,0,3);
        System.out.println("\nArray elements after sorting");
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
