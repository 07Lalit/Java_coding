import java.util.*;
import java.lang.*;

class Car
{
	public void start()
	{
		System.out.println("Car started");
	}

	public void accelerate()
	{
		System.out.println("Car is Accelerated");
	}

	public void  changeGear()
	{
		System.out.println("Car gear is changed.");
	}
}

class LuxaryCar extends Car
{
	@Override
	public void changeGear()
	{
		System.out.println("Automatic Gear");
	}
	
	
	public void openRoof()
	{
		System.out.println("Sun roof is opened");
	}

}

public class Overriding3
{
	public static void main(String args[])
	{
		Car c = new Car();
		c.start();
		c.accelerate();
		c.changeGear();
		LuxaryCar l = new LuxaryCar();
		l.start();
		l.accelerate();
		l.changeGear();
		l.openRoof();
		Car d = new LuxaryCar();
		d.changeGear();
		//d.openRoof();
		d.accelerate();
		

	}
}