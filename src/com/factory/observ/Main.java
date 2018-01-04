package com.factory.observ;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Main 
{
	public static void main(String[] args) throws Exception
	{
		MyModel model=new MyModel();
		model.addChangeListner(new Piyush());
		model.addChangeListner(new Sathya());
		model.addChangeListner(new Tarun());
		
		int score=1;
		while(score<=50)
		{
			model.score.setScore(score);
			score+=(int)Math.ceil(Math.random()*3);
			Thread.sleep(1000);
		}
	}
}
