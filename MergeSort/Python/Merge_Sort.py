class Merge_Sort():

    def merge_sort(self, a):
        if len(a) <= 1:
            return a
        n = len(a)//2
        a1 = self.mergeSort(a[0:n])
        a2 = self.mergeSort(a[n:])
        return self.merge(a1, a2, a)
    
    def merge(self, a1, a2, a):
        i = 0
        j = 0

        while i < len(a1) and j < len(a2):
            if a1[i] <= a2[j]:
                a[i+j] = a1[i]
                i += 1
            else:
                a[i+j] = a2[j]
                j += 1
        while i < len(a1):
            a[i+j] = a1[i]
            i += 1
        while j < len(a2):
            a[i+j] = a2[j]
            j += 1
        
        return a
    
ms = Merge_Sort()
unsorted_list = [3, 2, 8, 1, 4, 5, 7, 6, 10, 9]
print(f"Merge Sort (Python): {ms.merge_sort(unsorted_list)}")