package com.cognizant.Command;

public class TestMain {
	public static void main(String[] args) {
		Light l1 = new Light();
		Command c1 = new LightOnCommand(l1);
		c1.execute();
		Command c2 = new LightOffCommand(l1);
		c2.execute();
	}
}
