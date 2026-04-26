def SignalGenerator(n, array):
    result = []
    flat_values = []

    i = 0
    
    # Step 1: Find all flat phases
    while i < n - 1:
        if array[i] == array[i + 1]:
            val = array[i]
            
            # skip entire flat sequence
            while i < n - 1 and array[i] == array[i + 1]:
                i += 1
            
            flat_values.append(val)
        i += 1

    # Step 2: Generate output
    if not flat_values:
        return []

    # First flat phase
    result.append(1)

    # Compare next flat phases
    for i in range(1, len(flat_values)):
        if flat_values[i] > flat_values[i - 1]:
            result.append(1)
        else:
            result.append(-1)

    return result


# Hardcoded INPUT
n = 12
array = [3, 5, 5, 6, 7, 7, 7, 8, 9, 4, 4, 0]

# OUTPUT
output = SignalGenerator(n, array)

for val in output:
    print(val)
