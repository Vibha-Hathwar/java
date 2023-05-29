/*
No Nine is a counting game that you can try when you are bored. In this game, you are only allowed to say numbers that are legal. A number is legal if and only if all of the following are true:

it is a natural number (i.e. in the set {1, 2, 3...})
it does not contain the digit 9 anywhere in its base 10 representation
it is not divisible by 9
For example, the numbers 16 and 17 are legal. The numbers 18, 19, 17.2, and -17 are not legal.

On the first turn of the game, you choose and say a legal number F. On each subsequent turn, you say the next legal number. For example, if you played a game with F = 16, you would say 16, 17, 20, 21, and so on.

Alice is very good at this game and never makes mistakes. She remembers that she played a game in which the first number was F and the last number was L (when she got tired of the game and stopped), and she wonders how many turns were in the game in total (that is, how many numbers she said).

Input
The input starts with one line containing one integer T; T test cases follow. Each test case consists of a single line containing two integers F and L: the first and last numbers from the game, as described above.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1), and y is the number of the turns played in the game.

Limits
1 ≤ T ≤ 100.
Time limit: 60 seconds per test set.
Memory limit: 1 GB.
F does not contain a 9 digit.
F is not divisible by 9.
L does not contain a 9 digit.
L is not divisible by 9.
Small dataset (Test set 1 - Visible)
1 ≤ F < L ≤ 106.
Large dataset (Test set 2 - Hidden)
1 ≤ F < L ≤ 1018.

Sample input
2
16 26
88 102

Sample output
9
4
*/

//      NOT COMPLETE
import java.util.*;
public class sub2
{
public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int j=0;j<n;j++)
		{
	    	int k=s.nextInt();
	    	int l=s.nextInt();
	    	int count=0,isn=0;
	    	for(int i=k;i<=l;i++)
	    	{
	    	   if(i%9!=0&&i%10!=9)
	    	    {
	    	        count++;
	    	        System.out.print(i+" ");
	    	    } 
	    	}
	    	System.out.println("\n"+count);
	    }
	}
}
/*while(i>0)
    {
	   if(i%10==9)
	     {
	      break;
	     }
	     i=i/10;
	 }
	    	    if(i>0)isn=1;*/
