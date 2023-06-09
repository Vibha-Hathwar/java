/*
Consider the trunk calls of a telephone exchange. A trunk call can be
ordinary, urgent or lightning. The charges depend on the duration and the
type of the call. Write a program using the concept of polymorphism in
Java to calculate the charges
*/
class TrunkCall
{
    int duration;
    TrunkCall (int sec)
    {
        duration=sec;
    }
    double charge ()
    {
        System.out.println("Charge is undefined");
        return 0;
    }
}
class Ordinary extends TrunkCall
{
    Ordinary (int a)
    {
        super(a);
    }
    double charge ()
    {
        return duration*1.00;
    }
}
class Urgent extends TrunkCall
{
    Urgent (int a)
    {
        super(a);
    }
    double charge ()
    {
        return duration*2.00;
    }
}
class Lightning extends TrunkCall
{
    Lightning (int a)
    {
        super(a);
    }
    double charge ()
    {
        return duration*3.00;
    }
}
public class trunk
{
    public static void main (String args [])
    {
        TrunkCall a;
        Ordinary b=new Ordinary (50);
        Urgent c=new Urgent (70);
        Lightning d=new Lightning (20);
        a=b;
        System.out.println("Charges for Ordinary call="+a. charge ());
        a=c;
        System.out.println("Charges for Urgent call="+a. charge ());
        a=d;
        System.out.println("Charges for Lightning call="+a. charge ());
    }
}
