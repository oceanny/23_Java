package com.java.regular;

public class TestInfoAns {
		
	public static void main(String[] args) {
		RegularForm regular = RegularForm.getInstance();
		
		RegularProcess regularEx = new RegularProcess();
		
		regularEx.process(regular.getForm());
		
	}
}
