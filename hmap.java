import java.util.*;
public class hmap
{
    public static void main(String args[])
    {
        HashMap<Integer,String>stu = new HashMap<Integer,String>();
        stu.put(1,"Abhi");
        stu.put(2,"Adi");
        stu.put(3,"bhav");
        stu.put(2,"bab");
        System.out.println(stu.get(2));
        System.out.println(stu.get(3));
        System.out.println(stu.size());
    }
}
