package com.lynda.olivepress.olives;

public enum OliveName {
	
	//For Enums the constructor must be private- cannot define a public constructor
	
	KALAMATA("Kalamata"), LIGURIA("Liguria"), 
	PICHOLINE("Picholine"), GOLDEN("Golden");
	
	private String nameAsString;
	
	private OliveName(String nameAsString) {
		this.nameAsString = nameAsString;
	}
	
	@Override
	public String toString() {
		return this.nameAsString;
	}
	
	
	

}
