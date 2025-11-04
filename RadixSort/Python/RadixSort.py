class RadixSort:
    def radix_sort(self, A):
        d = len(str(max(A)))
        
        for i in range(d, -1, -1):
            A = self.bucket_sort(A)

        return A
    
    def bucket_sort(self, A):
        N = max(A)
        B = []
        for i in range(N+1):
            B.append([])

        for i in range(len(A)):
            k = A[i]
            B[k].append(A[i])

        j = 0
        for k in range(len(B)):
            for x in B[k]:
                A[j] = x
                j += 1

        return A

rs = RadixSort()
A = [200, 3, 1323, 11111, 234, 12, 678, 90]
print(rs.radix_sort(A))