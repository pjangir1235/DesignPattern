package com.accolite.Execute;

import java.util.Scanner;

public class Command implements CommandInt
{
	private boolean isAdmin;
	private CommandMethod cmd;
	
	public Command(String user,String pass) 
	{
			if(user.equals("Piyush")&&pass.equals("Piyush"))
			{
				isAdmin=true;
			}
			else
				isAdmin=false;
			cmd=new CommandMethod();
	}
	@Override
	public void runCmd(String str) throws Exception
	{
		if(isAdmin)
			cmd.runCmd(str);
		else
		{
			if(str.trim().startsWith("rm"))
			{
				throw new Exception("rm not allowed");
				
			}
			cmd.runCmd(str);
		}
		
	}
	public static void main(String[] args) throws Exception 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("ID : ");
		String id=s1.next();
		System.out.println("Password : ");
		String pass=s1.next();
		Command c=new Command(id, pass);
		System.out.println("cmd : ");
		String cm=s1.next();
		c.runCmd(cm);
		
	}
}
