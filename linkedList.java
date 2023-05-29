import java.util.*;
public class linkedList
{
	public static ArrayList<Integer> removeDupl(int a[])
	{
		//	removeConsecutiveDuplicates
		ArrayList<Integer> b=new ArrayList<>();
		b.add(a[0]);
		for(int i=1;i<a.length;i++)
		{
			if(a[i]!=a[i-1])
				b.add(a[i]);
		}
		return b;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		/*ArrayList<Integer> a=new ArrayList<>();
		//ArrayList<Integer> a=new ArrayList<>(7);	//arraylist of size 7
		a.add(1);a.add(10);a.add(20);
		for(int i=0;i<a.size();i++)		// i is index
			System.out.print(a.get(i)+" ");
		a.add(1,80);//add 80 at index 1
		a.remove(2);
		Integer i=10;
		System.out.println();
		for(int j:a)		//j is value of arraylist
			System.out.print(j+" ");
		a.remove(i);
		System.out.println("\narrylist size = "+a.size());
		System.out.println("index 2 = "+a.get(2));*/
	
		int n=s.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		ArrayList<Integer>res=removeDupl(a);
		for(int j:res)
			System.out.print(j+" ");
	}
}