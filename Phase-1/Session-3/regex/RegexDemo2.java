package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	
	public static void main(String[] args) {
		String regex="[987]{3}[0-9]{7}";
		//first three numbers must be 987, rest 7 must be between 0-9
		String input="7894527814";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		if (match.matches()) {
			System.out.println("Pattern Matched");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}
