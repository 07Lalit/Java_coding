import java.util.*;
import java.lang.*;

class product
{
	private int itemno;
	private String name;
	private double price;
	private int quantity; 

	public product()
	{
		itemno=1;
		name="xyz";
		price=0;
		quantity=0;
	}
	
	public product(int i,String n,double p , int q)
	{	
		itemno=i;
		name = n;
		price=p;
		quantity=q;

	}

	public void getproduct()
	{
		System.out.println("itemno is :" +itemno+ "\n" + "name is : " +name+ "\n" + "Price is :" +price+ "\n" + "quantity is : " +quantity+"\n\n");
	}
	
	public void setitemno(int i)
	{
		itemno=i;
	}

	public void setname(String n)
	{
		name=n;
	}
	
	public void setprice(double p)
	{
		price=p;
	}

	public void setphoneno(int q)
	{
		quantity=q;
	}

}



class customer
{
	private int customerid;
	private String name;
	private String address;
	private String phoneno;

	public customer()
	{
		customerid=1;
		name="abc";
		address="Unknown";
		phoneno="6263330665";
	}

	public customer(int c,String n,String a , String p)
	{
		customerid=c;
		name=n;
		address=a;
		phoneno=p;
	}

	public void getcustomer()
	{
		System.out.println("customerid is :" +customerid+ "\n" + "name is :" +name+ "\n"+"address is :" +address+ "\n" + "phoneno is :" +phoneno+"\n\n");
	}
 
	public void setcustomerid(int c)
	{
		customerid=c;
	}

	public void setname(String n)
	{
		name= n;
	}

	public void setaddress(String a)
	{
		address =a;
	}

	public void setphoneno(String p)
	{
		phoneno=p;

	}

}


class customerproduct
{		
	public static void main(String args[])
	{
		customer c1 = new customer();
		product p1 = new product();
		p1.getproduct();
		c1.getcustomer();
		customer c2= new customer(1,"Lalit","Bhopal","6263330665");
		product p2 = new product(1,"Apple",20,6);
		p2.getproduct();
		c2.getcustomer();

	}
}