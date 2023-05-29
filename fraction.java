package objects;

public class fraction 
{
	private int num;
	private int den;
	
	public fraction(int num,int den)
	{
		if(den==0)
			den=1;
		this.num=num;
		this.den=den;
		simplify();
	}
	private void simplify()
	{
		int gcd=1;
		int smaller=Math.min(num,den);
		for(int i=1;i<=smaller;i++)
			if(num%i==0&&den%i==0)
				gcd=i;
		num=num/gcd;
		den=den/gcd;
	}
	public void print()
	{
		System.out.println(num+"/"+den);
	}
	public void increment()
	{
		num=num+den;
		simplify();
	}
	public static fraction add(fraction f1,fraction f2)
	{
		int newnum = (f1.num*f2.den)+(f2.num*f1.den);
		int newden=f1.den*f2.den;
		fraction f3=new fraction(newnum,newden);
		return f3;
	}
	public void multiply(fraction f2)
	{
		this.num=(this.num*f2.num);
		this.den=this.den*f2.den;
		simplify();
	}
	public void subt(fraction f2)
	{
		this.num = (this.num*f2.den)-(f2.num*this.den);
		this.den=this.den*f2.den;
		simplify();
	}
	public void setnum(int num)
	{
		this.num=num;
		simplify();
	}
	public void setden(int den)
	{
		if(den==0)
			return;
		this.den=den;
	}
	
	public int getnum()
	{
		return num;
	}
	public void add(fraction f2)
	{
		this.num = (this.num*f2.den)+(f2.num*this.den);
		this.den=this.den*f2.den;
		simplify();
	}
	
}
