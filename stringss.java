import java.util.*;
public class stringss
{
	public static String reverseWordwise(String str)
	{
		/*String rev="";
		int i,count=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				break;
			count++;
		}
		for(int j=i-1;j>=0;j--)
			rev=rev+str.charAt(j);
		System.out.print(rev);*/
		
		//str=str+" ";
		String ans="";
		int start=0;
		int i=0;
		for(;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				String rev="";
				for(int j=i-1;j>=start;j--)
					rev=rev+str.charAt(j);
			ans+=rev+" ";
			start=i+1;
			}
		}
		//
		String rev="";
		for(int j=start;j<=i-1;j++)
			rev=str.charAt(j)+rev;
		ans+=rev;//
		return ans;
	}
	public static boolean isPermutation(String s1,String s2)
	{
		//	12%
		/*String res="";
		s1=s1.trim();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
				if(s1.charAt(i)==s2.charAt(j))
					res=res+s2.charAt(j);
		}
		System.out.println(res);
		return (s1.equals(res));*/
		
		//	87%
		if(s1.length()==s2.length())
		{
			int c1=0,c2=0;
			for(int i=0;i<s1.length();i++)
			{
				c1=c1+s1.charAt(i);
				c2=c2+s2.charAt(i);
			}
			if(c1==c2)
				return true;
		}
		return false;
	}
	public static String noduplicates(String str)
	{	//remove consecutive Duplicates
		String res="";
		int n;
		for(int i=0;i<str.length();i+=n)
		{
			n=1;
			res=res+str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
					n++;
				else
					break;
			}
		}
		return res;
	}
	public static String removec(String str,char c)
	{	// remove chareter
		String res="";
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)!=c)
				res=res+str.charAt(i);
		return res;
	}
	public static char hoccur(String str)
	{	// highest occuring charecter	//abdefgbabfba
		
		/*int res[] = new int[256];
		for (int i = 0; i < str.length(); i++)
	    	res[str.charAt(i)]++;
		int max = -1;
		char result = ' ';
		for (int i = 0; i < str.length(); i++)
		{
		   if (max < res[str.charAt(i)])
		   {
			   max = res[str.charAt(i)];
			   result = str.charAt(i);
		   }
		 }
		 return result;*/
		
		int count=0,idx=0;
        for (int i=0;i<str.length();i++)
        {
            int charcount=1;
            for (int j=i+1;j<str.length();j++)
            {
                if (str.charAt(i) == str.charAt(j))
                    charcount++;
            }
            if (charcount > count)
            {
                count=charcount;
                idx=i;
            }
        }
        return str.charAt(idx);
	}
	public static String compress(String str)
	{
		 String com=""+str.charAt(0);
	     int count=1;
	     for (int i=1;i<str.length();i++)
         {
	    	 if (str.charAt(i) != str.charAt(i-1))
	         {
	    		 if (count>1)
	    			 com=com+Integer.toString(count);
	             com=com+str.charAt(i);
	             count=1;
	         }
	         else
	        	 count=count+1;  
	     }
	     if (count>1)
	    	 com=com+Integer.toString(count);
	     return com;
	}
	public static String reverseWordWise(String input)
    {
		// Write your code here
		StringBuffer str = new StringBuffer();
        input=" "+input;
        int prevPos=input.length()-1;
        for (int i=input.length()-1;i>=0;i--)
        {
            if (input.charAt(i) == ' ')
            {
                str.append(input.substring(i,prevPos+1));
                //str.append(" ");
                prevPos=i-1;
            }
        }
        return (str.toString()).trim();
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*StringBuffer str=new StringBuffer("abc");
		System.out.print(str+" ");
		str.setCharAt(0,'d');
		System.out.print(str+" ");
		str.append("xyz");
		System.out.print(str+" ");
		System.out.print(str.substring(2,5));*/
		
		Scanner s=new Scanner(System.in);
		
		/*String str;
		str=s.nextLine();
		System.out.println(reverseWordwise(str));
		//String rev=reverseWordwise(str);
		//System.out.println(rev);*/
		
		/*String s1,s2;
		s1=s.nextLine();
		s2=s.nextLine();
		System.out.println(isPermutation(s1,s2));*/
		
		/*String str;
		str=s.nextLine();
		System.out.println(noduplicates(str));*/
		
		/*String str;
		str=s.nextLine();
		char c;
		c=s.next().charAt(0);
		System.out.println(removec(str,c));*/
		
		String str;
		str=s.nextLine();
		System.out.println(reverseWordWise(str));
		//System.out.println(hoccur(str));
		//System.out.println(compress(str));
	}
}
