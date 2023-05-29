import java.util.*;
public class queue
{
    public static void main(String args[])
    {
        Queue<Integer> num = new LinkedList<>();
        num.add(1);num.add(5);
        num.add(9);num.add(11);
        num.add(6);
        System.out.println(num.peek());
        int len=num.size();
        for(int i=0;i<len;i++)
            System.out.println(num.remove());
    }
}
