import java.util.*;
public class fuction
{
	public static int fact(int n)
	{
		int fac=1;
		for(int i=1;i<=n;i++)
			fac=fac*i;
		return fac;
	}
	public static int add(int a,int b)
	{
		return (a+b);
	}
	public static void printevenno(int start,int end)
	{
		if(start%2!=0)
			start++;
		for(int i=start;i<=end;i+=2)
			System.out.print(i+" ");
	}
	public static void func2()
	{
	    System.out.print("#");
	}
	public static void func1()
	{
	    System.out.print("*");
	    func2();
	}
	public static void inc(int n)
	{
		n++;
	}
	public static int increment(int n)
	{
		n++;
		return n;
	}
	public static double sum(double a,double b)	//	function overloading
	{
		return (a+b);
	}
	public static int sum(int a,int b)	//	function overloading
	{
		return (a+b);
	}
	public static int sum(int a)		//	function overloading
	{
		return a+10;
	}
	public static void main(String[] args)
	{	
		//System.out.println(Integer.MIN_VALUE);
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		
		int r=s.nextInt();
		/*int nf=fact(n);
		int rf=fact(r);
		int nr=fact(n-r);
		int res=nf/(rf*nr);
		System.out.println(res);
		
		int sum=add(n,r);
		System.out.println(sum);
		
		printevenno(n,r);*/
		

	    /*func2();
	    func1();*/
		
		/*inc(n);
		System.out.println(n);
		n=increment(n);
		System.out.println(n);
		*/
		
		System.out.println(sum(10.6,1.8));
		System.out.println(sum(n));		//	function overloading
		System.out.println(sum(n,r));
	}
}
