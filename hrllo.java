import java.util.Scanner;
//  hackerrank
//   formatting output
/*
================================
java 100 cpp 65 python 50       //input
java           100              //output
cpp            065
python         050
================================
*/

//hackerank
//java string introduction
/*
Input Format
The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

Output Format
There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.*/
public class hrllo 
{
    public static void main(String[] args)
    {
           /* Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);
            }
            System.out.println("================================");
            
            
        /*******************************************************/
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0)
            System.out.println("Yes");
        else
            System.out.println("No");
        A= A.substring(0, 1).toUpperCase()+ A.substring(1); 
        B= B.substring(0, 1).toUpperCase()+B.substring(1);
        System.out.println(A+" "+B);
        
    
   
    }
}
