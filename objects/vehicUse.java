package objects;

public class vehicUse 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*vehicle v=new vehicle();
		//v.color="Red";
		v.setcolor("Red");
		v.maxSpeed=10;
		v.print();
		
		vehicar c=new vehicar();
		c.setcolor("Black");
		c.maxSpeed=100;
		c.numdoor=4;
		c.print();*/
		
		/*vehicar c=new vehicar(4,100);
		c.print();*/
		
		vehicle v=new vehicar(4,60);
		v.maxSpeed=100;
		//v.numdoor=4;		// compile time error	// access only vehicle nor car
		v.print();			//	run time
		//vehicar c=new vehicle();	not work
		
		vehicar c=(vehicar)v;	// typecasting
		c.numdoor=3;
		
		//object class is super class of all class in java
		Object a=new vehicle(45);
		//Object b=new vehicar(4,45);
		
		/*	predict output
		vehicar a = new vehicar(5,7);
	    a.vehicar();*/
		
		 /*vehicle obj1 = new vehicar();
	    obj1.print();
   		vehicle obj2 = new vehicle();
	    obj2.print(); */ 
	}
}