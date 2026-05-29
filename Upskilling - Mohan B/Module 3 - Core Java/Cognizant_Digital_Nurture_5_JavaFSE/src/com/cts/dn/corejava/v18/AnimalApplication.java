package com.cts.dn.corejava.v18;

public class AnimalApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();	// PARENT 
		Dog d1 = new Dog(); 	// Dog - child class 
		a1.makeSound();
		d1.makeSound();
		
	}

}
