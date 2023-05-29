package objects;
import java.util.*;

import java.util.Scanner;

//	COMPLEX NUMBER
public class compex 
{
	private int real;
    private int imaginary;
    
    public compex(int n,int m)
    {
        real=n;
        imaginary=m;
    }
    public void plus(compex c2)
    {
        this.real=this.real+c2.real;
        this.imaginary=this.imaginary+c2.imaginary;
    }
    public void multiply(compex c)
    {
        /*this.real=(this.real*c.real)-(this.imaginary*c.imaginary)+(-1*this.imaginary*c.imaginary);
        this.imaginary=(this.real*c.imaginary)+(this.imaginary*c.real); */
    	int newReal=((this.real)*(c.real))-(this.imaginary*c.imaginary);
        int newImag=(this.real*c.imaginary)+(this.imaginary*c.real);
        this.real=newReal;
		 this.imaginary=newImag;
    }
    public void print()
    {
        System.out.println(real+"+i"+imaginary);
    }
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();
		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();
		compex c1 = new compex(real1, imaginary1);
		compex c2 = new compex(real2, imaginary2);
		int choice = s.nextInt();
		 
		if(choice == 1)
		{
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2)
		{
			c1.multiply(c2);
			c1.print();
		}
		else
			return;
	}
}