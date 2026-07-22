package com.cognizant.DN.Singleton;

public class Logger {
		private static Logger ins;
		private static int num;
		private Logger(int num) {
			System.out.println("Objected Created only once");
			this.num = num;
		}
		
		public  static synchronized Logger getInstance(int num) {
			if(ins == null) {
				ins = new Logger(num);
			}
			return ins;
		}
		public static int getNum() {
			return num;
		}
}
