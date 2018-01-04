package com.single;

public class SingleClass 
{
	private static SingleClass obj;
	private SingleClass()
	{
		
	}
	public static  SingleClass getInstance()
	{
		if(obj==null)
			synchronized (SingleClass.class) 
			{
				if(obj==null)
					obj=new SingleClass();
			}
		return obj;
	}
	public void  location()
	{
		System.out.println("Hello");
	}
	

}
