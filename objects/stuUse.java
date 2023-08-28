package objects;
import java.util.*;
public class stuUse
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*stu s1;
		s1=new stu();
		System.out.println(s1);
		System.out.println(s1.name+" "+s1.getroll());
		s1.name="Manisha";
		//s1.roll=10;
		s1.setroll(10);
		System.out.println(s1.name+" "+s1.getroll());
		
		//	this
		stu s2=new stu();
		System.out.println("s2 "+s2);
		s2.set_name("Ankush");
		s2.setroll(2);
		System.out.println(s2.name+" "+s2.getroll());*/
		
		//	constructors
		/*stu s3=new stu("Manisha",50);
		System.out.println(s3.name+" "+s3.getroll());
		stu s4=new stu("Shanima");
		System.out.println(s4.name+" "+s4.getroll());*/

		//	static
		/*System.out.println(stu.stuno);
		stu s1=new stu("Manisha",50);
		stu s2=new stu("Ankush",4);
		s1.print();s2.print();
		System.out.println(s1.stuno+" "+s2.stuno+" "+stu.stuno);*/
		
		stu s1=new stu("Manisha");
		stu s2=new stu("Ankush");
		//System.out.println(s1.getstuno());
		//System.out.println(s2.getstuno());
		System.out.println(stu.getstuno());
		s1.print();s2.print();
		
		
		//	predict output
		/*stu s1=new stu();
		s1.set(10,20);
		s1.display();*/
		
		//predict output
		//stu s1=new stu();
		
		//predict output
		/* stu c=new stu();        
		 stu.year=2018;              
	        c.company_name="KIA";
	        stu d=new stu();
	        System.out.print(d.year);*/
		
		//predict output
		/*stu t=new stu();              
	      t.set_marks(78);
	      System.out.print(stu.marks); */
		
		//	predict output
		/*stu t=new stu();
	      t.fun();
	      System.out.print(stu.a+stu.b);*/
		
		//	predict output
		/*stu v=new stu();
		  v.colour = "white";
	      v.set(1010) ;
	      System.out.println(v.colour + " " + v.get());*/
	}
}