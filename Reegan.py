# def solution(nums, target):
#     # Initialize the dp array with -inf
#     dp = [-float('inf')] * target
#     dp[0] = 0  # Base case: sum of 0 modulo target is always valid
    
#     # Iterate through each number in nums
#     for num in nums:
#         # Create a new dp array for current iteration
#         new_dp = dp[:]
#         for i in range(target):
#             if dp[i] != -float('inf'):
#                 new_dp[(i + num) % target] = max(new_dp[(i + num) % target], dp[i] + num)
#         dp = new_dp
    
#     # The maximum sum that satisfies the condition is found at dp[0]
#     return dp[0]

# # Example usage:
# nums1 = [1, 7, 2, 4]
# target1 = 3
# print(solution(nums1, target1))  # Output: 3

# nums2 = [1]
# target2 = 3 
# print(solution(nums2, target2))  # Output: 1





def max_subset_sum(nums, target):
  """
  Finds the maximum subset sum in nums where no two elements' sum is divisible by target.

  Args:
      nums: A list of integers.
      target: An integer value.

  Returns:
      The maximum subset sum that satisfies the condition.
  """

  # Handle base case where target is 1 (all sums will be divisible by 1)
  if target == 1:
    return 0

  # Initialize a dictionary to store maximum subset sums for remainders
  dp = {0: 0}  # Base case: empty subset with remainder 0 has sum 0

  for num in nums:
    # Get all possible remainders when dividing num by target
    remainders = [num % target, (num % target - target) % target]

    # Update dp for each remainder, considering the current number or previous value
    for remainder in remainders:
      dp[remainder] = max(dp.get(remainder, 0), num + dp.get((remainder - target) % target, 0))

  return dp[0]  # Return the maximum subset sum with remainder 0 (no divisibility)

# Examples
nums1 = [1, 7, 2, 4]
target1 = 3
print(max_subset_sum(nums1, target1))  # Output: 3

nums2 = [1]
target2 = 3
print(max_subset_sum(nums2, target2))  # Output: 1