package MergeSort.Java;
import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] A) {
        if (A.length <= 1) {
            return A;
        }
        int i = A.length / 2;
        int[] A1 = mergeSort(Arrays.copyOfRange(A, 0, i)); 
        int[] A2 = mergeSort(Arrays.copyOfRange(A, i, A.length));
        return merge(A1, A2, A);
    }

    public int[] merge(int[] A1, int[] A2, int[] A) {
        int i = 0;
        int j = 0;

        while (i < A1.length && j < A2.length) {
            if (A1[i] <= A2[j]) {
                A[i+j] = A1[i];
                i += 1;
            } else {
                A[i+j] = A2[j];
                j += 1;
            }
        }
        while (i < A1.length) {
            A[i+j] = A1[i];
            i += 1;
        }
        while (j < A2.length) {
            A[i+j] = A2[j];
            j += 1;
        }

        return A;
    }
}
