package com.cognizant.Builder;

import com.cognizant.Builder.Computer.ComputerBuilder;

public class BuilderDemo {
	public static void main(String[] args) {
		Computer c1 = new Computer.ComputerBuilder("8GB Ram", "512 GB SSD")
				.enableGraphics("NVIDEA Graphics")
				.customCPU("i7 variant").build();
		System.out.println(c1.toString());
	}
}
