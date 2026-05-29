package com.cts.dn.corejava.v22v23;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		try(FileWriter wr = new FileWriter("Output.txt")) {
			wr.write(ip);
			System.out.println("User data was written to File Sucesfully");
		}catch(IOException e) {
			System.err.print("Error : " + e);
		}finally {
			System.out.println("Sample program to demonstrate File Writer in Java ");
		}
		sc.close();
	}

}
