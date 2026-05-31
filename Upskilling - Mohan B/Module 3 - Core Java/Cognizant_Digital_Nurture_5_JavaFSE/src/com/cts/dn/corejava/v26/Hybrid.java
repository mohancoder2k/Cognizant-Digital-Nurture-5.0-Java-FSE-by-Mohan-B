package com.cts.dn.corejava.v26;
interface Car{
	
}
interface Tata extends Car{
	
}
interface Nexon extends Tata{
	
}
interface Petrol extends Nexon{
	
}
interface EV extends Nexon{
	
}
public class Hybrid implements Petrol, EV {
	
}
