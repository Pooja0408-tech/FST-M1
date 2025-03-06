# Given tuple
num_tuple = (10, 21, 33, 48, 57)
print("Given list is ", num_tuple)
 
# Print elements that are divisible by 3
print("Elements that are divisible by 3:")
for num in num_tuple:
    if (num % 3 == 0):
        print(num)