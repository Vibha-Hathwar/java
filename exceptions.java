import java.util.*;
public class exceptions
{
	public static int divide (int a,int b) throws ArithmeticException
	{
		if(b==0)
			throw new ArithmeticException();
		return a/b;
	}
	public static int fact(int n) throws ArithmeticException
	{
		if(n<0)
			throw new ArithmeticException();
		int res=1;
		for(int i=2;i<=n;i++)
			res=res*i;
		return res;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		/*int a=s.nextInt();
		int b=s.nextInt();
		//System.out.println(divide(a,b));
		try
		{
			divide(a,b);
			System.out.println("within try");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero Excepion raised");
		}
		System.out.println("done");*/
		
		
//		 one try 2 or more catches can be there
		int n=s.nextInt();
		try
		{
			System.out.println(fact(n));
			System.out.println("within try");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Negetive no");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("finally");
			//either exception or not, ie try or catch ,  always excecuted 
		}
		System.out.println("done");
	}
}