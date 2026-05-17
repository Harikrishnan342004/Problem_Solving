import sys

def solve():
    data = sys.stdin.read().split()
    n = int(data[0])
    k = int(data[1])
    a = [int(data[2 + i]) for i in range(n)]
    
    NEG_INF = float('-inf')
    # dp[j][d]: max earnings where j = items_collected % k, d = double_pending
    dp = [[NEG_INF] * 2 for _ in range(k)]
    dp[0][0] = 0
    
    for val in a:
        new_dp = [[NEG_INF] * 2 for _ in range(k)]
        for j in range(k):
            for d in range(2):
                if dp[j][d] == NEG_INF:
                    continue
                # Skip
                if new_dp[j][d] < dp[j][d]:
                    new_dp[j][d] = dp[j][d]
                # Collect
                earned = val * 2 if d == 1 else val
                new_j = (j + 1) % k
                new_d = 1 if new_j == 0 else 0
                new_total = dp[j][d] + earned
                if new_dp[new_j][new_d] < new_total:
                    new_dp[new_j][new_d] = new_total
        dp = new_dp
    
    ans = max(dp[j][d] for j in range(k) for d in range(2) if dp[j][d] != NEG_INF)
    print(ans)

solve()