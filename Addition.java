import java.util.ArrayList;
import java.util.*;

public class Addition
{
	
	public static void print(int n)
	{
	    /*if(n < 0){
	        return;
	    }
	    System.out.print(n+" ");
	    print(n - 2);*/
		if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
	    print(n--);
	    System.out.print(n+" ");
	}
	public static int sum(int a,int b)
	{
	    System.out.print("int sum ");
	    return a+b;
	}
	public static long sum(long a,long b)
	{
	    System.out.print("long sum ");
	    return a+b;
	}
	
	public static double sum(double a,double b)
	{
	    System.out.print("float sum ");
	    return a+b;
	}
	
	
	public static void func1(int a,int b)
	{
	    int ans=1;
	    for(int i=0;i<b;i++)
	    {
	        ans*=a;
	    }
	    System.out.print(ans);
	}
	public static void mul(int [] arr)
	{
	    for(int i=0;i<5;i++)
	    arr[i]*=i;

	}
	 /*public static void change(int input[])
	 {
		    input[0] = 15;
	 }*/
	 public static void change(int input[])
	 {
		    input = new int[5];
		    input[0] = 15;
		    System.out.println(input[0]);
	    }
	 public static int fun1(int[][] arr2d)
	 {
	     int sum=0;
	     for(int i=0;i<arr2d.length;i++)
	     {
	         for(int j=0;j<arr2d[i].length;j++)
	         {
	             sum+=arr2d[i][j];
	         }
	     }
	     return sum;
	 }
	 public static void  fun(int[][] arr2d)
	 {

	     for(int i=0;i<arr2d.length;i++)
	     {
	         for(int j=0;j<arr2d[i].length;j++)
	         {
	             arr2d[i][j]=2*i+j;
	         }
	     }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find output
		
		 /*int var1 = 5; 
	        int var2 = 6;
	        if ((var2 = 1) == var1)
	            System.out.print(var2);
	        else 
	            System.out.print(var2 + 1);*/

		
		
		/* int x = 5; 
	        if (x < 6)
	            System.out.print("Hello  ");
	        if(x == 5){
	            System.out.print("Hi  ");
	        }
	        else{ 
	            System.out.print("Hey ");
	        } */
		
		/*  int a=50;
		    if(a>10)
		    {
		        System.out.print("Coding");
		    }
		    else(a>20)			//error
		    {
		        System.out.print("Ninjas");
		    }*/
		
		/*int var1 = 5;
        int var2 = 6;
        System.out.print(var1 > var2);*/
		
		/* double a = 55.5;
	        int b = 55;
	        a = a % 10;
	        b = b % 10;
	        System.out.println(a + " "  + b);*/
		
		/*double a = 6 / 4;
	        int b  = 6 / 4;
	        double c = a + b;
	        System.out.println(c);*/
		
		/*Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String str = s.next();
		System.out.print(a);
		System.out.println(str);
		
	
		 
		/*int i=10;
	    while((i=i-1)>0)
	    {
	        System.out.print(i);
	        if(i%5==0)
	            return;
	    }

		*/
		
		/*
		int a = 10;
		    while(a > 5) {
		        int b = 1;
		        System.out.print(b + " ");
		        a--;
		    }
		  */ 

		 
		 //coding ninjas
   	//increment decrement operators
    /*int a=60,b=80; 
    if(a++ > 60 && b++ > 80)
        System.out.println("Inside if");
    else
        System.out.println("Inside else");
    System.out.println("a = "+a+"\nb = "+b);
    a=60;b=80;
    if(++a > 60 || b++ > 80)
        System.out.println("Inside if");
    else
        System.out.println("Inside else");
    System.out.println("a = "+a+"\nb = "+b);
    */
    	
    	//coding ninjas
    	//	guess the output
    	  /*int a=10,b=50;
    	    a++;
    	    --b;
    	    int c=a--+b--;
    	    System.out.print(++c);*/
    	
    	 	/*int a=10,b=20;
    	    int c=a&b;
    	    System.out.print(c);
    	    int d=a|b;
    	    System.out.print(d);
    	    int e=a^b;
    	    System.out.print(e);
    	    int f=c+d+e;
    	    System.out.print(~f);*/
    	
    	/*int a=10,b=-20;
        System.out.print(a^b);*/
    	
    	/*int a = 42;
        int b = ~a; //(there is tilde sign before a)
        System.out.print(a + " " + b); */ 
        
       /* int x , y = 1;
        x = 10;
        if (x != 10 && x / 0 == 0)
            System.out.println(y);
        else
            System.out.println(++y);*/
    	
    	/*int x = 15;
        int y = x++;
        int  z = ++x;
        System.out.println(y +" " + z);*/
        
        
        //int g = 3;
        //System.out.print(++g * 8);
        
        
        /*int x =10;
        int y = 20;
        if(x++ > 10 && ++y > 20 ){
        System.out.print("Inside if  ");
        }else{
        System.out.print("Inside else  ");
        }
        System.out.println(x +" "+y);*/
    	
        
        /*int x = 10;
        int y = 20;
        if(x++ > 10 || ++y > 20 ){
        System.out.print("Inside if  ");
        }else{
        System.out.print("Inside else  ");
        }
        System.out.println(x  + " " + y);*/
    	
    	/*int a=5;
        a+=5+(++a)+(a++);
        System.out.print(a);*/
		
		/* int a=10;
		    a+=++a-5/3+6*a;
		    System.out.print(a);*/
		
		/*for(int i=483;i>0;i=i%3)
	    {
	        System.out.print("*");
	    }*/
	    
	    /*for(int i = 0; i < 5; i = i + 1){
             System.out.print(i + " ");
            i = i + 1;
        }*/
        
        /*for(int i = 1; i < 5; i = i + 1){
            System.out.print(i +" ");
            i = i - 1;
        }*/
        
        /*for(int i = 0; i < 2; i = i + 1) {
            for(int j = 0; j < 2; j = j + 1) {
                if (j == 1)
                    break;
                System.out.print(j +" ");
            }
        } */
        
        /*int i=0;
        for(;;)
        {
            if(i==5)
                break;
            System.out.print(i);
            i++;
        }*/
        
        //for(int i=7;i!=0;i--)
        //    System.out.print(i--);
	
        /*int i = 1;
        while(i < 5)
        {
            if(i == 3)
                break;
            System.out.print(i + " ");
            i++;
        }*/
    
    
        /*int i = 1;
        while(i < 5)
        {
            if(i == 3)
                continue;
            System.out.print(i + " ");
            i++;
        }*/
        
        
        /*int i = 1;
        while(i < 3)
        {
            int j = 1;
            while(j < 5)
            {
                if(j == 3)
                     break;
                System.out.print(j + " ");
                j++;
            }
            i++;
        }*/


       /* int i = 1;
        while(i < 3)
        {
            int j = 1;
            while(j < 5) {
                if(j == 3)
                    break;
                System.out.print(j + " ");
                j++;
            }
            i++;
        }*/


       /*int i = 1;
        while(i < 3)
        {
            int j = 0;
            while(j < 5)
            {
                j++;
                if(j == 3)
                    continue;
                System.out.print(j + " ");
            }
            i++;
        }*/

		/* int a=10,b=20;
		    System.out.println(a+++--b);//line 1
		    System.out.println(a--+++b);//line 2
		    System.out.println(a++-++b);//line 3
		    System.out.println(a+++++b);//line 4
		*/
		
		/*for(int i=1;i<10;i*=2)
		{
		     System.out.println(i);
		}*/
		
		   /*for(int i = 0; i < 3; i++) {
			   System.out.print(i + " ");
		   }
		   System.out.print(i + " ");
		    */
        
    
       /* for(int i=1;;i++)
        {if(i==5)
            break;
        System.out.print(i);
        }*/

       /* for(int i=1;;i++)
        {   if(i<5)
            System.out.print(i);
        else 
            break;
        }*/
       
         /*int n=10,r=6;
    	int factn=1,factr=1,factnr=1;
    	for(int i=2;i<=n;i++)
    	{
        	factn*=i;
        	if(i<=r)
            	factr*=i;
        	if(i<=n-r)
            	factnr*=i;
    	}
    	int ncr=factn/(factr*factnr);
    	System.out.print(ncr);*/
	
	
	   /* int a=4;
        int b=5;
	    System.out.print(sum(a,b));*/
		
		/*System.out.print(sum(5,4));
	    System.out.print(sum(5.0,4.0));*/
		
		//func1(2,5);
		
		/*int arr[] = new int[5];
		System.out.println(arr[0]);*/
		
		/*boolean arr[] = new boolean[5];
		System.out.println(arr[0]);**/
		
		/*int arr[] = new int[5];
	      arr[1] = 10;
	      arr = new int[2];
	      System.out.println(arr[0]);*/
		
		/*int arr[]={1,2,3,4,5};
	    mul(arr);
	    for(int i=0;i<5;i++)
	        System.out.print(arr[i]);*/
		
		/*int arr[]=new int[5];
		change(arr);
		System.out.println(arr[0]);*/
		
		/*int arr[]=new int[5];
		change(arr);
		System.out.println(arr[0]);*/
		
		//	STRINGS
		
		/*String a ="abcd";
		String b="abcda";
		System.out.println(a.compareTo(b));*/
		
		/*String a="coding",b="ninjas";
		if(a.contains("ing"))
		    a+=b;
		else
		    b+="ing";
		System.out.print(b+a);*/

		/*String a="coding";
		for(int i=2;i<5;i++)
			System.out.print(a.substring(i-2,i+1));*/

		/*Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.nextLine();
		String str3=str2+str1;
		System.out.println(str3);*/
		
		/*String str1="abc";
		String str2=new String("abc");
		System.out.println(str1.equals(str2));*/
		
		/*String str1="abc";
		String str2="bc";
		String str3="ab"+str2;
		System.out.println(str1==str3);*/
		
		/*String str1="abc";
		String str2=str1+" ";
		System.out.println(str1==str2);*/
		
		/*String str1="abc";
		String str2="";
		System.out.println(str1.contains(str2));*/
		
		/*StringBuffer str1=new StringBuffer("");
		for(int i=0;i<5;i++)
		    str1.append((char)('a'+i));
		System.out.println(str1);*/
	
		//	2D ARRAY
		
		/*int arr[][]=new int[4][5];
	    for(int i=0;i<5;i++)
	    {
	        arr[i][0]=2;
	    }
	    System.out.print(arr[3][0]);*/
		
		/*int arr[][]=new int[4][5];
	    for(int i=0;i<4;i++)
	    {
	        for(int j=0;j<5;j++)
	        arr[i][j]=i*j;
	    }
	    System.out.print(arr[3][4]);*/
		
		 /*int[][] arr = new int [2][2]; 
		    for (int i = 0; i < 2; i++)
		    { 
		        for (int j = 0; j < 2; j++) 
		        { 
		            System.out.print(arr[i][j] + " "); 
		        } 
		    } */
		
		 /*int[][] arr = { { 1, 2 }, { 3, 4 } }; 
		    System.out.println(arr[0][0]+arr[1][1]);*/
		
		 /*int[][] arr = { {1,2,4,5,7},{3,4,5,6,7},{5,6,7,8,9} }; 
		    System.out.println(arr.length+" "+arr[0].length); */
		
		 /*int[][] arr = { {0,1,2,4,5}, {3,4,5,6,7},{5,6,7,8,9} }; 
		    System.out.println(fun1(arr)); */
		
		/*int[][] arr = new int[2][2]; 
	    fun(arr);
	    for(int i=0;i<2;i++)
	    {
	        for(int j=0;j<2;j++)
	        {
	            System.out.print(arr[i][j]+" " );
	        }
	    }*/
	    
	    /*int arr[][]={ {1,2,3,4} , {2,4} , {3,5,7,8,9,11} };
	    System.out.print(arr.length+arr[0].length+
	    arr[1].length+arr[2].length);*/
	    
	   /* int arr[][]=new int [4][];
	    System.out.print(arr[2].length);*/
	    
	    /*class stu
		{
    		int roll_number;
    		String name;
		}
		class DPS
		{
    		public static void main (String[] args)
    		{
        		stu s=new stu();
        		s.roll_number=5;
        		s.name="Rohit";
        		System.out.println(s.roll_number+" "+s.name);
    		}
		}*/
		
		 /*try{
		        return;
		    }
		 finally
		 {
		        System.out.println("Hello coding ninjas");
		 }*/
		
			/*try{
		       int a = 5/0;
		    }
		    catch(Exception e){
		        System.out.print("Exception caught ");
		    }
		    catch(ArithmeticException e){
		        System.out.print("Arithmetic Exception caught ");
		   }
		   finally{
		       System.out.print("finally block");
		   } */
		
		  int num = 3;
		    print(num);
	}
	
