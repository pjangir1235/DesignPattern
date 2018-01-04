package com.factory.observ;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Tarun  implements PropertyChangeListener
{
	@Override
	public void propertyChange(PropertyChangeEvent evt)
	{
		System.out.println("Tarun : change val "+evt.getNewValue());
	}
	public Tarun() 
	{
		
	}
	
}
