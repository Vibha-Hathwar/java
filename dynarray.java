package objects;
	//	DYNAMIC ARRAY
public class dynarray
{
	private int a[];
	private int nextind;
	
	public dynarray()
	{
		a=new int[5];
		nextind=0;
	}
	public int size()
	{
		return nextind;
	}
	public boolean empty()
	{
		return nextind==0;	
	}
	public void set(int i,int num)
	{
		if(i>=nextind)
			return;
		a[i]=num;
	}
	public int get(int i)
	{
		if(i>=nextind)
			return -1;
		return a[i];
	}
	public void add(int num)
	{
		if(nextind==a.length)
			capacity();
		a[nextind]=num;
		nextind++;
	}
	private void capacity()	//double size 
	{
		int temp[]=a;
		a=new int[temp.length*2];
		for(int i=0;i<temp.length;i++)
			a[i]=temp[i];
	}
	public int remlast()
	{
		if(nextind==0)
			return -1;
		int temp=a[nextind-1];
		a[nextind-1]=0;
		nextind--;
		return temp;
	}
	//add function //arguments = indext and num //add num to index i and shift remaining ->
	//remove function //argument = i //index i element remove and shift remaining <-
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		dynarray d=new dynarray();
		for(int i=1;i<=10;i++)
			d.add(i);
		System.out.println(d.size());
		System.out.println(d.get(3));
		System.out.println(d.get(9));
		d.set(2,50);
		System.out.println(d.get(2));
		while(!d.empty())
			System.out.println("removed "+d.remlast()+", size = "+d.size());
	}
}