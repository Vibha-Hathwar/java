import java.util.Scanner;
class rectangle
{
    double width,length,area;
    String color;
    Scanner s=new Scanner(System.in);
    void set_length()
    {
        System.out.print("Enter length : ");
        length=s.nextDouble();
    }
    void set_width()
    {
        System.out.print("Enter width : ");
        width=s.nextDouble();
    }
    void set_color()
    {
        System.out.print("Enter color : ");
        color=s.next();
    }
    double find_area()
    {
        return length*width;
    }
    void compare(rectangle r)
    {
        if(area==r.area && color.equals(r.color))
            System.out.println("\nMatching Rectangles");
        else
            System.out.println("\nNon Matching Rectangles");
    }
}
public class rect
{
    public static void main(String args[])
    {
        rectangle r1=new rectangle();
        System.out.println("Enter 1st rectangle dimensions");
        r1.set_length();
        r1.set_width();
        r1.set_color();
        System.out.println("\n1st rectangle Area = "+r1.find_area());
        rectangle r2=new rectangle();
        System.out.println("\nEnter 2nd rectangle dimensions");
        r2.set_length();
        r2.set_width();
        r2.set_color();
        System.out.println("\n2nd rectangle Area = "+r2.find_area());
        r1.compare(r2);
    }
}
