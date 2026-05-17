import sys

def solve():
    data = sys.stdin.read().split()
    n = int(data[0])
    k = int(data[1])
    a = [int(data[2 + i]) for i in range(n)]
    
    a.sort(reverse=True)
    
    # Triggers at collected positions k, 2k, 3k,...
    # Item right after trigger is doubled
    # Max doubles in subsequence of all n items:
    doubles = 0
    pos = k  # first trigger position
    while pos < n:  # there must be a next item (pos+1 <= n means pos < n)
        doubles += 1
        pos += k
    
    # Greedily double the largest 'doubles' items
    total = sum(a)
    for i in range(doubles):
        total += a[i]
    
    print(total)

solve()