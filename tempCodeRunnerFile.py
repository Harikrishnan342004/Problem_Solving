def find_median(I1, I2):
    combined = sorted(I1 + I2)  # Merge and sort the two arrays
    length = len(combined)
    if length % 2 == 0:
        return (combined[length // 2 - 1] + combined[length // 2]) / 2  # Correct indexing for even length
    else:
        return combined[length // 2]  # Correct indexing for odd length

I1 = [1, 2, 3]
I2 = [4, 5]
Output = find_median(I1, I2)
print(Output)  #