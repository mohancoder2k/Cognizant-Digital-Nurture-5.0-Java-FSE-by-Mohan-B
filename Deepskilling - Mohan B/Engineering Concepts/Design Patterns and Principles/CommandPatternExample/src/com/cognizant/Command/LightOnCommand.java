package com.cognizant.Command;

public class LightOnCommand implements Command{
	
	private Light lt;
	
	public LightOnCommand(Light lt) {
		this.lt = lt;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lt.turnOn();
	}
	
}
