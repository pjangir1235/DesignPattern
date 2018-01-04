package com.factory;

public class MainMet
{
		public static void main(String[] args) 
		{
			CoffeeFactory cf=new CoffeeFactory();
			Coffee cofe= cf.choice(3);
			cofe.deliver();
		}
}
