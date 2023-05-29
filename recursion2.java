import java.util.*;
public class recursion2
{
	public static String replaceChar(String s,char a,char b)
	{
		if(s.length()==0)
			return s;
		String r=replaceChar(s.substring(1),a,b);
		if(s.charAt(0)==a)
			return b+r;
		else
			return s.charAt(0)+r;
	}//abcxdxex
	public static String removeX(String s)
	{
		if(s.length()==0)
			return s;
		String r=removeX(s.substring(1));
		if(s.charAt(0)=='x')
			return r;
		else
			return s.charAt(0)+r;
	}
	public static String replacePi(String s)
	{
		if(s.length()<=1)
			return s;
		String r;
		if(s.charAt(0)=='p'&&s.charAt(1)=='i')
		{
			r = replacePi(s.substring(2));
			return "3.14" + r;
		}
		else
		{
			r = replacePi(s.substring(1));
			return s.charAt(0)+r;
		}
	}
	public static String removeDupl(String s)
	{
		//removeConsecutiveDuplicates
		if(s.length()<=1)
			return s;
		String r= removeDupl(s.substring(1));
		if(s.charAt(0)==s.charAt(1))
			return r;
		else
			return s.charAt(0)+r;
	}
	public static void TOH(int n,char src,char temp,char dest)
	{
	    if(n==1)
	    {
	        System.out.println(src+" "+dest);
	        return;
	    }
	    else if(n==0)
	    {
	    	System.out.println();
	    	return;
	    }
	    TOH(n-1,src,dest,temp);
	    System.out.println(src+" "+dest);
	    TOH(n-1,temp,src,dest);
	}
	public static double findGeometricSum(int k)
	{
		if(k==0)
			return 1.0;
		return (double)((1/Math.pow(2, k))+findGeometricSum(k-1));
	}
	public static boolean palindrome(String a)
	{
		return (palindrome(a,0,a.length()-1));
	}
	 public static boolean palindrome(String a, int s, int e)
	 {
		 if (s>=e)
			 return true;
	     boolean check=true;
	     if (a.charAt(s)==a.charAt(e))
	    	 check=palindrome(a,s+1,e-1);
	     else
	    	 check=false;
	     return check;
	}
	 public static int sumofdigits(int n)
	 {
		 if(n==0)
			 return 0;
		 int sum=sumofdigits(n/10);
		 return (n%10)+sum;
	 }
	public static int multiply(int m,int n)
	{
		if(m==0||n==0)
			return 0;
		int pro=multiply(m,n-1);
		return (m+pro);
	}
	public static int countzeros(int n)
	{
		if(n==0)
			return 0;
        int c=countzeros(n/10);
        if (n%10==0)
        	return c+1;
        return c;
	}
	public static int countzerosrec(int n)
	{
		if(n==0)
			return 1;
		return countzeros(n);
	}
	public static String addStars(String s)
	{
		if (s.length()==1)
	            return s;
		String sm=addStars(s.substring(1)); 
		if (s.charAt(0)==s.charAt(1))
	         return s.charAt(0)+"*"+sm;
	     else
	    	 return s.charAt(0)+sm;
	}
	public static boolean checkab(String a)
	{
		/*	a. The string begins with an 'a'
			b. Each 'a' is followed by nothing or an 'a' or "bb"
			c. Each "bb" is followed by nothing or an 'a'*/
		if(a.length()==0)
			return true;
		if(a.charAt(0)!='a')
			return false;
		if(a.length()>=3&&a.substring(0,3).equals("abb"))
			return checkab(a.substring(3));
		else
			return checkab(a.substring(1));
	}
	public static int stair(int n)
	{
		/*A child is running up a staircase with N steps,
		   and can hop either 1 step, 2 steps or 3 steps at a time.
		    Implement a method to count how many possible ways 
		    the child can run up to the stairs. You need to return number of possible ways W.*/
		if (n<0)
            return 0;
        else if (n==0)
            return 1;
        return stair(n-1)+stair(n-2)+stair(n-3);
	}
	public static int stringtoInt(String a)
	{
		if(a.length()==0)
			return 0;
		int c=stringtoInt(a.substring(0,a.length()-1));
		int res=(int)a.charAt(a.length()-1);
		res=res-48;
		return res+(c*10);
	}
	public static void intersection(int[] arr1, int[] arr2)
	{
	    //Your code goes here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        /*if(arr1.length<arr2.length)
        	Arrays.sort(arr1);
        else
        	Arrays.sort(arr2);*/
		int i=0,j=0;
        while (i<arr1.length && j<arr2.length)
        {
            if (arr1[i]==arr2[j])
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if (arr1[i]<arr2[j])
                i++;
            else
                j++;
        }
    }
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
    public static int eqlbmindx(int[] arr)
	{  
		int idx=-1;
        int sum_left=0,sum_right=0;
        for (int i=1;i<arr.length;i++)
        {
            for (int j=0;j<i;j++)
                sum_left+=arr[j];
            for (int j=i+1;j<arr.length;j++)
                sum_right+=arr[j];
            if (sum_left==sum_right)
            {
                idx=i;
                break;
            }
            else
            {
                sum_right=0;
                sum_left=0;
            }
        }
        return idx;
	}
    public static int findUnique(int[] arr)
	{
    	//Your code goes here
		int val=0;
        for (int i=0;i<arr.length;i++)
            val=val^arr[i];
        return val;
    		//	TIME LIMIT EXCEED IN 2 CASES OF 5
    	/*int i,j;
    	int n=array.length;
    	int count = 1;
        for(i = 0; i < n; i++)
        {
          for(j = 0; j < n; j++)
    	      if(array[i] == array[j] && i != j)
    	         break;
    	   if(j == n )
    	   {
    	  	  ++count;
    	  	  return array[i];
    	   }
    	}
       return -1;*/
	}
    public static int findDuplicate(int[] arr)
	{
    	//Your code goes here
		int val=0;
        for (int i=0;i<arr.length;i++)
            val=val+arr[i];
        return val-((arr.length-2)*(arr.length-1)/2);
	}
    public static int pairSum(int[] arr, int num) 
	{
		//Your code goes here
		int count=0;
        for (int i=0;i<arr.length;i++)
            for (int j=i+1;j<arr.length;j++)
				if (arr[i]+arr[j]==num)
            		   count++;
        return count;
	}
    public static int tripletSum(int[] arr, int num)
	{
    	//	2 test cases time limit exceed
    	int count=0;
    	 for (int i = 0; i < arr.length - 2; i++)
    		 for (int j = i + 1; j < arr.length - 1; j++)
    	       	for (int k = j + 1; k < arr.length; k++)
    	            if (arr[i] + arr[j] + arr[k] == num)
    	                count++;
    	 return count;
    	
//    		2 test cases time limit exceed
     	/*int n=arr.length,count=0;
     	for (int i = 0; i < n - 1; i++)
     	{
             HashSet<Integer> s = new HashSet<>();
             for (int j = i + 1; j < n; j++)
             {
                 int x = num - (arr[i] + arr[j]);
                 if (s.contains(x))
                 	count++;
                 else
                     s.add(arr[j]);
             }
         }
     	return count;*/
    	 
    	//	no answer
    	/*int l,r,count=0;
    	Arrays.sort(arr);
    	 for (int i = 0; i < arr.length - 2; i++)
    	 {
    		 l = i + 1; // index of the first element in the
             r = arr.length - 1; // index of the last element
             while (l < r)
             {
                 if (arr[i] + arr[l] + arr[r] == num)
                	 count++;
                 else if (arr[i] + arr[l] + arr[r] < num)
                     l++;
                 else // A[i] + A[l] + A[r] > sum
                     r--;
             }
    	 }*/
    	
    	
	}

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		//String str=s.nextLine();
		/*char a=s.next().charAt(0);
		char b=s.next().charAt(0);
		System.out.println(replaceChar(str,a,b));*/
		//System.out.println(removeX(str));
		//System.out.println(replacePi(str));
		//System.out.println(removeDupl(str));
		
