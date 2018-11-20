package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class JoshFrame extends JFrame
{
	private GUIController appController;
	private JoshPanel appPanel;
	
	public JoshFrame(GUIController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new JoshPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("My Josh GUI");
		this.setResizable(true);
		this.setVisible(true);
	}
}
