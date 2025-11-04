class Bucket_Sort:

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

bs = Bucket_Sort()
A = [4, 1, 5, 6, 2, 3, 8, 4]
print(bs.bucket_sort(A))