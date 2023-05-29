import java.util.*;
import java.io.*;
public class test4
{		//	Test 3 7:00
	public static int sumOfMaxMin(int[] a, int n)
	{
	      // Write your code here
	      int min=a[0];
	      int max=a[0];
	      for(int i=0;i<n;i++)
	      {
	          if(a[i]>max)
	              max=a[i];
	          if(a[i]<min)
	              min=a[i];
	      }
	      return max+min;
	}
	public static long getInversions(long arr[], int n)
	{
	  // Write your code here.
	  long totalInversions = 0;
	  for (int i = 0; i < n; i++)
	  {
		  for (int j = i + 1; j < n; j++)
			  if (arr[i] > arr[j]) 
				  totalInversions += 1;
	  }
	  return totalInversions;
	 } 
	public static int chessTournament(int[] positions, int n,  int c) 
	{
        // Write your code here.    
		Arrays.sort(positions);
	    int ans = 0;
	    int maxPos = positions[n - 1];
	    for (int i = 1; i < maxPos; i++) 
	    {
	         int count = 1, previousRoom = positions[0];
	         for (int j = 1; j < n; j++) 
	              if (positions[j] - previousRoom >= i) 
	              {
	                  count++;
	                  previousRoom = positions[j];
	              }
		    if (count < c) 
                break;
		    else 
	            ans = i;
	     }
	    return ans;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			System.out.println(sumOfMaxMin(a,n));
		}
		
		/*int n=s.nextInt();
		int [] a = new int[n];
		for(int j=0;j<n;j++)
			a[j]=s.nextInt();
		System.out.println(getInversions(a,n));*/
		
		/**/
	}
}