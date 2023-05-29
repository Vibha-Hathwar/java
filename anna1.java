public class anna1
{
	String name;
	String rollno;
	
	public anna1(String name,String rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public String toString()
	{
		return "Name: "+this.name+" Roll No: "+this.rollno;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		anna1 s=new anna1("Vivek","1");
		System.out.println(s);
	}
}