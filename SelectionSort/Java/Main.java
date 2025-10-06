package SelectionSort.Java;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] unsortedArray = new int[] {3, 2, 8, 1, 4, 5, 7, 6, 10, 9};
        System.out.println("Selection Sort (Java): " + Arrays.toString(ss.selectionSort(unsortedArray)));
    }
}
