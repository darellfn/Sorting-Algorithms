from QuickSort import QuickSort

qs = QuickSort()
unsorted_list = [3, 2, 8, 1, 4, 5, 7, 6, 10, 9]
print(f"Python: {qs.quick_sort(unsorted_list, 0, len(unsorted_list) - 1)}")