import java.util.*;
class num
{
    int a,b;
    num()
    {
        a=0;
        b=0;
    }
    public static int ad(int a,int b)
    {
        return a+b;
    }
}
public class add
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Sum = "+num.ad(a,b));
    }
}
