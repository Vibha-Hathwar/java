package objects;
	//	INHERITACE
public class vehicle
{
	private String color;
	//int maxSpeed;
	public int maxSpeed;
	
	/*public  vehicle()
	{
		System.out.println("Vehicle Constructor");
	}*/
	public vehicle(int maxSpeed)
	{
		System.out.println("Vehicle Constructor");
		this.maxSpeed=maxSpeed;
	}
	public String getcolor()
	{
		return color;
	}
	public void setcolor(String color)
	{
		this.color=color;
	}
	public void print()
	{
		System.out.println("Vehicle colour "+color+", max Speed "+maxSpeed);
	}
	
		//	predit output
	 	/*private int seats;
	    private int speed;

	    public vehicle(int seats, int speed) 
	    {
	    	this.seats = seats;
	    	this.speed = speed;
	    	System.out.print("This Is Car ");
	    }*/
	
		/*void print()
		{
			System.out.print("Vehicle class");
		}*/
	
}