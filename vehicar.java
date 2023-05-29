package objects;

public class vehicar extends vehicle
{
		int numdoor;
		
		/*public  vehicar()
		{
			System.out.println("Car constructor");
		}*/
		
		public vehicar(int numdoor,int maxSpeed)
		{
			super(maxSpeed);
			//if this not called default constructor called, as no default constructor, error
			//	this should be 1st statement, as 1st parent constructor then this , else error
			System.out.println("Car constructor");
			this.numdoor=numdoor;
		}
		
		public void print()
		{
			//	super.maxSpeed=100;
			super.print();		//super keyword - calls funcn of parent class
			System.out.println("Car - no of doors "+numdoor);
		}
		
		
		//	predict output
		/*vehicar(int x, int y)
		{
		    super(x,y); 
		    System.out.print("This Is Para Audi ");
		}
		void vehicar()
		{
		    System.out.print("This Is Def Audi");
	    }*/
	
	 	/*void print()
	 	{
		    System.out.print("Car class ");
	    }*/
}