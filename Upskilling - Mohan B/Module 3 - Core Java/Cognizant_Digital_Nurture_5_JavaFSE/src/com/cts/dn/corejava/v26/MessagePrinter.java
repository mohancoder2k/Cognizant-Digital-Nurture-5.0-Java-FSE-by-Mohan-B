package com.cts.dn.corejava.v26;

public class MessagePrinter implements Runnable {
	
	private final String msg;
	MessagePrinter(String msg){
		this.msg = msg;
	}

	@Override
	public void run() {
		
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Interpted : " + e);
			}
		}
		
	}

}
