'''
Given an unsorted array of size n. Array elements are in the range from 1 to n. One number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.

Examples: 

 Input: arr[] = {3, 1, 3}
Output: Missing = 2, Repeating = 3
Explanation: In the array, 
2 is missing and 3 occurs twice 

Input: arr[] = {4, 3, 6, 2, 1, 1}
Output: Missing = 5, Repeating = 1
'''

def missing_repeating():
     
    arr = [ 4, 3, 6, 2, 1, 1 ]
     
    numberMap = {}
     
    max = len(arr)
    for i in arr:
        if not i in numberMap:
            numberMap[i] = True
             
        else:
            print("Repeating =", i)
     
    for i in range(1, max + 1):
        if not i in numberMap:
            print("Missing =", i)
