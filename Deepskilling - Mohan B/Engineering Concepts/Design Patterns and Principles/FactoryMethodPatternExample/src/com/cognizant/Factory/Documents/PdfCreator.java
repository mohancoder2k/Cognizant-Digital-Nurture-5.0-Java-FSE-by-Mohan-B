package com.cognizant.Factory.Documents;
import com.cognizant.Products.Documents.Document;
import com.cognizant.Products.Documents.PdfDocument;

public class PdfCreator extends DocumentFactory{
	@Override
	public Document createDocument() {
		return new  PdfDocument();
	}
}
