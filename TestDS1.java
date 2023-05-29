import java.util.*;
public class TestDS1
{
	static boolean solve(String a,String b,int i,int j)
	{
		if(j==b.length()-1)
		{
			if(a.charAt(i)==b.charAt(j))
				return true;
		}
		if(i==a.length()-1)
			return false;
		if(a.charAt(i)==b.charAt(j))
			return solve(a,b,i+1,j+1);
		else
			return solve(a,b,i+1,j);
	}
	public static boolean checkSequence(String a, String b) 
	{
		return solve(a,b,0,0);
	}
	
	
	
	public static int maximumProfit(int a[])
	{
		// Write your code here
		int p=0,n=a.length;
		Arrays.sort(a);
		for(int i=0;i<n;i++)
			p=Math.max(p,(n-i)*a[i]);
		return p;
	}
	
	
	 public static boolean splitArray(int arr[], int si, int lsum, int rsum) 
	 { 
        if (si == arr.length) 
            return lsum == rsum;
     	if (arr[si] % 5 == 0)
     		return splitArray(arr,si+1,lsum+arr[si],rsum); 
        else if (arr[si] % 3 == 0) 
     		return splitArray(arr,si+1,lsum,rsum+arr[si]); 
        else
            return splitArray(arr,si+1, lsum+arr[si], rsum)  || splitArray(arr,si+1,lsum,rsum+arr[si]);
 	} 

	public static boolean splitArray(int input[])
	{
		return splitArray(input,0,0,0);
	}
	
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		/*Given two string s and t, write a function to check 
		 if s contains all characters of t (in the same order as they are in string t).
		Return true or false. Do it recursively.*/
		String str=s.next();
		String t=s.next();
		System.out.println(checkSequence(str,t));
		
		
		/*There are certain users who will subscribe to your app only if their budget is greater than or equal to your price.
		You will be provided with a list of size N having budgets of subscribers and you need to return the maximum profit that you can earn.
		Lets say you decide that price of your app is Rs. x and there are N number of subscribers. So maximum profit you can earn is :m * x
		where m is total number of subscribers whose budget is greater than or equal to x.*/
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println(maximumProfit(a));
		
		/*Given an integer array A of size N, check if the input array can be splitted in two parts such that -
 		-Sum of both parts is equal
		- All elements in the input, which are divisible by 5 should be in same group.
		- All elements in the input, which are divisible by 3 (but not divisible by 5) should be in other group.
		- Elements which are neither divisible by 5 nor by 3, can be put in any group.
		Return true, if array can be split according to the above rules, else return false.
		Note : You will get marks only if all the test cases are passed.*/
		
		/*int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();*/
		System.out.println(splitArray(a));
	}
}