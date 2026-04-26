import sys
input = sys.stdin.readline


def solve(n: int, k: int, a: list) -> int:
    num_neg = sum(1 for x in a if x < 0)
    if k >= num_neg:
        return sum(abs(x) for x in a)

    c = [-x for x in a]

    def kadane_with_penalty(lam):
        NEG_INF = float('-inf')
        out_val, out_cnt = 0, 0
        in_val, in_cnt = NEG_INF, 0

        for v in c:
            ext_val = in_val + v if in_val != NEG_INF else NEG_INF
            ext_cnt = in_cnt

            new_val = out_val + v - lam
            new_cnt = out_cnt + 1

            if ext_val > new_val:
                ni_val, ni_cnt = ext_val, ext_cnt
            else:
                ni_val, ni_cnt = new_val, new_cnt

            if in_val != NEG_INF and in_val > out_val:
                no_val, no_cnt = in_val, in_cnt
            else:
                no_val, no_cnt = out_val, out_cnt

            out_val, out_cnt = no_val, no_cnt
            in_val, in_cnt = ni_val, ni_cnt

        if in_val != NEG_INF and in_val > out_val:
            return in_val, in_cnt
        return out_val, out_cnt

    lo, hi = 0, 2 * 10**9
    while lo < hi:
        mid = (lo + hi) // 2
        _, cnt = kadane_with_penalty(mid)
        if cnt <= k:
            hi = mid
        else:
            lo = mid + 1

    best_val, _ = kadane_with_penalty(lo)
    gain = best_val + lo * k

    return sum(a) + 2 * gain


if __name__ == "__main__":
    try:
        n = int(input())
        k = int(input())
        a = list(map(int, input().split()))
        result = solve(n, k, a)
        print(result)
    except (EOFError, ValueError):
        pass