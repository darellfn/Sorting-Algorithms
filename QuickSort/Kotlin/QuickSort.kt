package Sorting.QuickSort

class QuickSort {
    fun quickSort(A: IntArray, low: Int, high: Int): IntArray  {
        if (low >= high) {
            return A
        }
        var p = partition(A, low, high)
        quickSort(A, low, p-1)
        quickSort(A, p+1, high)
        return A
    }

    fun partition(A: IntArray, low: Int, high: Int): Int  {
        val p = choosePivot(A, low, high)
        val tempHigh = A[high]
        A[high] = A[p]
        A[p] = tempHigh
        val pivot = A[high]
        var left = low
        var right = high - 1

        while (left <= right) {
            while (left <= right && A[left] <= pivot) {
                left += 1
            }
            while (right >= left && A[right] >= pivot) {
                right -= 1
            }
            if (left < right) {
                val tempLeft = A[left]
                A[left] = A[right]
                A[right] = tempLeft 
            }
        }

        val tempLeft = A[left]
        A[left] = A[high]
        A[high] = tempLeft

        return left
    }

    fun choosePivot(A: IntArray, low: Int, high: Int): Int {
        val m = A.size / 2

        if (A[low] <= A[m] && A[high] >= A[m] || A[low] >= A[m] && A[high] <= A[m]) {
            return m;
        } else if (A[m] <= A[low] && A[high] >= A[low] || A[m] >= A[low] && A[high] <= A[low]) {
            return low;
        } else {
            return high;
        }
    }
}