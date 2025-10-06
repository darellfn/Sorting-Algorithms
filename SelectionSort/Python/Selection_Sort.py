def selection_sort(A):
    for i in range(len(A)):
        k = i
        for j in range(1 + i, len(A)):
            if A[j] < A[k]:
                k = j
        if i != k:
            temp = A[i] 
            A[i] = A[k]
            A[k] = temp
    return A

unsorted_list = [3, 2, 8, 1, 4, 5, 7, 6, 10, 9]
print(selection_sort(f"Selection Sort (Python): {unsorted_list}"))