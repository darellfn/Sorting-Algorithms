class Quick_Sort:
    
    def quick_sort(self, A, low, high):
        if low >= high:
            return A
        p = self.partition(A, low, high)
        self.quick_sort(A, low, p-1)
        self.quick_sort(A, p+1, high)
        return A
        
    def partition(self, A, low, high):
        p = self.choose_pivot(A, low, high)
        tempHigh = A[high]
        A[high] = A[p]
        A[p] = tempHigh
        pivot = A[high]
        left = low
        right = high - 1

        while left <= right:
            while left <= right and A[left] <= pivot:
                left += 1
            while right >= left and A[right] >= pivot:
                right -= 1
            if left < right:
                tempLeft = A[left]
                A[left] = A[right]
                A[right] = tempLeft
        
        tempLeft = A[left]
        A[left] = A[high]
        A[high] = tempLeft

        return left
    
    def choose_pivot(self, A, low, high):
        m = len(A)//2

        if A[low] <= A[m] and A[high] >= A[m] or A[low] >= A[m] and A[high] <= A[m]:
            return m
        elif A[m] <= A[low] and A[high] >= A[low] or A[m] >= A[low] and A[high] <= A[low]:
            return low
        else:
            return high