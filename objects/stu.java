package objects;
public class stu
{
	// these are properties
	
	String name;
	private int roll;
	//final double per = 0.95;
	//static int stuno;
	
	//int roll          //default	// only in package	//import objects.stu;
	//private int roll;	//private only in class
	//public String name; //public 
	// final keyword	// value can be assigned only once & value cannot be changed
	// static //belongs to class //not every object has seperate copy
	
	final static double PER = 0.95;
	private static int stuno;
	
	public stu(String na,int n)
	{
		name=na;
		roll=n;
		stuno++;
	}
	public stu(String n)
	{
		name=n;
		stuno++;
		this.roll=stuno;
	}
	public stu()
	{
		name="";
		stuno++;
		this.roll=stuno;
	}
	public static int getstuno()
	{
		return stuno;
	}
	
	public void print()
	{
		System.out.println(name+" "+roll);
	}
	
	/*public void setroll(int n)
	{	
		if(n<=0)
			return;
		roll=n;
	}
	
	 public void set_name(String n)
	 {	name=n;  }
	
	/*public void setroll(int roll)
	{
		if(roll<=0)
			return;
		//roll=roll;		// don't work
		System.out.println("this "+this);
		this.roll=roll;
	}* /
	public int getroll()
	{	
		return roll;
		//return this.roll;
	}
	
	//	CONSTRUCTORS
	public stu(String na,int n)
	{
		name=na;
		roll=n;
		stuno++;
	}
	public stu(String n)
	{
		name=n;
	}
	public stu() {}*/
	
	//	predict output
	/*static int year;
	    String company_name;
	
	int a; 
     int b; 
	public void set(int a, int b) 
 	{  
     b = a; 
     this.b = b; 
 	} 
 	void display() 
 	{	System.out.println("a=" + a + " b=" + b); } */
	
	//	predict output
	 	/*int a; 
	    int b; 
	    stu() 
	    {   
	        this(10, 20);   
	        System.out.print("constructor one "); 
	    } 
	    stu(int a, int b) 
	    { 
	        this.a = a; 
	        this.b = b; 
	        System.out.print("constructor two "); 
	    }*/
	
	/*static int marks;
    void set_marks(int marks)
    {
        this.marks=marks;               //Line 1
    }*/
	
	  /*static int a = 10; 
	    static int b; 
	    static void fun(){ 
	        b = a * 4; 
	    }*/
	
	
	 	/*String colour;
	    private int number;
	    void set(int number)
	    {
	        number=number;
	    }
	    int get()
	    {
	        return number;
	    }*/
	
}