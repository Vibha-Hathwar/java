import java.util.*;

public class sume
{
    //sum of even nos from 1 to n (inclusive)
    public static void main(String args[])
    {
        int res=0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<=n;i++)
            if(i%2==0)
                res+=i;
        System.out.println("sum = " + res);
    }
}
