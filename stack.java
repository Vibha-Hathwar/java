import java.util.*;
public class stack
{
    public static void main(String args[])
    {
        Stack<Integer> num = new Stack<Integer>();
        num.push(1);num.push(5);
        num.push(9);num.push(11);
        num.push(6);
        System.out.println(num.peek());
        int len=num.size();
        for(int i=0;i<len;i++)
            System.out.println(num.pop());
    }
}