		//int n=s.nextInt();
		//TOH(n,'a','b','c');
		
		//int n=s.nextInt();
		//System.out.printf("%.5f",findGeometricSum(n));
		
		/*String str=s.next();
		System.out.println(palindrome(str));*/
		
		//int n=s.nextInt();
		//System.out.println(sumofdigits(n));
		
		/*int m=s.nextInt();
		int n=s.nextInt();
		System.out.println(multiply(m,n));*/

		/*int n=s.nextInt();
		System.out.println(countzerosrec(n));
		
		/*String str=s.next();
		System.out.println(addStars(str));*/
		
		/*String str=s.next();
		System.out.println(checkab(str));*/
		
		/*int n=s.nextInt();
		System.out.println(stair(n));	*/
		
		/*String str=s.next();
		System.out.println(stringtoInt(str));*/

		
//	 TIME COMPLIXITY
		
		/*int [] a = inputarray();
		int b[]=inputarray();
		intersection(a,b);*/
		
		/*int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			//System.out.println(eqlbmindx(a));
			//System.out.println(findUnique(a));
			System.out.println(findDuplicate(a));
		}*/
		
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			int sum=s.nextInt();
			//System.out.println(pairSum(a,sum));
			System.out.println(tripletSum(a,sum));
		}
	}
}