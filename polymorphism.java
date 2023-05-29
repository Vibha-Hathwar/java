class trunkcall
{
    int duration;
    trunkcall(int sec)
    {
        duration=sec;
    }
    double charge()
    {
        System.out.println("Charge is undefined");
        return 0;
    }
}
class ordinary extends trunkcall
{
    ordinary(int a)
    {
        super(a);
    }
    double charge()
    {
        return duration*1.00;
    }
}
class urgent extends trunkcall
{
    urgent(int a)
    {
        super(a);
    }
    double charge()
    {
        return duration*2.00;
    }
}
class lightning extends trunkcall
{
    lightning(int a)
    {
        super(a);
    }
    double charge()
    {
        return duration*3.00;
    }
}
public class polymorphism//trunk
{
    public static void main(String args[])
    {
        trunkcall a;
        ordinary b=new ordinary(50);
        urgent c=new urgent(70);
        lightning d=new lightning(20);
        a=b;
        System.out.println("Charges for ordinary call = "+a.charge);
        a=c;
        System.out.println("Charges for urgent call = "+a.charge);
        a=d;
        System.out.println("Charges for lightning call = "+a.charge);
    }
}
