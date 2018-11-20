package gui.controller;

import gui.model.Josh;
import gui.view.JoshFrame;

public class GUIController
{
	private Josh myJosh;
	private JoshFrame appFrame;
	
	public GUIController()
	{
		myJosh = new Josh();
		
		appFrame = new JoshFrame(this);
	}
	
	public void start()
	{
		
	}
}
