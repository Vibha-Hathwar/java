import java.util.*;
public class recursion
{
	public static int fact(int n)
	{
		if(n==0||n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static int nSum(int n)
	{
		if(n==0)
			return 0;
		else
			return n+nSum(n-1);
	}
	public static int power(int x, int n)
	{
		if(n==0)
			return 1;
		else
			return x*power(x,n-1);
	}
	public static int count(int n)
	{
		/*if(n==0)
			return 0;
		int m = count(n / 10);
		return m+1;*/
		if (n/10 == 0)
            return 1;
        return 1 + count(n / 10);
	}
	public static void print1ton(int n)
	{
		if(n==0)
			return;
		print1ton(n-1);
		System.out.print(n+" ");
	}
	public static void printnto1(int n)
	{
		if(n==0)
			return;
		System.out.print(n+" ");
		print1ton(n-1);
	}
	public static int fibo(int n)
	{
		if(n==1||n==2)
			return 1;
		return fibo(n-1)+fibo(n-2);
	}
	public static boolean sorted(int a[])
	{
		if(a.length==1)
			return true;
		if(a[0]>a[1])
			return false;
		int b[]=new int[a.length-1];
		for(int i=1;i<a.length;i++)
			b[i-1]=a[i];
		boolean s=sorted(b);
		return s;
	}
	public static boolean isSorted(int a[],int s)
	{
		if(s==a.length-1)
			return true;
		if(a[s]>a[s+1])
			return false;
		boolean r=isSorted(a,s+1);
		return r;
	}
	public static int sum(int a[])
	{
		if(a.length==1)
			return a[0];
		int s=0;
		int b[]=new int[a.length-1];
		for(int i=1;i<a.length;i++)
			b[i-1]=a[i];
		s=a[0]+sum(b);
		return s;
	}
	public static boolean checkNumber(int a[],int x)
	{
		if(a.length==1)
		{
			if(a[0]==x)
				return true;
			else
				return false;
		}
		if(a[0]==x)
			return true;
		else if(a[a.length-1]==x)
			return true;
		int b[]=new int[a.length-1];
		for(int i=1;i<a.length;i++)
			b[i-1]=a[i];
		boolean s=checkNumber(b,x);
		return s;
	}
	public static int firstIndex(int a[],int x)
	{
		if(a.length==0)
			return -1;
		if(a[0]==x)
			return 0;
		int b[]=new int[a.length-1];
		for(int i=1;i<a.length;i++)
			b[i-1]=a[i];
		int j=firstIndex(b,x);
		if(j==-1)
			return -1;
		else 
			return j+1;
	}
	public static int firstInd(int a[],int x,int s)
	{
		if(s==a.length)
			return -1;
		if(a[s]==x)
			return s;
		return firstInd(a,x,s+1);
	}
	public static int lastIndex(int a[],int x)
	{
		if(a.length==0)
			return -1;
		int b[]=new int[a.length-1];
		for(int i=1;i<a.length;i++)
			b[i-1]=a[i];
		int j=lastIndex(b,x);
		if(j!=-1)
			return j+1;
		else
		{
			if(a[0]==x)
				return 0;
			else
				return -1;
		}	
		
		//	runtime error
		/*if(a.length==0)
			return -1;
		if(a[a.length-1]==x)
			return a.length-1;
		int b[]=new int[a.length-1];
		for(int i=0;i<a.length-1;i++)
			b[i-1]=a[i];
		int j=lastIndex(b,x);
		if(j==-1)
			return -1;
		else 
			return j;*/
	}
	public static int lastInd(int a[],int x,int s)
	{
		if(s==a.length)
			return -1;
		int j=lastInd(a,x,s+1);
		if(j!=-1)
			return j;
		else
		{
			if(a[s]==x)
				return s;
			else
				return -1;
		}
	}
	public static int binSearch(int a[],int s,int e,int x)
	{
		if(s>e)
			return -1;
		int mid=(s+e)/2;
		if(a[mid]==x)
			return mid;
		if(a[mid]<x)
			return binSearch(a,mid+1,e,x);
		else
			return binSearch(a,s,mid-1,x);
	}
	public static void merge(int a[],int b[],int d[])
	{
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				d[k]=a[i];
				i++;k++;
			}
			else
			{
				d[k]=b[j];
				j++;k++;
			}
		}
		while(i<a.length)
		{
			d[k]=a[i];
			i++;k++;
		}
		while(j<b.length)
		{
			d[k]=b[j];
			j++;k++;
		}
	}
	public static void mergeSort(int a[])
	{
		if(a.length<=1)
			return;
		int b[]=new int[a.length/2];
		int c[]=new int[a.length-b.length];
		for(int i=0;i<a.length/2;i++)
			b[i]=a[i];
		for(int i=a.length/2;i<a.length;i++)
			c[i-a.length/2]=a[i];
		mergeSort(b);
		mergeSort(c);
		merge(b,c,a);
	}
	public static int partition(int a[],int s,int e)
	{
		int p=a[s];
		int small=0;
		for(int i=s+1;i<=e;i++)
			if(a[i]<p)
				small++;
		int temp=a[s+small];
		a[s+small]=p;
		a[s]=temp;
		
		int i=s;
		int j=e;
		while(i<j)
		{
			if(a[i]<p)
				i++;
			else if(a[j]>=p)
				j--;
			else
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		return s+small;
	}
	public static void quickSort(int a[],int s,int e)
	{
		if(s>=e)
			return;
		int p=partition(a,s,e);
		quickSort(a,s,p-1);
		quickSort(a,p+1,e);
	}
	public static void quickSort(int a[])
	{
		quickSort(a,0,a.length-1);	
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		/*System.out.println(n+"! = "+fact(n));
		int m=s.nextInt();
		System.out.println(nSum(m));
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println(power(x,n));
		System.out.println(count(n));
		print1ton(n);
		System.out.println(fibo(n));*/
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		//System.out.println(sorted(a));
		//System.out.println(isSorted(a,0));
		//System.out.println(sum(a));
		int x=s.nextInt();
		//System.out.println(checkNumber(a,x));
		//System.out.println(firstIndex(a,x));
		//System.out.println(firstInd(a,x,0));
		//System.out.println(lastIndex(a,x));
		System.out.println(lastInd(a,x,0));
		
		/*int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		/*int x=s.nextInt();
		System.out.println(binSearch(a,0,n-1,x));* /
		//mergeSort(a);
		//quickSort(a,0,n-1);
		quickSort(a);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");*/
	}
}