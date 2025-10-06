package HeapSort.Java;

public class HeapSort {
    
    public int[] heapSort(int[] A) {
        buildMaxHeap(A, A.length);
        for (int i = A.length - 1; i >= 0; i--) {
            int temp = A[i];
            A[i] = A[0];
            A[0] = temp;
            bubbleDown(A, 0, i);
        }
        return A;
    }

    public void buildMaxHeap(int[] A, int n) {
        for (int i = n/2; i >= 0; i--) {
            bubbleDown(A, i, n);
        }
    }

    public void bubbleDown(int[] A, int i, int n) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && A[left] > A[largest]) {
            largest = left;
        }
        if (right < n && A[right] > A[largest]) {
            largest = right;
        }
        if (i != largest) {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            bubbleDown(A, largest, n);
        }
    }
}
