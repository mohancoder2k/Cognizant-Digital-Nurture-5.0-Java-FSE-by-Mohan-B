package com.cognizant.Command;


public class LightOffCommand implements Command{
	
	private Light lt;
	
	public LightOffCommand(Light lt) {
		this.lt = lt;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lt.turnOff();
	}
}
	