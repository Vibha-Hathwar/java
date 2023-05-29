import java.util.*;
public class prime
{
	public static boolean checkprime(int n)
	{
		int div=2;
		while(div<=n/2)
		{
			if(n%div==0)
				return false;
			div++;
		}
		return true;
	}
	public static boolean isPrime2(int x)
	{
	    for(int i=2;i<x/2;i++)
	    {
	        if(x%i==0)
	        return false;
	    }
	    return true;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
	    int n=s.nextInt();
	    /*boolean isprime=true;
	    if(n%2==0)
	        isprime=false;
	    int i=3;
	    while(isprime&&i<n)
	    {
	        isprime=!(n%i==0);
	        i+=2;
	    }
	    if(isprime)
	    {
	        System.out.println("Prime");
	    }
	    else
	    {
	        System.out.println("Composite");
	    }*/
	    
	    
	    /*int div=2;
	    while(div<=n/2)
	    {
	    	if(n%div==0)
	    	{
	    		System.out.println("Composite");
	    		return ;
	    	}
	    	div=div+1;
	    }
	    System.out.println("Prime");*/
	    
	    /*boolean isPrime=checkprime(n);
	    System.out.println(isPrime);*/
	    

		System.out.print(isPrime2(n));
	
	}
}
