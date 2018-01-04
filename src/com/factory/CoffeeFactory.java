package com.factory;

public class CoffeeFactory
{
	
	public Coffee choice(int a)
	{
		Coffee c=null;
		switch(a)
		{
			case 1	:	c=new Capa();
						break;
			case 2	:	c=new Esp();
						break;
			case 3	:	c=new Laatte();
						break;
			default	:	System.out.println("Wrong Choice");
		}
		return c;
	}
}
