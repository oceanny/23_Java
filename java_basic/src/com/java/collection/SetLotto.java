package com.java.collection;

import java.util.HashSet;
import java.util.Set;

public class SetLotto {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		while(set.size() < 6) {
			set.add((int)(Math.random() * 45 + 1));
		}
		
		System.out.println(set);
		
	}

}
