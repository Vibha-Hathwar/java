package objects;

public class fracUse
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		fraction f1=new fraction(4,6);
		f1.increment();
		f1.print();
		fraction f2=new fraction(4,8);
		f2.print();
		//f1.add(f2);
		//f1.print();
		fraction f3=fraction.add(f1,f2);
		f3.print();
		
		//f1.setnum(12);
		//System.out.println(f1.getnum());
		//f1.print();
	}
}