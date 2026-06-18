package com.cognizant.Factory.Documents;

import com.cognizant.Products.Documents.Document;
import com.cognizant.Products.Documents.WordDocument;


public class WordCreator extends DocumentFactory{
	@Override
	public Document createDocument() {
		return new  WordDocument();
	}
}
