import java.util.Scanner;//
class shape
{
    double lnt,bdt,a;
    shape(double l)
    {
        lnt=l;
    }
    shape(double l,double b)
    {
        lnt=l;
        bdt=b;
    }
    void area(double l)
    {
        System.out.println("Area of rectangle (length given) = "+l*l);
    }
    void area(double l,double b)
    {
        System.out.println("Area of rectangle = "+l*b);
    }
}
public class overload
{
    public static void main(String args[])
    {
        //shape s1=new shape(5.000);
        //shape s2=new shape(5.000,6.000);
        Scanner s=new Scanner(System.in);
        double a,b,c;//
        a=s.nextDouble();
        shape s1=new shape(a);//
        b=s.nextDouble();
        c=s.nextDouble();
        shape s2=new shape(b,c);
        s1.area(s1.lnt);
        s2.area(s2.lnt,s2.bdt);
       // s2.area(s2.lnt);
    }
}
