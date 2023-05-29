import java.util.*;
public class salary {
	
	public static void main(String[] args)
    {	
		//for loop
		/*Scanner sc=new Scanner(System.in);
    	int n;
		n = sc.nextInt();
		for(int i=0;i<n;i++)
			System.out.println (i);
		for(int i=0,j=100;i<n;i++,j+=20)
			System.out.println (i+" "+j);
		
		//for(int i=0;i<n,j<100;i++,j++)    //error     //condition 2 no
		//for(int i=0,j=50;i<n && j<100;i++,j+=10)         //condition 2 no
			
		/* ******************************************************************************/
		
		//	key words
		//	break and continue
		
		/*
		 1 2 3 4
		 1 2 3 4
		 1 2 3 4
		 1 2 3 4
		 */
	 	/*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n;j++)
        	{	if(i==j)
        			break;
        	System.out.print(j+" ");
        	}
        	System.out.println();
		}
	 */
		
		/*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n;j++)
        	{	if(i==j)
        			continue;
        	System.out.print(j+" ");
        	}
        	System.out.println();
        }*/
		
		
		/*
		 	
		 	1
		 	1 2
		 	1 2 3
		*/
		/*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n;j++)
        	{	if(i==j)
        			break;
        	System.out.print(j+" ");
        	}
        	System.out.println();
        }*/
        
		/*
		 	1
		 	1 2
		 	1 2 3
		 	1 2 3 4
		 */
		/*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n;j++)
        	{	if(i+1==j)
        			break;
        	System.out.print(j+" ");
        	}
        	System.out.println();
        }*/
		
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        int sum=0,pro=1;
        if(c==1)
        {
            for(int i=1;i<=n;i++)
                sum=sum+i;
        	System.out.print(sum);
        }
        else if(c==2)
        {
            for(int i=1;i<=n;i++)
                pro=pro*i;
        	System.out.print(pro);
        }
        else
            System.out.print("-1");*/
		
		
		
		/*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res=0,count=0;
        for(int i=1;count<n;i++)
        {
            res=3*i+2;
            if(res%4==0)
                continue;
            System.out.print(res+" ");
            count++;
        }*/
		
		
        /* ***********************************************************************************************/
		/*
		//bitwise operators
		
		int a=10;
		int b=2;
		System.out.println (a&b);	//and
		System.out.println (a|b);	//or
		System.out.println (a^b);	//xor
		System.out.println (~a);	//negete
		System.out.println (a<<1);	//left shift by 1	//vacant filled with 0
		System.out.println (a>>1);	//right shift by 1	//vacant filled with sign bit
		
		//assignment operators
		
		//+=  -=  *=  /=  ^=  <<=	//a+=10;  a=a+10;
		System.out.println (a+=10);
		System.out.println (a^=1);
		
		/* *********************************************************************************************/
		/*//charecter case
		Scanner sc=new Scanner(System.in);
    	char ch;
        ch=sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z')
            System.out.println(1);
     
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(0);
     
        else
            System.out.println(-1 );	
            
		/**********************************************************/
		/*
		//x power n
	       Scanner sc =new Scanner(System.in);
	    	int x,n,p=1;
			x= sc.nextInt();
	        n=sc.nextInt();
	        for(int i=1;i<=n;i++)
	            p=p*x;
	    	System.out.print(p);
	 
		/************************************************************/
		/*
	    	//print factors
      	Scanner sc=new Scanner(System.in);
    	int n;
		n= sc.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
               System.out.print(i+" ");
        } 
        
        /************************************************************/ 
		/*
		//sum of odd and even
		Scanner sc=new Scanner(System.in);
    	int n,rem;
		n = sc.nextInt();
        int even=0,odd=0;
		while(n!=0)
        {
            rem=n%10;
            n=n/10;
            if(rem%2==0)
                even=even+rem;
            else
                odd=odd+rem;
        }
        System.out.println(even+" "+odd);
        
        /***********************************************************/
        //tables
		Scanner sc=new Scanner(System.in);
    	int n;
		n=sc.nextInt();
    	for(int i=1;i<=10;i++)
    	{
    	    int p=n*i;
        	System.out.println(n+" x "+i+" = "+p);
		}
		
		/* **************************************************************/
		//salary
		// Write your code here
		/*Scanner sc =new Scanner(System.in);
    	int basic;
    	char grade;
        basic = sc.nextInt();
    	grade = sc.next().charAt(0);
    	double total = basic+(float)basic*59/100;
        if(grade=='A')
            total=1700+total;
        else if(grade=='B')
            total=1500+total;
        else
            total=1300 + total;
       // int a = (int) Math.round(total);
        //System.out.println(total);
        int a = (int)(total + 0.5);
        //int a = (int) Math.ceil(total);
        System.out.println(a);*/
	}
}
