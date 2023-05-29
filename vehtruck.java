import objects.vehicle;
public class vehtruck extends vehicle
{
	int capacity;
	
	public void print()
	{
		System.out.println("Vehicle colour "+getcolor()+", max Speed "+maxSpeed+", maxloadingcapacity "+capacity);
	}
}