	/*static int divideByZero(int a, int b){ 
    int i = a/b;  
    return i; 
} 
static int computeDivision(int a, int b) { 
    int res =0; 
    try
    { 
      res = divideByZero(a,b); 
    } 
    catch(NumberFormatException ex) 
    { 
       System.out.println("Exception occured");  
    } 
    return res; 
} 
public static void main(String args[]){ 
    int a = 1; 
    int b = 1; 
    int i=0;  
    try
    { 
         i = computeDivision(a,b); 

    } 
    catch(ArithmeticException ex) 
    { 
        System.out.println(ex.getMessage()); 
    }
    System.out.print(i);
} */
	
	/*static void fun() throws Exception 
	{ 
	    throw new Exception(); 
	} 
	public static void main(String args[]) 
	{   
	    try { 
	        fun(); 
	    } 
	    catch (Exception e) { 
	        System.out.print("caught in main."); 
	    }
	    System.out.print("All is well"); 

	}*/

	/*ArrayList<String> a=new ArrayList<>();
	a.add("apple");a.add("b");a.add("c");a.add(0,"m");
	System.out.println(""+a.get(2));*/
	

	/*ArrayList<String> a=new ArrayList<>();
	a.add("a");a.add("b");a.add("c");a.add("d");a.add("e");
	a.set(2,"b");
	System.out.println(""+a.get(2));*/
	
}
