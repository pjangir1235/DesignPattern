package com.factory.observ;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Piyush  implements PropertyChangeListener
{
	@Override
	public void propertyChange(PropertyChangeEvent evt)
	{
		System.out.println("Piyush : change val "+evt.getNewValue());
	}
	public Piyush()
	{	
	}
	
}
