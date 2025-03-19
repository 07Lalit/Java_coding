import java.util.*;
import java.lang.*;

class phone
{
	public void call(){System.out.println("phone call");}

	public void sms(){System.out.println("Phone sending sms");}
}

interface camera
{
	void click();
	void stop();
}

interface musicplayer
{
	void play();
	void stop();
}

class smartphone extends phone implements camera,musicplayer
	{
		public void videocall()
		{
			System.out.println("Smart phone video calling.");
		}

		public void click()
		{
			System.out.println("Smart phone clicking photo");
		}

		public void record()
		{
			System.out.println("Smart phone recording video.");
		}

		public void play()
		{
			System.out.println("Smart phone playing music.");
		}

		public void stop()
		{
			System.out.println("Smart phone stopped playing music");
		}

	}

public class Interface2
{
	public static void main(String args[])
	{
		smartphone s = new smartphone();
		s.call();
		s.sms();
		s.videocall();
		s.click();
		s.record();
		s.play();
		s.stop();
		camera c =s;
		c.click();		
		c.stop();
	}
}