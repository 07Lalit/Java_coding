import java.util.*;
import java.lang.*;

class student
{
	private String rollno;
	private static int count=1;

	private String assignrollno()
	{
		Date d = new Date();
		String rno = "Univ-"+(d.getYear()+1990)+"-"+count;
		count++;
		return rno;
	}

	student()
	{
		rollno=assignrollno();
	}
	
	public String getrollno()
	{
		return rollno;
	}
}

public class Static4
{
	public static void main(String args[])
	{
		student s = new student();
		System.out.println(s.getrollno());
	}
}