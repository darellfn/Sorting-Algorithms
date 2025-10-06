package BubbleSort.Java;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] unsortedArray = new int[] {3, 2, 8, 1, 4, 5, 7, 6, 10, 9};
        System.out.println("Bubble Sort (Java): " + Arrays.toString(bs.bubbleSort(unsortedArray)));
    }
}
