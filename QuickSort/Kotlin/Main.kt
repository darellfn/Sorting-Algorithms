package Sorting

import Sorting.QuickSort.QuickSort

fun main() {
    val qs = QuickSort()
    val unsortedArray = intArrayOf(3, 2, 8, 1, 4, 5, 7, 6, 10, 9)
    println("Quick Sort (Kotlin): " + qs.quickSort(unsortedArray, 0, unsortedArray.size - 1).joinToString())
}