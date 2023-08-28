class display
{
    public /*static*/ void disp()
    {
        System.out.println("Hello world !");
    }
}
public class hello
{
    public static void main(String args[])
    {
        //display.disp();
        display d=new display();
        d.disp();
    }
}
