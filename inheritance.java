class player
{
    String name;
    int age,match,rank;
    player(String n,int a,int m,int r)
    {
        name=n;
        age=a;
        match=m;
        rank=r;
    }
}
class cricket_player extends player
{
    int hscore,bavg,batavg;
    cricket_player(String n,int a,int m,int r,int h,int b,int ba)
    {
        super(n,a,m,r);
        hscore=h;
        batavg=b;
        bavg=ba;
    }
    void disp()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("No of matches : "+match);
        System.out.println("Highest Score : "+hscore);
        System.out.println("Batting average : "+batavg);
        System.out.println("Balling average : "+bavg);
        System.out.println("Player ranking : "+rank);
    }
}
class football_player extends player
{
    int goals,gavg,pass;
    football_player(String n,int a,int m,int r,int g,int avg,int pas)
    {
        super(n,a,m,r);
        goals=g;
        gavg=avg;
        pass=pas;
    }
    void disp()
    {
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
        System.out.println("No of matches : "+match);
        System.out.println("No of goals : "+goals);
        System.out.println("goals average : "+gavg);
        System.out.println("passing efficiency : "+pass+"%");
        System.out.println("player ranking : "+rank);
    }
}
class hockey_player extends player
{
    int goal,gavg,pass;
    hockey_player(String n,int a,int m,int r,int g,int avg,int pas)
    {
        super(n,a,m,r);
        goal=g;
        gavg=avg;
        pass=pas;
    }
    void disp()
    {
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
        System.out.println("No of matches : "+match);
        System.out.println("No of goals : "+goal);
        System.out.println("goals average : "+gavg);
        System.out.println("passing efficiency : "+pass+"%");
        System.out.println("player ranking : "+rank);
    }
}
public class inheritance
{
    public static void main(String args[])
    {
        cricket_player c=new cricket_player("Sachin Tendulkar",49,600,8,200,60,30);
        football_player f=new football_player("Sunil Chhetri",32,120,90,3,80,94);
        hockey_player h=new hockey_player("Dhanraj Pillay",32,120,90,3,80,94);
        c.disp();
        f.disp();
        h.disp();
    }
}
