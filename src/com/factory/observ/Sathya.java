package com.factory.observ;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Sathya  implements PropertyChangeListener, ModelInterface
{
	@Override
	public void propertyChange(PropertyChangeEvent evt)
	{
		System.out.println("Sathya : change val "+evt.getNewValue());
	}

	public Sathya() 
	{
		
	}
	@Override
	public void addListner(MyModel model) 
	{
		model.addChangeListner(new Sathya());	
	}
}
