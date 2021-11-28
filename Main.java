package com.gmail.kutepov89.sergey;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Map<String, String> hmap = new HashMap<String, String>();
		
//		TranslateClass.addEngUkrWords("one","один");
//		TranslateClass.addEngUkrWords("two","два");
//		TranslateClass.addEngUkrWords("three","три");
//		TranslateClass.addEngUkrWords("four","чотири");
//		TranslateClass.addEngUkrWords("five","п'ять");
		TranslateClass.addEngUkrWords("seven","сім");
		TranslateClass.addEngUkrWords("eleven","одинадцять");
		
		hmap = TranslateClass.engUkrWords();	
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print(mentry.getKey() + "\t\t");
			System.out.println(mentry.getValue());
		}
		
//		TranslateClass.translateWords("English.in","Ukrainian.out");


	}

}
