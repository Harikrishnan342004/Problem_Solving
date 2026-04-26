import sys
input = sys.stdin.readline

def solve(n: int, k: int, a: list) -> int:
    base_sum = sum(abs(x) for x in a)
    blocks = []
    i = 0
    while i < n:
        if a[i] < 0:
            block_abs = 0
            while i < n and a[i] < 0:
                block_abs += abs(a[i])
                i += 1
            blocks.append(block_abs)
        else:
            i += 1
    num_blocks = len(blocks)
    if k >= num_blocks:
        return base_sum
    blocks.sort(reverse=True)
    leftover_neg_sum = sum(blocks[k:])
    return base_sum - 2 * leftover_neg_sum

if __name__ == "__main__":
    # Case 1: n=5, k=2, a=[-10, 20, -30, 40, -50] → Expected: 130
    n = 5
    k = 2
    a = [-10, 20, -30, 40, -50]
    print("Case 1 Output:", solve(n, k, a))   # 130