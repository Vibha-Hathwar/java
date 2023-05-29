import java.util.*;
					//		TEST 2
public class test3
{
	public static void print2DArray(int input[][])
    {
		for(int i=0;i<input.length;i++)
        {
            int count=input.length-i;
            while(count>0)
            {
                for(int j=0;j<input[0].length;j++)
                    System.out.print(input[i][j]+" ");
                System.out.println();
                count--;
            }
        }
	}
	public static String minLengthWord(String input)
    {
		String str=input+" ";
        char ch=' ';
        int length=str.length();
        int count=0,min=length;
        String smallest="",word="";
        for(int i=0;i<length;i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
                word+=ch;
            else
            {
                count=word.length();
                if(count<min)
                {
                    min=count;
                    smallest=word;
                }
                word="";
            }
        }
        return smallest;
    }
	public static void leaders(int[] input)
    {
		for(int i=0;i<input.length;i++)
        {
            boolean check=true;
            for(int j=i+1;j<input.length;j++)
            	if(input[j]>input[i])
            	{
                	check=false;
                    break;
            	}
            if(check==true)
                System.out.print(input[i]+" ");
        }
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		/*Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.*/
		int n=s.nextInt();
		int m=s.nextInt();
		int [][] a = new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=s.nextInt();
		print2DArray(a);
		
		/*Given a string S (that can contain multiple words), you need to find the word which has minimum length.
			Note : If multiple words are of same length, then answer will be first minimum length word in the string.Words are seperated by single space only.*/
		/*String str=s.nextLine();
		System.out.println(minLengthWord(str));*/
		
		
		/*Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
		   Print all the leader elements separated by space and in the same order they are present in the input array.*/
		/*int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		leaders(a);*/
	}
}