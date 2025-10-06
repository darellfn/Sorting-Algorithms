class Heap_Sort():

    def heap_sort(self, a):
        self.build_max_heap(a, len(a))
        for i in range(len(a) - 1, 0, -1):
            temp = a[i]
            a[i] = a[0]
            a[0] = temp
            self.bubble_down(a, 0, i)
        return a

    def build_max_heap(self, a, n):
        for i in range(n//2, -1, -1):
            self.bubble_down(a, i, n)
    
    def bubble_down(self, a, i, n):
        largest = i
        left = 2*i + 1
        right = 2*i + 2

        if left < n and a[left] > a[largest]:
            largest = left
        if right < n and a[right] > a[largest]:
            largest = right
        if i != largest:
            temp = a[i]
            a[i] = a[largest]
            a[largest] = temp
            self.bubble_down(a, largest, n)

hs = Heap_Sort()
unsorted_list = [3, 2, 8, 1, 4, 5, 7, 6, 10, 9]
print(f"Heap Sort (Python): {hs.heap_sort(unsorted_list)}")