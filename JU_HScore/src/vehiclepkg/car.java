package vehiclepkg;

public class car extends Vehicle {
	
	private static int noDoors = 1;
	
	public static int getNoDoors()
	{
		return noDoors;
	}
	
	public static void setNoDoors(int noDoors)
	{
		if(noDoors < 1 || noDoors > 5)
			car.noDoors = 1; //noDoors must be between 1 and 5
		else 
			car.noDoors = noDoors;
	}
}
