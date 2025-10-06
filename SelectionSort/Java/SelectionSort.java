package SelectionSort.Java;

public class SelectionSort {
    
    public int[] selectionSort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int k = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[k]) {
                    k = j;
                }
            }
            if (i != k) {
                int temp = A[i];
                A[i] = A[k];
                A[k] = temp;
            }
        }
        return A;
    }
}
