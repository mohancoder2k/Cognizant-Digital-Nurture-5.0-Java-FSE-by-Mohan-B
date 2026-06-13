package com.cognizant.Factory.Documents;

import com.cognizant.Products.Documents.Document;
import com.cognizant.Products.Documents.ExcelDocument;


public class ExcelCreator extends DocumentFactory{
	@Override
	public Document createDocument() {
		return new  ExcelDocument();
	}
}