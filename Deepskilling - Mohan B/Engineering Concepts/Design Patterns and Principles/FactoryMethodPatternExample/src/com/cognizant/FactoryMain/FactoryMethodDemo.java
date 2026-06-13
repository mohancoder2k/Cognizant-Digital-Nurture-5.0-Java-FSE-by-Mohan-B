package com.cognizant.FactoryMain;

import com.cognizant.Factory.Documents.*;
import com.cognizant.Products.Documents.Document;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		
		DocumentFactory d1 = new PdfCreator(); // Invokes Factory 
		Document doc1 = d1.createDocument(); // Invoking Product 
		System.out.println(doc1.readable());
		
		DocumentFactory d2 = new ExcelCreator(); // Invokes Factory 
		Document doc2 = d2.createDocument(); // Invoking Product 
		System.out.println(doc2.readable());
		
		DocumentFactory d3 = new WordCreator(); // Invokes Factory 
		Document doc3 = d3.createDocument(); // Invoking Product 
		System.out.println(doc3.readable());
	}

}
