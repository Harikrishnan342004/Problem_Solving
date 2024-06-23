




























def solution(nums, target):
    n = len(nums)
    dp = [0] * (1 << n)
    
    for mask in range(1 << n):
        subset = []
        for i in range(n):
            if mask & (1 << i):
                subset.append(nums[i])
        
        valid = True
        for j in range(len(subset)):
            for k in range(j + 1, len(subset)):
                if (subset[j] + subset[k]) % target == 0:
                    valid = False
                    break
            if not valid:
                break
        
        if valid:
            dp[mask] = len(subset)
    
    return max(dp)

# Example usage:
print(solution([2,4,6,8,], 2))  # Output: 3
print(solution([1], 3)) # Output: 1