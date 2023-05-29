import java.util.*;
public class arr
{
    public static void main(String args[])
    {
        int a[] = new int[5];
        int x=10;int y=20;double z=x/y;
        System.out.println(z);
        for(int i=0;i<5;i++)
            a[i]=i;
        a[0]=5;
        for(int i=0;i<5;i++)
            System.out.println(a[i]);
    }
}
