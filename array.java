import java.util.*;
public class array
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
	
	public static int sumarray(int a[])
	{
		int n=a.length;
		int sum=0;
		for(int i=0;i<n;i++)
			sum+=a[i];
		return sum;
	}
	
	public static int linearsearch(int[] a,int x)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
			if(x==a[i])
				return i;
		return -1;
	}
	
	public static void arrange(int[] a,int n)
	{
		/*int i;
		int odd=1;
		int ind;
		for(i=0;i<=(int)n/2;i++)
		{
			a[i]=odd;
			odd=odd+2;
		}
		ind=i;
		int even=2;
		for(int j=1;j<=(int)n/2;j++)
		{
			a[n-j]=even;
			even=even+2;
		}
		for(int j=0;j<n;j++)
			System.out.print(a[j]+" ");	*/
		if(n==0)
            return;
        int x;
        if(n%2==0)
            x=n/2-1;
        else
            x=n/2;
        int s=0,e=n-1,p=1;
        for(int i=0;i<=x;i++)
        {
            if(s==x)
                a[s]=p++;
            else
            {
                a[s++]=p++;
                a[e--]=p++;
            }
        }
        if(n%2==0)
            a[e]=p;
	}
	public static int largest(int[] a)
	{
		int max=Integer.MIN_VALUE;
		int n=a.length;
		for(int i=0;i<n;i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}
	public static void increment(int[] a)
	{
		for(int i=0;i<a.length;i++)
				a[i]=a[i]+1;
	}
	/*public static int[] increment(int[] a)
	{
		a=new int[7];
		for(int i=0;i<a.length;i++)
				a[i]=a[i]+1;
		return a;
	}*/
	public static void printallpairs(int[] a)
	{
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
				System.out.println(a[i]+" "+a[j]);
		}
	}
	public static int unique(int[] a)
	{
		int n=a.length;
		int val=-1;
		int []b=new int[n];
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n;k++)
			{
				if(a[j]==a[k]&&j!=k)
					b[j]=1;
			}
		}
		for(int j=0;j<n;j++)
			if(b[j]==0)
				val=a[j];
		return val;
	}
	public static int duplicate(int[] arr)
	{
		int n=arr.length;
		int v=0;
		int []b=new int[n];
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n;k++)
			{
				if(arr[j]==arr[k]&&j!=k)
					b[j]=1;
			}
		}
		for(int j=0;j<n;j++)
			if(b[j]==1)
				v=arr[j];
		return v;
	}
	public static int pairsSum(int[] a,int x)
	{
		int count=0;
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
				if(a[i]+a[j]==x)
					count++;
		}
		return count;
	}
	public static int tripletsSum(int[] a,int x)
	{
		int count=0;
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
				for(int k=j+1;k<n;k++)
					if(a[i]+a[j]+a[k]==x)
						count++;
		}
		return count;
	}
	public static void sortBinary(int[] a)
	{
		int zero=0;
		for(int i=0;i<a.length;i++)
			if(a[i]==0)
				zero++;
		for(int i=0;i<zero;i++)
			a[i]=0;
        for(int i=zero;i<a.length;i++)
            a[i]=1;
	}
	public static void intersection(int arr1[],int arr2[])//copied
	{			//		COOOOOOPIIIIIIED
		 int n1=arr1.length;
	     int n2=arr2.length;  
	     for(int i=0;i<n1;i++)    
	    	 for(int j=0;j<n2;j++)
	            if(arr1[i]==arr2[j])
	            {
	            	System.out.print(arr1[i]+" ");
	                arr2[j]=Integer.MIN_VALUE;
	                break;
	            }
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

//
		/*int[] a = new int[10];
		char [] carr=new char[10];
		double [] darr=new double[10];
		System.out.print(a[0]);		//	0
		System.out.print(carr[0]);	//	
		System.out.print(darr[0]);  //0.0*/
		
//
		/*Scanner s = new Scanner(System.in);
		System.out.print("enter n ");
		int n=s.nextInt();
		System.out.print("Enter "+n+" elements ");
		int [] a = new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");*/

//
		/*int [] a = inputarray();
		printarray(a);*/

//1
		/*	sum
		    Sample Input :
			2
			5
			1 2 3 4 5 
			3
			10 20 30 
			Sample Output :
			15
			60*/
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		int [] sum = new int[t];
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			sum[i]=sumarray(a);
		}
		for(int i=0;i<t;i++)
			System.out.println(sum[i]);*/
	
//2		
		/*	linear search
		Sample Input :
		2
		7
		2 13 4 1 3 6 28
		9
		5
		7 8 5 9 5      
		5
		Sample Output :
		-1
		2*/
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		int []pos = new int[t];
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			int x=s.nextInt();
			pos[i]=linearsearch(a,x);
		}
		for(int i=0;i<t;i++)
			System.out.println(pos[i]);*/
		
//3		//	arrange
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int[] a=new int[n];
			arrange(a,n);
			printarray(a);
		}*/
		
		
		//System.out.println("\n"+a);	//	non-primitive datatypes store data
		//	address - [I@39ba5a14		-> [=1 D, I=int, after @ is reference

//
		/*int[] a=inputarray();
		
		int lar = largest(a);
		System.out.print(lar);
		
		increment(a);
		//a=increment(a);
		printarray(a);
		
		printallpairs(a);*/
		
//4		//	swap alternate
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		int []pos = new int[t];
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			for (int j=0;j<n-1;)
	        {
	            int temp=a[j];
	            a[j]=a[j+1];
	            a[j+1]=temp;
	            j=j+2;
	        }
			for(int j=0;j<n;j++)
				System.out.print(a[j]+" ");
			System.out.println();
		}*/
		
//5		//	find unique	&&	find duplicate
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			//int val=unique(a);
			int val=duplicate(a);
			System.out.println(val);
		}*/
		
//6		//	pair sum &&	triplet sum
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			int x=s.nextInt();
			//int val=pairsSum(a,x);
			int val=tripletsSum(a,x);
			System.out.println(val);
		}*/
		
//7		//	sort 0 1 array
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			sortBinary(a);
			printarray(a);
		}*/
		
//8		//	intersection
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			int m=s.nextInt();
			int [] b = new int[m];
			for(int j=0;j<m;j++)
				b[j]=s.nextInt();
			intersection(a,b);
		}
	}
}
