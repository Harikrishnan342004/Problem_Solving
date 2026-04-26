import sys
input = sys.stdin.readline

def solve(n: int, k: int, a: list) -> int:
    pre = [0] * (n + 1)
    for i in range(n):
        pre[i+1] = pre[i] + a[i]
    
    INF = float('inf')
    dp = [[-INF] * (k + 1) for _ in range(n + 1)]
    dp[0][0] = 0
    
    for i in range(1, n + 1):
        for j in range(k + 1):
            if dp[i-1][j] != -INF:
                dp[i][j] = max(dp[i][j], dp[i-1][j] + a[i-1])
            if j > 0:
                for s in range(i):
                    if dp[s][j-1] != -INF:
                        flip_gain = -(pre[i] - pre[s])
                        dp[i][j] = max(dp[i][j], dp[s][j-1] + flip_gain)
    
    return max(dp[n][j] for j in range(k + 1))

if __name__ == "__main__":
    try:
        n = int(input())
        k = int(input())
        a = list(map(int, input().split()))
        print(solve(n, k, a))
    except (EOFError, ValueError):
        pass