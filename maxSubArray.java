/******************************************************************************
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [0]
Output: 0

Example 4:

Input: nums = [-1]
Output: -1

Example 5:

Input: nums = [-2147483647]
Output: -2147483647

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int maxSubArray(int[] inputArray,int n)
    {
        int curr_sum=inputArray[0];
        int max_sum=curr_sum;
        for(int i=1;i<n;i++)
        {
            curr_sum=Math.max(inputArray[i]+curr_sum,inputArray[i]);
            max_sum=Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] nums =new int[input];
		for(int i=0;i<input;i++)
		{
		    nums[i]=sc.nextInt();
		}
		System.out.println(maxSubArray(nums,input));
		
	}
}
