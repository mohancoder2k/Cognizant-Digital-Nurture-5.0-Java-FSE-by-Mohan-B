package com.cognizant.DN.Singleton;

public class LoggerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// private static final Logger ins = new Logger();
		Logger l1 = Logger.getInstance(34);
		Logger l2 = Logger.getInstance(44);
		System.out.println("L1 data: " +  l1.getNum());
		System.out.println("L2 data: " +  l2.getNum());
		System.out.println(l1 == l2);
	}

}
