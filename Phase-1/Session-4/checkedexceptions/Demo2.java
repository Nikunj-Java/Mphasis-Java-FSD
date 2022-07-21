package com.simplilearn.checkedexceptions;

import java.io.FileReader;

public class Demo2 {
	
	public static void main(String[] args) {
		//compiletime :  FileNotFoundException
		FileReader file= new FileReader("C://test//user.txt");
		
	}

}
