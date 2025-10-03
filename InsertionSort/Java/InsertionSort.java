package InsertionSort.Java;

public class InsertionSort {
    
    public int[] insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int j = i;
            while (j > 0) {
                int temp = A[j-1];
                A[j-1] = A[j];
                A[j] = temp;
                j -= 1;
            }
        }
        return A;
    }
}
