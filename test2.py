# Program 2


import sys

def solve():
    data = sys.stdin.read().split()
    n = int(data[0])
    k = int(data[1])
    a = [int(data[2 + i]) for i in range(n)]
    
    total = 0
    for i in range(n):
        # i is 0-indexed, so position = i+1
        # item at position i was preceded by a trigger if i > 0 and i % k == 0
        if i > 0 and i % k == 0:
            total += 2 * a[i]
        else:
            total += a[i]
    
    print(total)

solve()