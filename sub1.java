// subbu anna //25-12-2022
/*
Given an integer array nums and an integer k, return the length of the shortest non-empty subarray of nums with a sum of at least k. If there is no such subarray, return -1.

A subarray is a contiguous part of an array.

Example 1:
Input: nums = [1], k = 1
Output: 1

Example 2:
Input: nums = [1,2], k = 4
Output: -1

Example 3:
Input: nums = [2,-1,2], k = 3
Output: 3
 

Constraints:

1 <= nums.length <= 105
-105 <= nums[i] <= 105
1 <= k <= 109
*/
import java.util.*;
public class sub1
{
    public static int[] inputarray()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("enter n ");
		int n=s.nextInt();
		System.out.print("Enter "+n+" elements ");
		int [] a = new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		return a;
	}
	public static void printarray(int[] a)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static int subarr(int[] a, int K)
	{int n = a.length;
       int lengthOfSmallestSubarray = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            int currentSubarraySum = 0;
            for(int j = i; j < n; j++)
            {
                currentSubarraySum += a[j];
                if(currentSubarraySum >= K)
                {
                    lengthOfSmallestSubarray = Math.min(lengthOfSmallestSubarray, j-i+1);
                    break;
                }
            }
        }
        return lengthOfSmallestSubarray == Integer.MAX_VALUE ? -1: lengthOfSmallestSubarray;
    }
	public static void main(String[] args)
	{
	    int [] a = inputarray();
		  //  printarray(a);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter k ");
		int k=s.nextInt();
		int res=subarr(a,k);
		System.out.println(res);
	}
}
/*if(nums.length()==1)
            if(nums[0]==k)
                return 1;
        
        return -1;*/
