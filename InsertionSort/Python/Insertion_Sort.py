def insertion_sort(A):
    for i in range(1, len(A)):
        j = i
        while j > 0 and A[j-1] > A[j]:
            temp = A[j-1]
            A[j-1] = A[j]
            A[j] = temp
            j -= 1
    return A


unsorted_list = [3, 2, 8, 1, 4, 5, 7, 6, 10, 9]
print(insertion_sort(unsorted_list))