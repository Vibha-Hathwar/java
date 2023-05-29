/*
Create the dynamic stack by implementing the interfaces that
defines Push() and Pop() methods.
*/
interface instack
{
    void push (int item);
    int pop ();
}
class dstack implements instack
{
    private int stk [];
    private int tos;
    dstack (int size)
    {
        stk=new int[size];
        tos=-1;
    }
    public void push (int item)
    {
        if (tos==stk.length-1)
        {
            int temp []=new int[stk.length*2];
            for (int i=0; i<stk.length; i++)
                temp[i]=stk[i];
            stk=temp;
            stk[++tos]=item;
        }
        else
        stk[++tos]=item;
    }
    public int pop ()
    {
        if(tos<0)
        {
            System.out.println("stack underflow");
            return 0;
        }
        else
            return stk[tos--];
    }
}
public class Dyn_stack
{
    public static void main (String args [])
    {
        dstack mystack1=new dstack (5);
        dstack mystack2=new dstack (8);
        for (int i=0;i<20;i++)
            mystack1.push(i);
        for (int i=0;i<20;i++)
            mystack2.push(i);
        System.out.print("Elements in stack1\n");
        for (int i=0;i<20;i++)
            System.out.print(mystack1.pop () +" ");
        System.out.println();
        System.out.print("Elements in stack2\n");
        for (int i=0;i<20;i++)
            System.out.print(mystack2.pop () +" ");
        System.out.println();
    }
}
