package com.cts.dn.corejava.v22v23;

import java.io.File;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("Output.txt");
		try(Scanner reader = new Scanner(fl)){
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

}
