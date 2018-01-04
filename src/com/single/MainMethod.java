package com.single;

public class MainMethod extends Thread
{
	public void  run()
	{
		SingleClass obj=SingleClass.getInstance();
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		MainMethod ob1=new MainMethod();
		MainMethod ob2=new MainMethod();
		ob1.start();
		ob2.start();
		
	}
}
