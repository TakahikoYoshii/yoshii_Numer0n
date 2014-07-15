package main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Numer0nArugolism {
	private Set<String> eatSet = new HashSet<String>(); 
	private Set<String> biteSet = new HashSet<String>(); 
	private int eat = 0;
	private int bite = 0;
	
	public String analyze(String actualNumber, String expectedNumber) {
		String[] actualNumberArray = splitNumber(actualNumber);
		String[] expectedNumberArray = splitNumber(expectedNumber);
		for (int i = 0; i < 3; i++) {
			eatAnalyze(actualNumberArray, expectedNumberArray, i);
		}
		Iterator<String> iterator = biteSet.iterator();
		while(iterator.hasNext()){
			biteAnalyze(iterator.next());
		}
		return Integer.toString(eat) + ":" + Integer.toString(bite);
	}

	private void eatAnalyze(String[] actualNumberArray,
			String[] expectedNumberArray, int i) {
		if (actualNumberArray[i].equals(expectedNumberArray[i])) {
			eat++;
			expectedNumberArray[i] = "";
		}else{
			eatSet.add(actualNumberArray[i]);
			biteSet.add(expectedNumberArray[i]);
		}
	}

	private void biteAnalyze(String expectedNumber) {
		if(eatSet.contains(expectedNumber)){
			bite++;
		}
	}

	public String[] splitNumber(String number) {
		return number.replaceAll("", " ").trim().split(" ");
	}

}
