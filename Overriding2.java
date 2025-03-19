import java.util.*;
import java.lang.*;

class TV
{
	public void switchON()
	{
		System.out.println("Tv is switched ON");
	}

	public void changeChannel()
	{
		System.out.println("TV channel is changes");
	}
}

class SmartTV extends TV
{
	@Override
	public void switchON()
	{
		System.out.println("Smart Tv is switched ON");
	}
	
	@Override
	public void changeChannel()
	{
		System.out.println("Smart TV channel is changes");
	}

	public void browse()
	{
		System.out.println("Smart Tv Browsing");
	}
}

public class Overriding2
{
	public static void main(String args[])
	{
		TV t = new TV();
		t.switchON();
		t.changeChannel();
		SmartTV s = new SmartTV();
		s.switchON();
		s.changeChannel();
		s.browse();

		TV a = new SmartTV();
		a.changeChannel();
		a.browse();
	}
}