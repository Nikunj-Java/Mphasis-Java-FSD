package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {

	
	public static void main(String[] args) {
		String regex="^(?=.*[A-Z]).{8,}";
		 
		String input="12345Aa678";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		if (match.matches()) {
			System.out.println("Password is valid");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
}
