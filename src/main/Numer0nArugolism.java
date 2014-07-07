package main;

import java.util.HashSet;
import java.util.Set;

public class Numer0nArugolism {
	private Set<String> set = new HashSet<String>(); 
	private int eat = 0;
	private int bite = 0;
	
	public String analyze(String actualNumber, String expectedNumber) {
		String[] actualNumberArray = splitNumber(actualNumber);
		String[] expectedNumberArray = splitNumber(expectedNumber);
		for (int i = 0; i < 3; i++) {
			eatAnalyze(actualNumberArray, expectedNumberArray, i);
		}
		for(int i = 0; i < 3; i++){
			biteAnalyze(expectedNumberArray, i);
		}
		return Integer.toString(eat) + ":" + Integer.toString(bite);
	}

	private void eatAnalyze(String[] actualNumberArray,
			String[] expectedNumberArray, int i) {
		if (actualNumberArray[i].equals(expectedNumberArray[i])) {
			eat++;
		}else{
			set.add(actualNumberArray[i]);
		}
	}

	private void biteAnalyze(String[] expectedNumberArray, int i) {
		if(set.contains(expectedNumberArray[i])){
			bite++;
		}
	}

	public String[] splitNumber(String number) {
		return number.replaceAll("", " ").trim().split(" ");
	}

}
