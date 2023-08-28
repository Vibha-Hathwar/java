package objects;

public class poly
{
	dynarray coef;
	public poly()
	{}
	public void setcoef(int deg,int c)
	{
		//if(deg>=coef.size())
		
		coef.set(deg,c);
	}
	public int getcoef(int deg)
	{
		return coef.size();
	}
	public void print()
	{}
	public void add(poly p) {}
	public void subt(poly p) {}
	public void multiply(poly p) {}
	public int evaluate(int x) {}
	public static poly add(poly p1,poly p2) {}

}