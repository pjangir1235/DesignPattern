package com.factory.observ;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.management.Notification;
import javax.management.NotificationListener;

public class MyModel
{
	List<PropertyChangeListener> listner=new ArrayList<>();
	Score score=new Score();
	class Score
	{
		int score;
		public Score() {}
		int getScore()
		{
			return score;
		}
		void setScore(int x)
		{
			notifyListner(this, "score", score+"", (score=x)+"");
		}
	}
	public void notifyListner(Object obj,String property,String oldValue,String newValue)
	{
		for(PropertyChangeListener listner:listner)
		{
			listner.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
		}
	}
	public void addChangeListner(PropertyChangeListener newListner)
	{
		listner.add(newListner);
	}
	
}
