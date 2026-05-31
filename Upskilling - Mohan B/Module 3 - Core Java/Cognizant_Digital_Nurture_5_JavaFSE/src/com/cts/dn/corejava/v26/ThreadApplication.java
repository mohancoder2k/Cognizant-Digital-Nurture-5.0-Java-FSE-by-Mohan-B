package com.cts.dn.corejava.v26;

public class ThreadApplication {
	public static void main(String[] args) {
	MessagePrinter t1 = new MessagePrinter("Im from Thread 1 ");
	MessagePrinter t2 = new MessagePrinter("Im from Thread 2 ");
	 MessagePrinter task1 = new MessagePrinter("Hello from Thread A!");
     MessagePrinter task2 = new MessagePrinter("Greetings from Thread B!");

    
     Thread thread1 = new Thread(task1, "Thread-A");
     Thread thread2 = new Thread(task2, "Thread-B");

 
     thread1.start();
     thread2.start();
     
     
}
}