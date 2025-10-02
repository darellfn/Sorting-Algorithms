package QuickSort.Java;

public class QuickSort {
    
    public int[] quickSort(int[] A, int low, int high) {
        if (low >= high) {
            return A;
        }
        int p = partition(A, low, high);
        quickSort(A, low, p-1);
        quickSort(A, p+1, high);
        return A;
    }

    public int partition(int[] A, int low, int high) {
        int p = choosePivot(A, low, high);
        int tempHigh = A[high];
        A[high] = A[p];
        A[p] = tempHigh;
        int pivot = A[high];
        int left = low;
        int right = high - 1;

        while (left <= right) {
            while (left <= right && A[left] <= pivot) {
                left += 1;
            }
            while (right >= left && A[right] >= pivot) {
                right -= 1;
            }
            if (left < right) {
                int tempLeft = A[left];
                A[left] = A[right];
                A[right] = tempLeft;
            }
        }

        int tempLeft = A[left];
        A[left] = A[high];
        A[high] = tempLeft;

        return left;
    }

    public int choosePivot(int[] A, int low, int high) {
        int m = A.length / 2;

        if (A[low] <= A[m] && A[high] >= A[m] || A[low] >= A[m] && A[high] <= A[m]) {
            return m;
        } else if (A[m] <= A[low] && A[high] >= A[low] || A[m] >= A[low] && A[high] <= A[low]) {
            return low;
        } else {
            return high;
        }
    }
}