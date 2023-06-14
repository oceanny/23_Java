package com.java.regular;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class RegularProcess {

	public void process(Map<String, String> regularForm) {

		Scanner scann = new Scanner(System.in);
		String input = "";
		int count = 0;

		Set<Entry<String, String>> entrySet = regularForm.entrySet();
		if (entrySet != null)
			for (Entry<String, String> regularEntry : entrySet) {

				count = Integer.parseInt(regularEntry.getKey().substring(0, 3));

				String regExName = regularEntry.getKey().substring(3);

				System.out.print(count + ". " + regExName + " : ");
				input = scann.nextLine();

				if (!input.matches(regularEntry.getValue())) {
					System.out.println(regExName + " 형식이 아닙니다.");
				}
			}
	}
}
