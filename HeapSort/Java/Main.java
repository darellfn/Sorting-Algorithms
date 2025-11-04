package HeapSort.Java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HeapSort hs = new HeapSort();
        int[] unsortedArray = new int[] {3, 2, 8, 1, 4, 5, 7, 6, 10, 9};
        System.out.println("Heap Sort (Java): " + Arrays.toString(hs.heapSort(unsortedArray)));
    }
}