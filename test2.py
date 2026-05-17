import sys
from collections import defaultdict

def solve():
    input_data = sys.stdin.read().split()
    idx = 0
    n = int(input_data[idx])
    idx += 1
    arr = [int(input_data[idx + i]) for i in range(n)]
    
    MOD = 10**9 + 7
    freq = defaultdict(int)
    prefix_sum = 0
    count = 0
    
    for k in range(n):
        prefix_sum += arr[k]
        
        s = prefix_sum
        i = 1
        while i * i <= s:
            if s % i == 0:
                count = (count + freq[i]) % MOD
                if i != s // i:
                    count = (count + freq[s // i]) % MOD
            i += 1
        
        freq[prefix_sum] += 1
    
    print(count)

solve()