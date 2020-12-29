/******************************************************************************

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below N .

Input Format

First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer,N .

Constraints

1 <= T <= 105
1 <= N <= 109

Output Format

For each test case, print an integer that denotes the sum of all the multiples of 3 or 5 below N.

Sample Input

2
10
100
Sample Output

23
2318
Explanation

For the input 10
output = 3 + 5 + 6 + 9 = 23

*******************************************************************************/
#include <stdio.h>

int main()
{
    long int N;
    scanf("%ld",&N);
    //first calculate terms divisible by 3
    /*
       x=(N-1)/3
    */
    // secondly calculate sum of multiples of 3
    //sum=((x)*2a+(x-1)*d))/2;
    long int x = (N-1)/3;
    long int sum_of_multiples_of_3 = ((x)*(2*3+(x-1)*3))/2;
    //Do it same for 5 and 15
    long int y = (N-1)/5;
    long int sum_of_multiples_of_5 = ((y)*(2*5+(y-1)*5))/2;
    
    long int z = (N-1)/15;
    long int sum_of_multiples_of_15 = ((z)*(2*15+(z-1)*15))/2;
    
    //removing the duplicate terms by subtracting the multiples of 15th terms
    long int ans = (sum_of_multiples_of_3 + sum_of_multiples_of_5 - sum_of_multiples_of_15);
    printf("%ld",ans);
    
    return 0;
}

