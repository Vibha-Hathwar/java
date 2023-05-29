import java.util.*;
public class array2
{	
	public static void printarray(int[] a)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static int binarysearch(int[] a,int x)
	{
		int n=a.length;
		int low=0;
		int high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(x==a[mid])
				return mid;
			else if(x<a[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
	public static void insertionsort(int[] a)
	{
		int n=a.length;
		 int i,j,temp;
		    for(i=1;i<n;i++)
		    {
		        temp=a[i];
		        j=i-1;
		        while(j>=0&&a[j]>temp)
		        {
		            a[j+1]=a[j];
		            j--;
		        }
		        a[j+1]=temp;
		    }
	}
	public static void bubblesort(int[] a)
	{
    	int n=a.length;
    	int temp;
        for(int i=0;i<n;i++)
        	for(int j=0;j<n-1-i;j++)
        		if(a[j]>a[j+1])
        		{
        			temp=a[j];
        			a[j]=a[j+1];
        			a[j+1]=temp;
        		}
	}
	public static void sortTrinary(int[] a)
	{
		int zero=0,one=0;
		for(int i=0;i<a.length;i++)
			if(a[i]==0)
				zero++;
		for(int i=0;i<a.length;i++)
			if(a[i]==1)
				one++;
		for(int i=0;i<zero;i++)
			a[i]=0;
        for(int i=zero;i<zero+one;i++)
            a[i]=1;
        for(int i=zero+one;i<a.length;i++)
            a[i]=2;
	}
	public static void pushZerosAtEnd(int[] a)
	{
		int[] b=new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++)
			if(a[i]!=0)
			{
				b[j]=a[i];
				j++;
			}
		for(int i=0;i<b.length;i++)
			a[i]=b[i];
		for(int i=b.length;i<a.length;i++)
			a[i]=0;
	}
	public static void rotate(int[] a,int d)
	{
		int n=a.length;
		int[] b=new int[n];
		int j=0;
		for(int i=d;i<n;i++)
		{
			b[j]=a[i];
			j++;
		}
		for(int i=0;i<d;i++)
		{
			b[j]=a[i];
			j++;
		}
		for(int i=0;i<n;i++)
			a[i]=b[i];
		/*int j=0;
		for(int i=0;i<n;i++)
		{	
			b[i]=a[j];
			j++;
		}
		for(int i=0;i<d;i++)
		{
			b[i]=a[j];
			j++;
		}
		for(int i=0;i<n;i++)
			a[i]=b[i];*/
	}
	public static int secondmax(int[] a)
	{
		int n=a.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]>max2&&a[i]<max)
				max2=a[i];
		}
		return max2;
	}
	public static int checkrotate(int[] a)
	{
		int value=0;
        for (int i=0;i<a.length-1;i++)
        {
            if (a[i]>a[i+1])
            {
                value=i+1;
                break;
            }
        }
        return value;
	}
	public static void sum(int[] a,int[] b,int[] c)
	{
		/*int n=a.length;
		int m=b.length;
		for(int i=c.length-1;i>0;i--)
		{
			c[i]=c[i]+a[n-1]+b[m-1];
			m=m-1;
			n=n-1;
			if(c[i]>9)
			{
				c[i]=c[i]-10;
				c[i-1]=1;
			}
		}*/
		int n=a.length-1;
		int m=b.length-1;
		for(int i=c.length-1;i>0;i--)
		{	
			if(n<0 && m>=0) {
				c[i]+=b[m];
			}
			if(m<0 && n>=0) {
				c[i]+=a[n];
			}
			if(m<0 && n<0)
				c[i]=c[i];
			if(m>=0 && n>=0)
				c[i]=c[i]+a[n]+b[m];
			m--;n--;
			if(c[i]>9)
			{
				c[i]=c[i]-10;
				c[i-1]=1;
			}
		}
	}
	public static int[] merge(int arr1[],int arr2[])
	{
		/*int n=arr1.length;	//	one-case time limit exceed
		int m=arr2.length;
		int []b=new int[n+m];
		int i=0,j=0,k=0;
		for(k=0;k<n+m;k++)
		{
			if(i>=n)
			{
				b[k]=arr2[j];
	            j++;
	        }
			else if(j>=m)
			{
	            b[k]=arr1[i];
	            i++;
	        }
			else
			{
				if(arr1[i]<arr2[j])
				{	
					b[k]=arr1[i];
					i++;
				}
				else
				{
					b[k]=arr2[j];
					j++;
				}
			}
		}
       return b;*/
		int i=0,j=0,k=0;			//	copied
        int[] arr3 = new int[arr1.length+arr2.length];
        for(k=0;k<(arr1.length + arr2.length);k++)
		{
            if (i>=arr1.length) 
			{
				arr3[k]=arr2[j];
				j++;
			}
            else if (j>=arr2.length)
			{
				arr3[k]=arr1[i];
				i++;
			}
            else
			{
				if (arr1[i]<arr2[j])
				{
					arr3[k]=arr1[i];
					i++;
				}
				else
				{
					arr3[k]=arr2[j];
					j++;
				}
			}
		}
        return arr3;
	}
	public static void selectionSort(int[] a)
	{
		for (int i=0;i<a.length;i++)
		{
			int idx=i;
			for (int j=i+1;j<a.length;j++)
			{
				if (a[j]<a[idx])
				{
					idx=j;
				}
			}
			int temp=a[i];
			a[i]=a[idx];
			a[idx]=temp;
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
//1		//	binary search
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		//int n=s.nextInt();
		int [] a = new int[t];
		for(int j=0;j<t;j++)
			a[j]=s.nextInt();
		int m=s.nextInt();
		int x,pos;
		for(int i=0;i<m;i++)
		{
			x=s.nextInt();
			pos=binarysearch(a,x);
			System.out.println(pos);
		}*/
		
//2		//	bubble sort
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			//bubblesort(a);
			//printarray(a);
		}*/
		
		
//3		//	insertion sort
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			insertionsort(a);
			printarray(a);
		}*/
		
//4		//	merge 2 sorted arrays
		/*Scanner s = new Scanner(System.in);
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
			System.out.println();
			int []res=merge(a,b);
			printarray(res);
		}*/
		
//5		//	sort array with  0 1 2
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			sortTrinary(a);
			printarray(a);
		}*/
		
//6		//	push zeros to end
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			pushZerosAtEnd(a);
			printarray(a);
			System.out.println();
		}
		
//7		//	rotate an array
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			int d=s.nextInt();
			rotate(a,d);
			printarray(a);
		}*/
		
//8		//	find 2nd max in array
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			int pos=secondmax(a);
			System.out.println(pos);
		}*/

//9		//	find rotation		
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			int pos=checkrotate(a);
			System.out.println(pos);
		}*/
		
//10	//	sum
		/*Scanner s = new Scanner(System.in);
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
			int arr[] = new int[m+1];
		    if(n>m)
		      arr = new int[n+1];
			sum(a,b,arr);
			printarray(arr);
		}*/
		
//11	//	selection sort
		/*Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{	
			int n=s.nextInt();
			int [] a = new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			selectionSort(a);
			printarray(a);
		}*/
	}
}