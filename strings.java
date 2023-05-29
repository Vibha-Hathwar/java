import java.util.*;
public class strings
{
	public static void printchar(String str)
	{
		for(int i=0;i<str.length();i++)
			System.out.print(str.charAt(i)+" ");
		System.out.println();
	}
	public static int countwords(String str)
	{
		int count=1;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==' ')
				count++;
		return count;
	}
	public static String reverse(String str)
	{
		String rev="";
		/*for(int i=str.length()-1;i>=0;i--)
			rev=rev+str.charAt(i);*/
		for(int i=0;i<str.length();i++)
			rev=str.charAt(i)+rev;
			//rev=rev+str.charAt(str.length()-i-1);
		return rev;
	}
	public static boolean isPalindrome(String str)
	{
		/*String rev="";
		for(int i=str.length()-1;i>=0;i--)
			rev=rev+str.charAt(i);
		return(str.equals(rev));*/
		int j=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			j++;
		}
		return true;
	}
	public static void printSubstrings(String str)
	{
		//	printing char 
		for(int i=0;i<str.length();i++)
			for(int j=i;j<str.length();j++)
				System.out.println(str.substring(i,j+1));
		//	printing length-wise
		/*for(int i=1;i<=str.length();i++)
			for(int j=0;i+j<=str.length();j++)
				System.out.println(str.substring(j,i+j));*/
		/*for(int len=1;len<=str.length();len++)
			for(int start=0;start<=str.length()-len;start++)
			{
				int end=start+len-1;
				System.out.println(str.substring(start,end+1));
			}*/
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//	strings immutability
		
		//	strings are non-primitive datatypes
		
		/*char a[]= {'c','o','d','i','n','g'};	//	char array
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println();
		
		String s1="coding";
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		String s2="",s3=" ";
		System.out.println(s2.length()+" "+s3.length());
		
		String s4="is fun";
		System.out.println(s1+s4);
		String s5=s1+" "+s4;
		System.out.println(s5);
		
		//	functions on strings
		s2=s1.concat(s4);
		System.out.println(s2);
		System.out.println(s2.equals(s5));
		System.out.println(s2.equals(s2));
		String s6="cocing";
		//String s6="coeing"
		System.out.println(s1.compareTo(s6));
		//	if equal 0	//	else subtract ascii of mis-matching
		System.out.println(s1.contains("ing"));
		
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(2));	//	start substring index
		
		String substr=s1.substring(1,5);	//	start and end index	//	end index exclusive
		System.out.println(substr);
		System.out.println(substr.length());
		
//		//	taking input
		Scanner s=new Scanner(System.in);
		String str;
		str=s.next();
		System.out.println(str+" "+str.length());
		str=s.nextLine();
		System.out.println(str+" "+str.length());*/
		
//		//	print all chars
		/*Scanner s=new Scanner(System.in);
		String str;
		str=s.next();
		printchar(str);*/
		
//		//	count words
		/*Scanner s=new Scanner(System.in);	//	1 test case fail
		String str;
		str=s.nextLine();
		int n=countwords(str);
		System.out.println(n);*/
	
//		//	reverse string
		/*Scanner s=new Scanner(System.in);
		String str;
		str=s.nextLine();
		String rev=reverse(str);
		System.out.println(rev);*/
	
//		//	check palindrome
		/*Scanner s=new Scanner(System.in);
		String str;
		str=s.next();
		boolean t=isPalindrome(str);
		System.out.println(t);*/
		
		//String s=new string("coding");
		
		//	String pool optimisation
		//	string are stored	..
		/*String s1="abc";
		String s2="abc";
		if(s1==s2)
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		String s3=new String("abc");
		if(s1==s3)
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		if(s1.equals(s3))
			System.out.println("Equal");
		else
			System.out.println("Not equal");*/
		
//		//	print all substrings
		Scanner s=new Scanner(System.in);
		String str;
		str=s.nextLine();
		printSubstrings(str);

	}
}