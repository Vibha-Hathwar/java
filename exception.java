class collision
{
    String i, j;
    collision (String a, String b)
    {
        i=a;
        j=b;
    }
    void check ()
    {
        try
        {
            if(i==j)
               System.out.println("The two vehicles are moving in same direction, hence no problem");
            else
                throw new Exception ("The two vehicles are moving in different directions, so collision occurs");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class exception
{
    public static void main (String args [])
    {
        collision s=new collision ("north”, “north");
        collision n=new collision ("north”, “east");
        s.check ();
        System.out.println();
        n.check ();
        System.out.println();
    }
}
