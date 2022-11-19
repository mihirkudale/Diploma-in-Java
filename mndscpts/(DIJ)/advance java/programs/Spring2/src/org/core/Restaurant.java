package org.core;

public class Restaurant 
{
	String welomeNote;
	
	
	
	public void setWelomeNote(String welomeNote) {
		this.welomeNote = welomeNote;
	}



	public void greetCustomer() {
		System.out.println(welomeNote);
		
	}

}