def bubble_sort(a):
    for i in range(len(a) - 1):
        for j in range(len(a) - 1 - i):
            if a[j] > a[j+1]:
                temp = a[j]
                a[j] = a[j+1]
                a[j+1] = temp
    return a

unsorted_list = [3, 2, 8, 1, 4, 5, 7, 6, 10, 9]
print(f"Bubble Sort (Python): {bubble_sort(unsorted_list)}")