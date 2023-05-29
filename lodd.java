import java.util.Scanner;
public class lodd
{
    public static int countOdds(int low, int high) {
       int N = (high - low) / 2;
        if (high % 2 != 0 || low % 2 != 0)
            N++;
        return N; 
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int h=s.nextInt();
        System.out.println(countOdds(l,h));
    }
}

/*Total numbers in the range will be (R – L + 1) i.e. N. 
    If N is even then the count of both odd and even numbers will be N/2.
    If N is odd, 
        If L or R is odd, then the count of the odd numbers will be N/2 + 1, and even numbers = N – countofOdd.
        Else, the count of odd numbers will be N/2 and even numbers = N – countofOdd.*/
