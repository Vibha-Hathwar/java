import java.util.*;
import java.lang.*;
//					TEST 1
public class test1
{	
	public static void main(String[] args)
    {
		// Write your code here
		/*Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        int temp=n;
        int count=0,sum=0;
        int rem;
        while(temp>0)
        {
            count++;
            temp=temp/10;
        }
        temp=n;
        for(;temp!=0;temp/=10)
        {
            rem=temp%10;
            sum=sum+(int)Math.pow(rem,count);
        }
        if(sum==n)
            System.out.println(n+" is armstrong");
        else
            System.out.println(n+" is NOT armstrong");*/
         
         //pattern
         /*
            432*
            43*1
            4*21
            *321
         */  
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        for (int i=1;i<=N;i++)
        {
            for (int j=N;j>=1;j--)
            {
                if (j==i)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            System.out.println("");
        }
        
        //pattern
        /*
            *000*000*
            0*00*00*0
            00*0*0*00
            000***000
        */
        /*Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        for (int i=1;i<=N;i++)
        {
            for (int j=1;j<i;j++)
                System.out.print("0");
            System.out.print("*");
            for (int j=1;j<=(N-i);j++)
                System.out.print("0");
            System.out.print("*");
            for (int j=N-i;j>=1;j--)
                System.out.print("0");
            System.out.print("*");
            for (int j=1;j<i;j++)
                System.out.print("0");
            System.out.println("");   
        }*/
	}
}
