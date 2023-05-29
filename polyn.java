package objects;
import java.util.*;

public class polyn
{ 
	private int[] poly;
    private int maxDegree;
    
      public polyn()
    {
        poly = new int[10];
        maxDegree=0;
    }
    public polyn(int degree)
    {
        poly = new int[degree];
        maxDegree=degree-1;
    }
    private void doubleCapacity()
	{
		int[] temp=poly;
		poly=new int[2*temp.length];
		for (int i=0;i<temp.length;i++)
			poly[i]=temp[i];
	}
    
    public void setCoefficient(int degree, int coeff)
    {
		while (degree > poly.length-1)
            doubleCapacity();
        if (maxDegree<degree)
            maxDegree=degree;
        poly[degree]=coeff;
	}	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print()
    {
		for (int i=0;i<=maxDegree;i++)
            if (poly[i] != 0)
                System.out.print(poly[i]+"x"+i+" ");
    }

	// Adds two polynomials and returns a new polynomial which has result
	public polyn add(polyn p)
    {
		int degree1=this.maxDegree;
        int degree2=p.maxDegree;
        int limit;
        if (degree1>degree2)
            limit=degree1;
        else
            limit=degree2;
        polyn polysum = new polyn(limit+1);
        for (int i=0;i<=limit;i++)
        {
            int sum=0;
            if (i<=degree1)
               sum=sum+(this.poly[i]);
            if (i<=degree2)
                sum=sum+(p.poly[i]);
            polysum.setCoefficient(i,sum);
        }
        return polysum;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public polyn subtract(polyn p)
    {
		int degree1=this.maxDegree;
        int degree2=p.maxDegree;
        int limit;
        if (degree1>degree2)
            limit=degree1;
        else
            limit=degree2;
        polyn polydiff = new polyn(limit+1);
        for (int i=0;i<=limit;i++)
        {
            int diff=0;
            if (i<=degree1)
               diff=diff+(this.poly[i]);
            if (i<=degree2)
                diff=diff-(p.poly[i]);
            polydiff.setCoefficient(i,diff);
        }
        return polydiff;
    }
	// Multiply two polynomials and returns a new polynomial which has result
	public polyn multiply(polyn p)
    {
		int limit=this.maxDegree+p.maxDegree;
		polyn polymul = new polyn(limit+1);
        for (int i=0;i<=this.maxDegree;i++)
        {
            int product=0;
            for (int j=0;j<=p.maxDegree;j++)
            {
                product=polymul.poly[i+j];
                product=product+(this.poly[i]*p.poly[j]);
                polymul.setCoefficient(i+j,product);
            }
        }
		return polymul;
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++)
			degree1[i] = s.nextInt();
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++)
			coeff1[i] = s.nextInt();
		polyn first = new polyn();
		for(int i = 0; i < n; i++)
			first.setCoefficient(degree1[i],coeff1[i]);
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++)
			degree2[i] = s.nextInt();
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++)
			coeff2[i] = s.nextInt();
		polyn second = new polyn();
		for(int i = 0; i < n; i++)
			second.setCoefficient(degree2[i],coeff2[i]);
		int choice = s.nextInt();
		polyn result;
		switch(choice)
		{
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}
	}
}
