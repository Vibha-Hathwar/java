import java.util.*;
//import java.lang.*;
public class fibo
{	
	public static void main(String[] args)
    {	
		/* ********************************************************** /
//1		// fibonacci no
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       	int arr[]=new int[100];
      	int i;
       	arr[0] = 0;
       	arr[1] = 1;
       	for (i = 2; i <= n; i++)
       		arr[i] = arr[i - 1] + arr[i - 2];
       	System.out.println (arr[n]);*/
        
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       	int arr[]=new int[100];
      	int i,temp=n;
       	arr[0] = 0;
       	arr[1] = 1;
       	for (i = 2; i <= n; i++)
       	{	
       		arr[i] = arr[i - 1] + arr[i - 2];
       		if(temp==arr[i])
       		{
       			System.out.println ("true");
       			return;
       		}
       	}
       	System.out.println("false");
       	
        
        /* *********************************************************
        //print all prime no below n
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            int count=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==1)
                System.out.println(i);
        }
	*/
	    
//2     //  print reverse no
        //  without leading zeros
       //   Anna
       /*Scanner s = new Scanner(System.in);
        int number =s.nextInt();
        int reverse = 0;
        while(number!=0){
            reverse = reverse*10 + (number%10);
            number/=10;
        }
        System.out.print(reverse);
        s.close();*/
        
//3     //binary to decimal   
       /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rem,sum=0,count=0,pos;
        while(n!=0)
        {
        	rem=n%10;
        	sum=sum+(int)rem*(int)Math.pow(2,count);
            n=n/10;
            count++;
        }
        System.out.print(sum);*/
          
//4     //  decimal to binary
        /*Scanner s = new Scanner(System.in);   //  1 of 5 test cases failed
        int n = s.nextInt();
        int arr[]=new int[32];
        int i=0;
        while(n!=0)
        {
        	arr[i++]=n%2;
        	n=n/2;
        }
        for(int j=i-1;j>=0;j--)
            System.out.print(arr[j]);*/
            
          //pradeep                             //  success
       /* String b="",a="";
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==0)
        {
          System.out.println(0);
          System.exit(0);
        }
        int r;
        while(n>0)
        {
            r=n%2;
            a+=r;
            n=n/2;
        }
        char ch;
         for(int i=a.length()-1;i>=0;i--)
         {
             ch=a.charAt(i);
             b=b+ch;
         }
         System.out.println(b);*/

        
            
//5     //  square root
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int root;
        root=(int)Math.sqrt(n);
         System.out.print(root); */
         
//6     //  check no sequence (lecture 7)   
       /* Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int[] a= new int[n];
        for (int i =0; i<n;i++)
            a[i]= s.nextInt();
        int [] A= new int [n-1];
        for ( int i =0;i<n-1;i++)
        {
            if ( a[i]==a[i+1])
            {
                System.out.println("false");
		    	return ;
            }
            A[i]= a[i]-a[i+1];
        }
        for(int i=0;i<n-2;i++)
            if (A[i]<0 && A[i+1]>0)
            {
                System.out.println("false");
		    	return ;
            }
   	    System.out.println("true"); */
	
	  //pradeep
	  /*Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];            
      int f=0;      
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();      
      if(a[0]<a[1])
        {
            for(int i=1;i<n-1;i++)
                if(a[i]>=a[i+1])
                  {
                    System.out.println("false");
                         System.exit(0);
                }
          System.out.println("true");
        }
      else if(a[0]>a[1])
        {
            for(int i=1;i<n-1;i++)
            {
                if(a[i]<=a[i+1])
                    f=1;
                if(f==1)
                     if(a[i]>=a[i+1])
                     {
                         System.out.println("false");
                         System.exit(0);
                     }
            }
            System.out.println("true");
        }
      else
         System.out.println("false");
           
//7	
	/*Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++)
            {
                int m= a + b*(int)Math.pow(2,j);
                System.out.print(m+" ");
            }
                System.out.println();
        }     
        in.close();*/
        
    

	}
}
